package androidx.core.provider;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri$Builder;
import android.net.Uri;
import android.os.Build$VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.content.res.ResourcesCompat$FontCallback;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class FontsContractCompat {
    final class androidx.core.provider.FontsContractCompat$5 implements Comparator {
        androidx.core.provider.FontsContractCompat$5() {
            super();
        }

        public int compare(Object arg1, Object arg2) {
            return this.compare(((byte[])arg1), ((byte[])arg2));
        }

        public int compare(byte[] arg5, byte[] arg6) {
            if(arg5.length != arg6.length) {
                return arg5.length - arg6.length;
            }

            int v1;
            for(v1 = 0; v1 < arg5.length; ++v1) {
                if(arg5[v1] != arg6[v1]) {
                    return arg5[v1] - arg6[v1];
                }
            }

            return 0;
        }
    }

    public final class Columns implements BaseColumns {
        public static final String FILE_ID = "file_id";
        public static final String ITALIC = "font_italic";
        public static final String RESULT_CODE = "result_code";
        public static final int RESULT_CODE_FONT_NOT_FOUND = 1;
        public static final int RESULT_CODE_FONT_UNAVAILABLE = 2;
        public static final int RESULT_CODE_MALFORMED_QUERY = 3;
        public static final int RESULT_CODE_OK = 0;
        public static final String TTC_INDEX = "font_ttc_index";
        public static final String VARIATION_SETTINGS = "font_variation_settings";
        public static final String WEIGHT = "font_weight";

        public Columns() {
            super();
        }
    }

    public class FontFamilyResult {
        public static final int STATUS_OK = 0;
        public static final int STATUS_UNEXPECTED_DATA_PROVIDED = 2;
        public static final int STATUS_WRONG_CERTIFICATES = 1;
        private final FontInfo[] mFonts;
        private final int mStatusCode;

        @RestrictTo(value={Scope.LIBRARY_GROUP}) public FontFamilyResult(int arg1, @Nullable FontInfo[] arg2) {
            super();
            this.mStatusCode = arg1;
            this.mFonts = arg2;
        }

        public FontInfo[] getFonts() {
            return this.mFonts;
        }

        public int getStatusCode() {
            return this.mStatusCode;
        }
    }

    public class FontInfo {
        private final boolean mItalic;
        private final int mResultCode;
        private final int mTtcIndex;
        private final Uri mUri;
        private final int mWeight;

        @RestrictTo(value={Scope.LIBRARY_GROUP}) public FontInfo(@NonNull Uri arg1, @IntRange(from=0) int arg2, @IntRange(from=1, to=1000) int arg3, boolean arg4, int arg5) {
            super();
            this.mUri = Preconditions.checkNotNull(arg1);
            this.mTtcIndex = arg2;
            this.mWeight = arg3;
            this.mItalic = arg4;
            this.mResultCode = arg5;
        }

        public int getResultCode() {
            return this.mResultCode;
        }

        @IntRange(from=0) public int getTtcIndex() {
            return this.mTtcIndex;
        }

        @NonNull public Uri getUri() {
            return this.mUri;
        }

        @IntRange(from=1, to=1000) public int getWeight() {
            return this.mWeight;
        }

        public boolean isItalic() {
            return this.mItalic;
        }
    }

    public class FontRequestCallback {
        @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface FontRequestFailReason {
        }

        public static final int FAIL_REASON_FONT_LOAD_ERROR = -3;
        public static final int FAIL_REASON_FONT_NOT_FOUND = 1;
        public static final int FAIL_REASON_FONT_UNAVAILABLE = 2;
        public static final int FAIL_REASON_MALFORMED_QUERY = 3;
        public static final int FAIL_REASON_PROVIDER_NOT_FOUND = -1;
        public static final int FAIL_REASON_SECURITY_VIOLATION = -4;
        public static final int FAIL_REASON_WRONG_CERTIFICATES = -2;
        @RestrictTo(value={Scope.LIBRARY_GROUP}) public static final int RESULT_OK;

        public FontRequestCallback() {
            super();
        }

        public void onTypefaceRequestFailed(int arg1) {
        }

        public void onTypefaceRetrieved(Typeface arg1) {
        }
    }

    final class TypefaceResult {
        final int mResult;
        final Typeface mTypeface;

        TypefaceResult(@Nullable Typeface arg1, int arg2) {
            super();
            this.mTypeface = arg1;
            this.mResult = arg2;
        }
    }

    private static final int BACKGROUND_THREAD_KEEP_ALIVE_DURATION_MS = 10000;
    @RestrictTo(value={Scope.LIBRARY_GROUP}) public static final String PARCEL_FONT_RESULTS = "font_results";
    @RestrictTo(value={Scope.LIBRARY_GROUP}) static final int RESULT_CODE_PROVIDER_NOT_FOUND = -1;
    @RestrictTo(value={Scope.LIBRARY_GROUP}) static final int RESULT_CODE_WRONG_CERTIFICATES = -2;
    private static final String TAG = "FontsContractCompat";
    private static final SelfDestructiveThread sBackgroundThread;
    private static final Comparator sByteArrayComparator;
    static final Object sLock;
    @GuardedBy(value="sLock") static final SimpleArrayMap sPendingReplies;
    static final LruCache sTypefaceCache;

    static {
        FontsContractCompat.sTypefaceCache = new LruCache(16);
        FontsContractCompat.sBackgroundThread = new SelfDestructiveThread("fonts", 10, 10000);
        FontsContractCompat.sLock = new Object();
        FontsContractCompat.sPendingReplies = new SimpleArrayMap();
        FontsContractCompat.sByteArrayComparator = new androidx.core.provider.FontsContractCompat$5();
    }

    private FontsContractCompat() {
        super();
    }

    @Nullable public static Typeface buildTypeface(@NonNull Context arg1, @Nullable CancellationSignal arg2, @NonNull FontInfo[] arg3) {
        return TypefaceCompat.createFromFontInfo(arg1, arg2, arg3, 0);
    }

    private static List convertToByteArrayList(Signature[] arg3) {
        ArrayList v0 = new ArrayList();
        int v1;
        for(v1 = 0; v1 < arg3.length; ++v1) {
            ((List)v0).add(arg3[v1].toByteArray());
        }

        return ((List)v0);
    }

    private static boolean equalsByteArrayList(List arg4, List arg5) {
        if(arg4.size() != arg5.size()) {
            return 0;
        }

        int v0;
        for(v0 = 0; v0 < arg4.size(); ++v0) {
            if(!Arrays.equals(arg4.get(v0), arg5.get(v0))) {
                return 0;
            }
        }

        return 1;
    }

    @NonNull public static FontFamilyResult fetchFonts(@NonNull Context arg2, @Nullable CancellationSignal arg3, @NonNull FontRequest arg4) throws PackageManager$NameNotFoundException {
        ProviderInfo v0 = FontsContractCompat.getProvider(arg2.getPackageManager(), arg4, arg2.getResources());
        if(v0 == null) {
            return new FontFamilyResult(1, null);
        }

        return new FontFamilyResult(0, FontsContractCompat.getFontFromProvider(arg2, arg4, v0.authority, arg3));
    }

    private static List getCertificates(FontRequest arg1, Resources arg2) {
        if(arg1.getCertificates() != null) {
            return arg1.getCertificates();
        }

        return FontResourcesParserCompat.readCerts(arg2, arg1.getCertificatesArrayResId());
    }

    @NonNull @VisibleForTesting static FontInfo[] getFontFromProvider(Context arg20, FontRequest arg21, String arg22, CancellationSignal arg23) {
        ArrayList v3_1;
        ArrayList v1 = new ArrayList();
        Uri v2 = new Uri$Builder().scheme("content").authority(arg22).build();
        Uri v0 = new Uri$Builder().scheme("content").authority(arg22).appendPath("file").build();
        Cursor v10 = null;
        try {
            Cursor v3 = Build$VERSION.SDK_INT > 16 ? arg20.getContentResolver().query(v2, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{arg21.getQuery()}, null, arg23) : arg20.getContentResolver().query(v2, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{arg21.getQuery()}, null);
            v10 = v3;
            if(v10 != null && v10.getCount() > 0) {
                int v1_1 = v10.getColumnIndex("result_code");
                v3_1 = new ArrayList();
                int v4 = v10.getColumnIndex("_id");
                int v5 = v10.getColumnIndex("file_id");
                int v6 = v10.getColumnIndex("font_ttc_index");
                int v7 = v10.getColumnIndex("font_weight");
                int v8 = v10.getColumnIndex("font_italic");
                while(true) {
                    if(v10.moveToNext()) {
                        int v9 = -1;
                        int v19 = v1_1 != v9 ? v10.getInt(v1_1) : 0;
                        int v16 = v6 != v9 ? v10.getInt(v6) : 0;
                        Uri v13 = v5 == v9 ? ContentUris.withAppendedId(v2, v10.getLong(v4)) : ContentUris.withAppendedId(v0, v10.getLong(v5));
                        Uri v15 = v13;
                        int v17 = v7 != v9 ? v10.getInt(v7) : 400;
                        boolean v18 = v8 == v9 || v10.getInt(v8) != 1 ? false : true;
                        v3_1.add(new FontInfo(v15, v16, v17, v18, v19));
                        continue;
                    }
                    else {
                        goto label_115;
                    }
                }
            }

            goto label_116;
        }
        catch(Throwable v0_1) {
            goto label_122;
        }

    label_115:
        v1 = v3_1;
        goto label_116;
    label_122:
        if(v10 != null) {
            v10.close();
        }

        throw v0_1;
    label_116:
        if(v10 != null) {
            v10.close();
        }

        return v1.toArray(new FontInfo[0]);
    }

    @NonNull static TypefaceResult getFontInternal(Context arg3, FontRequest arg4, int arg5) {
        FontFamilyResult v4;
        CancellationSignal v0 = null;
        try {
            v4 = FontsContractCompat.fetchFonts(arg3, v0, arg4);
        }
        catch(PackageManager$NameNotFoundException ) {
            return new TypefaceResult(((Typeface)v0), -1);
        }

        int v2 = -3;
        if(v4.getStatusCode() == 0) {
            Typeface v3 = TypefaceCompat.createFromFontInfo(arg3, v0, v4.getFonts(), arg5);
            if(v3 != null) {
                v2 = 0;
            }

            return new TypefaceResult(v3, v2);
        }

        if(v4.getStatusCode() == 1) {
            v2 = -2;
        }

        return new TypefaceResult(((Typeface)v0), v2);
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public static Typeface getFontSync(Context arg2, FontRequest arg3, @Nullable FontCallback arg4, @Nullable Handler arg5, boolean arg6, int arg7, int arg8) {
        String v0_1 = arg3.getIdentifier() + "-" + arg8;
        Object v1 = FontsContractCompat.sTypefaceCache.get(v0_1);
        if(v1 != null) {
            if(arg4 != null) {
                arg4.onFontRetrieved(((Typeface)v1));
            }

            return ((Typeface)v1);
        }

        if((arg6) && arg7 == -1) {
            TypefaceResult v2 = FontsContractCompat.getFontInternal(arg2, arg3, arg8);
            if(arg4 != null) {
                if(v2.mResult == 0) {
                    arg4.callbackSuccessAsync(v2.mTypeface, arg5);
                }
                else {
                    arg4.callbackFailAsync(v2.mResult, arg5);
                }
            }

            return v2.mTypeface;
        }

        androidx.core.provider.FontsContractCompat$1 v1_1 = new Callable(arg2, arg3, arg8, v0_1) {
            public TypefaceResult call() throws Exception {
                TypefaceResult v0 = FontsContractCompat.getFontInternal(this.val$context, this.val$request, this.val$style);
                if(v0.mTypeface != null) {
                    FontsContractCompat.sTypefaceCache.put(this.val$id, v0.mTypeface);
                }

                return v0;
            }

            public Object call() throws Exception {
                return this.call();
            }
        };
        Typeface v2_1 = null;
        if(arg6) {
            try {
                return FontsContractCompat.sBackgroundThread.postAndWait(((Callable)v1_1), arg7).mTypeface;
            }
            catch(InterruptedException ) {
                return v2_1;
            }
        }

        androidx.core.provider.FontsContractCompat$2 v3 = arg4 == null ? ((androidx.core.provider.FontsContractCompat$2)v2_1) : new ReplyCallback(arg4, arg5) {
            public void onReply(TypefaceResult arg3) {
                if(arg3 == null) {
                    this.val$fontCallback.callbackFailAsync(1, this.val$handler);
                }
                else if(arg3.mResult == 0) {
                    this.val$fontCallback.callbackSuccessAsync(arg3.mTypeface, this.val$handler);
                }
                else {
                    this.val$fontCallback.callbackFailAsync(arg3.mResult, this.val$handler);
                }
            }

            public void onReply(Object arg1) {
                this.onReply(((TypefaceResult)arg1));
            }
        };
        Object v4 = FontsContractCompat.sLock;
        __monitor_enter(v4);
        try {
            if(FontsContractCompat.sPendingReplies.containsKey(v0_1)) {
                if(v3 != null) {
                    FontsContractCompat.sPendingReplies.get(v0_1).add(v3);
                }

                __monitor_exit(v4);
                return v2_1;
            }

            if(v3 != null) {
                ArrayList v5 = new ArrayList();
                v5.add(v3);
                FontsContractCompat.sPendingReplies.put(v0_1, v5);
            }

            __monitor_exit(v4);
        }
        catch(Throwable v2_2) {
            try {
            label_66:
                __monitor_exit(v4);
            }
            catch(Throwable v2_2) {
                goto label_66;
            }

            throw v2_2;
        }

        FontsContractCompat.sBackgroundThread.postAndReply(((Callable)v1_1), new ReplyCallback(v0_1) {
            public void onReply(TypefaceResult arg5) {
                int v0_1;
                Object v1;
                Object v0 = FontsContractCompat.sLock;
                __monitor_enter(v0);
                try {
                    v1 = FontsContractCompat.sPendingReplies.get(this.val$id);
                    if(v1 == null) {
                        __monitor_exit(v0);
                        return;
                    }

                    FontsContractCompat.sPendingReplies.remove(this.val$id);
                    __monitor_exit(v0);
                    v0_1 = 0;
                }
                catch(Throwable v5) {
                    try {
                    label_21:
                        __monitor_exit(v0_1);
                    }
                    catch(Throwable v5) {
                        goto label_21;
                    }

                    throw v5;
                }

                while(v0_1 < ((ArrayList)v1).size()) {
                    ((ArrayList)v1).get(v0_1).onReply(arg5);
                    ++v0_1;
                }
            }

            public void onReply(Object arg1) {
                this.onReply(((TypefaceResult)arg1));
            }
        });
        return v2_1;
    }

    @Nullable @RestrictTo(value={Scope.LIBRARY_GROUP}) @VisibleForTesting public static ProviderInfo getProvider(@NonNull PackageManager arg5, @NonNull FontRequest arg6, @Nullable Resources arg7) throws PackageManager$NameNotFoundException {
        String v0 = arg6.getProviderAuthority();
        int v1 = 0;
        ProviderInfo v2 = arg5.resolveContentProvider(v0, 0);
        if(v2 != null) {
            if(v2.packageName.equals(arg6.getProviderPackage())) {
                List v5 = FontsContractCompat.convertToByteArrayList(arg5.getPackageInfo(v2.packageName, 0x40).signatures);
                Collections.sort(v5, FontsContractCompat.sByteArrayComparator);
                List v6 = FontsContractCompat.getCertificates(arg6, arg7);
                while(v1 < v6.size()) {
                    ArrayList v7 = new ArrayList(v6.get(v1));
                    Collections.sort(((List)v7), FontsContractCompat.sByteArrayComparator);
                    if(FontsContractCompat.equalsByteArrayList(v5, ((List)v7))) {
                        return v2;
                    }

                    ++v1;
                }

                return null;
            }

            StringBuilder v7_1 = new StringBuilder();
            v7_1.append("Found content provider ");
            v7_1.append(v0);
            v7_1.append(", but package was not ");
            v7_1.append(arg6.getProviderPackage());
            throw new PackageManager$NameNotFoundException(v7_1.toString());
        }

        StringBuilder v6_1 = new StringBuilder();
        v6_1.append("No package found for authority: ");
        v6_1.append(v0);
        throw new PackageManager$NameNotFoundException(v6_1.toString());
    }

    @RequiresApi(value=19) @RestrictTo(value={Scope.LIBRARY_GROUP}) public static Map prepareFontData(Context arg5, FontInfo[] arg6, CancellationSignal arg7) {
        HashMap v0 = new HashMap();
        int v1 = arg6.length;
        int v2;
        for(v2 = 0; v2 < v1; ++v2) {
            FontInfo v3 = arg6[v2];
            if(v3.getResultCode() != 0) {
            }
            else {
                Uri v3_1 = v3.getUri();
                if(v0.containsKey(v3_1)) {
                }
                else {
                    v0.put(v3_1, TypefaceCompatUtil.mmap(arg5, arg7, v3_1));
                }
            }
        }

        return Collections.unmodifiableMap(((Map)v0));
    }

    public static void requestFont(@NonNull Context arg2, @NonNull FontRequest arg3, @NonNull FontRequestCallback arg4, @NonNull Handler arg5) {
        arg5.post(new Runnable(arg2, arg3, new Handler(), arg4) {
            public void run() {
                FontFamilyResult v0;
                CancellationSignal v2;
                try {
                    v2 = null;
                    v0 = FontsContractCompat.fetchFonts(this.val$context, v2, this.val$request);
                }
                catch(PackageManager$NameNotFoundException ) {
                    this.val$callerThreadHandler.post(new Runnable() {
                        public void run() {
                            androidx.core.provider.FontsContractCompat$4.this.val$callback.onTypefaceRequestFailed(-1);
                        }
                    });
                    return;
                }

                if(v0.getStatusCode() == 0) {
                    goto label_23;
                }

                switch(v0.getStatusCode()) {
                    case 1: {
                        goto label_18;
                    }
                    case 2: {
                        goto label_13;
                    }
                }

                this.val$callerThreadHandler.post(new Runnable() {
                    public void run() {
                        androidx.core.provider.FontsContractCompat$4.this.val$callback.onTypefaceRequestFailed(-3);
                    }
                });
                return;
            label_18:
                this.val$callerThreadHandler.post(new Runnable() {
                    public void run() {
                        androidx.core.provider.FontsContractCompat$4.this.val$callback.onTypefaceRequestFailed(-2);
                    }
                });
                return;
            label_13:
                this.val$callerThreadHandler.post(new Runnable() {
                    public void run() {
                        androidx.core.provider.FontsContractCompat$4.this.val$callback.onTypefaceRequestFailed(-3);
                    }
                });
                return;
            label_23:
                FontInfo[] v0_1 = v0.getFonts();
                if(v0_1 != null) {
                    if(v0_1.length == 0) {
                    }
                    else {
                        int v1 = v0_1.length;
                        int v3 = 0;
                        while(true) {
                            if(v3 < v1) {
                                FontInfo v4 = v0_1[v3];
                                if(v4.getResultCode() != 0) {
                                    int v0_2 = v4.getResultCode();
                                    if(v0_2 < 0) {
                                        this.val$callerThreadHandler.post(new Runnable() {
                                            public void run() {
                                                androidx.core.provider.FontsContractCompat$4.this.val$callback.onTypefaceRequestFailed(-3);
                                            }
                                        });
                                    }
                                    else {
                                        this.val$callerThreadHandler.post(new Runnable(v0_2) {
                                            public void run() {
                                                androidx.core.provider.FontsContractCompat$4.this.val$callback.onTypefaceRequestFailed(this.val$resultCode);
                                            }
                                        });
                                    }

                                    return;
                                }
                                else {
                                    ++v3;
                                    continue;
                                }
                            }
                            else {
                                break;
                            }

                            goto label_61;
                        }

                        Typeface v0_3 = FontsContractCompat.buildTypeface(this.val$context, v2, v0_1);
                        if(v0_3 == null) {
                            this.val$callerThreadHandler.post(new Runnable() {
                                public void run() {
                                    androidx.core.provider.FontsContractCompat$4.this.val$callback.onTypefaceRequestFailed(-3);
                                }
                            });
                            return;
                        }

                        this.val$callerThreadHandler.post(new Runnable(v0_3) {
                            public void run() {
                                androidx.core.provider.FontsContractCompat$4.this.val$callback.onTypefaceRetrieved(this.val$typeface);
                            }
                        });
                        return;
                    }
                }

            label_61:
                this.val$callerThreadHandler.post(new Runnable() {
                    public void run() {
                        androidx.core.provider.FontsContractCompat$4.this.val$callback.onTypefaceRequestFailed(1);
                    }
                });
            }
        });
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public static void resetCache() {
        FontsContractCompat.sTypefaceCache.evictAll();
    }
}

