package androidx.core.view.accessibility;

import android.os.Build$VERSION;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.NonNull;
import java.util.List;

public class AccessibilityRecordCompat {
    private final AccessibilityRecord mRecord;

    @Deprecated public AccessibilityRecordCompat(Object arg1) {
        super();
        this.mRecord = ((AccessibilityRecord)arg1);
    }

    @Deprecated public boolean equals(Object arg5) {
        if(this == (((AccessibilityRecordCompat)arg5))) {
            return 1;
        }

        if(arg5 == null) {
            return 0;
        }

        if(this.getClass() != arg5.getClass()) {
            return 0;
        }

        if(this.mRecord == null) {
            if(((AccessibilityRecordCompat)arg5).mRecord != null) {
                return 0;
            }
        }
        else if(!this.mRecord.equals(((AccessibilityRecordCompat)arg5).mRecord)) {
            return 0;
        }

        return 1;
    }

    @Deprecated public int getAddedCount() {
        return this.mRecord.getAddedCount();
    }

    @Deprecated public CharSequence getBeforeText() {
        return this.mRecord.getBeforeText();
    }

    @Deprecated public CharSequence getClassName() {
        return this.mRecord.getClassName();
    }

    @Deprecated public CharSequence getContentDescription() {
        return this.mRecord.getContentDescription();
    }

    @Deprecated public int getCurrentItemIndex() {
        return this.mRecord.getCurrentItemIndex();
    }

    @Deprecated public int getFromIndex() {
        return this.mRecord.getFromIndex();
    }

    @Deprecated public Object getImpl() {
        return this.mRecord;
    }

    @Deprecated public int getItemCount() {
        return this.mRecord.getItemCount();
    }

    public static int getMaxScrollX(AccessibilityRecord arg2) {
        if(Build$VERSION.SDK_INT >= 15) {
            return arg2.getMaxScrollX();
        }

        return 0;
    }

    @Deprecated public int getMaxScrollX() {
        return AccessibilityRecordCompat.getMaxScrollX(this.mRecord);
    }

    public static int getMaxScrollY(AccessibilityRecord arg2) {
        if(Build$VERSION.SDK_INT >= 15) {
            return arg2.getMaxScrollY();
        }

        return 0;
    }

    @Deprecated public int getMaxScrollY() {
        return AccessibilityRecordCompat.getMaxScrollY(this.mRecord);
    }

    @Deprecated public Parcelable getParcelableData() {
        return this.mRecord.getParcelableData();
    }

    @Deprecated public int getRemovedCount() {
        return this.mRecord.getRemovedCount();
    }

    @Deprecated public int getScrollX() {
        return this.mRecord.getScrollX();
    }

    @Deprecated public int getScrollY() {
        return this.mRecord.getScrollY();
    }

    @Deprecated public AccessibilityNodeInfoCompat getSource() {
        return AccessibilityNodeInfoCompat.wrapNonNullInstance(this.mRecord.getSource());
    }

    @Deprecated public List getText() {
        return this.mRecord.getText();
    }

    @Deprecated public int getToIndex() {
        return this.mRecord.getToIndex();
    }

    @Deprecated public int getWindowId() {
        return this.mRecord.getWindowId();
    }

    @Deprecated public int hashCode() {
        int v0 = this.mRecord == null ? 0 : this.mRecord.hashCode();
        return v0;
    }

    @Deprecated public boolean isChecked() {
        return this.mRecord.isChecked();
    }

    @Deprecated public boolean isEnabled() {
        return this.mRecord.isEnabled();
    }

    @Deprecated public boolean isFullScreen() {
        return this.mRecord.isFullScreen();
    }

    @Deprecated public boolean isPassword() {
        return this.mRecord.isPassword();
    }

    @Deprecated public boolean isScrollable() {
        return this.mRecord.isScrollable();
    }

    @Deprecated public static AccessibilityRecordCompat obtain() {
        return new AccessibilityRecordCompat(AccessibilityRecord.obtain());
    }

    @Deprecated public static AccessibilityRecordCompat obtain(AccessibilityRecordCompat arg1) {
        return new AccessibilityRecordCompat(AccessibilityRecord.obtain(arg1.mRecord));
    }

    @Deprecated public void recycle() {
        this.mRecord.recycle();
    }

    @Deprecated public void setAddedCount(int arg2) {
        this.mRecord.setAddedCount(arg2);
    }

    @Deprecated public void setBeforeText(CharSequence arg2) {
        this.mRecord.setBeforeText(arg2);
    }

    @Deprecated public void setChecked(boolean arg2) {
        this.mRecord.setChecked(arg2);
    }

    @Deprecated public void setClassName(CharSequence arg2) {
        this.mRecord.setClassName(arg2);
    }

    @Deprecated public void setContentDescription(CharSequence arg2) {
        this.mRecord.setContentDescription(arg2);
    }

    @Deprecated public void setCurrentItemIndex(int arg2) {
        this.mRecord.setCurrentItemIndex(arg2);
    }

    @Deprecated public void setEnabled(boolean arg2) {
        this.mRecord.setEnabled(arg2);
    }

    @Deprecated public void setFromIndex(int arg2) {
        this.mRecord.setFromIndex(arg2);
    }

    @Deprecated public void setFullScreen(boolean arg2) {
        this.mRecord.setFullScreen(arg2);
    }

    @Deprecated public void setItemCount(int arg2) {
        this.mRecord.setItemCount(arg2);
    }

    public static void setMaxScrollX(AccessibilityRecord arg2, int arg3) {
        if(Build$VERSION.SDK_INT >= 15) {
            arg2.setMaxScrollX(arg3);
        }
    }

    @Deprecated public void setMaxScrollX(int arg2) {
        AccessibilityRecordCompat.setMaxScrollX(this.mRecord, arg2);
    }

    public static void setMaxScrollY(AccessibilityRecord arg2, int arg3) {
        if(Build$VERSION.SDK_INT >= 15) {
            arg2.setMaxScrollY(arg3);
        }
    }

    @Deprecated public void setMaxScrollY(int arg2) {
        AccessibilityRecordCompat.setMaxScrollY(this.mRecord, arg2);
    }

    @Deprecated public void setParcelableData(Parcelable arg2) {
        this.mRecord.setParcelableData(arg2);
    }

    @Deprecated public void setPassword(boolean arg2) {
        this.mRecord.setPassword(arg2);
    }

    @Deprecated public void setRemovedCount(int arg2) {
        this.mRecord.setRemovedCount(arg2);
    }

    @Deprecated public void setScrollX(int arg2) {
        this.mRecord.setScrollX(arg2);
    }

    @Deprecated public void setScrollY(int arg2) {
        this.mRecord.setScrollY(arg2);
    }

    @Deprecated public void setScrollable(boolean arg2) {
        this.mRecord.setScrollable(arg2);
    }

    public static void setSource(@NonNull AccessibilityRecord arg2, View arg3, int arg4) {
        if(Build$VERSION.SDK_INT >= 16) {
            arg2.setSource(arg3, arg4);
        }
    }

    @Deprecated public void setSource(View arg2) {
        this.mRecord.setSource(arg2);
    }

    @Deprecated public void setSource(View arg2, int arg3) {
        AccessibilityRecordCompat.setSource(this.mRecord, arg2, arg3);
    }

    @Deprecated public void setToIndex(int arg2) {
        this.mRecord.setToIndex(arg2);
    }
}

