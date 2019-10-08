package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.annotations.PublicApi;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import com.google.firebase.internal.DefaultIdTokenListenersCountChangedListener;
import com.google.firebase.internal.InternalTokenProvider;
import com.google.firebase.internal.InternalTokenResult;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

@PublicApi public class FirebaseApp {
    class com.google.firebase.FirebaseApp$1 {
    }

    @KeepForSdk public interface BackgroundStateChangeListener {
        @KeepForSdk void onBackgroundStateChanged(boolean arg1);
    }

    @TargetApi(value=14) class GlobalBackgroundStateListener implements com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener {
        private static AtomicReference INSTANCE;

        static {
            GlobalBackgroundStateListener.INSTANCE = new AtomicReference();
        }

        private GlobalBackgroundStateListener() {
            super();
        }

        static void access$100(Context arg0) {
            GlobalBackgroundStateListener.ensureBackgroundStateListenerRegistered(arg0);
        }

        private static void ensureBackgroundStateListenerRegistered(Context arg3) {
            if(PlatformVersion.isAtLeastIceCreamSandwich()) {
                if(!(arg3.getApplicationContext() instanceof Application)) {
                }
                else {
                    arg3 = arg3.getApplicationContext();
                    if(GlobalBackgroundStateListener.INSTANCE.get() == null) {
                        GlobalBackgroundStateListener v0 = new GlobalBackgroundStateListener();
                        if(GlobalBackgroundStateListener.INSTANCE.compareAndSet(null, v0)) {
                            BackgroundDetector.initialize(((Application)arg3));
                            BackgroundDetector.getInstance().addListener(((com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener)v0));
                        }
                    }

                    return;
                }
            }
        }

        public void onBackgroundStateChanged(boolean arg5) {
            Object v0 = FirebaseApp.LOCK;
            __monitor_enter(v0);
            try {
                Iterator v1 = new ArrayList(FirebaseApp.INSTANCES.values()).iterator();
                while(v1.hasNext()) {
                    Object v2 = v1.next();
                    if(!((FirebaseApp)v2).automaticResourceManagementEnabled.get()) {
                        continue;
                    }

                    ((FirebaseApp)v2).notifyBackgroundStateChangeListeners(arg5);
                }

                __monitor_exit(v0);
                return;
            label_18:
                __monitor_exit(v0);
            }
            catch(Throwable v5) {
                goto label_18;
            }

            throw v5;
        }
    }

    @KeepForSdk @Deprecated public interface IdTokenListener {
        @KeepForSdk void onIdTokenChanged(@NonNull InternalTokenResult arg1);
    }

    @KeepForSdk @Deprecated public interface IdTokenListenersCountChangedListener {
        @KeepForSdk void onListenerCountChanged(int arg1);
    }

    class UiExecutor implements Executor {
        private static final Handler HANDLER;

        static {
            UiExecutor.HANDLER = new Handler(Looper.getMainLooper());
        }

        UiExecutor(com.google.firebase.FirebaseApp$1 arg1) {
            this();
        }

        private UiExecutor() {
            super();
        }

        public void execute(@NonNull Runnable arg2) {
            UiExecutor.HANDLER.post(arg2);
        }
    }

    @TargetApi(value=24) class UserUnlockReceiver extends BroadcastReceiver {
        private static AtomicReference INSTANCE;
        private final Context applicationContext;

        static {
            UserUnlockReceiver.INSTANCE = new AtomicReference();
        }

        public UserUnlockReceiver(Context arg1) {
            super();
            this.applicationContext = arg1;
        }

        static void access$200(Context arg0) {
            UserUnlockReceiver.ensureReceiverRegistered(arg0);
        }

        private static void ensureReceiverRegistered(Context arg3) {
            if(UserUnlockReceiver.INSTANCE.get() == null) {
                UserUnlockReceiver v0 = new UserUnlockReceiver(arg3);
                if(UserUnlockReceiver.INSTANCE.compareAndSet(null, v0)) {
                    arg3.registerReceiver(((BroadcastReceiver)v0), new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void onReceive(Context arg2, Intent arg3) {
            Object v2 = FirebaseApp.LOCK;
            __monitor_enter(v2);
            try {
                Iterator v3_1 = FirebaseApp.INSTANCES.values().iterator();
                while(v3_1.hasNext()) {
                    v3_1.next().initializeAllApis();
                }

                __monitor_exit(v2);
            }
            catch(Throwable v3) {
                goto label_14;
            }

            this.unregister();
            return;
            try {
            label_14:
                __monitor_exit(v2);
            }
            catch(Throwable v3) {
                goto label_14;
            }

            throw v3;
        }

        public void unregister() {
            this.applicationContext.unregisterReceiver(((BroadcastReceiver)this));
        }
    }

    private static final List API_INITIALIZERS = null;
    private static final String AUTH_CLASSNAME = "com.google.firebase.auth.FirebaseAuth";
    private static final Set CORE_CLASSES = null;
    private static final String CRASH_CLASSNAME = "com.google.firebase.crash.FirebaseCrash";
    @VisibleForTesting static final String DATA_COLLECTION_DEFAULT_ENABLED = "firebase_data_collection_default_enabled";
    private static final List DEFAULT_APP_API_INITITALIZERS = null;
    public static final String DEFAULT_APP_NAME = "[DEFAULT]";
    private static final List DEFAULT_CONTEXT_API_INITITALIZERS = null;
    private static final List DIRECT_BOOT_COMPATIBLE_API_INITIALIZERS = null;
    private static final String FIREBASE_ANDROID = "fire-android";
    private static final String FIREBASE_APP_PREFS = "com.google.firebase.common.prefs:";
    private static final String FIREBASE_COMMON = "fire-core";
    private static final String IID_CLASSNAME = "com.google.firebase.iid.FirebaseInstanceId";
    @GuardedBy(value="LOCK") static final Map INSTANCES = null;
    private static final Object LOCK = null;
    private static final String LOG_TAG = "FirebaseApp";
    private static final String MEASUREMENT_CLASSNAME = "com.google.android.gms.measurement.AppMeasurement";
    private static final Executor UI_EXECUTOR;
    private final Context applicationContext;
    private final AtomicBoolean automaticResourceManagementEnabled;
    private final List backgroundStateChangeListeners;
    private final ComponentRuntime componentRuntime;
    private final AtomicBoolean dataCollectionDefaultEnabled;
    private final AtomicBoolean deleted;
    private final List idTokenListeners;
    private IdTokenListenersCountChangedListener idTokenListenersCountChangedListener;
    private final List lifecycleListeners;
    private final String name;
    private final FirebaseOptions options;
    private final Publisher publisher;
    private final SharedPreferences sharedPreferences;
    private InternalTokenProvider tokenProvider;

    static {
        FirebaseApp.API_INITIALIZERS = Arrays.asList(new String[]{"com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId"});
        FirebaseApp.DEFAULT_APP_API_INITITALIZERS = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");
        FirebaseApp.DEFAULT_CONTEXT_API_INITITALIZERS = Arrays.asList(new String[]{"com.google.android.gms.measurement.AppMeasurement"});
        FirebaseApp.DIRECT_BOOT_COMPATIBLE_API_INITIALIZERS = Arrays.asList(new String[0]);
        FirebaseApp.CORE_CLASSES = Collections.emptySet();
        FirebaseApp.LOCK = new Object();
        FirebaseApp.UI_EXECUTOR = new UiExecutor(null);
        FirebaseApp.INSTANCES = new ArrayMap();
    }

    protected FirebaseApp(Context arg7, String arg8, FirebaseOptions arg9) {
        super();
        this.automaticResourceManagementEnabled = new AtomicBoolean(false);
        this.deleted = new AtomicBoolean();
        this.idTokenListeners = new CopyOnWriteArrayList();
        this.backgroundStateChangeListeners = new CopyOnWriteArrayList();
        this.lifecycleListeners = new CopyOnWriteArrayList();
        this.applicationContext = Preconditions.checkNotNull(arg7);
        this.name = Preconditions.checkNotEmpty(arg8);
        this.options = Preconditions.checkNotNull(arg9);
        this.idTokenListenersCountChangedListener = new DefaultIdTokenListenersCountChangedListener();
        this.sharedPreferences = arg7.getSharedPreferences(FirebaseApp.getSharedPrefsName(arg8), 0);
        this.dataCollectionDefaultEnabled = new AtomicBoolean(this.readAutoDataCollectionEnabled());
        this.componentRuntime = new ComponentRuntime(FirebaseApp.UI_EXECUTOR, ComponentDiscovery.forContext(arg7).discover(), new Component[]{Component.of(arg7, Context.class, new Class[0]), Component.of(this, FirebaseApp.class, new Class[0]), Component.of(arg9, FirebaseOptions.class, new Class[0]), LibraryVersionComponent.create("fire-android", ""), LibraryVersionComponent.create("fire-core", "16.1.0"), DefaultUserAgentPublisher.component()});
        this.publisher = this.componentRuntime.get(Publisher.class);
    }

    static Object access$300() {
        return FirebaseApp.LOCK;
    }

    static void access$400(FirebaseApp arg0) {
        arg0.initializeAllApis();
    }

    static AtomicBoolean access$500(FirebaseApp arg0) {
        return arg0.automaticResourceManagementEnabled;
    }

    static void access$600(FirebaseApp arg0, boolean arg1) {
        arg0.notifyBackgroundStateChangeListeners(arg1);
    }

    @KeepForSdk public void addBackgroundStateChangeListener(BackgroundStateChangeListener arg2) {
        this.checkNotDeleted();
        if((this.automaticResourceManagementEnabled.get()) && (BackgroundDetector.getInstance().isInBackground())) {
            arg2.onBackgroundStateChanged(true);
        }

        this.backgroundStateChangeListeners.add(arg2);
    }

    @KeepForSdk @Deprecated public void addIdTokenListener(@NonNull IdTokenListener arg2) {
        this.checkNotDeleted();
        Preconditions.checkNotNull(arg2);
        this.idTokenListeners.add(arg2);
        this.idTokenListenersCountChangedListener.onListenerCountChanged(this.idTokenListeners.size());
    }

    @KeepForSdk public void addLifecycleEventListener(@NonNull FirebaseAppLifecycleListener arg2) {
        this.checkNotDeleted();
        Preconditions.checkNotNull(arg2);
        this.lifecycleListeners.add(arg2);
    }

    private void checkNotDeleted() {
        Preconditions.checkState(this.deleted.get() ^ 1, "FirebaseApp was deleted");
    }

    @VisibleForTesting public static void clearInstancesForTest() {
        Object v0 = FirebaseApp.LOCK;
        __monitor_enter(v0);
        try {
            FirebaseApp.INSTANCES.clear();
            __monitor_exit(v0);
            return;
        label_7:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_7;
        }

        throw v1;
    }

    @PublicApi public void delete() {
        if(!this.deleted.compareAndSet(false, true)) {
            return;
        }

        Object v0 = FirebaseApp.LOCK;
        __monitor_enter(v0);
        try {
            FirebaseApp.INSTANCES.remove(this.name);
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            try {
            label_15:
                __monitor_exit(v0);
            }
            catch(Throwable v1) {
                goto label_15;
            }

            throw v1;
        }

        this.notifyOnAppDeleted();
    }

    public boolean equals(Object arg2) {
        if(!(arg2 instanceof FirebaseApp)) {
            return 0;
        }

        return this.name.equals(((FirebaseApp)arg2).getName());
    }

    @KeepForSdk public Object get(Class arg2) {
        this.checkNotDeleted();
        return this.componentRuntime.get(arg2);
    }

    private static List getAllAppNames() {
        ArrayList v0 = new ArrayList();
        Object v1 = FirebaseApp.LOCK;
        __monitor_enter(v1);
        try {
            Iterator v2 = FirebaseApp.INSTANCES.values().iterator();
            while(v2.hasNext()) {
                ((List)v0).add(v2.next().getName());
            }

            __monitor_exit(v1);
        }
        catch(Throwable v0_1) {
            goto label_17;
        }

        Collections.sort(((List)v0));
        return ((List)v0);
        try {
        label_17:
            __monitor_exit(v1);
        }
        catch(Throwable v0_1) {
            goto label_17;
        }

        throw v0_1;
    }

    @NonNull @PublicApi public Context getApplicationContext() {
        this.checkNotDeleted();
        return this.applicationContext;
    }

    @PublicApi public static List getApps(Context arg2) {
        Object v2 = FirebaseApp.LOCK;
        __monitor_enter(v2);
        try {
            __monitor_exit(v2);
            return new ArrayList(FirebaseApp.INSTANCES.values());
        label_9:
            __monitor_exit(v2);
        }
        catch(Throwable v0) {
            goto label_9;
        }

        throw v0;
    }

    @NonNull @PublicApi public static FirebaseApp getInstance() {
        Object v0 = FirebaseApp.LOCK;
        __monitor_enter(v0);
        try {
            Object v1_1 = FirebaseApp.INSTANCES.get("[DEFAULT]");
            if(v1_1 != null) {
                __monitor_exit(v0);
                return ((FirebaseApp)v1_1);
            }

            StringBuilder v2 = new StringBuilder();
            v2.append("Default FirebaseApp is not initialized in this process ");
            v2.append(ProcessUtils.getMyProcessName());
            v2.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
            throw new IllegalStateException(v2.toString());
        label_21:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_21;
        }

        throw v1;
    }

    @NonNull @PublicApi public static FirebaseApp getInstance(@NonNull String arg5) {
        Object v0 = FirebaseApp.LOCK;
        __monitor_enter(v0);
        try {
            Object v1 = FirebaseApp.INSTANCES.get(FirebaseApp.normalize(arg5));
            if(v1 != null) {
                __monitor_exit(v0);
                return ((FirebaseApp)v1);
            }

            List v1_1 = FirebaseApp.getAllAppNames();
            String v1_2 = v1_1.isEmpty() ? "" : "Available app names: " + TextUtils.join(", ", ((Iterable)v1_1));
            throw new IllegalStateException(String.format("FirebaseApp with name %s doesn\'t exist. %s", arg5, v1_2));
        label_33:
            __monitor_exit(v0);
        }
        catch(Throwable v5) {
            goto label_33;
        }

        throw v5;
    }

    @KeepForSdk @Deprecated public List getListeners() {
        this.checkNotDeleted();
        return this.idTokenListeners;
    }

    @NonNull @PublicApi public String getName() {
        this.checkNotDeleted();
        return this.name;
    }

    @NonNull @PublicApi public FirebaseOptions getOptions() {
        this.checkNotDeleted();
        return this.options;
    }

    @KeepForSdk public static String getPersistenceKey(String arg2, FirebaseOptions arg3) {
        return Base64Utils.encodeUrlSafeNoPadding(arg2.getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(arg3.getApplicationId().getBytes(Charset.defaultCharset()));
    }

    @KeepForSdk public String getPersistenceKey() {
        return Base64Utils.encodeUrlSafeNoPadding(this.getName().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(this.getOptions().getApplicationId().getBytes(Charset.defaultCharset()));
    }

    private static String getSharedPrefsName(String arg2) {
        return "com.google.firebase.common.prefs:" + arg2;
    }

    @NonNull @KeepForSdk @Deprecated public Task getToken(boolean arg2) {
        this.checkNotDeleted();
        if(this.tokenProvider == null) {
            return Tasks.forException(new FirebaseApiNotAvailableException("firebase-auth is not linked, please fall back to unauthenticated mode."));
        }

        return this.tokenProvider.getAccessToken(arg2);
    }

    @Nullable @KeepForSdk @Deprecated public String getUid() throws FirebaseApiNotAvailableException {
        this.checkNotDeleted();
        if(this.tokenProvider != null) {
            return this.tokenProvider.getUid();
        }

        throw new FirebaseApiNotAvailableException("firebase-auth is not linked, please fall back to unauthenticated mode.");
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    private void initializeAllApis() {
        boolean v0 = ContextCompat.isDeviceProtectedStorage(this.applicationContext);
        if(v0) {
            UserUnlockReceiver.access$200(this.applicationContext);
        }
        else {
            this.componentRuntime.initializeEagerComponents(this.isDefaultApp());
        }

        this.initializeApis(FirebaseApp.class, this, FirebaseApp.API_INITIALIZERS, v0);
        if(this.isDefaultApp()) {
            this.initializeApis(FirebaseApp.class, this, FirebaseApp.DEFAULT_APP_API_INITITALIZERS, v0);
            this.initializeApis(Context.class, this.applicationContext, FirebaseApp.DEFAULT_CONTEXT_API_INITITALIZERS, v0);
        }
    }

    private void initializeApis(Class arg7, Object arg8, Iterable arg9, boolean arg10) {
        Object v0;
        Iterator v9 = arg9.iterator();
    label_1:
        while(v9.hasNext()) {
            v0 = v9.next();
            if(arg10) {
                try {
                    if(!FirebaseApp.DIRECT_BOOT_COMPATIBLE_API_INITIALIZERS.contains(v0)) {
                        continue;
                    }

                label_14:
                    Method v1_1 = Class.forName(((String)v0)).getMethod("getInstance", arg7);
                    int v2 = v1_1.getModifiers();
                    if(!Modifier.isPublic(v2)) {
                        continue;
                    }

                    if(!Modifier.isStatic(v2)) {
                        continue;
                    }

                    v1_1.invoke(null, arg8);
                    continue;
                }
                catch(IllegalAccessException v1) {
                    goto label_31;
                }
                catch(InvocationTargetException v0_1) {
                    goto label_40;
                }
                catch(NoSuchMethodException ) {
                    goto label_44;
                }
                catch(ClassNotFoundException ) {
                    goto label_53;
                }
            }

            goto label_14;
        }

        return;
    label_31:
        Log.wtf("FirebaseApp", "Failed to initialize " + (((String)v0)), ((Throwable)v1));
        goto label_1;
    label_40:
        Log.wtf("FirebaseApp", "Firebase API initialization failure.", ((Throwable)v0_1));
        goto label_1;
    label_53:
        if(!FirebaseApp.CORE_CLASSES.contains(v0)) {
            Log.d("FirebaseApp", (((String)v0)) + " is not linked. Skipping initialization.");
            goto label_1;
        }

        StringBuilder v8 = new StringBuilder();
        v8.append(((String)v0));
        v8.append(" is missing, but is required. Check if it has been removed by Proguard.");
        throw new IllegalStateException(v8.toString());
    label_44:
        v8 = new StringBuilder();
        v8.append(((String)v0));
        v8.append("#getInstance has been removed by Proguard. Add keep rule to prevent it.");
        throw new IllegalStateException(v8.toString());
    }

    @Nullable @PublicApi public static FirebaseApp initializeApp(@NonNull Context arg3) {
        Object v0 = FirebaseApp.LOCK;
        __monitor_enter(v0);
        try {
            if(FirebaseApp.INSTANCES.containsKey("[DEFAULT]")) {
                __monitor_exit(v0);
                return FirebaseApp.getInstance();
            }

            FirebaseOptions v1 = FirebaseOptions.fromResource(arg3);
            if(v1 == null) {
                Log.d("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                __monitor_exit(v0);
                return null;
            }

            __monitor_exit(v0);
            return FirebaseApp.initializeApp(arg3, v1);
        label_21:
            __monitor_exit(v0);
        }
        catch(Throwable v3) {
            goto label_21;
        }

        throw v3;
    }

    @NonNull @PublicApi public static FirebaseApp initializeApp(@NonNull Context arg1, @NonNull FirebaseOptions arg2) {
        return FirebaseApp.initializeApp(arg1, arg2, "[DEFAULT]");
    }

    @NonNull @PublicApi public static FirebaseApp initializeApp(@NonNull Context arg4, @NonNull FirebaseOptions arg5, @NonNull String arg6) {
        FirebaseApp v1_1;
        GlobalBackgroundStateListener.access$100(arg4);
        arg6 = FirebaseApp.normalize(arg6);
        if(arg4.getApplicationContext() == null) {
        }
        else {
            arg4 = arg4.getApplicationContext();
        }

        Object v0 = FirebaseApp.LOCK;
        __monitor_enter(v0);
        try {
            int v1 = FirebaseApp.INSTANCES.containsKey(arg6) ^ 1;
            Preconditions.checkState(((boolean)v1), "FirebaseApp name " + arg6 + " already exists!");
            Preconditions.checkNotNull(arg4, "Application context cannot be null.");
            v1_1 = new FirebaseApp(arg4, arg6, arg5);
            FirebaseApp.INSTANCES.put(arg6, v1_1);
            __monitor_exit(v0);
        }
        catch(Throwable v4) {
            try {
            label_30:
                __monitor_exit(v0);
            }
            catch(Throwable v4) {
                goto label_30;
            }

            throw v4;
        }

        v1_1.initializeAllApis();
        return v1_1;
    }

    @KeepForSdk public boolean isDataCollectionDefaultEnabled() {
        this.checkNotDeleted();
        return this.dataCollectionDefaultEnabled.get();
    }

    @VisibleForTesting @KeepForSdk public boolean isDefaultApp() {
        return "[DEFAULT]".equals(this.getName());
    }

    private static String normalize(@NonNull String arg0) {
        return arg0.trim();
    }

    private void notifyBackgroundStateChangeListeners(boolean arg3) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator v0 = this.backgroundStateChangeListeners.iterator();
        while(v0.hasNext()) {
            v0.next().onBackgroundStateChanged(arg3);
        }
    }

    @UiThread @KeepForSdk @Deprecated public void notifyIdTokenListeners(@NonNull InternalTokenResult arg5) {
        Log.d("FirebaseApp", "Notifying auth state listeners.");
        Iterator v0 = this.idTokenListeners.iterator();
        int v2;
        for(v2 = 0; v0.hasNext(); ++v2) {
            v0.next().onIdTokenChanged(arg5);
        }

        Log.d("FirebaseApp", String.format("Notified %d auth state listeners.", Integer.valueOf(v2)));
    }

    private void notifyOnAppDeleted() {
        Iterator v0 = this.lifecycleListeners.iterator();
        while(v0.hasNext()) {
            v0.next().onDeleted(this.name, this.options);
        }
    }

    private boolean readAutoDataCollectionEnabled() {
        if(this.sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            return this.sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        }

        try {
            PackageManager v0 = this.applicationContext.getPackageManager();
            if(v0 != null) {
                ApplicationInfo v0_1 = v0.getApplicationInfo(this.applicationContext.getPackageName(), 0x80);
                if(v0_1 != null && v0_1.metaData != null && (v0_1.metaData.containsKey("firebase_data_collection_default_enabled"))) {
                    return v0_1.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            }

            return 1;
        }
        catch(PackageManager$NameNotFoundException ) {
            return 1;
        }
    }

    @KeepForSdk public void removeBackgroundStateChangeListener(BackgroundStateChangeListener arg2) {
        this.checkNotDeleted();
        this.backgroundStateChangeListeners.remove(arg2);
    }

    @KeepForSdk @Deprecated public void removeIdTokenListener(@NonNull IdTokenListener arg2) {
        this.checkNotDeleted();
        Preconditions.checkNotNull(arg2);
        this.idTokenListeners.remove(arg2);
        this.idTokenListenersCountChangedListener.onListenerCountChanged(this.idTokenListeners.size());
    }

    @KeepForSdk public void removeLifecycleEventListener(@NonNull FirebaseAppLifecycleListener arg2) {
        this.checkNotDeleted();
        Preconditions.checkNotNull(arg2);
        this.lifecycleListeners.remove(arg2);
    }

    @PublicApi public void setAutomaticResourceManagementEnabled(boolean arg3) {
        this.checkNotDeleted();
        if(this.automaticResourceManagementEnabled.compareAndSet((((int)arg3)) ^ 1, arg3)) {
            boolean v0 = BackgroundDetector.getInstance().isInBackground();
            if((arg3) && (v0)) {
                this.notifyBackgroundStateChangeListeners(true);
                return;
            }

            if(arg3) {
                return;
            }

            if(!v0) {
                return;
            }

            this.notifyBackgroundStateChangeListeners(false);
        }
    }

    @KeepForSdk public void setDataCollectionDefaultEnabled(boolean arg5) {
        this.checkNotDeleted();
        if(this.dataCollectionDefaultEnabled.compareAndSet((((int)arg5)) ^ 1, arg5)) {
            this.sharedPreferences.edit().putBoolean("firebase_data_collection_default_enabled", arg5).commit();
            this.publisher.publish(new Event(DataCollectionDefaultChange.class, new DataCollectionDefaultChange(arg5)));
        }
    }

    @KeepForSdk @Deprecated public void setIdTokenListenersCountChangedListener(@NonNull IdTokenListenersCountChangedListener arg2) {
        this.idTokenListenersCountChangedListener = Preconditions.checkNotNull(arg2);
        this.idTokenListenersCountChangedListener.onListenerCountChanged(this.idTokenListeners.size());
    }

    @KeepForSdk @Deprecated public void setTokenProvider(@NonNull InternalTokenProvider arg1) {
        this.tokenProvider = Preconditions.checkNotNull(arg1);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.name).add("options", this.options).toString();
    }
}

