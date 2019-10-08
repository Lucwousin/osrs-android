package androidx.core.app;

import android.app.Notification$Action$Builder;
import android.app.Notification$Action;
import android.app.Notification$BigPictureStyle;
import android.app.Notification$BigTextStyle;
import android.app.Notification$Builder;
import android.app.Notification$DecoratedCustomViewStyle;
import android.app.Notification$InboxStyle;
import android.app.Notification$MessagingStyle$Message;
import android.app.Notification$MessagingStyle;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput$Builder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff$Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes$Builder;
import android.net.Uri;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.core.R$color;
import androidx.core.R$dimen;
import androidx.core.R$drawable;
import androidx.core.R$id;
import androidx.core.R$integer;
import androidx.core.R$layout;
import androidx.core.R$string;
import androidx.core.text.BidiFormatter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class NotificationCompat {
    public class Action {
        public final class Builder {
            private boolean mAllowGeneratedReplies;
            private final Bundle mExtras;
            private final int mIcon;
            private final PendingIntent mIntent;
            private ArrayList mRemoteInputs;
            private int mSemanticAction;
            private boolean mShowsUserInterface;
            private final CharSequence mTitle;

            public Builder(int arg10, CharSequence arg11, PendingIntent arg12) {
                this(arg10, arg11, arg12, new Bundle(), null, true, 0, true);
            }

            private Builder(int arg2, CharSequence arg3, PendingIntent arg4, Bundle arg5, RemoteInput[] arg6, boolean arg7, int arg8, boolean arg9) {
                super();
                this.mAllowGeneratedReplies = true;
                this.mShowsUserInterface = true;
                this.mIcon = arg2;
                this.mTitle = androidx.core.app.NotificationCompat$Builder.limitCharSequenceLength(arg3);
                this.mIntent = arg4;
                this.mExtras = arg5;
                ArrayList v2 = arg6 == null ? null : new ArrayList(Arrays.asList(((Object[])arg6)));
                this.mRemoteInputs = v2;
                this.mAllowGeneratedReplies = arg7;
                this.mSemanticAction = arg8;
                this.mShowsUserInterface = arg9;
            }

            public Builder(Action arg10) {
                this(arg10.icon, arg10.title, arg10.actionIntent, new Bundle(arg10.mExtras), arg10.getRemoteInputs(), arg10.getAllowGeneratedReplies(), arg10.getSemanticAction(), arg10.mShowsUserInterface);
            }

            public Builder addExtras(Bundle arg2) {
                if(arg2 != null) {
                    this.mExtras.putAll(arg2);
                }

                return this;
            }

            public Builder addRemoteInput(RemoteInput arg2) {
                if(this.mRemoteInputs == null) {
                    this.mRemoteInputs = new ArrayList();
                }

                this.mRemoteInputs.add(arg2);
                return this;
            }

            public Action build() {
                RemoteInput[] v10;
                ArrayList v0 = new ArrayList();
                ArrayList v1 = new ArrayList();
                if(this.mRemoteInputs != null) {
                    Iterator v2 = this.mRemoteInputs.iterator();
                    while(v2.hasNext()) {
                        Object v3 = v2.next();
                        if(((RemoteInput)v3).isDataOnly()) {
                            ((List)v0).add(v3);
                        }
                        else {
                            ((List)v1).add(v3);
                        }
                    }
                }

                Object[] v3_1 = null;
                if(((List)v0).isEmpty()) {
                    v10 = ((RemoteInput[])v3_1);
                }
                else {
                    Object[] v10_1 = ((List)v0).toArray(new RemoteInput[((List)v0).size()]);
                }

                if(!((List)v1).isEmpty()) {
                    v3_1 = ((List)v1).toArray(new RemoteInput[((List)v1).size()]);
                }

                Object[] v9 = v3_1;
                return new Action(this.mIcon, this.mTitle, this.mIntent, this.mExtras, ((RemoteInput[])v9), v10, this.mAllowGeneratedReplies, this.mSemanticAction, this.mShowsUserInterface);
            }

            public Builder extend(Extender arg1) {
                arg1.extend(this);
                return this;
            }

            public Bundle getExtras() {
                return this.mExtras;
            }

            public Builder setAllowGeneratedReplies(boolean arg1) {
                this.mAllowGeneratedReplies = arg1;
                return this;
            }

            public Builder setSemanticAction(int arg1) {
                this.mSemanticAction = arg1;
                return this;
            }

            public Builder setShowsUserInterface(boolean arg1) {
                this.mShowsUserInterface = arg1;
                return this;
            }
        }

        public interface Extender {
            Builder extend(Builder arg1);
        }

        @Retention(value=RetentionPolicy.SOURCE) @public interface SemanticAction {
        }

        public final class WearableExtender implements Extender {
            private static final int DEFAULT_FLAGS = 1;
            private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
            private static final int FLAG_AVAILABLE_OFFLINE = 1;
            private static final int FLAG_HINT_DISPLAY_INLINE = 4;
            private static final int FLAG_HINT_LAUNCHES_ACTIVITY = 2;
            private static final String KEY_CANCEL_LABEL = "cancelLabel";
            private static final String KEY_CONFIRM_LABEL = "confirmLabel";
            private static final String KEY_FLAGS = "flags";
            private static final String KEY_IN_PROGRESS_LABEL = "inProgressLabel";
            private CharSequence mCancelLabel;
            private CharSequence mConfirmLabel;
            private int mFlags;
            private CharSequence mInProgressLabel;

            public WearableExtender() {
                super();
                this.mFlags = 1;
            }

            public WearableExtender(Action arg3) {
                super();
                this.mFlags = 1;
                Bundle v3 = arg3.getExtras().getBundle("android.wearable.EXTENSIONS");
                if(v3 != null) {
                    this.mFlags = v3.getInt("flags", 1);
                    this.mInProgressLabel = v3.getCharSequence("inProgressLabel");
                    this.mConfirmLabel = v3.getCharSequence("confirmLabel");
                    this.mCancelLabel = v3.getCharSequence("cancelLabel");
                }
            }

            public WearableExtender clone() {
                WearableExtender v0 = new WearableExtender();
                v0.mFlags = this.mFlags;
                v0.mInProgressLabel = this.mInProgressLabel;
                v0.mConfirmLabel = this.mConfirmLabel;
                v0.mCancelLabel = this.mCancelLabel;
                return v0;
            }

            public Object clone() throws CloneNotSupportedException {
                return this.clone();
            }

            public Builder extend(Builder arg4) {
                Bundle v0 = new Bundle();
                if(this.mFlags != 1) {
                    v0.putInt("flags", this.mFlags);
                }

                if(this.mInProgressLabel != null) {
                    v0.putCharSequence("inProgressLabel", this.mInProgressLabel);
                }

                if(this.mConfirmLabel != null) {
                    v0.putCharSequence("confirmLabel", this.mConfirmLabel);
                }

                if(this.mCancelLabel != null) {
                    v0.putCharSequence("cancelLabel", this.mCancelLabel);
                }

                arg4.getExtras().putBundle("android.wearable.EXTENSIONS", v0);
                return arg4;
            }

            @Deprecated public CharSequence getCancelLabel() {
                return this.mCancelLabel;
            }

            @Deprecated public CharSequence getConfirmLabel() {
                return this.mConfirmLabel;
            }

            public boolean getHintDisplayActionInline() {
                boolean v0 = (this.mFlags & 4) != 0 ? true : false;
                return v0;
            }

            public boolean getHintLaunchesActivity() {
                boolean v0 = (this.mFlags & 2) != 0 ? true : false;
                return v0;
            }

            @Deprecated public CharSequence getInProgressLabel() {
                return this.mInProgressLabel;
            }

            public boolean isAvailableOffline() {
                boolean v1 = true;
                if((this.mFlags & 1) != 0) {
                }
                else {
                    v1 = false;
                }

                return v1;
            }

            public WearableExtender setAvailableOffline(boolean arg2) {
                this.setFlag(1, arg2);
                return this;
            }

            @Deprecated public WearableExtender setCancelLabel(CharSequence arg1) {
                this.mCancelLabel = arg1;
                return this;
            }

            @Deprecated public WearableExtender setConfirmLabel(CharSequence arg1) {
                this.mConfirmLabel = arg1;
                return this;
            }

            private void setFlag(int arg1, boolean arg2) {
                if(arg2) {
                    this.mFlags |= arg1;
                }
                else {
                    this.mFlags &= ~arg1;
                }
            }

            public WearableExtender setHintDisplayActionInline(boolean arg2) {
                this.setFlag(4, arg2);
                return this;
            }

            public WearableExtender setHintLaunchesActivity(boolean arg2) {
                this.setFlag(2, arg2);
                return this;
            }

            @Deprecated public WearableExtender setInProgressLabel(CharSequence arg1) {
                this.mInProgressLabel = arg1;
                return this;
            }
        }

        static final String EXTRA_SEMANTIC_ACTION = "android.support.action.semanticAction";
        static final String EXTRA_SHOWS_USER_INTERFACE = "android.support.action.showsUserInterface";
        public static final int SEMANTIC_ACTION_ARCHIVE = 5;
        public static final int SEMANTIC_ACTION_CALL = 10;
        public static final int SEMANTIC_ACTION_DELETE = 4;
        public static final int SEMANTIC_ACTION_MARK_AS_READ = 2;
        public static final int SEMANTIC_ACTION_MARK_AS_UNREAD = 3;
        public static final int SEMANTIC_ACTION_MUTE = 6;
        public static final int SEMANTIC_ACTION_NONE = 0;
        public static final int SEMANTIC_ACTION_REPLY = 1;
        public static final int SEMANTIC_ACTION_THUMBS_DOWN = 9;
        public static final int SEMANTIC_ACTION_THUMBS_UP = 8;
        public static final int SEMANTIC_ACTION_UNMUTE = 7;
        public PendingIntent actionIntent;
        public int icon;
        private boolean mAllowGeneratedReplies;
        private final RemoteInput[] mDataOnlyRemoteInputs;
        final Bundle mExtras;
        private final RemoteInput[] mRemoteInputs;
        private final int mSemanticAction;
        boolean mShowsUserInterface;
        public CharSequence title;

        Action(int arg2, CharSequence arg3, PendingIntent arg4, Bundle arg5, RemoteInput[] arg6, RemoteInput[] arg7, boolean arg8, int arg9, boolean arg10) {
            super();
            this.mShowsUserInterface = true;
            this.icon = arg2;
            this.title = androidx.core.app.NotificationCompat$Builder.limitCharSequenceLength(arg3);
            this.actionIntent = arg4;
            if(arg5 != null) {
            }
            else {
                arg5 = new Bundle();
            }

            this.mExtras = arg5;
            this.mRemoteInputs = arg6;
            this.mDataOnlyRemoteInputs = arg7;
            this.mAllowGeneratedReplies = arg8;
            this.mSemanticAction = arg9;
            this.mShowsUserInterface = arg10;
        }

        public Action(int arg11, CharSequence arg12, PendingIntent arg13) {
            this(arg11, arg12, arg13, new Bundle(), null, null, true, 0, true);
        }

        public PendingIntent getActionIntent() {
            return this.actionIntent;
        }

        public boolean getAllowGeneratedReplies() {
            return this.mAllowGeneratedReplies;
        }

        public RemoteInput[] getDataOnlyRemoteInputs() {
            return this.mDataOnlyRemoteInputs;
        }

        public Bundle getExtras() {
            return this.mExtras;
        }

        public int getIcon() {
            return this.icon;
        }

        public RemoteInput[] getRemoteInputs() {
            return this.mRemoteInputs;
        }

        public int getSemanticAction() {
            return this.mSemanticAction;
        }

        public boolean getShowsUserInterface() {
            return this.mShowsUserInterface;
        }

        public CharSequence getTitle() {
            return this.title;
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface BadgeIconType {
    }

    public class BigPictureStyle extends Style {
        private Bitmap mBigLargeIcon;
        private boolean mBigLargeIconSet;
        private Bitmap mPicture;

        public BigPictureStyle() {
            super();
        }

        public BigPictureStyle(androidx.core.app.NotificationCompat$Builder arg1) {
            super();
            this.setBuilder(arg1);
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) public void apply(NotificationBuilderWithBuilderAccessor arg3) {
            if(Build$VERSION.SDK_INT >= 16) {
                Notification$BigPictureStyle v3 = new Notification$BigPictureStyle(arg3.getBuilder()).setBigContentTitle(this.mBigContentTitle).bigPicture(this.mPicture);
                if(this.mBigLargeIconSet) {
                    v3.bigLargeIcon(this.mBigLargeIcon);
                }

                if(!this.mSummaryTextSet) {
                    return;
                }

                v3.setSummaryText(this.mSummaryText);
            }
        }

        public BigPictureStyle bigLargeIcon(Bitmap arg1) {
            this.mBigLargeIcon = arg1;
            this.mBigLargeIconSet = true;
            return this;
        }

        public BigPictureStyle bigPicture(Bitmap arg1) {
            this.mPicture = arg1;
            return this;
        }

        public BigPictureStyle setBigContentTitle(CharSequence arg1) {
            this.mBigContentTitle = androidx.core.app.NotificationCompat$Builder.limitCharSequenceLength(arg1);
            return this;
        }

        public BigPictureStyle setSummaryText(CharSequence arg1) {
            this.mSummaryText = androidx.core.app.NotificationCompat$Builder.limitCharSequenceLength(arg1);
            this.mSummaryTextSet = true;
            return this;
        }
    }

    public class BigTextStyle extends Style {
        private CharSequence mBigText;

        public BigTextStyle() {
            super();
        }

        public BigTextStyle(androidx.core.app.NotificationCompat$Builder arg1) {
            super();
            this.setBuilder(arg1);
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) public void apply(NotificationBuilderWithBuilderAccessor arg3) {
            if(Build$VERSION.SDK_INT >= 16) {
                Notification$BigTextStyle v3 = new Notification$BigTextStyle(arg3.getBuilder()).setBigContentTitle(this.mBigContentTitle).bigText(this.mBigText);
                if(this.mSummaryTextSet) {
                    v3.setSummaryText(this.mSummaryText);
                }
            }
        }

        public BigTextStyle bigText(CharSequence arg1) {
            this.mBigText = androidx.core.app.NotificationCompat$Builder.limitCharSequenceLength(arg1);
            return this;
        }

        public BigTextStyle setBigContentTitle(CharSequence arg1) {
            this.mBigContentTitle = androidx.core.app.NotificationCompat$Builder.limitCharSequenceLength(arg1);
            return this;
        }

        public BigTextStyle setSummaryText(CharSequence arg1) {
            this.mSummaryText = androidx.core.app.NotificationCompat$Builder.limitCharSequenceLength(arg1);
            this.mSummaryTextSet = true;
            return this;
        }
    }

    public class androidx.core.app.NotificationCompat$Builder {
        private static final int MAX_CHARSEQUENCE_LENGTH = 0x1400;
        @RestrictTo(value={Scope.LIBRARY_GROUP}) public ArrayList mActions;
        int mBadgeIcon;
        RemoteViews mBigContentView;
        String mCategory;
        String mChannelId;
        int mColor;
        boolean mColorized;
        boolean mColorizedSet;
        CharSequence mContentInfo;
        PendingIntent mContentIntent;
        CharSequence mContentText;
        CharSequence mContentTitle;
        RemoteViews mContentView;
        @RestrictTo(value={Scope.LIBRARY_GROUP}) public Context mContext;
        Bundle mExtras;
        PendingIntent mFullScreenIntent;
        int mGroupAlertBehavior;
        String mGroupKey;
        boolean mGroupSummary;
        RemoteViews mHeadsUpContentView;
        ArrayList mInvisibleActions;
        Bitmap mLargeIcon;
        boolean mLocalOnly;
        Notification mNotification;
        int mNumber;
        @Deprecated public ArrayList mPeople;
        int mPriority;
        int mProgress;
        boolean mProgressIndeterminate;
        int mProgressMax;
        Notification mPublicVersion;
        CharSequence[] mRemoteInputHistory;
        String mShortcutId;
        boolean mShowWhen;
        String mSortKey;
        Style mStyle;
        CharSequence mSubText;
        RemoteViews mTickerView;
        long mTimeout;
        boolean mUseChronometer;
        int mVisibility;

        @Deprecated public androidx.core.app.NotificationCompat$Builder(Context arg2) {
            this(arg2, null);
        }

        public androidx.core.app.NotificationCompat$Builder(@NonNull Context arg4, @NonNull String arg5) {
            super();
            this.mActions = new ArrayList();
            this.mInvisibleActions = new ArrayList();
            this.mShowWhen = true;
            this.mLocalOnly = false;
            this.mColor = 0;
            this.mVisibility = 0;
            this.mBadgeIcon = 0;
            this.mGroupAlertBehavior = 0;
            this.mNotification = new Notification();
            this.mContext = arg4;
            this.mChannelId = arg5;
            this.mNotification.when = System.currentTimeMillis();
            this.mNotification.audioStreamType = -1;
            this.mPriority = 0;
            this.mPeople = new ArrayList();
        }

        public androidx.core.app.NotificationCompat$Builder addAction(int arg3, CharSequence arg4, PendingIntent arg5) {
            this.mActions.add(new Action(arg3, arg4, arg5));
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder addAction(Action arg2) {
            this.mActions.add(arg2);
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder addExtras(Bundle arg2) {
            if(arg2 != null) {
                if(this.mExtras == null) {
                    this.mExtras = new Bundle(arg2);
                }
                else {
                    this.mExtras.putAll(arg2);
                }
            }

            return this;
        }

        @RequiresApi(value=21) public androidx.core.app.NotificationCompat$Builder addInvisibleAction(int arg2, CharSequence arg3, PendingIntent arg4) {
            return this.addInvisibleAction(new Action(arg2, arg3, arg4));
        }

        @RequiresApi(value=21) public androidx.core.app.NotificationCompat$Builder addInvisibleAction(Action arg2) {
            this.mInvisibleActions.add(arg2);
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder addPerson(String arg2) {
            this.mPeople.add(arg2);
            return this;
        }

        public Notification build() {
            return new NotificationCompatBuilder(this).build();
        }

        public androidx.core.app.NotificationCompat$Builder extend(androidx.core.app.NotificationCompat$Extender arg1) {
            arg1.extend(this);
            return this;
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) public RemoteViews getBigContentView() {
            return this.mBigContentView;
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) public int getColor() {
            return this.mColor;
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) public RemoteViews getContentView() {
            return this.mContentView;
        }

        public Bundle getExtras() {
            if(this.mExtras == null) {
                this.mExtras = new Bundle();
            }

            return this.mExtras;
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) public RemoteViews getHeadsUpContentView() {
            return this.mHeadsUpContentView;
        }

        @Deprecated public Notification getNotification() {
            return this.build();
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) public int getPriority() {
            return this.mPriority;
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) public long getWhenIfShowing() {
            long v0 = this.mShowWhen ? this.mNotification.when : 0;
            return v0;
        }

        protected static CharSequence limitCharSequenceLength(CharSequence arg2) {
            if(arg2 == null) {
                return arg2;
            }

            int v1 = 0x1400;
            if(arg2.length() > v1) {
                arg2 = arg2.subSequence(0, v1);
            }

            return arg2;
        }

        private Bitmap reduceLargeIconSize(Bitmap arg10) {
            if(arg10 != null) {
                if(Build$VERSION.SDK_INT >= 27) {
                }
                else {
                    Resources v0 = this.mContext.getResources();
                    int v1 = v0.getDimensionPixelSize(R$dimen.compat_notification_large_icon_max_width);
                    int v0_1 = v0.getDimensionPixelSize(R$dimen.compat_notification_large_icon_max_height);
                    if(arg10.getWidth() <= v1 && arg10.getHeight() <= v0_1) {
                        return arg10;
                    }

                    double v0_2 = Math.min((((double)v1)) / (((double)Math.max(1, arg10.getWidth()))), (((double)v0_1)) / (((double)Math.max(1, arg10.getHeight()))));
                    return Bitmap.createScaledBitmap(arg10, ((int)Math.ceil((((double)arg10.getWidth())) * v0_2)), ((int)Math.ceil((((double)arg10.getHeight())) * v0_2)), true);
                }
            }

            return arg10;
        }

        public androidx.core.app.NotificationCompat$Builder setAutoCancel(boolean arg2) {
            this.setFlag(16, arg2);
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setBadgeIconType(int arg1) {
            this.mBadgeIcon = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setCategory(String arg1) {
            this.mCategory = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setChannelId(@NonNull String arg1) {
            this.mChannelId = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setColor(@ColorInt int arg1) {
            this.mColor = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setColorized(boolean arg1) {
            this.mColorized = arg1;
            this.mColorizedSet = true;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setContent(RemoteViews arg2) {
            this.mNotification.contentView = arg2;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setContentInfo(CharSequence arg1) {
            this.mContentInfo = androidx.core.app.NotificationCompat$Builder.limitCharSequenceLength(arg1);
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setContentIntent(PendingIntent arg1) {
            this.mContentIntent = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setContentText(CharSequence arg1) {
            this.mContentText = androidx.core.app.NotificationCompat$Builder.limitCharSequenceLength(arg1);
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setContentTitle(CharSequence arg1) {
            this.mContentTitle = androidx.core.app.NotificationCompat$Builder.limitCharSequenceLength(arg1);
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setCustomBigContentView(RemoteViews arg1) {
            this.mBigContentView = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setCustomContentView(RemoteViews arg1) {
            this.mContentView = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setCustomHeadsUpContentView(RemoteViews arg1) {
            this.mHeadsUpContentView = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setDefaults(int arg2) {
            this.mNotification.defaults = arg2;
            if((arg2 & 4) != 0) {
                this.mNotification.flags |= 1;
            }

            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setDeleteIntent(PendingIntent arg2) {
            this.mNotification.deleteIntent = arg2;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setExtras(Bundle arg1) {
            this.mExtras = arg1;
            return this;
        }

        private void setFlag(int arg2, boolean arg3) {
            if(arg3) {
                this.mNotification.flags |= arg2;
            }
            else {
                this.mNotification.flags &= ~arg2;
            }
        }

        public androidx.core.app.NotificationCompat$Builder setFullScreenIntent(PendingIntent arg1, boolean arg2) {
            this.mFullScreenIntent = arg1;
            this.setFlag(0x80, arg2);
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setGroup(String arg1) {
            this.mGroupKey = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setGroupAlertBehavior(int arg1) {
            this.mGroupAlertBehavior = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setGroupSummary(boolean arg1) {
            this.mGroupSummary = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setLargeIcon(Bitmap arg1) {
            this.mLargeIcon = this.reduceLargeIconSize(arg1);
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setLights(@ColorInt int arg2, int arg3, int arg4) {
            this.mNotification.ledARGB = arg2;
            this.mNotification.ledOnMS = arg3;
            this.mNotification.ledOffMS = arg4;
            arg2 = this.mNotification.ledOnMS == 0 || this.mNotification.ledOffMS == 0 ? 0 : 1;
            this.mNotification.flags = arg2 | this.mNotification.flags & -2;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setLocalOnly(boolean arg1) {
            this.mLocalOnly = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setNumber(int arg1) {
            this.mNumber = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setOngoing(boolean arg2) {
            this.setFlag(2, arg2);
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setOnlyAlertOnce(boolean arg2) {
            this.setFlag(8, arg2);
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setPriority(int arg1) {
            this.mPriority = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setProgress(int arg1, int arg2, boolean arg3) {
            this.mProgressMax = arg1;
            this.mProgress = arg2;
            this.mProgressIndeterminate = arg3;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setPublicVersion(Notification arg1) {
            this.mPublicVersion = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setRemoteInputHistory(CharSequence[] arg1) {
            this.mRemoteInputHistory = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setShortcutId(String arg1) {
            this.mShortcutId = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setShowWhen(boolean arg1) {
            this.mShowWhen = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setSmallIcon(int arg2) {
            this.mNotification.icon = arg2;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setSmallIcon(int arg2, int arg3) {
            this.mNotification.icon = arg2;
            this.mNotification.iconLevel = arg3;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setSortKey(String arg1) {
            this.mSortKey = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setSound(Uri arg3) {
            this.mNotification.sound = arg3;
            this.mNotification.audioStreamType = -1;
            if(Build$VERSION.SDK_INT >= 21) {
                this.mNotification.audioAttributes = new AudioAttributes$Builder().setContentType(4).setUsage(5).build();
            }

            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setSound(Uri arg3, int arg4) {
            this.mNotification.sound = arg3;
            this.mNotification.audioStreamType = arg4;
            if(Build$VERSION.SDK_INT >= 21) {
                this.mNotification.audioAttributes = new AudioAttributes$Builder().setContentType(4).setLegacyStreamType(arg4).build();
            }

            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setStyle(Style arg2) {
            if(this.mStyle != arg2) {
                this.mStyle = arg2;
                if(this.mStyle != null) {
                    this.mStyle.setBuilder(this);
                }
            }

            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setSubText(CharSequence arg1) {
            this.mSubText = androidx.core.app.NotificationCompat$Builder.limitCharSequenceLength(arg1);
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setTicker(CharSequence arg2) {
            this.mNotification.tickerText = androidx.core.app.NotificationCompat$Builder.limitCharSequenceLength(arg2);
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setTicker(CharSequence arg2, RemoteViews arg3) {
            this.mNotification.tickerText = androidx.core.app.NotificationCompat$Builder.limitCharSequenceLength(arg2);
            this.mTickerView = arg3;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setTimeoutAfter(long arg1) {
            this.mTimeout = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setUsesChronometer(boolean arg1) {
            this.mUseChronometer = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setVibrate(long[] arg2) {
            this.mNotification.vibrate = arg2;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setVisibility(int arg1) {
            this.mVisibility = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$Builder setWhen(long arg2) {
            this.mNotification.when = arg2;
            return this;
        }
    }

    public final class CarExtender implements androidx.core.app.NotificationCompat$Extender {
        public class UnreadConversation {
            public class androidx.core.app.NotificationCompat$CarExtender$UnreadConversation$Builder {
                private long mLatestTimestamp;
                private final List mMessages;
                private final String mParticipant;
                private PendingIntent mReadPendingIntent;
                private RemoteInput mRemoteInput;
                private PendingIntent mReplyPendingIntent;

                public androidx.core.app.NotificationCompat$CarExtender$UnreadConversation$Builder(String arg2) {
                    super();
                    this.mMessages = new ArrayList();
                    this.mParticipant = arg2;
                }

                public androidx.core.app.NotificationCompat$CarExtender$UnreadConversation$Builder addMessage(String arg2) {
                    this.mMessages.add(arg2);
                    return this;
                }

                public UnreadConversation build() {
                    return new UnreadConversation(this.mMessages.toArray(new String[this.mMessages.size()]), this.mRemoteInput, this.mReplyPendingIntent, this.mReadPendingIntent, new String[]{this.mParticipant}, this.mLatestTimestamp);
                }

                public androidx.core.app.NotificationCompat$CarExtender$UnreadConversation$Builder setLatestTimestamp(long arg1) {
                    this.mLatestTimestamp = arg1;
                    return this;
                }

                public androidx.core.app.NotificationCompat$CarExtender$UnreadConversation$Builder setReadPendingIntent(PendingIntent arg1) {
                    this.mReadPendingIntent = arg1;
                    return this;
                }

                public androidx.core.app.NotificationCompat$CarExtender$UnreadConversation$Builder setReplyAction(PendingIntent arg1, RemoteInput arg2) {
                    this.mRemoteInput = arg2;
                    this.mReplyPendingIntent = arg1;
                    return this;
                }
            }

            private final long mLatestTimestamp;
            private final String[] mMessages;
            private final String[] mParticipants;
            private final PendingIntent mReadPendingIntent;
            private final RemoteInput mRemoteInput;
            private final PendingIntent mReplyPendingIntent;

            UnreadConversation(String[] arg1, RemoteInput arg2, PendingIntent arg3, PendingIntent arg4, String[] arg5, long arg6) {
                super();
                this.mMessages = arg1;
                this.mRemoteInput = arg2;
                this.mReadPendingIntent = arg4;
                this.mReplyPendingIntent = arg3;
                this.mParticipants = arg5;
                this.mLatestTimestamp = arg6;
            }

            public long getLatestTimestamp() {
                return this.mLatestTimestamp;
            }

            public String[] getMessages() {
                return this.mMessages;
            }

            public String getParticipant() {
                String v0 = this.mParticipants.length > 0 ? this.mParticipants[0] : null;
                return v0;
            }

            public String[] getParticipants() {
                return this.mParticipants;
            }

            public PendingIntent getReadPendingIntent() {
                return this.mReadPendingIntent;
            }

            public RemoteInput getRemoteInput() {
                return this.mRemoteInput;
            }

            public PendingIntent getReplyPendingIntent() {
                return this.mReplyPendingIntent;
            }
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) static final String EXTRA_CAR_EXTENDER = "android.car.EXTENSIONS";
        private static final String EXTRA_COLOR = "app_color";
        private static final String EXTRA_CONVERSATION = "car_conversation";
        @RestrictTo(value={Scope.LIBRARY_GROUP}) static final String EXTRA_INVISIBLE_ACTIONS = "invisible_actions";
        private static final String EXTRA_LARGE_ICON = "large_icon";
        private static final String KEY_AUTHOR = "author";
        private static final String KEY_MESSAGES = "messages";
        private static final String KEY_ON_READ = "on_read";
        private static final String KEY_ON_REPLY = "on_reply";
        private static final String KEY_PARTICIPANTS = "participants";
        private static final String KEY_REMOTE_INPUT = "remote_input";
        private static final String KEY_TEXT = "text";
        private static final String KEY_TIMESTAMP = "timestamp";
        private int mColor;
        private Bitmap mLargeIcon;
        private UnreadConversation mUnreadConversation;

        public CarExtender() {
            super();
            this.mColor = 0;
        }

        public CarExtender(Notification arg4) {
            super();
            this.mColor = 0;
            if(Build$VERSION.SDK_INT < 21) {
                return;
            }

            Bundle v4 = NotificationCompat.getExtras(arg4) == null ? null : NotificationCompat.getExtras(arg4).getBundle("android.car.EXTENSIONS");
            if(v4 != null) {
                this.mLargeIcon = v4.getParcelable("large_icon");
                this.mColor = v4.getInt("app_color", 0);
                this.mUnreadConversation = CarExtender.getUnreadConversationFromBundle(v4.getBundle("car_conversation"));
            }
        }

        public androidx.core.app.NotificationCompat$Builder extend(androidx.core.app.NotificationCompat$Builder arg4) {
            if(Build$VERSION.SDK_INT < 21) {
                return arg4;
            }

            Bundle v0 = new Bundle();
            if(this.mLargeIcon != null) {
                v0.putParcelable("large_icon", this.mLargeIcon);
            }

            if(this.mColor != 0) {
                v0.putInt("app_color", this.mColor);
            }

            if(this.mUnreadConversation != null) {
                v0.putBundle("car_conversation", CarExtender.getBundleForUnreadConversation(this.mUnreadConversation));
            }

            arg4.getExtras().putBundle("android.car.EXTENSIONS", v0);
            return arg4;
        }

        @RequiresApi(value=21) private static Bundle getBundleForUnreadConversation(@NonNull UnreadConversation arg7) {
            Bundle v0 = new Bundle();
            int v2 = 0;
            String v1 = arg7.getParticipants() == null || arg7.getParticipants().length <= 1 ? null : arg7.getParticipants()[0];
            Parcelable[] v3 = new Parcelable[arg7.getMessages().length];
            while(v2 < v3.length) {
                Bundle v4 = new Bundle();
                v4.putString("text", arg7.getMessages()[v2]);
                v4.putString("author", v1);
                v3[v2] = ((Parcelable)v4);
                ++v2;
            }

            v0.putParcelableArray("messages", v3);
            RemoteInput v1_1 = arg7.getRemoteInput();
            if(v1_1 != null) {
                v0.putParcelable("remote_input", new RemoteInput$Builder(v1_1.getResultKey()).setLabel(v1_1.getLabel()).setChoices(v1_1.getChoices()).setAllowFreeFormInput(v1_1.getAllowFreeFormInput()).addExtras(v1_1.getExtras()).build());
            }

            v0.putParcelable("on_reply", arg7.getReplyPendingIntent());
            v0.putParcelable("on_read", arg7.getReadPendingIntent());
            v0.putStringArray("participants", arg7.getParticipants());
            v0.putLong("timestamp", arg7.getLatestTimestamp());
            return v0;
        }

        @ColorInt public int getColor() {
            return this.mColor;
        }

        public Bitmap getLargeIcon() {
            return this.mLargeIcon;
        }

        public UnreadConversation getUnreadConversation() {
            return this.mUnreadConversation;
        }

        @RequiresApi(value=21) private static UnreadConversation getUnreadConversationFromBundle(@Nullable Bundle arg19) {
            String[] v7;
            Bundle v0 = arg19;
            UnreadConversation v1 = null;
            if(v0 == null) {
                return v1;
            }

            Parcelable[] v2 = v0.getParcelableArray("messages");
            if(v2 != null) {
                String[] v4 = new String[v2.length];
                int v5 = 0;
                int v6 = 0;
                while(true) {
                    if(v6 >= v4.length) {
                        break;
                    }
                    else if(!(v2[v6] instanceof Bundle)) {
                    }
                    else {
                        v4[v6] = v2[v6].getString("text");
                        if(v4[v6] == null) {
                        }
                        else {
                            ++v6;
                            continue;
                        }
                    }

                    goto label_28;
                }

                v5 = 1;
            label_28:
                if(v5 != 0) {
                    v7 = v4;
                    goto label_33;
                }

                return v1;
            }
            else {
                v7 = ((String[])v1);
            }

        label_33:
            Parcelable v10 = v0.getParcelable("on_read");
            Parcelable v9 = v0.getParcelable("on_reply");
            Parcelable v2_1 = v0.getParcelable("remote_input");
            String[] v11 = v0.getStringArray("participants");
            if(v11 != null) {
                if(v11.length != 1) {
                }
                else {
                    if(v2_1 != null) {
                        RemoteInput v1_1 = new RemoteInput(((android.app.RemoteInput)v2_1).getResultKey(), ((android.app.RemoteInput)v2_1).getLabel(), ((android.app.RemoteInput)v2_1).getChoices(), ((android.app.RemoteInput)v2_1).getAllowFreeFormInput(), ((android.app.RemoteInput)v2_1).getExtras(), null);
                    }

                    return new UnreadConversation(v7, ((RemoteInput)v1), ((PendingIntent)v9), ((PendingIntent)v10), v11, v0.getLong("timestamp"));
                }
            }

            return v1;
        }

        public CarExtender setColor(@ColorInt int arg1) {
            this.mColor = arg1;
            return this;
        }

        public CarExtender setLargeIcon(Bitmap arg1) {
            this.mLargeIcon = arg1;
            return this;
        }

        public CarExtender setUnreadConversation(UnreadConversation arg1) {
            this.mUnreadConversation = arg1;
            return this;
        }
    }

    public class DecoratedCustomViewStyle extends Style {
        private static final int MAX_ACTION_BUTTONS = 3;

        public DecoratedCustomViewStyle() {
            super();
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) public void apply(NotificationBuilderWithBuilderAccessor arg3) {
            if(Build$VERSION.SDK_INT >= 24) {
                arg3.getBuilder().setStyle(new Notification$DecoratedCustomViewStyle());
            }
        }

        private RemoteViews createRemoteViews(RemoteViews arg7, boolean arg8) {
            int v1 = 1;
            int v2 = 0;
            RemoteViews v0 = this.applyStandardTemplate(true, R$layout.notification_template_custom_big, false);
            v0.removeAllViews(R$id.actions);
            if(!arg8 || this.mBuilder.mActions == null) {
            label_26:
                v1 = 0;
            }
            else {
                int v8 = Math.min(this.mBuilder.mActions.size(), 3);
                if(v8 > 0) {
                    int v3;
                    for(v3 = 0; v3 < v8; ++v3) {
                        v0.addView(R$id.actions, this.generateActionButton(this.mBuilder.mActions.get(v3)));
                    }
                }
                else {
                    goto label_26;
                }
            }

            if(v1 != 0) {
            }
            else {
                v2 = 8;
            }

            v0.setViewVisibility(R$id.actions, v2);
            v0.setViewVisibility(R$id.action_divider, v2);
            this.buildIntoRemoteViews(v0, arg7);
            return v0;
        }

        private RemoteViews generateActionButton(Action arg7) {
            int v0 = arg7.actionIntent == null ? 1 : 0;
            String v2 = this.mBuilder.mContext.getPackageName();
            int v3 = v0 != 0 ? R$layout.notification_action_tombstone : R$layout.notification_action;
            RemoteViews v1 = new RemoteViews(v2, v3);
            v1.setImageViewBitmap(R$id.action_image, this.createColoredBitmap(arg7.getIcon(), this.mBuilder.mContext.getResources().getColor(R$color.notification_action_color_filter)));
            v1.setTextViewText(R$id.action_text, arg7.title);
            if(v0 == 0) {
                v1.setOnClickPendingIntent(R$id.action_container, arg7.actionIntent);
            }

            if(Build$VERSION.SDK_INT >= 15) {
                v1.setContentDescription(R$id.action_container, arg7.title);
            }

            return v1;
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor arg3) {
            RemoteViews v0 = null;
            if(Build$VERSION.SDK_INT >= 24) {
                return v0;
            }

            RemoteViews v3 = this.mBuilder.getBigContentView();
            if(v3 != null) {
            }
            else {
                v3 = this.mBuilder.getContentView();
            }

            if(v3 == null) {
                return v0;
            }

            return this.createRemoteViews(v3, true);
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor arg3) {
            RemoteViews v0 = null;
            if(Build$VERSION.SDK_INT >= 24) {
                return v0;
            }

            if(this.mBuilder.getContentView() == null) {
                return v0;
            }

            return this.createRemoteViews(this.mBuilder.getContentView(), false);
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor arg3) {
            RemoteViews v0 = null;
            if(Build$VERSION.SDK_INT >= 24) {
                return v0;
            }

            RemoteViews v3 = this.mBuilder.getHeadsUpContentView();
            RemoteViews v1 = v3 != null ? v3 : this.mBuilder.getContentView();
            if(v3 == null) {
                return v0;
            }

            return this.createRemoteViews(v1, true);
        }
    }

    public interface androidx.core.app.NotificationCompat$Extender {
        androidx.core.app.NotificationCompat$Builder extend(androidx.core.app.NotificationCompat$Builder arg1);
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface GroupAlertBehavior {
    }

    public class InboxStyle extends Style {
        private ArrayList mTexts;

        public InboxStyle() {
            super();
            this.mTexts = new ArrayList();
        }

        public InboxStyle(androidx.core.app.NotificationCompat$Builder arg2) {
            super();
            this.mTexts = new ArrayList();
            this.setBuilder(arg2);
        }

        public InboxStyle addLine(CharSequence arg2) {
            this.mTexts.add(androidx.core.app.NotificationCompat$Builder.limitCharSequenceLength(arg2));
            return this;
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) public void apply(NotificationBuilderWithBuilderAccessor arg3) {
            if(Build$VERSION.SDK_INT >= 16) {
                Notification$InboxStyle v3 = new Notification$InboxStyle(arg3.getBuilder()).setBigContentTitle(this.mBigContentTitle);
                if(this.mSummaryTextSet) {
                    v3.setSummaryText(this.mSummaryText);
                }

                Iterator v0 = this.mTexts.iterator();
                while(v0.hasNext()) {
                    v3.addLine(v0.next());
                }
            }
        }

        public InboxStyle setBigContentTitle(CharSequence arg1) {
            this.mBigContentTitle = androidx.core.app.NotificationCompat$Builder.limitCharSequenceLength(arg1);
            return this;
        }

        public InboxStyle setSummaryText(CharSequence arg1) {
            this.mSummaryText = androidx.core.app.NotificationCompat$Builder.limitCharSequenceLength(arg1);
            this.mSummaryTextSet = true;
            return this;
        }
    }

    public class MessagingStyle extends Style {
        public final class Message {
            static final String KEY_DATA_MIME_TYPE = "type";
            static final String KEY_DATA_URI = "uri";
            static final String KEY_EXTRAS_BUNDLE = "extras";
            static final String KEY_NOTIFICATION_PERSON = "sender_person";
            static final String KEY_PERSON = "person";
            static final String KEY_SENDER = "sender";
            static final String KEY_TEXT = "text";
            static final String KEY_TIMESTAMP = "time";
            @Nullable private String mDataMimeType;
            @Nullable private Uri mDataUri;
            private Bundle mExtras;
            @Nullable private final Person mPerson;
            private final CharSequence mText;
            private final long mTimestamp;

            public Message(CharSequence arg2, long arg3, @Nullable Person arg5) {
                super();
                this.mExtras = new Bundle();
                this.mText = arg2;
                this.mTimestamp = arg3;
                this.mPerson = arg5;
            }

            @Deprecated public Message(CharSequence arg2, long arg3, CharSequence arg5) {
                this(arg2, arg3, new androidx.core.app.Person$Builder().setName(arg5).build());
            }

            @NonNull static Bundle[] getBundleArrayForMessages(List arg4) {
                Bundle[] v0 = new Bundle[arg4.size()];
                int v1 = arg4.size();
                int v2;
                for(v2 = 0; v2 < v1; ++v2) {
                    v0[v2] = arg4.get(v2).toBundle();
                }

                return v0;
            }

            @Nullable public String getDataMimeType() {
                return this.mDataMimeType;
            }

            @Nullable public Uri getDataUri() {
                return this.mDataUri;
            }

            @NonNull public Bundle getExtras() {
                return this.mExtras;
            }

            @Nullable static Message getMessageFromBundle(Bundle arg6) {
                Message v2;
                Person v1;
                Message v0 = null;
                try {
                    if(arg6.containsKey("text")) {
                        if(!arg6.containsKey("time")) {
                        }
                        else {
                            if(arg6.containsKey("person")) {
                                v1 = Person.fromBundle(arg6.getBundle("person"));
                            }
                            else {
                                if((arg6.containsKey("sender_person")) && Build$VERSION.SDK_INT >= 28) {
                                    v1 = Person.fromAndroidPerson(arg6.getParcelable("sender_person"));
                                    goto label_36;
                                }

                                if(arg6.containsKey("sender")) {
                                    v1 = new androidx.core.app.Person$Builder().setName(arg6.getCharSequence("sender")).build();
                                    goto label_36;
                                }

                                v1 = ((Person)v0);
                            }

                        label_36:
                            v2 = new Message(arg6.getCharSequence("text"), arg6.getLong("time"), v1);
                            if((arg6.containsKey("type")) && (arg6.containsKey("uri"))) {
                                v2.setData(arg6.getString("type"), arg6.getParcelable("uri"));
                            }

                            if(arg6.containsKey("extras")) {
                                v2.getExtras().putAll(arg6.getBundle("extras"));
                            }

                            return v2;
                        }
                    }

                    return v0;
                }
                catch(ClassCastException ) {
                    return v0;
                }

                return v2;
            }

            @NonNull static List getMessagesFromBundleArray(Parcelable[] arg3) {
                ArrayList v0 = new ArrayList(arg3.length);
                int v1;
                for(v1 = 0; v1 < arg3.length; ++v1) {
                    if((arg3[v1] instanceof Bundle)) {
                        Message v2 = Message.getMessageFromBundle(arg3[v1]);
                        if(v2 != null) {
                            ((List)v0).add(v2);
                        }
                    }
                }

                return ((List)v0);
            }

            @Nullable public Person getPerson() {
                return this.mPerson;
            }

            @Nullable @Deprecated public CharSequence getSender() {
                CharSequence v0 = this.mPerson == null ? null : this.mPerson.getName();
                return v0;
            }

            @NonNull public CharSequence getText() {
                return this.mText;
            }

            public long getTimestamp() {
                return this.mTimestamp;
            }

            public Message setData(String arg1, Uri arg2) {
                this.mDataMimeType = arg1;
                this.mDataUri = arg2;
                return this;
            }

            private Bundle toBundle() {
                Bundle v0 = new Bundle();
                if(this.mText != null) {
                    v0.putCharSequence("text", this.mText);
                }

                v0.putLong("time", this.mTimestamp);
                if(this.mPerson != null) {
                    v0.putCharSequence("sender", this.mPerson.getName());
                    if(Build$VERSION.SDK_INT >= 28) {
                        v0.putParcelable("sender_person", this.mPerson.toAndroidPerson());
                    }
                    else {
                        v0.putBundle("person", this.mPerson.toBundle());
                    }
                }

                if(this.mDataMimeType != null) {
                    v0.putString("type", this.mDataMimeType);
                }

                if(this.mDataUri != null) {
                    v0.putParcelable("uri", this.mDataUri);
                }

                if(this.mExtras != null) {
                    v0.putBundle("extras", this.mExtras);
                }

                return v0;
            }
        }

        public static final int MAXIMUM_RETAINED_MESSAGES = 25;
        @Nullable private CharSequence mConversationTitle;
        @Nullable private Boolean mIsGroupConversation;
        private final List mMessages;
        private Person mUser;

        private MessagingStyle() {
            super();
            this.mMessages = new ArrayList();
        }

        public MessagingStyle(@NonNull Person arg2) {
            super();
            this.mMessages = new ArrayList();
            if(!TextUtils.isEmpty(arg2.getName())) {
                this.mUser = arg2;
                return;
            }

            throw new IllegalArgumentException("User\'s name must not be empty.");
        }

        @Deprecated public MessagingStyle(@NonNull CharSequence arg2) {
            super();
            this.mMessages = new ArrayList();
            this.mUser = new androidx.core.app.Person$Builder().setName(arg2).build();
        }

        public void addCompatExtras(Bundle arg3) {
            super.addCompatExtras(arg3);
            arg3.putCharSequence("android.selfDisplayName", this.mUser.getName());
            arg3.putBundle("android.messagingStyleUser", this.mUser.toBundle());
            arg3.putCharSequence("android.hiddenConversationTitle", this.mConversationTitle);
            if(this.mConversationTitle != null && (this.mIsGroupConversation.booleanValue())) {
                arg3.putCharSequence("android.conversationTitle", this.mConversationTitle);
            }

            if(!this.mMessages.isEmpty()) {
                arg3.putParcelableArray("android.messages", Message.getBundleArrayForMessages(this.mMessages));
            }

            if(this.mIsGroupConversation != null) {
                arg3.putBoolean("android.isGroupConversation", this.mIsGroupConversation.booleanValue());
            }
        }

        public MessagingStyle addMessage(Message arg2) {
            this.mMessages.add(arg2);
            if(this.mMessages.size() > 25) {
                this.mMessages.remove(0);
            }

            return this;
        }

        public MessagingStyle addMessage(CharSequence arg2, long arg3, Person arg5) {
            this.addMessage(new Message(arg2, arg3, arg5));
            return this;
        }

        @Deprecated public MessagingStyle addMessage(CharSequence arg4, long arg5, CharSequence arg7) {
            this.mMessages.add(new Message(arg4, arg5, new androidx.core.app.Person$Builder().setName(arg7).build()));
            if(this.mMessages.size() > 25) {
                this.mMessages.remove(0);
            }

            return this;
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) public void apply(NotificationBuilderWithBuilderAccessor arg11) {
            Notification$MessagingStyle$Message v6;
            int v2;
            this.setGroupConversation(this.isGroupConversation());
            CharSequence v1 = null;
            if(Build$VERSION.SDK_INT >= 24) {
                v2 = 28;
                Notification$MessagingStyle v0 = Build$VERSION.SDK_INT >= v2 ? new Notification$MessagingStyle(this.mUser.toAndroidPerson()) : new Notification$MessagingStyle(this.mUser.getName());
                if((this.mIsGroupConversation.booleanValue()) || Build$VERSION.SDK_INT >= v2) {
                    v0.setConversationTitle(this.mConversationTitle);
                }

                if(Build$VERSION.SDK_INT >= v2) {
                    v0.setGroupConversation(this.mIsGroupConversation.booleanValue());
                }

                Iterator v3 = this.mMessages.iterator();
                while(v3.hasNext()) {
                    Object v4 = v3.next();
                    if(Build$VERSION.SDK_INT >= v2) {
                        Person v5 = ((Message)v4).getPerson();
                        CharSequence v7 = ((Message)v4).getText();
                        long v8 = ((Message)v4).getTimestamp();
                        android.app.Person v5_1 = v5 == null ? ((android.app.Person)v1) : v5.toAndroidPerson();
                        v6 = new Notification$MessagingStyle$Message(v7, v8, v5_1);
                    }
                    else {
                        CharSequence v5_2 = ((Message)v4).getPerson() != null ? ((Message)v4).getPerson().getName() : v1;
                        v6 = new Notification$MessagingStyle$Message(((Message)v4).getText(), ((Message)v4).getTimestamp(), v5_2);
                    }

                    if(((Message)v4).getDataMimeType() != null) {
                        v6.setData(((Message)v4).getDataMimeType(), ((Message)v4).getDataUri());
                    }

                    v0.addMessage(v6);
                }

                v0.setBuilder(arg11.getBuilder());
            }
            else {
                Message v0_1 = this.findLatestIncomingMessage();
                if(this.mConversationTitle != null && (this.mIsGroupConversation.booleanValue())) {
                    arg11.getBuilder().setContentTitle(this.mConversationTitle);
                }
                else if(v0_1 != null) {
                    arg11.getBuilder().setContentTitle("");
                    if(v0_1.getPerson() != null) {
                        arg11.getBuilder().setContentTitle(v0_1.getPerson().getName());
                    }
                }

                if(v0_1 != null) {
                    Notification$Builder v2_1 = arg11.getBuilder();
                    CharSequence v0_2 = this.mConversationTitle != null ? this.makeMessageLine(v0_1) : v0_1.getText();
                    v2_1.setContentText(v0_2);
                }

                if(Build$VERSION.SDK_INT < 16) {
                    return;
                }

                SpannableStringBuilder v0_3 = new SpannableStringBuilder();
                v2 = this.mConversationTitle != null || (this.hasMessagesWithoutSender()) ? 1 : 0;
                int v5_3;
                for(v5_3 = this.mMessages.size() - 1; v5_3 >= 0; --v5_3) {
                    Object v6_1 = this.mMessages.get(v5_3);
                    CharSequence v6_2 = v2 != 0 ? this.makeMessageLine(((Message)v6_1)) : ((Message)v6_1).getText();
                    if(v5_3 != this.mMessages.size() - 1) {
                        v0_3.insert(0, "\n");
                    }

                    v0_3.insert(0, v6_2);
                }

                new Notification$BigTextStyle(arg11.getBuilder()).setBigContentTitle(v1).bigText(((CharSequence)v0_3));
            }
        }

        @Nullable public static MessagingStyle extractMessagingStyleFromNotification(Notification arg2) {
            Bundle v2 = NotificationCompat.getExtras(arg2);
            MessagingStyle v0 = null;
            if(v2 != null && !v2.containsKey("android.selfDisplayName") && !v2.containsKey("android.messagingStyleUser")) {
                return v0;
            }

            try {
                MessagingStyle v1 = new MessagingStyle();
                v1.restoreFromCompatExtras(v2);
                return v1;
            }
            catch(ClassCastException ) {
                return v0;
            }
        }

        @Nullable private Message findLatestIncomingMessage() {
            int v0;
            for(v0 = this.mMessages.size() - 1; v0 >= 0; --v0) {
                Object v1 = this.mMessages.get(v0);
                if(((Message)v1).getPerson() != null && !TextUtils.isEmpty(((Message)v1).getPerson().getName())) {
                    return ((Message)v1);
                }
            }

            if(!this.mMessages.isEmpty()) {
                return this.mMessages.get(this.mMessages.size() - 1);
            }

            return null;
        }

        @Nullable public CharSequence getConversationTitle() {
            return this.mConversationTitle;
        }

        public List getMessages() {
            return this.mMessages;
        }

        public Person getUser() {
            return this.mUser;
        }

        @Deprecated public CharSequence getUserDisplayName() {
            return this.mUser.getName();
        }

        private boolean hasMessagesWithoutSender() {
            int v0;
            for(v0 = this.mMessages.size() - 1; v0 >= 0; --v0) {
                Object v2 = this.mMessages.get(v0);
                if(((Message)v2).getPerson() != null && ((Message)v2).getPerson().getName() == null) {
                    return 1;
                }
            }

            return 0;
        }

        public boolean isGroupConversation() {
            boolean v1 = false;
            if(this.mBuilder != null && this.mBuilder.mContext.getApplicationInfo().targetSdkVersion < 28 && this.mIsGroupConversation == null) {
                if(this.mConversationTitle != null) {
                    v1 = true;
                }

                return v1;
            }

            if(this.mIsGroupConversation != null) {
                v1 = this.mIsGroupConversation.booleanValue();
            }

            return v1;
        }

        @NonNull private TextAppearanceSpan makeFontColorSpan(int arg8) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(arg8), null);
        }

        private CharSequence makeMessageLine(Message arg7) {
            String v7;
            CharSequence v4_1;
            String v4;
            BidiFormatter v0 = BidiFormatter.getInstance();
            SpannableStringBuilder v1 = new SpannableStringBuilder();
            int v2 = Build$VERSION.SDK_INT >= 21 ? 1 : 0;
            int v3 = v2 != 0 ? 0xFF000000 : -1;
            if(arg7.getPerson() == null) {
                v4 = "";
            }
            else {
                v4_1 = arg7.getPerson().getName();
            }

            if(TextUtils.isEmpty(((CharSequence)v4))) {
                v4_1 = this.mUser.getName();
                if(v2 != 0 && this.mBuilder.getColor() != 0) {
                    v3 = this.mBuilder.getColor();
                }
            }

            CharSequence v2_1 = v0.unicodeWrap(((CharSequence)v4));
            v1.append(v2_1);
            v1.setSpan(this.makeFontColorSpan(v3), v1.length() - v2_1.length(), v1.length(), 33);
            if(arg7.getText() == null) {
                v7 = "";
            }
            else {
                CharSequence v7_1 = arg7.getText();
            }

            v1.append("  ").append(v0.unicodeWrap(((CharSequence)v7)));
            return ((CharSequence)v1);
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) protected void restoreFromCompatExtras(Bundle arg3) {
            this.mMessages.clear();
            this.mUser = arg3.containsKey("android.messagingStyleUser") ? Person.fromBundle(arg3.getBundle("android.messagingStyleUser")) : new androidx.core.app.Person$Builder().setName(arg3.getString("android.selfDisplayName")).build();
            this.mConversationTitle = arg3.getCharSequence("android.conversationTitle");
            if(this.mConversationTitle == null) {
                this.mConversationTitle = arg3.getCharSequence("android.hiddenConversationTitle");
            }

            Parcelable[] v0 = arg3.getParcelableArray("android.messages");
            if(v0 != null) {
                this.mMessages.addAll(Message.getMessagesFromBundleArray(v0));
            }

            if(arg3.containsKey("android.isGroupConversation")) {
                this.mIsGroupConversation = Boolean.valueOf(arg3.getBoolean("android.isGroupConversation"));
            }
        }

        public MessagingStyle setConversationTitle(@Nullable CharSequence arg1) {
            this.mConversationTitle = arg1;
            return this;
        }

        public MessagingStyle setGroupConversation(boolean arg1) {
            this.mIsGroupConversation = Boolean.valueOf(arg1);
            return this;
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface NotificationVisibility {
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface StreamType {
    }

    public abstract class Style {
        CharSequence mBigContentTitle;
        @RestrictTo(value={Scope.LIBRARY_GROUP}) protected androidx.core.app.NotificationCompat$Builder mBuilder;
        CharSequence mSummaryText;
        boolean mSummaryTextSet;

        public Style() {
            super();
            this.mSummaryTextSet = false;
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) public void addCompatExtras(Bundle arg1) {
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) public void apply(NotificationBuilderWithBuilderAccessor arg1) {
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) public RemoteViews applyStandardTemplate(boolean arg13, int arg14, boolean arg15) {
            int v13;
            Resources v0 = this.mBuilder.mContext.getResources();
            RemoteViews v7 = new RemoteViews(this.mBuilder.mContext.getPackageName(), arg14);
            int v1 = -1;
            int v9 = 0;
            arg14 = this.mBuilder.getPriority() < v1 ? 1 : 0;
            int v3 = 21;
            int v10 = 16;
            if(Build$VERSION.SDK_INT >= v10 && Build$VERSION.SDK_INT < v3) {
                if(arg14 != 0) {
                    v7.setInt(R$id.notification_background, "setBackgroundResource", R$drawable.notification_bg_low);
                    v7.setInt(R$id.icon, "setBackgroundResource", R$drawable.notification_template_icon_low_bg);
                }
                else {
                    v7.setInt(R$id.notification_background, "setBackgroundResource", R$drawable.notification_bg);
                    v7.setInt(R$id.icon, "setBackgroundResource", R$drawable.notification_template_icon_bg);
                }
            }

            int v11 = 8;
            if(this.mBuilder.mLargeIcon != null) {
                if(Build$VERSION.SDK_INT >= v10) {
                    v7.setViewVisibility(R$id.icon, 0);
                    v7.setImageViewBitmap(R$id.icon, this.mBuilder.mLargeIcon);
                }
                else {
                    v7.setViewVisibility(R$id.icon, v11);
                }

                if(!arg13) {
                    goto label_118;
                }

                if(this.mBuilder.mNotification.icon == 0) {
                    goto label_118;
                }

                v13 = v0.getDimensionPixelSize(R$dimen.notification_right_icon_size);
                arg14 = v13 - v0.getDimensionPixelSize(R$dimen.notification_small_icon_background_padding) * 2;
                if(Build$VERSION.SDK_INT >= v3) {
                    v7.setImageViewBitmap(R$id.right_icon, this.createIconWithBackground(this.mBuilder.mNotification.icon, v13, arg14, this.mBuilder.getColor()));
                }
                else {
                    v7.setImageViewBitmap(R$id.right_icon, this.createColoredBitmap(this.mBuilder.mNotification.icon, v1));
                }

                v7.setViewVisibility(R$id.right_icon, 0);
            }
            else {
                if(!arg13) {
                    goto label_118;
                }

                if(this.mBuilder.mNotification.icon == 0) {
                    goto label_118;
                }

                v7.setViewVisibility(R$id.icon, 0);
                if(Build$VERSION.SDK_INT >= v3) {
                    v7.setImageViewBitmap(R$id.icon, this.createIconWithBackground(this.mBuilder.mNotification.icon, v0.getDimensionPixelSize(R$dimen.notification_large_icon_width) - v0.getDimensionPixelSize(R$dimen.notification_big_circle_margin), v0.getDimensionPixelSize(R$dimen.notification_small_icon_size_as_large), this.mBuilder.getColor()));
                    goto label_118;
                }

                v7.setImageViewBitmap(R$id.icon, this.createColoredBitmap(this.mBuilder.mNotification.icon, v1));
            }

        label_118:
            if(this.mBuilder.mContentTitle != null) {
                v7.setTextViewText(R$id.title, this.mBuilder.mContentTitle);
            }

            if(this.mBuilder.mContentText != null) {
                v7.setTextViewText(R$id.text, this.mBuilder.mContentText);
                v13 = 1;
            }
            else {
                v13 = 0;
            }

            arg14 = Build$VERSION.SDK_INT >= v3 || this.mBuilder.mLargeIcon == null ? 0 : 1;
            if(this.mBuilder.mContentInfo != null) {
                v7.setTextViewText(R$id.info, this.mBuilder.mContentInfo);
                v7.setViewVisibility(R$id.info, 0);
                goto label_152;
            }
            else if(this.mBuilder.mNumber > 0) {
                if(this.mBuilder.mNumber > v0.getInteger(R$integer.status_bar_notification_info_maxnum)) {
                    v7.setTextViewText(R$id.info, v0.getString(R$string.status_bar_notification_info_overflow));
                }
                else {
                    v7.setTextViewText(R$id.info, NumberFormat.getIntegerInstance().format(((long)this.mBuilder.mNumber)));
                }

                v7.setViewVisibility(R$id.info, 0);
            label_152:
                v13 = 1;
                arg14 = 1;
            }
            else {
                v7.setViewVisibility(R$id.info, v11);
            }

            if(this.mBuilder.mSubText == null || Build$VERSION.SDK_INT < v10) {
            label_202:
                v1 = 0;
            }
            else {
                v7.setTextViewText(R$id.text, this.mBuilder.mSubText);
                if(this.mBuilder.mContentText != null) {
                    v7.setTextViewText(R$id.text2, this.mBuilder.mContentText);
                    v7.setViewVisibility(R$id.text2, 0);
                    v1 = 1;
                }
                else {
                    v7.setViewVisibility(R$id.text2, v11);
                    goto label_202;
                }
            }

            if(v1 != 0 && Build$VERSION.SDK_INT >= v10) {
                if(arg15) {
                    v7.setTextViewTextSize(R$id.text, 0, ((float)v0.getDimensionPixelSize(R$dimen.notification_subtext_size)));
                }

                v7.setViewPadding(R$id.line1, 0, 0, 0, 0);
            }

            if(this.mBuilder.getWhenIfShowing() != 0) {
                if(!this.mBuilder.mUseChronometer || Build$VERSION.SDK_INT < v10) {
                    v7.setViewVisibility(R$id.time, 0);
                    v7.setLong(R$id.time, "setTime", this.mBuilder.getWhenIfShowing());
                }
                else {
                    v7.setViewVisibility(R$id.chronometer, 0);
                    v7.setLong(R$id.chronometer, "setBase", this.mBuilder.getWhenIfShowing() + (SystemClock.elapsedRealtime() - System.currentTimeMillis()));
                    v7.setBoolean(R$id.chronometer, "setStarted", true);
                }

                arg14 = 1;
            }

            int v15 = R$id.right_side;
            arg14 = arg14 != 0 ? 0 : 8;
            v7.setViewVisibility(v15, arg14);
            arg14 = R$id.line3;
            if(v13 != 0) {
            }
            else {
                v9 = 8;
            }

            v7.setViewVisibility(arg14, v9);
            return v7;
        }

        public Notification build() {
            Notification v0 = this.mBuilder != null ? this.mBuilder.build() : null;
            return v0;
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) public void buildIntoRemoteViews(RemoteViews arg8, RemoteViews arg9) {
            this.hideNormalContent(arg8);
            arg8.removeAllViews(R$id.notification_main_column);
            arg8.addView(R$id.notification_main_column, arg9.clone());
            arg8.setViewVisibility(R$id.notification_main_column, 0);
            if(Build$VERSION.SDK_INT >= 21) {
                arg8.setViewPadding(R$id.notification_main_column_container, 0, this.calculateTopPadding(), 0, 0);
            }
        }

        private int calculateTopPadding() {
            Resources v0 = this.mBuilder.mContext.getResources();
            int v1 = v0.getDimensionPixelSize(R$dimen.notification_top_pad);
            int v2 = v0.getDimensionPixelSize(R$dimen.notification_top_pad_large_text);
            float v0_1 = (Style.constrain(v0.getConfiguration().fontScale, 1f, 1.3f) - 1f) / 0.3f;
            return Math.round((1f - v0_1) * (((float)v1)) + v0_1 * (((float)v2)));
        }

        private static float constrain(float arg1, float arg2, float arg3) {
            if(arg1 < arg2) {
                arg1 = arg2;
            }
            else if(arg1 > arg3) {
                arg1 = arg3;
            }

            return arg1;
        }

        private Bitmap createColoredBitmap(int arg4, int arg5, int arg6) {
            Drawable v4 = this.mBuilder.mContext.getResources().getDrawable(arg4);
            int v0 = arg6 == 0 ? v4.getIntrinsicWidth() : arg6;
            if(arg6 == 0) {
                arg6 = v4.getIntrinsicHeight();
            }

            Bitmap v1 = Bitmap.createBitmap(v0, arg6, Bitmap$Config.ARGB_8888);
            v4.setBounds(0, 0, v0, arg6);
            if(arg5 != 0) {
                v4.mutate().setColorFilter(new PorterDuffColorFilter(arg5, PorterDuff$Mode.SRC_IN));
            }

            v4.draw(new Canvas(v1));
            return v1;
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) public Bitmap createColoredBitmap(int arg2, int arg3) {
            return this.createColoredBitmap(arg2, arg3, 0);
        }

        private Bitmap createIconWithBackground(int arg3, int arg4, int arg5, int arg6) {
            Bitmap v6 = this.createColoredBitmap(R$drawable.notification_icon_background, 0, arg4);
            Canvas v0 = new Canvas(v6);
            Drawable v3 = this.mBuilder.mContext.getResources().getDrawable(arg3).mutate();
            v3.setFilterBitmap(true);
            arg4 = (arg4 - arg5) / 2;
            arg5 += arg4;
            v3.setBounds(arg4, arg4, arg5, arg5);
            v3.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff$Mode.SRC_ATOP));
            v3.draw(v0);
            return v6;
        }

        private void hideNormalContent(RemoteViews arg3) {
            arg3.setViewVisibility(R$id.title, 8);
            arg3.setViewVisibility(R$id.text2, 8);
            arg3.setViewVisibility(R$id.text, 8);
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor arg1) {
            return null;
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor arg1) {
            return null;
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor arg1) {
            return null;
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) protected void restoreFromCompatExtras(Bundle arg1) {
        }

        public void setBuilder(androidx.core.app.NotificationCompat$Builder arg2) {
            if(this.mBuilder != arg2) {
                this.mBuilder = arg2;
                if(this.mBuilder != null) {
                    this.mBuilder.setStyle(this);
                }
            }
        }
    }

    public final class androidx.core.app.NotificationCompat$WearableExtender implements androidx.core.app.NotificationCompat$Extender {
        private static final int DEFAULT_CONTENT_ICON_GRAVITY = 0x800005;
        private static final int DEFAULT_FLAGS = 1;
        private static final int DEFAULT_GRAVITY = 80;
        private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
        private static final int FLAG_BIG_PICTURE_AMBIENT = 0x20;
        private static final int FLAG_CONTENT_INTENT_AVAILABLE_OFFLINE = 1;
        private static final int FLAG_HINT_AVOID_BACKGROUND_CLIPPING = 16;
        private static final int FLAG_HINT_CONTENT_INTENT_LAUNCHES_ACTIVITY = 0x40;
        private static final int FLAG_HINT_HIDE_ICON = 2;
        private static final int FLAG_HINT_SHOW_BACKGROUND_ONLY = 4;
        private static final int FLAG_START_SCROLL_BOTTOM = 8;
        private static final String KEY_ACTIONS = "actions";
        private static final String KEY_BACKGROUND = "background";
        private static final String KEY_BRIDGE_TAG = "bridgeTag";
        private static final String KEY_CONTENT_ACTION_INDEX = "contentActionIndex";
        private static final String KEY_CONTENT_ICON = "contentIcon";
        private static final String KEY_CONTENT_ICON_GRAVITY = "contentIconGravity";
        private static final String KEY_CUSTOM_CONTENT_HEIGHT = "customContentHeight";
        private static final String KEY_CUSTOM_SIZE_PRESET = "customSizePreset";
        private static final String KEY_DISMISSAL_ID = "dismissalId";
        private static final String KEY_DISPLAY_INTENT = "displayIntent";
        private static final String KEY_FLAGS = "flags";
        private static final String KEY_GRAVITY = "gravity";
        private static final String KEY_HINT_SCREEN_TIMEOUT = "hintScreenTimeout";
        private static final String KEY_PAGES = "pages";
        public static final int SCREEN_TIMEOUT_LONG = -1;
        public static final int SCREEN_TIMEOUT_SHORT = 0;
        public static final int SIZE_DEFAULT = 0;
        public static final int SIZE_FULL_SCREEN = 5;
        public static final int SIZE_LARGE = 4;
        public static final int SIZE_MEDIUM = 3;
        public static final int SIZE_SMALL = 2;
        public static final int SIZE_XSMALL = 1;
        public static final int UNSET_ACTION_INDEX = -1;
        private ArrayList mActions;
        private Bitmap mBackground;
        private String mBridgeTag;
        private int mContentActionIndex;
        private int mContentIcon;
        private int mContentIconGravity;
        private int mCustomContentHeight;
        private int mCustomSizePreset;
        private String mDismissalId;
        private PendingIntent mDisplayIntent;
        private int mFlags;
        private int mGravity;
        private int mHintScreenTimeout;
        private ArrayList mPages;

        public androidx.core.app.NotificationCompat$WearableExtender() {
            super();
            this.mActions = new ArrayList();
            this.mFlags = 1;
            this.mPages = new ArrayList();
            this.mContentIconGravity = 0x800005;
            this.mContentActionIndex = -1;
            this.mCustomSizePreset = 0;
            this.mGravity = 80;
        }

        public androidx.core.app.NotificationCompat$WearableExtender(Notification arg12) {
            super();
            this.mActions = new ArrayList();
            this.mFlags = 1;
            this.mPages = new ArrayList();
            int v1 = 0x800005;
            this.mContentIconGravity = v1;
            int v2 = -1;
            this.mContentActionIndex = v2;
            this.mCustomSizePreset = 0;
            int v4 = 80;
            this.mGravity = v4;
            Bundle v12 = NotificationCompat.getExtras(arg12);
            v12 = v12 != null ? v12.getBundle("android.wearable.EXTENSIONS") : null;
            if(v12 != null) {
                ArrayList v5 = v12.getParcelableArrayList("actions");
                int v7 = 16;
                if(Build$VERSION.SDK_INT >= v7 && v5 != null) {
                    Action[] v6 = new Action[v5.size()];
                    int v8;
                    for(v8 = 0; v8 < v6.length; ++v8) {
                        if(Build$VERSION.SDK_INT >= 20) {
                            v6[v8] = NotificationCompat.getActionCompatFromAction(v5.get(v8));
                        }
                        else if(Build$VERSION.SDK_INT >= v7) {
                            v6[v8] = NotificationCompatJellybean.getActionFromBundle(v5.get(v8));
                        }
                    }

                    Collections.addAll(this.mActions, ((Object[])v6));
                }

                this.mFlags = v12.getInt("flags", 1);
                this.mDisplayIntent = v12.getParcelable("displayIntent");
                Notification[] v0 = NotificationCompat.getNotificationArrayFromBundle(v12, "pages");
                if(v0 != null) {
                    Collections.addAll(this.mPages, ((Object[])v0));
                }

                this.mBackground = v12.getParcelable("background");
                this.mContentIcon = v12.getInt("contentIcon");
                this.mContentIconGravity = v12.getInt("contentIconGravity", v1);
                this.mContentActionIndex = v12.getInt("contentActionIndex", v2);
                this.mCustomSizePreset = v12.getInt("customSizePreset", 0);
                this.mCustomContentHeight = v12.getInt("customContentHeight");
                this.mGravity = v12.getInt("gravity", v4);
                this.mHintScreenTimeout = v12.getInt("hintScreenTimeout");
                this.mDismissalId = v12.getString("dismissalId");
                this.mBridgeTag = v12.getString("bridgeTag");
            }
        }

        public androidx.core.app.NotificationCompat$WearableExtender addAction(Action arg2) {
            this.mActions.add(arg2);
            return this;
        }

        public androidx.core.app.NotificationCompat$WearableExtender addActions(List arg2) {
            this.mActions.addAll(((Collection)arg2));
            return this;
        }

        public androidx.core.app.NotificationCompat$WearableExtender addPage(Notification arg2) {
            this.mPages.add(arg2);
            return this;
        }

        public androidx.core.app.NotificationCompat$WearableExtender addPages(List arg2) {
            this.mPages.addAll(((Collection)arg2));
            return this;
        }

        public androidx.core.app.NotificationCompat$WearableExtender clearActions() {
            this.mActions.clear();
            return this;
        }

        public androidx.core.app.NotificationCompat$WearableExtender clearPages() {
            this.mPages.clear();
            return this;
        }

        public androidx.core.app.NotificationCompat$WearableExtender clone() {
            androidx.core.app.NotificationCompat$WearableExtender v0 = new androidx.core.app.NotificationCompat$WearableExtender();
            v0.mActions = new ArrayList(this.mActions);
            v0.mFlags = this.mFlags;
            v0.mDisplayIntent = this.mDisplayIntent;
            v0.mPages = new ArrayList(this.mPages);
            v0.mBackground = this.mBackground;
            v0.mContentIcon = this.mContentIcon;
            v0.mContentIconGravity = this.mContentIconGravity;
            v0.mContentActionIndex = this.mContentActionIndex;
            v0.mCustomSizePreset = this.mCustomSizePreset;
            v0.mCustomContentHeight = this.mCustomContentHeight;
            v0.mGravity = this.mGravity;
            v0.mHintScreenTimeout = this.mHintScreenTimeout;
            v0.mDismissalId = this.mDismissalId;
            v0.mBridgeTag = this.mBridgeTag;
            return v0;
        }

        public Object clone() throws CloneNotSupportedException {
            return this.clone();
        }

        public androidx.core.app.NotificationCompat$Builder extend(androidx.core.app.NotificationCompat$Builder arg8) {
            Bundle v0 = new Bundle();
            if(!this.mActions.isEmpty()) {
                int v2 = 16;
                if(Build$VERSION.SDK_INT >= v2) {
                    ArrayList v1 = new ArrayList(this.mActions.size());
                    Iterator v3 = this.mActions.iterator();
                    while(v3.hasNext()) {
                        Object v4 = v3.next();
                        if(Build$VERSION.SDK_INT >= 20) {
                            v1.add(androidx.core.app.NotificationCompat$WearableExtender.getActionFromActionCompat(((Action)v4)));
                        }
                        else {
                            if(Build$VERSION.SDK_INT < v2) {
                                continue;
                            }

                            v1.add(NotificationCompatJellybean.getBundleForAction(((Action)v4)));
                        }
                    }

                    v0.putParcelableArrayList("actions", v1);
                }
                else {
                    v0.putParcelableArrayList("actions", null);
                }
            }

            if(this.mFlags != 1) {
                v0.putInt("flags", this.mFlags);
            }

            if(this.mDisplayIntent != null) {
                v0.putParcelable("displayIntent", this.mDisplayIntent);
            }

            if(!this.mPages.isEmpty()) {
                v0.putParcelableArray("pages", this.mPages.toArray(new Notification[this.mPages.size()]));
            }

            if(this.mBackground != null) {
                v0.putParcelable("background", this.mBackground);
            }

            if(this.mContentIcon != 0) {
                v0.putInt("contentIcon", this.mContentIcon);
            }

            if(this.mContentIconGravity != 0x800005) {
                v0.putInt("contentIconGravity", this.mContentIconGravity);
            }

            if(this.mContentActionIndex != -1) {
                v0.putInt("contentActionIndex", this.mContentActionIndex);
            }

            if(this.mCustomSizePreset != 0) {
                v0.putInt("customSizePreset", this.mCustomSizePreset);
            }

            if(this.mCustomContentHeight != 0) {
                v0.putInt("customContentHeight", this.mCustomContentHeight);
            }

            if(this.mGravity != 80) {
                v0.putInt("gravity", this.mGravity);
            }

            if(this.mHintScreenTimeout != 0) {
                v0.putInt("hintScreenTimeout", this.mHintScreenTimeout);
            }

            if(this.mDismissalId != null) {
                v0.putString("dismissalId", this.mDismissalId);
            }

            if(this.mBridgeTag != null) {
                v0.putString("bridgeTag", this.mBridgeTag);
            }

            arg8.getExtras().putBundle("android.wearable.EXTENSIONS", v0);
            return arg8;
        }

        @RequiresApi(value=20) private static Notification$Action getActionFromActionCompat(Action arg4) {
            Notification$Action$Builder v0 = new Notification$Action$Builder(arg4.getIcon(), arg4.getTitle(), arg4.getActionIntent());
            Bundle v1 = arg4.getExtras() != null ? new Bundle(arg4.getExtras()) : new Bundle();
            v1.putBoolean("android.support.allowGeneratedReplies", arg4.getAllowGeneratedReplies());
            if(Build$VERSION.SDK_INT >= 24) {
                v0.setAllowGeneratedReplies(arg4.getAllowGeneratedReplies());
            }

            v0.addExtras(v1);
            RemoteInput[] v4 = arg4.getRemoteInputs();
            if(v4 != null) {
                android.app.RemoteInput[] v4_1 = RemoteInput.fromCompat(v4);
                int v1_1 = v4_1.length;
                int v2;
                for(v2 = 0; v2 < v1_1; ++v2) {
                    v0.addRemoteInput(v4_1[v2]);
                }
            }

            return v0.build();
        }

        public List getActions() {
            return this.mActions;
        }

        public Bitmap getBackground() {
            return this.mBackground;
        }

        public String getBridgeTag() {
            return this.mBridgeTag;
        }

        public int getContentAction() {
            return this.mContentActionIndex;
        }

        @Deprecated public int getContentIcon() {
            return this.mContentIcon;
        }

        @Deprecated public int getContentIconGravity() {
            return this.mContentIconGravity;
        }

        public boolean getContentIntentAvailableOffline() {
            boolean v1 = true;
            if((this.mFlags & 1) != 0) {
            }
            else {
                v1 = false;
            }

            return v1;
        }

        @Deprecated public int getCustomContentHeight() {
            return this.mCustomContentHeight;
        }

        @Deprecated public int getCustomSizePreset() {
            return this.mCustomSizePreset;
        }

        public String getDismissalId() {
            return this.mDismissalId;
        }

        public PendingIntent getDisplayIntent() {
            return this.mDisplayIntent;
        }

        @Deprecated public int getGravity() {
            return this.mGravity;
        }

        public boolean getHintAmbientBigPicture() {
            boolean v0 = (this.mFlags & 0x20) != 0 ? true : false;
            return v0;
        }

        @Deprecated public boolean getHintAvoidBackgroundClipping() {
            boolean v0 = (this.mFlags & 16) != 0 ? true : false;
            return v0;
        }

        public boolean getHintContentIntentLaunchesActivity() {
            boolean v0 = (this.mFlags & 0x40) != 0 ? true : false;
            return v0;
        }

        @Deprecated public boolean getHintHideIcon() {
            boolean v0 = (this.mFlags & 2) != 0 ? true : false;
            return v0;
        }

        @Deprecated public int getHintScreenTimeout() {
            return this.mHintScreenTimeout;
        }

        @Deprecated public boolean getHintShowBackgroundOnly() {
            boolean v0 = (this.mFlags & 4) != 0 ? true : false;
            return v0;
        }

        public List getPages() {
            return this.mPages;
        }

        public boolean getStartScrollBottom() {
            boolean v0 = (this.mFlags & 8) != 0 ? true : false;
            return v0;
        }

        public androidx.core.app.NotificationCompat$WearableExtender setBackground(Bitmap arg1) {
            this.mBackground = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$WearableExtender setBridgeTag(String arg1) {
            this.mBridgeTag = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$WearableExtender setContentAction(int arg1) {
            this.mContentActionIndex = arg1;
            return this;
        }

        @Deprecated public androidx.core.app.NotificationCompat$WearableExtender setContentIcon(int arg1) {
            this.mContentIcon = arg1;
            return this;
        }

        @Deprecated public androidx.core.app.NotificationCompat$WearableExtender setContentIconGravity(int arg1) {
            this.mContentIconGravity = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$WearableExtender setContentIntentAvailableOffline(boolean arg2) {
            this.setFlag(1, arg2);
            return this;
        }

        @Deprecated public androidx.core.app.NotificationCompat$WearableExtender setCustomContentHeight(int arg1) {
            this.mCustomContentHeight = arg1;
            return this;
        }

        @Deprecated public androidx.core.app.NotificationCompat$WearableExtender setCustomSizePreset(int arg1) {
            this.mCustomSizePreset = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$WearableExtender setDismissalId(String arg1) {
            this.mDismissalId = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$WearableExtender setDisplayIntent(PendingIntent arg1) {
            this.mDisplayIntent = arg1;
            return this;
        }

        private void setFlag(int arg1, boolean arg2) {
            if(arg2) {
                this.mFlags |= arg1;
            }
            else {
                this.mFlags &= ~arg1;
            }
        }

        @Deprecated public androidx.core.app.NotificationCompat$WearableExtender setGravity(int arg1) {
            this.mGravity = arg1;
            return this;
        }

        public androidx.core.app.NotificationCompat$WearableExtender setHintAmbientBigPicture(boolean arg2) {
            this.setFlag(0x20, arg2);
            return this;
        }

        @Deprecated public androidx.core.app.NotificationCompat$WearableExtender setHintAvoidBackgroundClipping(boolean arg2) {
            this.setFlag(16, arg2);
            return this;
        }

        public androidx.core.app.NotificationCompat$WearableExtender setHintContentIntentLaunchesActivity(boolean arg2) {
            this.setFlag(0x40, arg2);
            return this;
        }

        @Deprecated public androidx.core.app.NotificationCompat$WearableExtender setHintHideIcon(boolean arg2) {
            this.setFlag(2, arg2);
            return this;
        }

        @Deprecated public androidx.core.app.NotificationCompat$WearableExtender setHintScreenTimeout(int arg1) {
            this.mHintScreenTimeout = arg1;
            return this;
        }

        @Deprecated public androidx.core.app.NotificationCompat$WearableExtender setHintShowBackgroundOnly(boolean arg2) {
            this.setFlag(4, arg2);
            return this;
        }

        public androidx.core.app.NotificationCompat$WearableExtender setStartScrollBottom(boolean arg2) {
            this.setFlag(8, arg2);
            return this;
        }
    }

    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_REMINDER = "reminder";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    @ColorInt public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;
    public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
    public static final String EXTRA_BIG_TEXT = "android.bigText";
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
    public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";
    public static final String EXTRA_INFO_TEXT = "android.infoText";
    public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";
    public static final String EXTRA_MESSAGES = "android.messages";
    public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";
    public static final String EXTRA_PEOPLE = "android.people";
    public static final String EXTRA_PICTURE = "android.picture";
    public static final String EXTRA_PROGRESS = "android.progress";
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";
    public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
    public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";
    public static final String EXTRA_SMALL_ICON = "android.icon";
    public static final String EXTRA_SUB_TEXT = "android.subText";
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";
    public static final String EXTRA_TEMPLATE = "android.template";
    public static final String EXTRA_TEXT = "android.text";
    public static final String EXTRA_TEXT_LINES = "android.textLines";
    public static final String EXTRA_TITLE = "android.title";
    public static final String EXTRA_TITLE_BIG = "android.title.big";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_FOREGROUND_SERVICE = 0x40;
    public static final int FLAG_GROUP_SUMMARY = 0x200;
    @Deprecated public static final int FLAG_HIGH_PRIORITY = 0x80;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 0x100;
    public static final int FLAG_NO_CLEAR = 0x20;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    @Deprecated public NotificationCompat() {
        super();
    }

    public static Action getAction(Notification arg3, int arg4) {
        Object v2_1;
        if(Build$VERSION.SDK_INT >= 20) {
            return NotificationCompat.getActionCompatFromAction(arg3.actions[arg4]);
        }

        Bundle v2 = null;
        if(Build$VERSION.SDK_INT >= 19) {
            Notification$Action v0 = arg3.actions[arg4];
            SparseArray v3 = arg3.extras.getSparseParcelableArray("android.support.actionExtras");
            if(v3 != null) {
                v2_1 = v3.get(arg4);
            }

            return NotificationCompatJellybean.readAction(v0.icon, v0.title, v0.actionIntent, ((Bundle)v2_1));
        }

        if(Build$VERSION.SDK_INT >= 16) {
            return NotificationCompatJellybean.getAction(arg3, arg4);
        }

        return ((Action)v2);
    }

    @RequiresApi(value=20) static Action getActionCompatFromAction(Notification$Action arg14) {
        boolean v0_1;
        RemoteInput[] v9;
        android.app.RemoteInput[] v0 = arg14.getRemoteInputs();
        if(v0 == null) {
            v9 = null;
        }
        else {
            RemoteInput[] v2 = new RemoteInput[v0.length];
            int v3;
            for(v3 = 0; v3 < v0.length; ++v3) {
                v2[v3] = new RemoteInput(v0[v3].getResultKey(), v0[v3].getLabel(), v0[v3].getChoices(), v0[v3].getAllowFreeFormInput(), v0[v3].getExtras(), null);
            }

            v9 = v2;
        }

        if(Build$VERSION.SDK_INT >= 24) {
            if(!arg14.getExtras().getBoolean("android.support.allowGeneratedReplies")) {
                if(arg14.getAllowGeneratedReplies()) {
                }
                else {
                    v0_1 = false;
                    goto label_44;
                }
            }

            v0_1 = true;
        }
        else {
            v0_1 = arg14.getExtras().getBoolean("android.support.allowGeneratedReplies");
        }

    label_44:
        boolean v11 = v0_1;
        boolean v13 = arg14.getExtras().getBoolean("android.support.action.showsUserInterface", true);
        int v0_2 = Build$VERSION.SDK_INT >= 28 ? arg14.getSemanticAction() : arg14.getExtras().getInt("android.support.action.semanticAction", 0);
        int v12 = v0_2;
        return new Action(arg14.icon, arg14.title, arg14.actionIntent, arg14.getExtras(), v9, null, v11, v12, v13);
    }

    public static int getActionCount(Notification arg3) {
        int v1 = 0;
        if(Build$VERSION.SDK_INT >= 19) {
            if(arg3.actions != null) {
                v1 = arg3.actions.length;
            }

            return v1;
        }

        if(Build$VERSION.SDK_INT >= 16) {
            return NotificationCompatJellybean.getActionCount(arg3);
        }

        return 0;
    }

    public static int getBadgeIconType(Notification arg2) {
        if(Build$VERSION.SDK_INT >= 26) {
            return arg2.getBadgeIconType();
        }

        return 0;
    }

    public static String getCategory(Notification arg2) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.category;
        }

        return null;
    }

    public static String getChannelId(Notification arg2) {
        if(Build$VERSION.SDK_INT >= 26) {
            return arg2.getChannelId();
        }

        return null;
    }

    @RequiresApi(value=19) public static CharSequence getContentTitle(Notification arg1) {
        return arg1.extras.getCharSequence("android.title");
    }

    @Nullable public static Bundle getExtras(Notification arg2) {
        if(Build$VERSION.SDK_INT >= 19) {
            return arg2.extras;
        }

        if(Build$VERSION.SDK_INT >= 16) {
            return NotificationCompatJellybean.getExtras(arg2);
        }

        return null;
    }

    public static String getGroup(Notification arg2) {
        if(Build$VERSION.SDK_INT >= 20) {
            return arg2.getGroup();
        }

        if(Build$VERSION.SDK_INT >= 19) {
            return arg2.extras.getString("android.support.groupKey");
        }

        if(Build$VERSION.SDK_INT >= 16) {
            return NotificationCompatJellybean.getExtras(arg2).getString("android.support.groupKey");
        }

        return null;
    }

    public static int getGroupAlertBehavior(Notification arg2) {
        if(Build$VERSION.SDK_INT >= 26) {
            return arg2.getGroupAlertBehavior();
        }

        return 0;
    }

    @RequiresApi(value=21) public static List getInvisibleActions(Notification arg3) {
        ArrayList v0 = new ArrayList();
        Bundle v3 = arg3.extras.getBundle("android.car.EXTENSIONS");
        if(v3 == null) {
            return ((List)v0);
        }

        v3 = v3.getBundle("invisible_actions");
        if(v3 != null) {
            int v1;
            for(v1 = 0; v1 < v3.size(); ++v1) {
                v0.add(NotificationCompatJellybean.getActionFromBundle(v3.getBundle(Integer.toString(v1))));
            }
        }

        return ((List)v0);
    }

    public static boolean getLocalOnly(Notification arg3) {
        boolean v1 = false;
        if(Build$VERSION.SDK_INT >= 20) {
            if((arg3.flags & 0x100) != 0) {
                v1 = true;
            }

            return v1;
        }

        if(Build$VERSION.SDK_INT >= 19) {
            return arg3.extras.getBoolean("android.support.localOnly");
        }

        if(Build$VERSION.SDK_INT >= 16) {
            return NotificationCompatJellybean.getExtras(arg3).getBoolean("android.support.localOnly");
        }

        return 0;
    }

    static Notification[] getNotificationArrayFromBundle(Bundle arg4, String arg5) {
        Parcelable[] v0 = arg4.getParcelableArray(arg5);
        if(!(v0 instanceof Notification[])) {
            if(v0 == null) {
            }
            else {
                Notification[] v1 = new Notification[v0.length];
                int v2;
                for(v2 = 0; v2 < v0.length; ++v2) {
                    v1[v2] = v0[v2];
                }

                arg4.putParcelableArray(arg5, ((Parcelable[])v1));
                return v1;
            }
        }

        return ((Notification[])v0);
    }

    public static String getShortcutId(Notification arg2) {
        if(Build$VERSION.SDK_INT >= 26) {
            return arg2.getShortcutId();
        }

        return null;
    }

    public static String getSortKey(Notification arg2) {
        if(Build$VERSION.SDK_INT >= 20) {
            return arg2.getSortKey();
        }

        if(Build$VERSION.SDK_INT >= 19) {
            return arg2.extras.getString("android.support.sortKey");
        }

        if(Build$VERSION.SDK_INT >= 16) {
            return NotificationCompatJellybean.getExtras(arg2).getString("android.support.sortKey");
        }

        return null;
    }

    public static long getTimeoutAfter(Notification arg2) {
        if(Build$VERSION.SDK_INT >= 26) {
            return arg2.getTimeoutAfter();
        }

        return 0;
    }

    public static boolean isGroupSummary(Notification arg3) {
        boolean v1 = false;
        if(Build$VERSION.SDK_INT >= 20) {
            if((arg3.flags & 0x200) != 0) {
                v1 = true;
            }

            return v1;
        }

        if(Build$VERSION.SDK_INT >= 19) {
            return arg3.extras.getBoolean("android.support.isGroupSummary");
        }

        if(Build$VERSION.SDK_INT >= 16) {
            return NotificationCompatJellybean.getExtras(arg3).getBoolean("android.support.isGroupSummary");
        }

        return 0;
    }
}

