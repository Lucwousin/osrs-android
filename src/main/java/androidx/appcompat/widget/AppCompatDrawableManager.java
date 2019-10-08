package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff$Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$color;
import androidx.appcompat.R$drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.collection.LruCache;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public final class AppCompatDrawableManager {
    @RequiresApi(value=11) class AsldcInflateDelegate implements InflateDelegate {
        AsldcInflateDelegate() {
            super();
        }

        public Drawable createFromXmlInner(@NonNull Context arg2, @NonNull XmlPullParser arg3, @NonNull AttributeSet arg4, @Nullable Resources$Theme arg5) {
            try {
                return AnimatedStateListDrawableCompat.createFromXmlInner(arg2, arg2.getResources(), arg3, arg4, arg5);
            }
            catch(Exception v2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", ((Throwable)v2));
                return null;
            }
        }
    }

    class AvdcInflateDelegate implements InflateDelegate {
        AvdcInflateDelegate() {
            super();
        }

        public Drawable createFromXmlInner(@NonNull Context arg2, @NonNull XmlPullParser arg3, @NonNull AttributeSet arg4, @Nullable Resources$Theme arg5) {
            try {
                return AnimatedVectorDrawableCompat.createFromXmlInner(arg2, arg2.getResources(), arg3, arg4, arg5);
            }
            catch(Exception v2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", ((Throwable)v2));
                return null;
            }
        }
    }

    class ColorFilterLruCache extends LruCache {
        public ColorFilterLruCache(int arg1) {
            super(arg1);
        }

        private static int generateCacheKey(int arg1, PorterDuff$Mode arg2) {
            return (arg1 + 0x1F) * 0x1F + arg2.hashCode();
        }

        PorterDuffColorFilter get(int arg1, PorterDuff$Mode arg2) {
            return this.get(Integer.valueOf(ColorFilterLruCache.generateCacheKey(arg1, arg2)));
        }

        PorterDuffColorFilter put(int arg1, PorterDuff$Mode arg2, PorterDuffColorFilter arg3) {
            return this.put(Integer.valueOf(ColorFilterLruCache.generateCacheKey(arg1, arg2)), arg3);
        }
    }

    interface InflateDelegate {
        Drawable createFromXmlInner(@NonNull Context arg1, @NonNull XmlPullParser arg2, @NonNull AttributeSet arg3, @Nullable Resources$Theme arg4);
    }

    class VdcInflateDelegate implements InflateDelegate {
        VdcInflateDelegate() {
            super();
        }

        public Drawable createFromXmlInner(@NonNull Context arg1, @NonNull XmlPullParser arg2, @NonNull AttributeSet arg3, @Nullable Resources$Theme arg4) {
            try {
                return VectorDrawableCompat.createFromXmlInner(arg1.getResources(), arg2, arg3, arg4);
            }
            catch(Exception v1) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", ((Throwable)v1));
                return null;
            }
        }
    }

    private static final int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY = null;
    private static final int[] COLORFILTER_COLOR_CONTROL_ACTIVATED = null;
    private static final int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL = null;
    private static final ColorFilterLruCache COLOR_FILTER_CACHE = null;
    private static final boolean DEBUG = false;
    private static final PorterDuff$Mode DEFAULT_MODE = null;
    private static AppCompatDrawableManager INSTANCE = null;
    private static final String PLATFORM_VD_CLAZZ = "android.graphics.drawable.VectorDrawable";
    private static final String SKIP_DRAWABLE_TAG = "appcompat_skip_skip";
    private static final String TAG = "AppCompatDrawableManag";
    private static final int[] TINT_CHECKABLE_BUTTON_LIST;
    private static final int[] TINT_COLOR_CONTROL_NORMAL;
    private static final int[] TINT_COLOR_CONTROL_STATE_LIST;
    private ArrayMap mDelegates;
    private final WeakHashMap mDrawableCaches;
    private boolean mHasCheckedVectorDrawableSetup;
    private SparseArrayCompat mKnownDrawableIdTags;
    private WeakHashMap mTintLists;
    private TypedValue mTypedValue;

    static {
        AppCompatDrawableManager.DEFAULT_MODE = PorterDuff$Mode.SRC_IN;
        AppCompatDrawableManager.COLOR_FILTER_CACHE = new ColorFilterLruCache(6);
        AppCompatDrawableManager.COLORFILTER_TINT_COLOR_CONTROL_NORMAL = new int[]{R$drawable.abc_textfield_search_default_mtrl_alpha, R$drawable.abc_textfield_default_mtrl_alpha, R$drawable.abc_ab_share_pack_mtrl_alpha};
        AppCompatDrawableManager.TINT_COLOR_CONTROL_NORMAL = new int[]{R$drawable.abc_ic_commit_search_api_mtrl_alpha, R$drawable.abc_seekbar_tick_mark_material, R$drawable.abc_ic_menu_share_mtrl_alpha, R$drawable.abc_ic_menu_copy_mtrl_am_alpha, R$drawable.abc_ic_menu_cut_mtrl_alpha, R$drawable.abc_ic_menu_selectall_mtrl_alpha, R$drawable.abc_ic_menu_paste_mtrl_am_alpha};
        AppCompatDrawableManager.COLORFILTER_COLOR_CONTROL_ACTIVATED = new int[]{R$drawable.abc_textfield_activated_mtrl_alpha, R$drawable.abc_textfield_search_activated_mtrl_alpha, R$drawable.abc_cab_background_top_mtrl_alpha, R$drawable.abc_text_cursor_material, R$drawable.abc_text_select_handle_left_mtrl_dark, R$drawable.abc_text_select_handle_middle_mtrl_dark, R$drawable.abc_text_select_handle_right_mtrl_dark, R$drawable.abc_text_select_handle_left_mtrl_light, R$drawable.abc_text_select_handle_middle_mtrl_light, R$drawable.abc_text_select_handle_right_mtrl_light};
        AppCompatDrawableManager.COLORFILTER_COLOR_BACKGROUND_MULTIPLY = new int[]{R$drawable.abc_popup_background_mtrl_mult, R$drawable.abc_cab_background_internal_bg, R$drawable.abc_menu_hardkey_panel_mtrl_mult};
        AppCompatDrawableManager.TINT_COLOR_CONTROL_STATE_LIST = new int[]{R$drawable.abc_tab_indicator_material, R$drawable.abc_textfield_search_material};
        AppCompatDrawableManager.TINT_CHECKABLE_BUTTON_LIST = new int[]{R$drawable.abc_btn_check_material, R$drawable.abc_btn_radio_material};
    }

    public AppCompatDrawableManager() {
        super();
        this.mDrawableCaches = new WeakHashMap(0);
    }

    private void addDelegate(@NonNull String arg2, @NonNull InflateDelegate arg3) {
        if(this.mDelegates == null) {
            this.mDelegates = new ArrayMap();
        }

        this.mDelegates.put(arg2, arg3);
    }

    private boolean addDrawableToCache(@NonNull Context arg3, long arg4, @NonNull Drawable arg6) {
        LongSparseArray v0_1;
        __monitor_enter(this);
        try {
            Drawable$ConstantState v6 = arg6.getConstantState();
            if(v6 == null) {
                goto label_16;
            }

            Object v0 = this.mDrawableCaches.get(arg3);
            if(v0 == null) {
                v0_1 = new LongSparseArray();
                this.mDrawableCaches.put(arg3, v0_1);
            }

            v0_1.put(arg4, new WeakReference(v6));
        }
        catch(Throwable v3) {
            __monitor_exit(this);
            throw v3;
        }

        __monitor_exit(this);
        return 1;
    label_16:
        __monitor_exit(this);
        return 0;
    }

    private void addTintListToCache(@NonNull Context arg3, @DrawableRes int arg4, @NonNull ColorStateList arg5) {
        if(this.mTintLists == null) {
            this.mTintLists = new WeakHashMap();
        }

        Object v0 = this.mTintLists.get(arg3);
        if(v0 == null) {
            SparseArrayCompat v0_1 = new SparseArrayCompat();
            this.mTintLists.put(arg3, v0_1);
        }

        ((SparseArrayCompat)v0).append(arg4, arg5);
    }

    private static boolean arrayContains(int[] arg4, int arg5) {
        int v0 = arg4.length;
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            if(arg4[v2] == arg5) {
                return 1;
            }
        }

        return 0;
    }

    private void checkVectorDrawableSetup(@NonNull Context arg2) {
        if(this.mHasCheckedVectorDrawableSetup) {
            return;
        }

        this.mHasCheckedVectorDrawableSetup = true;
        Drawable v2 = this.getDrawable(arg2, R$drawable.abc_vector_test);
        if(v2 != null && (AppCompatDrawableManager.isVectorDrawable(v2))) {
            return;
        }

        this.mHasCheckedVectorDrawableSetup = false;
        throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
    }

    private ColorStateList createBorderlessButtonColorStateList(@NonNull Context arg2) {
        return this.createButtonColorStateList(arg2, 0);
    }

    private ColorStateList createButtonColorStateList(@NonNull Context arg6, @ColorInt int arg7) {
        int[][] v1 = new int[4][];
        int[] v0 = new int[4];
        int v2 = ThemeUtils.getThemeAttrColor(arg6, R$attr.colorControlHighlight);
        int v6 = ThemeUtils.getDisabledThemeAttrColor(arg6, R$attr.colorButtonNormal);
        v1[0] = ThemeUtils.DISABLED_STATE_SET;
        v0[0] = v6;
        v1[1] = ThemeUtils.PRESSED_STATE_SET;
        v0[1] = ColorUtils.compositeColors(v2, arg7);
        v1[2] = ThemeUtils.FOCUSED_STATE_SET;
        v0[2] = ColorUtils.compositeColors(v2, arg7);
        v1[3] = ThemeUtils.EMPTY_STATE_SET;
        v0[3] = arg7;
        return new ColorStateList(v1, v0);
    }

    private static long createCacheKey(TypedValue arg4) {
        return (((long)arg4.assetCookie)) << 0x20 | (((long)arg4.data));
    }

    private ColorStateList createColoredButtonColorStateList(@NonNull Context arg2) {
        return this.createButtonColorStateList(arg2, ThemeUtils.getThemeAttrColor(arg2, R$attr.colorAccent));
    }

    private ColorStateList createDefaultButtonColorStateList(@NonNull Context arg2) {
        return this.createButtonColorStateList(arg2, ThemeUtils.getThemeAttrColor(arg2, R$attr.colorButtonNormal));
    }

    private Drawable createDrawableIfNeeded(@NonNull Context arg8, @DrawableRes int arg9) {
        if(this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }

        TypedValue v0 = this.mTypedValue;
        arg8.getResources().getValue(arg9, v0, true);
        long v3 = AppCompatDrawableManager.createCacheKey(v0);
        Drawable v1 = this.getCachedDrawable(arg8, v3);
        if(v1 != null) {
            return v1;
        }

        if(arg9 == R$drawable.abc_cab_background_top_material) {
            LayerDrawable v1_1 = new LayerDrawable(new Drawable[]{this.getDrawable(arg8, R$drawable.abc_cab_background_internal_bg), this.getDrawable(arg8, R$drawable.abc_cab_background_top_mtrl_alpha)});
        }

        if(v1 != null) {
            v1.setChangingConfigurations(v0.changingConfigurations);
            this.addDrawableToCache(arg8, v3, v1);
        }

        return v1;
    }

    private ColorStateList createSwitchThumbColorStateList(Context arg8) {
        int[][] v1 = new int[3][];
        int[] v0 = new int[3];
        ColorStateList v2 = ThemeUtils.getThemeAttrColorStateList(arg8, R$attr.colorSwitchThumbNormal);
        int v3 = 2;
        if(v2 == null || !v2.isStateful()) {
            v1[0] = ThemeUtils.DISABLED_STATE_SET;
            v0[0] = ThemeUtils.getDisabledThemeAttrColor(arg8, R$attr.colorSwitchThumbNormal);
            v1[1] = ThemeUtils.CHECKED_STATE_SET;
            v0[1] = ThemeUtils.getThemeAttrColor(arg8, R$attr.colorControlActivated);
            v1[v3] = ThemeUtils.EMPTY_STATE_SET;
            v0[v3] = ThemeUtils.getThemeAttrColor(arg8, R$attr.colorSwitchThumbNormal);
        }
        else {
            v1[0] = ThemeUtils.DISABLED_STATE_SET;
            v0[0] = v2.getColorForState(v1[0], 0);
            v1[1] = ThemeUtils.CHECKED_STATE_SET;
            v0[1] = ThemeUtils.getThemeAttrColor(arg8, R$attr.colorControlActivated);
            v1[v3] = ThemeUtils.EMPTY_STATE_SET;
            v0[v3] = v2.getDefaultColor();
        }

        return new ColorStateList(v1, v0);
    }

    private static PorterDuffColorFilter createTintFilter(ColorStateList arg1, PorterDuff$Mode arg2, int[] arg3) {
        if(arg1 != null) {
            if(arg2 == null) {
            }
            else {
                return AppCompatDrawableManager.getPorterDuffColorFilter(arg1.getColorForState(arg3, 0), arg2);
            }
        }

        return null;
    }

    public static AppCompatDrawableManager get() {
        AppCompatDrawableManager v1_1;
        Class v0 = AppCompatDrawableManager.class;
        __monitor_enter(v0);
        try {
            if(AppCompatDrawableManager.INSTANCE == null) {
                AppCompatDrawableManager.INSTANCE = new AppCompatDrawableManager();
                AppCompatDrawableManager.installDefaultInflateDelegates(AppCompatDrawableManager.INSTANCE);
            }

            v1_1 = AppCompatDrawableManager.INSTANCE;
        }
        catch(Throwable v1) {
            __monitor_exit(v0);
            throw v1;
        }

        __monitor_exit(v0);
        return v1_1;
    }

    private Drawable getCachedDrawable(@NonNull Context arg4, long arg5) {
        Drawable v4_1;
        Drawable v1;
        Object v0;
        __monitor_enter(this);
        try {
            v0 = this.mDrawableCaches.get(arg4);
            v1 = null;
            if(v0 != null) {
                goto label_7;
            }
        }
        catch(Throwable v4) {
            goto label_19;
        }

        __monitor_exit(this);
        return v1;
        try {
        label_7:
            Object v2 = ((LongSparseArray)v0).get(arg5);
            if(v2 != null) {
                v2 = ((WeakReference)v2).get();
                if(v2 != null) {
                    v4_1 = ((Drawable$ConstantState)v2).newDrawable(arg4.getResources());
                    goto label_13;
                }
                else {
                    goto label_15;
                }
            }

            goto label_16;
        }
        catch(Throwable v4) {
            goto label_19;
        }

    label_13:
        __monitor_exit(this);
        return v4_1;
        try {
        label_15:
            ((LongSparseArray)v0).delete(arg5);
        }
        catch(Throwable v4) {
        label_19:
            __monitor_exit(this);
            throw v4;
        }

    label_16:
        __monitor_exit(this);
        return v1;
    }

    public Drawable getDrawable(@NonNull Context arg2, @DrawableRes int arg3) {
        Drawable v2_1;
        __monitor_enter(this);
        try {
            v2_1 = this.getDrawable(arg2, arg3, false);
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
        return v2_1;
    }

    Drawable getDrawable(@NonNull Context arg2, @DrawableRes int arg3, boolean arg4) {
        Drawable v0;
        __monitor_enter(this);
        try {
            this.checkVectorDrawableSetup(arg2);
            v0 = this.loadDrawableFromDelegates(arg2, arg3);
            if(v0 == null) {
                v0 = this.createDrawableIfNeeded(arg2, arg3);
            }

            if(v0 == null) {
                v0 = ContextCompat.getDrawable(arg2, arg3);
            }

            if(v0 != null) {
                v0 = this.tintDrawable(arg2, arg3, arg4, v0);
            }

            if(v0 != null) {
                DrawableUtils.fixDrawable(v0);
            }
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
        return v0;
    }

    public static PorterDuffColorFilter getPorterDuffColorFilter(int arg3, PorterDuff$Mode arg4) {
        PorterDuffColorFilter v1;
        Class v0 = AppCompatDrawableManager.class;
        __monitor_enter(v0);
        try {
            v1 = AppCompatDrawableManager.COLOR_FILTER_CACHE.get(arg3, arg4);
            if(v1 == null) {
                v1 = new PorterDuffColorFilter(arg3, arg4);
                AppCompatDrawableManager.COLOR_FILTER_CACHE.put(arg3, arg4, v1);
            }
        }
        catch(Throwable v3) {
            __monitor_exit(v0);
            throw v3;
        }

        __monitor_exit(v0);
        return v1;
    }

    ColorStateList getTintList(@NonNull Context arg3, @DrawableRes int arg4) {
        ColorStateList v0;
        __monitor_enter(this);
        try {
            v0 = this.getTintListFromCache(arg3, arg4);
            if(v0 == null) {
                if(arg4 == R$drawable.abc_edit_text_material) {
                    v0 = AppCompatResources.getColorStateList(arg3, R$color.abc_tint_edittext);
                }
                else if(arg4 == R$drawable.abc_switch_track_mtrl_alpha) {
                    v0 = AppCompatResources.getColorStateList(arg3, R$color.abc_tint_switch_track);
                }
                else if(arg4 == R$drawable.abc_switch_thumb_material) {
                    v0 = this.createSwitchThumbColorStateList(arg3);
                }
                else if(arg4 == R$drawable.abc_btn_default_mtrl_shape) {
                    v0 = this.createDefaultButtonColorStateList(arg3);
                }
                else if(arg4 == R$drawable.abc_btn_borderless_material) {
                    v0 = this.createBorderlessButtonColorStateList(arg3);
                }
                else if(arg4 == R$drawable.abc_btn_colored_material) {
                    v0 = this.createColoredButtonColorStateList(arg3);
                }
                else {
                    if(arg4 != R$drawable.abc_spinner_mtrl_am_alpha) {
                        if(arg4 == R$drawable.abc_spinner_textfield_background_material) {
                        }
                        else if(AppCompatDrawableManager.arrayContains(AppCompatDrawableManager.TINT_COLOR_CONTROL_NORMAL, arg4)) {
                            v0 = ThemeUtils.getThemeAttrColorStateList(arg3, R$attr.colorControlNormal);
                            goto label_59;
                        }
                        else if(AppCompatDrawableManager.arrayContains(AppCompatDrawableManager.TINT_COLOR_CONTROL_STATE_LIST, arg4)) {
                            v0 = AppCompatResources.getColorStateList(arg3, R$color.abc_tint_default);
                            goto label_59;
                        }
                        else {
                            if(AppCompatDrawableManager.arrayContains(AppCompatDrawableManager.TINT_CHECKABLE_BUTTON_LIST, arg4)) {
                                v0 = AppCompatResources.getColorStateList(arg3, R$color.abc_tint_btn_checkable);
                            }
                            else if(arg4 == R$drawable.abc_seekbar_thumb_material) {
                                v0 = AppCompatResources.getColorStateList(arg3, R$color.abc_tint_seek_thumb);
                            }
                            else {
                            }

                            goto label_59;
                        }
                    }

                    v0 = AppCompatResources.getColorStateList(arg3, R$color.abc_tint_spinner);
                }

            label_59:
                if(v0 == null) {
                    goto label_61;
                }

                this.addTintListToCache(arg3, arg4, v0);
            }
        }
        catch(Throwable v3) {
            __monitor_exit(this);
            throw v3;
        }

    label_61:
        __monitor_exit(this);
        return v0;
    }

    private ColorStateList getTintListFromCache(@NonNull Context arg3, @DrawableRes int arg4) {
        Object v1_1;
        ColorStateList v1 = null;
        if(this.mTintLists != null) {
            Object v3 = this.mTintLists.get(arg3);
            if(v3 != null) {
                v1_1 = ((SparseArrayCompat)v3).get(arg4);
            }

            return ((ColorStateList)v1_1);
        }

        return v1;
    }

    static PorterDuff$Mode getTintMode(int arg1) {
        PorterDuff$Mode v1 = arg1 == R$drawable.abc_switch_thumb_material ? PorterDuff$Mode.MULTIPLY : null;
        return v1;
    }

    private static void installDefaultInflateDelegates(@NonNull AppCompatDrawableManager arg2) {
        if(Build$VERSION.SDK_INT < 24) {
            arg2.addDelegate("vector", new VdcInflateDelegate());
            arg2.addDelegate("animated-vector", new AvdcInflateDelegate());
            arg2.addDelegate("animated-selector", new AsldcInflateDelegate());
        }
    }

    private static boolean isVectorDrawable(@NonNull Drawable arg1) {
        boolean v1 = ((arg1 instanceof VectorDrawableCompat)) || ("android.graphics.drawable.VectorDrawable".equals(arg1.getClass().getName())) ? true : false;
        return v1;
    }

    private Drawable loadDrawableFromDelegates(@NonNull Context arg10, @DrawableRes int arg11) {
        Drawable v1 = null;
        if(this.mDelegates != null && !this.mDelegates.isEmpty()) {
            if(this.mKnownDrawableIdTags != null) {
                Object v0 = this.mKnownDrawableIdTags.get(arg11);
                if(!"appcompat_skip_skip".equals(v0)) {
                    if(v0 == null) {
                    }
                    else if(this.mDelegates.get(v0) == null) {
                        return v1;
                    }

                    goto label_21;
                }

                return v1;
            }
            else {
                this.mKnownDrawableIdTags = new SparseArrayCompat();
            }

        label_21:
            if(this.mTypedValue == null) {
                this.mTypedValue = new TypedValue();
            }

            TypedValue v0_1 = this.mTypedValue;
            Resources v1_1 = arg10.getResources();
            v1_1.getValue(arg11, v0_1, true);
            long v3 = AppCompatDrawableManager.createCacheKey(v0_1);
            Drawable v5 = this.getCachedDrawable(arg10, v3);
            if(v5 != null) {
                return v5;
            }

            if(v0_1.string != null && (v0_1.string.toString().endsWith(".xml"))) {
                try {
                    XmlResourceParser v1_2 = v1_1.getXml(arg11);
                    AttributeSet v6 = Xml.asAttributeSet(((XmlPullParser)v1_2));
                    while(true) {
                        int v7 = ((XmlPullParser)v1_2).next();
                        int v8 = 2;
                        if(v7 != v8 && v7 != 1) {
                            continue;
                        }

                        break;
                    }

                    if(v7 == v8) {
                        String v2 = ((XmlPullParser)v1_2).getName();
                        this.mKnownDrawableIdTags.append(arg11, v2);
                        Object v2_1 = this.mDelegates.get(v2);
                        if(v2_1 != null) {
                            v5 = ((InflateDelegate)v2_1).createFromXmlInner(arg10, ((XmlPullParser)v1_2), v6, arg10.getTheme());
                        }

                        if(v5 == null) {
                            goto label_71;
                        }

                        v5.setChangingConfigurations(v0_1.changingConfigurations);
                        this.addDrawableToCache(arg10, v3, v5);
                        goto label_71;
                    }

                    throw new XmlPullParserException("No start tag found");
                }
                catch(Exception v10) {
                    Log.e("AppCompatDrawableManag", "Exception while inflating drawable", ((Throwable)v10));
                }
            }

        label_71:
            if(v5 == null) {
                this.mKnownDrawableIdTags.append(arg11, "appcompat_skip_skip");
            }

            return v5;
        }

        return v1;
    }

    public void onConfigurationChanged(@NonNull Context arg2) {
        __monitor_enter(this);
        try {
            Object v2_1 = this.mDrawableCaches.get(arg2);
            if(v2_1 != null) {
                ((LongSparseArray)v2_1).clear();
            }
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    Drawable onDrawableLoadedFromResources(@NonNull Context arg2, @NonNull VectorEnabledTintResources arg3, @DrawableRes int arg4) {
        Drawable v2_1;
        __monitor_enter(this);
        try {
            Drawable v0 = this.loadDrawableFromDelegates(arg2, arg4);
            if(v0 == null) {
                v0 = arg3.superGetDrawable(arg4);
            }

            if(v0 == null) {
                goto label_9;
            }

            v2_1 = this.tintDrawable(arg2, arg4, false, v0);
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
        return v2_1;
    label_9:
        __monitor_exit(this);
        return null;
    }

    private void removeDelegate(@NonNull String arg2, @NonNull InflateDelegate arg3) {
        if(this.mDelegates != null && this.mDelegates.get(arg2) == arg3) {
            this.mDelegates.remove(arg2);
        }
    }

    private static void setPorterDuffColorFilter(Drawable arg1, int arg2, PorterDuff$Mode arg3) {
        if(DrawableUtils.canSafelyMutateDrawable(arg1)) {
            arg1 = arg1.mutate();
        }

        if(arg3 == null) {
            arg3 = AppCompatDrawableManager.DEFAULT_MODE;
        }

        arg1.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(arg2, arg3));
    }

    static void tintDrawable(Drawable arg2, TintInfo arg3, int[] arg4) {
        if((DrawableUtils.canSafelyMutateDrawable(arg2)) && arg2.mutate() != arg2) {
            Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
            return;
        }

        if((arg3.mHasTintList) || (arg3.mHasTintMode)) {
            ColorStateList v0 = arg3.mHasTintList ? arg3.mTintList : null;
            PorterDuff$Mode v3 = arg3.mHasTintMode ? arg3.mTintMode : AppCompatDrawableManager.DEFAULT_MODE;
            arg2.setColorFilter(AppCompatDrawableManager.createTintFilter(v0, v3, arg4));
        }
        else {
            arg2.clearColorFilter();
        }

        if(Build$VERSION.SDK_INT <= 23) {
            arg2.invalidateSelf();
        }
    }

    private Drawable tintDrawable(@NonNull Context arg5, @DrawableRes int arg6, boolean arg7, @NonNull Drawable arg8) {
        ColorStateList v0 = this.getTintList(arg5, arg6);
        if(v0 != null) {
            if(DrawableUtils.canSafelyMutateDrawable(arg8)) {
                arg8 = arg8.mutate();
            }

            arg8 = DrawableCompat.wrap(arg8);
            DrawableCompat.setTintList(arg8, v0);
            PorterDuff$Mode v5 = AppCompatDrawableManager.getTintMode(arg6);
            if(v5 == null) {
                return arg8;
            }

            DrawableCompat.setTintMode(arg8, v5);
        }
        else {
            int v1 = 0x102000D;
            int v2 = 0x102000F;
            int v3 = 0x1020000;
            if(arg6 == R$drawable.abc_seekbar_track_material) {
                AppCompatDrawableManager.setPorterDuffColorFilter(arg8.findDrawableByLayerId(v3), ThemeUtils.getThemeAttrColor(arg5, R$attr.colorControlNormal), AppCompatDrawableManager.DEFAULT_MODE);
                AppCompatDrawableManager.setPorterDuffColorFilter(arg8.findDrawableByLayerId(v2), ThemeUtils.getThemeAttrColor(arg5, R$attr.colorControlNormal), AppCompatDrawableManager.DEFAULT_MODE);
                AppCompatDrawableManager.setPorterDuffColorFilter(arg8.findDrawableByLayerId(v1), ThemeUtils.getThemeAttrColor(arg5, R$attr.colorControlActivated), AppCompatDrawableManager.DEFAULT_MODE);
                return arg8;
            }

            if(arg6 != R$drawable.abc_ratingbar_material && arg6 != R$drawable.abc_ratingbar_indicator_material) {
                if(arg6 == R$drawable.abc_ratingbar_small_material) {
                }
                else {
                    if(AppCompatDrawableManager.tintDrawableUsingColorFilter(arg5, arg6, arg8)) {
                    }
                    else if(arg7) {
                        arg8 = null;
                    }
                    else {
                    }

                    return arg8;
                }
            }

            AppCompatDrawableManager.setPorterDuffColorFilter(arg8.findDrawableByLayerId(v3), ThemeUtils.getDisabledThemeAttrColor(arg5, R$attr.colorControlNormal), AppCompatDrawableManager.DEFAULT_MODE);
            AppCompatDrawableManager.setPorterDuffColorFilter(arg8.findDrawableByLayerId(v2), ThemeUtils.getThemeAttrColor(arg5, R$attr.colorControlActivated), AppCompatDrawableManager.DEFAULT_MODE);
            AppCompatDrawableManager.setPorterDuffColorFilter(arg8.findDrawableByLayerId(v1), ThemeUtils.getThemeAttrColor(arg5, R$attr.colorControlActivated), AppCompatDrawableManager.DEFAULT_MODE);
        }

        return arg8;
    }

    static boolean tintDrawableUsingColorFilter(@NonNull Context arg6, @DrawableRes int arg7, @NonNull Drawable arg8) {
        int v1;
        PorterDuff$Mode v0 = AppCompatDrawableManager.DEFAULT_MODE;
        int v2 = 0x1010031;
        int v3 = -1;
        if(AppCompatDrawableManager.arrayContains(AppCompatDrawableManager.COLORFILTER_TINT_COLOR_CONTROL_NORMAL, arg7)) {
            v2 = R$attr.colorControlNormal;
            goto label_9;
        }
        else if(AppCompatDrawableManager.arrayContains(AppCompatDrawableManager.COLORFILTER_COLOR_CONTROL_ACTIVATED, arg7)) {
            v2 = R$attr.colorControlActivated;
            goto label_9;
        }
        else if(AppCompatDrawableManager.arrayContains(AppCompatDrawableManager.COLORFILTER_COLOR_BACKGROUND_MULTIPLY, arg7)) {
            v0 = PorterDuff$Mode.MULTIPLY;
            goto label_9;
        }
        else if(arg7 == R$drawable.abc_list_divider_mtrl_alpha) {
            v2 = 0x1010030;
            v1 = Math.round(40.799999f);
            arg7 = 1;
        }
        else if(arg7 == R$drawable.abc_dialog_material_background) {
        label_9:
            arg7 = 1;
            v1 = -1;
        }
        else {
            arg7 = 0;
            v1 = -1;
            v2 = 0;
        }

        if(arg7 != 0) {
            if(DrawableUtils.canSafelyMutateDrawable(arg8)) {
                arg8 = arg8.mutate();
            }

            arg8.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(ThemeUtils.getThemeAttrColor(arg6, v2), v0));
            if(v1 != v3) {
                arg8.setAlpha(v1);
            }

            return 1;
        }

        return 0;
    }
}

