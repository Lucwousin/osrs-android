package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Paint$FontMetricsInt;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build$VERSION;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode$Callback;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.text.PrecomputedTextCompat$Params$Builder;
import androidx.core.text.PrecomputedTextCompat$Params;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class TextViewCompat {
    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface AutoSizeTextType {
    }

    @RequiresApi(value=26) class OreoCallback implements ActionMode$Callback {
        private static final int MENU_ITEM_ORDER_PROCESS_TEXT_INTENT_ACTIONS_START = 100;
        private final ActionMode$Callback mCallback;
        private boolean mCanUseMenuBuilderReferences;
        private boolean mInitializedMenuBuilderReferences;
        private Class mMenuBuilderClass;
        private Method mMenuBuilderRemoveItemAtMethod;
        private final TextView mTextView;

        OreoCallback(ActionMode$Callback arg1, TextView arg2) {
            super();
            this.mCallback = arg1;
            this.mTextView = arg2;
            this.mInitializedMenuBuilderReferences = false;
        }

        private Intent createProcessTextIntent() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        private Intent createProcessTextIntentForResolveInfo(ResolveInfo arg3, TextView arg4) {
            return this.createProcessTextIntent().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", this.isEditable(arg4) ^ 1).setClassName(arg3.activityInfo.packageName, arg3.activityInfo.name);
        }

        private List getSupportedActivities(Context arg4, PackageManager arg5) {
            ArrayList v0 = new ArrayList();
            if(!(arg4 instanceof Activity)) {
                return ((List)v0);
            }

            Iterator v5 = arg5.queryIntentActivities(this.createProcessTextIntent(), 0).iterator();
            while(v5.hasNext()) {
                Object v1 = v5.next();
                if(!this.isSupportedActivity(((ResolveInfo)v1), arg4)) {
                    continue;
                }

                ((List)v0).add(v1);
            }

            return ((List)v0);
        }

        private boolean isEditable(TextView arg2) {
            boolean v2 = !(arg2 instanceof Editable) || !arg2.onCheckIsTextEditor() || !arg2.isEnabled() ? false : true;
            return v2;
        }

        private boolean isSupportedActivity(ResolveInfo arg4, Context arg5) {
            boolean v1 = true;
            if(arg5.getPackageName().equals(arg4.activityInfo.packageName)) {
                return 1;
            }

            if(!arg4.activityInfo.exported) {
                return 0;
            }

            if(arg4.activityInfo.permission != null) {
                if(arg5.checkSelfPermission(arg4.activityInfo.permission) == 0) {
                }
                else {
                    v1 = false;
                }
            }

            return v1;
        }

        public boolean onActionItemClicked(ActionMode arg2, MenuItem arg3) {
            return this.mCallback.onActionItemClicked(arg2, arg3);
        }

        public boolean onCreateActionMode(ActionMode arg2, Menu arg3) {
            return this.mCallback.onCreateActionMode(arg2, arg3);
        }

        public void onDestroyActionMode(ActionMode arg2) {
            this.mCallback.onDestroyActionMode(arg2);
        }

        public boolean onPrepareActionMode(ActionMode arg2, Menu arg3) {
            this.recomputeProcessTextMenuItems(arg3);
            return this.mCallback.onPrepareActionMode(arg2, arg3);
        }

        private void recomputeProcessTextMenuItems(Menu arg9) {
            int v5;
            Context v0 = this.mTextView.getContext();
            PackageManager v1 = v0.getPackageManager();
            if(this.mInitializedMenuBuilderReferences) {
                goto label_24;
            }

            this.mInitializedMenuBuilderReferences = true;
            try {
                this.mMenuBuilderClass = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.mMenuBuilderRemoveItemAtMethod = this.mMenuBuilderClass.getDeclaredMethod("removeItemAt", Integer.TYPE);
                this.mCanUseMenuBuilderReferences = true;
            }
            catch(NoSuchMethodException ) {
                this.mMenuBuilderClass = null;
                this.mMenuBuilderRemoveItemAtMethod = null;
                this.mCanUseMenuBuilderReferences = false;
            }

            try {
            label_24:
                Method v2 = !this.mCanUseMenuBuilderReferences || !this.mMenuBuilderClass.isInstance(arg9) ? arg9.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE) : this.mMenuBuilderRemoveItemAtMethod;
                v5 = arg9.size() - 1;
                while(true) {
                label_39:
                    if(v5 < 0) {
                        goto label_54;
                    }

                    MenuItem v6 = arg9.getItem(v5);
                    if(v6.getIntent() != null && ("android.intent.action.PROCESS_TEXT".equals(v6.getIntent().getAction()))) {
                        v2.invoke(arg9, Integer.valueOf(v5));
                    }

                    break;
                }
            }
            catch(InvocationTargetException ) {
                return;
            }

            --v5;
            goto label_39;
        label_54:
            List v0_1 = this.getSupportedActivities(v0, v1);
            int v2_1;
            for(v2_1 = 0; v2_1 < v0_1.size(); ++v2_1) {
                Object v5_1 = v0_1.get(v2_1);
                arg9.add(0, 0, v2_1 + 100, ((ResolveInfo)v5_1).loadLabel(v1)).setIntent(this.createProcessTextIntentForResolveInfo(((ResolveInfo)v5_1), this.mTextView)).setShowAsAction(1);
            }
        }
    }

    public static final int AUTO_SIZE_TEXT_TYPE_NONE = 0;
    public static final int AUTO_SIZE_TEXT_TYPE_UNIFORM = 1;
    private static final int LINES = 1;
    private static final String LOG_TAG = "TextViewCompat";
    private static Field sMaxModeField;
    private static boolean sMaxModeFieldFetched;
    private static Field sMaximumField;
    private static boolean sMaximumFieldFetched;
    private static Field sMinModeField;
    private static boolean sMinModeFieldFetched;
    private static Field sMinimumField;
    private static boolean sMinimumFieldFetched;

    private TextViewCompat() {
        super();
    }

    public static int getAutoSizeMaxTextSize(@NonNull TextView arg2) {
        if(Build$VERSION.SDK_INT >= 27) {
            return arg2.getAutoSizeMaxTextSize();
        }

        if((arg2 instanceof AutoSizeableTextView)) {
            return ((AutoSizeableTextView)arg2).getAutoSizeMaxTextSize();
        }

        return -1;
    }

    public static int getAutoSizeMinTextSize(@NonNull TextView arg2) {
        if(Build$VERSION.SDK_INT >= 27) {
            return arg2.getAutoSizeMinTextSize();
        }

        if((arg2 instanceof AutoSizeableTextView)) {
            return ((AutoSizeableTextView)arg2).getAutoSizeMinTextSize();
        }

        return -1;
    }

    public static int getAutoSizeStepGranularity(@NonNull TextView arg2) {
        if(Build$VERSION.SDK_INT >= 27) {
            return arg2.getAutoSizeStepGranularity();
        }

        if((arg2 instanceof AutoSizeableTextView)) {
            return ((AutoSizeableTextView)arg2).getAutoSizeStepGranularity();
        }

        return -1;
    }

    @NonNull public static int[] getAutoSizeTextAvailableSizes(@NonNull TextView arg2) {
        if(Build$VERSION.SDK_INT >= 27) {
            return arg2.getAutoSizeTextAvailableSizes();
        }

        if((arg2 instanceof AutoSizeableTextView)) {
            return ((AutoSizeableTextView)arg2).getAutoSizeTextAvailableSizes();
        }

        return new int[0];
    }

    public static int getAutoSizeTextType(@NonNull TextView arg2) {
        if(Build$VERSION.SDK_INT >= 27) {
            return arg2.getAutoSizeTextType();
        }

        if((arg2 instanceof AutoSizeableTextView)) {
            return ((AutoSizeableTextView)arg2).getAutoSizeTextType();
        }

        return 0;
    }

    @NonNull public static Drawable[] getCompoundDrawablesRelative(@NonNull TextView arg4) {
        if(Build$VERSION.SDK_INT >= 18) {
            return arg4.getCompoundDrawablesRelative();
        }

        if(Build$VERSION.SDK_INT >= 17) {
            int v1 = 1;
            if(arg4.getLayoutDirection() == 1) {
            }
            else {
                v1 = 0;
            }

            Drawable[] v4 = arg4.getCompoundDrawables();
            if(v1 != 0) {
                Drawable v1_1 = v4[2];
                Drawable v3 = v4[0];
                v4[0] = v1_1;
                v4[2] = v3;
            }

            return v4;
        }

        return arg4.getCompoundDrawables();
    }

    public static int getFirstBaselineToTopHeight(@NonNull TextView arg1) {
        return arg1.getPaddingTop() - arg1.getPaint().getFontMetricsInt().top;
    }

    public static int getLastBaselineToBottomHeight(@NonNull TextView arg1) {
        return arg1.getPaddingBottom() + arg1.getPaint().getFontMetricsInt().bottom;
    }

    public static int getMaxLines(@NonNull TextView arg2) {
        if(Build$VERSION.SDK_INT >= 16) {
            return arg2.getMaxLines();
        }

        if(!TextViewCompat.sMaxModeFieldFetched) {
            TextViewCompat.sMaxModeField = TextViewCompat.retrieveField("mMaxMode");
            TextViewCompat.sMaxModeFieldFetched = true;
        }

        if(TextViewCompat.sMaxModeField != null && TextViewCompat.retrieveIntFromField(TextViewCompat.sMaxModeField, arg2) == 1) {
            if(!TextViewCompat.sMaximumFieldFetched) {
                TextViewCompat.sMaximumField = TextViewCompat.retrieveField("mMaximum");
                TextViewCompat.sMaximumFieldFetched = true;
            }

            if(TextViewCompat.sMaximumField == null) {
                return -1;
            }

            return TextViewCompat.retrieveIntFromField(TextViewCompat.sMaximumField, arg2);
        }

        return -1;
    }

    public static int getMinLines(@NonNull TextView arg2) {
        if(Build$VERSION.SDK_INT >= 16) {
            return arg2.getMinLines();
        }

        if(!TextViewCompat.sMinModeFieldFetched) {
            TextViewCompat.sMinModeField = TextViewCompat.retrieveField("mMinMode");
            TextViewCompat.sMinModeFieldFetched = true;
        }

        if(TextViewCompat.sMinModeField != null && TextViewCompat.retrieveIntFromField(TextViewCompat.sMinModeField, arg2) == 1) {
            if(!TextViewCompat.sMinimumFieldFetched) {
                TextViewCompat.sMinimumField = TextViewCompat.retrieveField("mMinimum");
                TextViewCompat.sMinimumFieldFetched = true;
            }

            if(TextViewCompat.sMinimumField == null) {
                return -1;
            }

            return TextViewCompat.retrieveIntFromField(TextViewCompat.sMinimumField, arg2);
        }

        return -1;
    }

    @RequiresApi(value=18) private static int getTextDirection(@NonNull TextDirectionHeuristic arg2) {
        if(arg2 == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 1;
        }

        if(arg2 == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }

        if(arg2 == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }

        if(arg2 == TextDirectionHeuristics.LTR) {
            return 3;
        }

        if(arg2 == TextDirectionHeuristics.RTL) {
            return 4;
        }

        if(arg2 == TextDirectionHeuristics.LOCALE) {
            return 5;
        }

        if(arg2 == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }

        if(arg2 == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 7;
        }

        return 1;
    }

    @RequiresApi(value=18) private static TextDirectionHeuristic getTextDirectionHeuristic(@NonNull TextView arg4) {
        if((arg4.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return TextDirectionHeuristics.LTR;
        }

        int v2 = 0;
        if(Build$VERSION.SDK_INT >= 28 && (arg4.getInputType() & 15) == 3) {
            int v4 = Character.getDirectionality(DecimalFormatSymbols.getInstance(arg4.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            if(v4 != 1) {
                if(v4 == 2) {
                }
                else {
                    return TextDirectionHeuristics.LTR;
                }
            }

            return TextDirectionHeuristics.RTL;
        }

        if(arg4.getLayoutDirection() == 1) {
            v2 = 1;
        }

        switch(arg4.getTextDirection()) {
            case 2: {
                goto label_46;
            }
            case 3: {
                goto label_44;
            }
            case 4: {
                goto label_42;
            }
            case 5: {
                goto label_40;
            }
            case 6: {
                goto label_38;
            }
            case 7: {
                goto label_36;
            }
        }

        TextDirectionHeuristic v4_1 = v2 != 0 ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        return v4_1;
    label_36:
        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
    label_38:
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    label_40:
        return TextDirectionHeuristics.LOCALE;
    label_42:
        return TextDirectionHeuristics.RTL;
    label_44:
        return TextDirectionHeuristics.LTR;
    label_46:
        return TextDirectionHeuristics.ANYRTL_LTR;
    }

    @NonNull public static Params getTextMetricsParams(@NonNull TextView arg3) {
        if(Build$VERSION.SDK_INT >= 28) {
            return new Params(arg3.getTextMetricsParams());
        }

        Builder v0 = new Builder(new TextPaint(arg3.getPaint()));
        if(Build$VERSION.SDK_INT >= 23) {
            v0.setBreakStrategy(arg3.getBreakStrategy());
            v0.setHyphenationFrequency(arg3.getHyphenationFrequency());
        }

        if(Build$VERSION.SDK_INT >= 18) {
            v0.setTextDirection(TextViewCompat.getTextDirectionHeuristic(arg3));
        }

        return v0.build();
    }

    private static Field retrieveField(String arg4) {
        Field v0;
        Field v1;
        try {
            v1 = TextView.class.getDeclaredField(arg4);
            v0 = null;
        }
        catch(NoSuchFieldException ) {
            v1 = v0;
            goto label_7;
        }

        try {
            v1.setAccessible(true);
        }
        catch(NoSuchFieldException ) {
        label_7:
            Log.e("TextViewCompat", "Could not retrieve " + arg4 + " field.");
        }

        return v1;
    }

    private static int retrieveIntFromField(Field arg2, TextView arg3) {
        try {
            return arg2.getInt(arg3);
        }
        catch(IllegalAccessException ) {
            Log.d("TextViewCompat", "Could not retrieve value of " + arg2.getName() + " field.");
            return -1;
        }
    }

    public static void setAutoSizeTextTypeUniformWithConfiguration(@NonNull TextView arg2, int arg3, int arg4, int arg5, int arg6) throws IllegalArgumentException {
        if(Build$VERSION.SDK_INT >= 27) {
            arg2.setAutoSizeTextTypeUniformWithConfiguration(arg3, arg4, arg5, arg6);
        }
        else if((arg2 instanceof AutoSizeableTextView)) {
            ((AutoSizeableTextView)arg2).setAutoSizeTextTypeUniformWithConfiguration(arg3, arg4, arg5, arg6);
        }
    }

    public static void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull TextView arg2, @NonNull int[] arg3, int arg4) throws IllegalArgumentException {
        if(Build$VERSION.SDK_INT >= 27) {
            arg2.setAutoSizeTextTypeUniformWithPresetSizes(arg3, arg4);
        }
        else if((arg2 instanceof AutoSizeableTextView)) {
            ((AutoSizeableTextView)arg2).setAutoSizeTextTypeUniformWithPresetSizes(arg3, arg4);
        }
    }

    public static void setAutoSizeTextTypeWithDefaults(@NonNull TextView arg2, int arg3) {
        if(Build$VERSION.SDK_INT >= 27) {
            arg2.setAutoSizeTextTypeWithDefaults(arg3);
        }
        else if((arg2 instanceof AutoSizeableTextView)) {
            ((AutoSizeableTextView)arg2).setAutoSizeTextTypeWithDefaults(arg3);
        }
    }

    public static void setCompoundDrawablesRelative(@NonNull TextView arg2, @Nullable Drawable arg3, @Nullable Drawable arg4, @Nullable Drawable arg5, @Nullable Drawable arg6) {
        if(Build$VERSION.SDK_INT >= 18) {
            arg2.setCompoundDrawablesRelative(arg3, arg4, arg5, arg6);
        }
        else if(Build$VERSION.SDK_INT >= 17) {
            int v1 = 1;
            if(arg2.getLayoutDirection() == 1) {
            }
            else {
                v1 = 0;
            }

            Drawable v0 = v1 != 0 ? arg5 : arg3;
            if(v1 != 0) {
            }
            else {
                arg3 = arg5;
            }

            arg2.setCompoundDrawables(v0, arg4, arg3, arg6);
        }
        else {
            arg2.setCompoundDrawables(arg3, arg4, arg5, arg6);
        }
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(@NonNull TextView arg2, @DrawableRes int arg3, @DrawableRes int arg4, @DrawableRes int arg5, @DrawableRes int arg6) {
        if(Build$VERSION.SDK_INT >= 18) {
            arg2.setCompoundDrawablesRelativeWithIntrinsicBounds(arg3, arg4, arg5, arg6);
        }
        else if(Build$VERSION.SDK_INT >= 17) {
            int v1 = 1;
            if(arg2.getLayoutDirection() == 1) {
            }
            else {
                v1 = 0;
            }

            int v0 = v1 != 0 ? arg5 : arg3;
            if(v1 != 0) {
            }
            else {
                arg3 = arg5;
            }

            arg2.setCompoundDrawablesWithIntrinsicBounds(v0, arg4, arg3, arg6);
        }
        else {
            arg2.setCompoundDrawablesWithIntrinsicBounds(arg3, arg4, arg5, arg6);
        }
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(@NonNull TextView arg2, @Nullable Drawable arg3, @Nullable Drawable arg4, @Nullable Drawable arg5, @Nullable Drawable arg6) {
        if(Build$VERSION.SDK_INT >= 18) {
            arg2.setCompoundDrawablesRelativeWithIntrinsicBounds(arg3, arg4, arg5, arg6);
        }
        else if(Build$VERSION.SDK_INT >= 17) {
            int v1 = 1;
            if(arg2.getLayoutDirection() == 1) {
            }
            else {
                v1 = 0;
            }

            Drawable v0 = v1 != 0 ? arg5 : arg3;
            if(v1 != 0) {
            }
            else {
                arg3 = arg5;
            }

            arg2.setCompoundDrawablesWithIntrinsicBounds(v0, arg4, arg3, arg6);
        }
        else {
            arg2.setCompoundDrawablesWithIntrinsicBounds(arg3, arg4, arg5, arg6);
        }
    }

    public static void setCustomSelectionActionModeCallback(@NonNull TextView arg0, @NonNull ActionMode$Callback arg1) {
        arg0.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(arg0, arg1));
    }

    public static void setFirstBaselineToTopHeight(@NonNull TextView arg3, @IntRange(from=0) @Px int arg4) {
        Preconditions.checkArgumentNonnegative(arg4);
        if(Build$VERSION.SDK_INT >= 28) {
            arg3.setFirstBaselineToTopHeight(arg4);
            return;
        }

        Paint$FontMetricsInt v0 = arg3.getPaint().getFontMetricsInt();
        int v0_1 = Build$VERSION.SDK_INT < 16 || (arg3.getIncludeFontPadding()) ? v0.top : v0.ascent;
        if(arg4 > Math.abs(v0_1)) {
            arg3.setPadding(arg3.getPaddingLeft(), arg4 - -v0_1, arg3.getPaddingRight(), arg3.getPaddingBottom());
        }
    }

    public static void setLastBaselineToBottomHeight(@NonNull TextView arg3, @IntRange(from=0) @Px int arg4) {
        Preconditions.checkArgumentNonnegative(arg4);
        Paint$FontMetricsInt v0 = arg3.getPaint().getFontMetricsInt();
        int v0_1 = Build$VERSION.SDK_INT < 16 || (arg3.getIncludeFontPadding()) ? v0.bottom : v0.descent;
        if(arg4 > Math.abs(v0_1)) {
            arg3.setPadding(arg3.getPaddingLeft(), arg3.getPaddingTop(), arg3.getPaddingRight(), arg4 - v0_1);
        }
    }

    public static void setLineHeight(@NonNull TextView arg2, @IntRange(from=0) @Px int arg3) {
        Preconditions.checkArgumentNonnegative(arg3);
        int v0 = arg2.getPaint().getFontMetricsInt(null);
        if(arg3 != v0) {
            arg2.setLineSpacing(((float)(arg3 - v0)), 1f);
        }
    }

    public static void setPrecomputedText(@NonNull TextView arg2, @NonNull PrecomputedTextCompat arg3) {
        if(Build$VERSION.SDK_INT >= 28) {
            arg2.setText(arg3.getPrecomputedText());
        }
        else if(TextViewCompat.getTextMetricsParams(arg2).equals(arg3.getParams())) {
            arg2.setText(((CharSequence)arg3));
        }
        else {
            goto label_12;
        }

        return;
    label_12:
        throw new IllegalArgumentException("Given text can not be applied to TextView.");
    }

    public static void setTextAppearance(@NonNull TextView arg2, @StyleRes int arg3) {
        if(Build$VERSION.SDK_INT >= 23) {
            arg2.setTextAppearance(arg3);
        }
        else {
            arg2.setTextAppearance(arg2.getContext(), arg3);
        }
    }

    public static void setTextMetricsParams(@NonNull TextView arg2, @NonNull Params arg3) {
        if(Build$VERSION.SDK_INT >= 18) {
            arg2.setTextDirection(TextViewCompat.getTextDirection(arg3.getTextDirection()));
        }

        if(Build$VERSION.SDK_INT < 23) {
            float v0 = arg3.getTextPaint().getTextScaleX();
            arg2.getPaint().set(arg3.getTextPaint());
            if(v0 == arg2.getTextScaleX()) {
                arg2.setTextScaleX(v0 / 2f + 1f);
            }

            arg2.setTextScaleX(v0);
        }
        else {
            arg2.getPaint().set(arg3.getTextPaint());
            arg2.setBreakStrategy(arg3.getBreakStrategy());
            arg2.setHyphenationFrequency(arg3.getHyphenationFrequency());
        }
    }

    @NonNull @RestrictTo(value={Scope.LIBRARY_GROUP}) public static ActionMode$Callback wrapCustomSelectionActionModeCallback(@NonNull TextView arg2, @NonNull ActionMode$Callback arg3) {
        if(Build$VERSION.SDK_INT >= 26 && Build$VERSION.SDK_INT <= 27) {
            if((arg3 instanceof OreoCallback)) {
            }
            else {
                return new OreoCallback(arg3, arg2);
            }
        }

        return arg3;
    }
}

