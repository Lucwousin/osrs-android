package androidx.core.content.pm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo$Builder;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Arrays;

public class ShortcutInfoCompat {
    public class Builder {
        private final ShortcutInfoCompat mInfo;

        public Builder(@NonNull Context arg2, @NonNull String arg3) {
            super();
            this.mInfo = new ShortcutInfoCompat();
            this.mInfo.mContext = arg2;
            this.mInfo.mId = arg3;
        }

        @NonNull public ShortcutInfoCompat build() {
            if(!TextUtils.isEmpty(this.mInfo.mLabel)) {
                if(this.mInfo.mIntents != null && this.mInfo.mIntents.length != 0) {
                    return this.mInfo;
                }

                throw new IllegalArgumentException("Shortcut must have an intent");
            }

            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }

        @NonNull public Builder setActivity(@NonNull ComponentName arg2) {
            this.mInfo.mActivity = arg2;
            return this;
        }

        public Builder setAlwaysBadged() {
            this.mInfo.mIsAlwaysBadged = true;
            return this;
        }

        @NonNull public Builder setDisabledMessage(@NonNull CharSequence arg2) {
            this.mInfo.mDisabledMessage = arg2;
            return this;
        }

        @NonNull public Builder setIcon(IconCompat arg2) {
            this.mInfo.mIcon = arg2;
            return this;
        }

        @NonNull public Builder setIntent(@NonNull Intent arg3) {
            return this.setIntents(new Intent[]{arg3});
        }

        @NonNull public Builder setIntents(@NonNull Intent[] arg2) {
            this.mInfo.mIntents = arg2;
            return this;
        }

        @NonNull public Builder setLongLabel(@NonNull CharSequence arg2) {
            this.mInfo.mLongLabel = arg2;
            return this;
        }

        @NonNull public Builder setShortLabel(@NonNull CharSequence arg2) {
            this.mInfo.mLabel = arg2;
            return this;
        }
    }

    ComponentName mActivity;
    Context mContext;
    CharSequence mDisabledMessage;
    IconCompat mIcon;
    String mId;
    Intent[] mIntents;
    boolean mIsAlwaysBadged;
    CharSequence mLabel;
    CharSequence mLongLabel;

    ShortcutInfoCompat() {
        super();
    }

    Intent addToIntent(Intent arg4) {
        arg4.putExtra("android.intent.extra.shortcut.INTENT", this.mIntents[this.mIntents.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.mLabel.toString());
        if(this.mIcon != null) {
            Drawable v0 = null;
            if(this.mIsAlwaysBadged) {
                PackageManager v1 = this.mContext.getPackageManager();
                if(this.mActivity != null) {
                    try {
                        v0 = v1.getActivityIcon(this.mActivity);
                        goto label_23;
                    }
                    catch(PackageManager$NameNotFoundException ) {
                    label_23:
                        if(v0 != null) {
                            goto label_27;
                        }

                        v0 = this.mContext.getApplicationInfo().loadIcon(v1);
                        goto label_27;
                    }
                }

                goto label_23;
            }

        label_27:
            this.mIcon.addToShortcutIntent(arg4, v0, this.mContext);
        }

        return arg4;
    }

    @Nullable public ComponentName getActivity() {
        return this.mActivity;
    }

    @Nullable public CharSequence getDisabledMessage() {
        return this.mDisabledMessage;
    }

    @NonNull public String getId() {
        return this.mId;
    }

    @NonNull public Intent getIntent() {
        return this.mIntents[this.mIntents.length - 1];
    }

    @NonNull public Intent[] getIntents() {
        return Arrays.copyOf(this.mIntents, this.mIntents.length);
    }

    @Nullable public CharSequence getLongLabel() {
        return this.mLongLabel;
    }

    @NonNull public CharSequence getShortLabel() {
        return this.mLabel;
    }

    @RequiresApi(value=25) public ShortcutInfo toShortcutInfo() {
        ShortcutInfo$Builder v0 = new ShortcutInfo$Builder(this.mContext, this.mId).setShortLabel(this.mLabel).setIntents(this.mIntents);
        if(this.mIcon != null) {
            v0.setIcon(this.mIcon.toIcon());
        }

        if(!TextUtils.isEmpty(this.mLongLabel)) {
            v0.setLongLabel(this.mLongLabel);
        }

        if(!TextUtils.isEmpty(this.mDisabledMessage)) {
            v0.setDisabledMessage(this.mDisabledMessage);
        }

        if(this.mActivity != null) {
            v0.setActivity(this.mActivity);
        }

        return v0.build();
    }
}

