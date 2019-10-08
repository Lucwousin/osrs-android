package androidx.core.app;

import android.app.Notification$Action$Builder;
import android.app.Notification$Builder;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestrictTo(value={Scope.LIBRARY_GROUP}) class NotificationCompatBuilder implements NotificationBuilderWithBuilderAccessor {
    private final List mActionExtrasList;
    private RemoteViews mBigContentView;
    private final Notification$Builder mBuilder;
    private final Builder mBuilderCompat;
    private RemoteViews mContentView;
    private final Bundle mExtras;
    private int mGroupAlertBehavior;
    private RemoteViews mHeadsUpContentView;

    NotificationCompatBuilder(Builder arg10) {
        super();
        this.mActionExtrasList = new ArrayList();
        this.mExtras = new Bundle();
        this.mBuilderCompat = arg10;
        int v1 = 26;
        this.mBuilder = Build$VERSION.SDK_INT >= v1 ? new Notification$Builder(arg10.mContext, arg10.mChannelId) : new Notification$Builder(arg10.mContext);
        Notification v0 = arg10.mNotification;
        Notification$Builder v2 = this.mBuilder.setWhen(v0.when).setSmallIcon(v0.icon, v0.iconLevel).setContent(v0.contentView).setTicker(v0.tickerText, arg10.mTickerView).setVibrate(v0.vibrate).setLights(v0.ledARGB, v0.ledOnMS, v0.ledOffMS);
        boolean v3 = (v0.flags & 2) != 0 ? true : false;
        v2 = v2.setOngoing(v3);
        v3 = (v0.flags & 8) != 0 ? true : false;
        v2 = v2.setOnlyAlertOnce(v3);
        int v6 = 16;
        v3 = (v0.flags & v6) != 0 ? true : false;
        v2 = v2.setAutoCancel(v3).setDefaults(v0.defaults).setContentTitle(arg10.mContentTitle).setContentText(arg10.mContentText).setContentInfo(arg10.mContentInfo).setContentIntent(arg10.mContentIntent).setDeleteIntent(v0.deleteIntent);
        PendingIntent v3_1 = arg10.mFullScreenIntent;
        boolean v7 = (v0.flags & 0x80) != 0 ? true : false;
        v2.setFullScreenIntent(v3_1, v7).setLargeIcon(arg10.mLargeIcon).setNumber(arg10.mNumber).setProgress(arg10.mProgressMax, arg10.mProgress, arg10.mProgressIndeterminate);
        int v3_2 = 21;
        if(Build$VERSION.SDK_INT < v3_2) {
            this.mBuilder.setSound(v0.sound, v0.audioStreamType);
        }

        int v7_1 = 20;
        if(Build$VERSION.SDK_INT >= v6) {
            this.mBuilder.setSubText(arg10.mSubText).setUsesChronometer(arg10.mUseChronometer).setPriority(arg10.mPriority);
            Iterator v2_1 = arg10.mActions.iterator();
            while(v2_1.hasNext()) {
                this.addAction(v2_1.next());
            }

            if(arg10.mExtras != null) {
                this.mExtras.putAll(arg10.mExtras);
            }

            if(Build$VERSION.SDK_INT < v7_1) {
                if(arg10.mLocalOnly) {
                    this.mExtras.putBoolean("android.support.localOnly", true);
                }

                if(arg10.mGroupKey != null) {
                    this.mExtras.putString("android.support.groupKey", arg10.mGroupKey);
                    if(arg10.mGroupSummary) {
                        this.mExtras.putBoolean("android.support.isGroupSummary", true);
                    }
                    else {
                        this.mExtras.putBoolean("android.support.useSideChannel", true);
                    }
                }

                if(arg10.mSortKey == null) {
                    goto label_148;
                }

                this.mExtras.putString("android.support.sortKey", arg10.mSortKey);
            }

        label_148:
            this.mContentView = arg10.mContentView;
            this.mBigContentView = arg10.mBigContentView;
        }

        if(Build$VERSION.SDK_INT >= 19) {
            this.mBuilder.setShowWhen(arg10.mShowWhen);
            if(Build$VERSION.SDK_INT < v3_2 && arg10.mPeople != null && !arg10.mPeople.isEmpty()) {
                this.mExtras.putStringArray("android.people", arg10.mPeople.toArray(new String[arg10.mPeople.size()]));
            }
        }

        if(Build$VERSION.SDK_INT >= v7_1) {
            this.mBuilder.setLocalOnly(arg10.mLocalOnly).setGroup(arg10.mGroupKey).setGroupSummary(arg10.mGroupSummary).setSortKey(arg10.mSortKey);
            this.mGroupAlertBehavior = arg10.mGroupAlertBehavior;
        }

        if(Build$VERSION.SDK_INT >= v3_2) {
            this.mBuilder.setCategory(arg10.mCategory).setColor(arg10.mColor).setVisibility(arg10.mVisibility).setPublicVersion(arg10.mPublicVersion).setSound(v0.sound, v0.audioAttributes);
            Iterator v0_1 = arg10.mPeople.iterator();
            while(v0_1.hasNext()) {
                this.mBuilder.addPerson(v0_1.next());
            }

            this.mHeadsUpContentView = arg10.mHeadsUpContentView;
            if(arg10.mInvisibleActions.size() > 0) {
                Bundle v0_2 = arg10.getExtras().getBundle("android.car.EXTENSIONS");
                if(v0_2 == null) {
                    v0_2 = new Bundle();
                }

                Bundle v2_2 = new Bundle();
                for(v3_2 = 0; v3_2 < arg10.mInvisibleActions.size(); ++v3_2) {
                    v2_2.putBundle(Integer.toString(v3_2), NotificationCompatJellybean.getBundleForAction(arg10.mInvisibleActions.get(v3_2)));
                }

                v0_2.putBundle("invisible_actions", v2_2);
                arg10.getExtras().putBundle("android.car.EXTENSIONS", v0_2);
                this.mExtras.putBundle("android.car.EXTENSIONS", v0_2);
            }
        }

        if(Build$VERSION.SDK_INT >= 24) {
            this.mBuilder.setExtras(arg10.mExtras).setRemoteInputHistory(arg10.mRemoteInputHistory);
            if(arg10.mContentView != null) {
                this.mBuilder.setCustomContentView(arg10.mContentView);
            }

            if(arg10.mBigContentView != null) {
                this.mBuilder.setCustomBigContentView(arg10.mBigContentView);
            }

            if(arg10.mHeadsUpContentView == null) {
                goto label_263;
            }

            this.mBuilder.setCustomHeadsUpContentView(arg10.mHeadsUpContentView);
        }

    label_263:
        if(Build$VERSION.SDK_INT >= v1) {
            this.mBuilder.setBadgeIconType(arg10.mBadgeIcon).setShortcutId(arg10.mShortcutId).setTimeoutAfter(arg10.mTimeout).setGroupAlertBehavior(arg10.mGroupAlertBehavior);
            if(arg10.mColorizedSet) {
                this.mBuilder.setColorized(arg10.mColorized);
            }

            if(TextUtils.isEmpty(arg10.mChannelId)) {
                return;
            }

            this.mBuilder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
    }

    private void addAction(Action arg6) {
        if(Build$VERSION.SDK_INT >= 20) {
            Notification$Action$Builder v0 = new Notification$Action$Builder(arg6.getIcon(), arg6.getTitle(), arg6.getActionIntent());
            if(arg6.getRemoteInputs() != null) {
                RemoteInput[] v1 = androidx.core.app.RemoteInput.fromCompat(arg6.getRemoteInputs());
                int v2 = v1.length;
                int v3;
                for(v3 = 0; v3 < v2; ++v3) {
                    v0.addRemoteInput(v1[v3]);
                }
            }

            Bundle v1_1 = arg6.getExtras() != null ? new Bundle(arg6.getExtras()) : new Bundle();
            v1_1.putBoolean("android.support.allowGeneratedReplies", arg6.getAllowGeneratedReplies());
            if(Build$VERSION.SDK_INT >= 24) {
                v0.setAllowGeneratedReplies(arg6.getAllowGeneratedReplies());
            }

            v1_1.putInt("android.support.action.semanticAction", arg6.getSemanticAction());
            if(Build$VERSION.SDK_INT >= 28) {
                v0.setSemanticAction(arg6.getSemanticAction());
            }

            v1_1.putBoolean("android.support.action.showsUserInterface", arg6.getShowsUserInterface());
            v0.addExtras(v1_1);
            this.mBuilder.addAction(v0.build());
        }
        else {
            if(Build$VERSION.SDK_INT < 16) {
                return;
            }

            this.mActionExtrasList.add(NotificationCompatJellybean.writeActionAndGetExtras(this.mBuilder, arg6));
        }
    }

    public Notification build() {
        Style v0 = this.mBuilderCompat.mStyle;
        if(v0 != null) {
            v0.apply(((NotificationBuilderWithBuilderAccessor)this));
        }

        RemoteViews v1 = v0 != null ? v0.makeContentView(((NotificationBuilderWithBuilderAccessor)this)) : null;
        Notification v2 = this.buildInternal();
        if(v1 != null) {
            v2.contentView = v1;
        }
        else if(this.mBuilderCompat.mContentView != null) {
            v2.contentView = this.mBuilderCompat.mContentView;
        }

        int v3 = 16;
        if(Build$VERSION.SDK_INT >= v3 && v0 != null) {
            v1 = v0.makeBigContentView(((NotificationBuilderWithBuilderAccessor)this));
            if(v1 != null) {
                v2.bigContentView = v1;
            }
        }

        if(Build$VERSION.SDK_INT >= 21 && v0 != null) {
            v1 = this.mBuilderCompat.mStyle.makeHeadsUpContentView(((NotificationBuilderWithBuilderAccessor)this));
            if(v1 != null) {
                v2.headsUpContentView = v1;
            }
        }

        if(Build$VERSION.SDK_INT >= v3 && v0 != null) {
            Bundle v1_1 = NotificationCompat.getExtras(v2);
            if(v1_1 != null) {
                v0.addCompatExtras(v1_1);
            }
        }

        return v2;
    }

    protected Notification buildInternal() {
        Notification v0;
        if(Build$VERSION.SDK_INT >= 26) {
            return this.mBuilder.build();
        }

        int v3 = 2;
        if(Build$VERSION.SDK_INT >= 24) {
            v0 = this.mBuilder.build();
            if(this.mGroupAlertBehavior != 0) {
                if(v0.getGroup() != null && (v0.flags & 0x200) != 0 && this.mGroupAlertBehavior == v3) {
                    this.removeSoundAndVibration(v0);
                }

                if(v0.getGroup() == null) {
                    return v0;
                }

                if((v0.flags & 0x200) != 0) {
                    return v0;
                }

                if(this.mGroupAlertBehavior != 1) {
                    return v0;
                }

                this.removeSoundAndVibration(v0);
            }

            return v0;
        }

        if(Build$VERSION.SDK_INT >= 21) {
            this.mBuilder.setExtras(this.mExtras);
            v0 = this.mBuilder.build();
            if(this.mContentView != null) {
                v0.contentView = this.mContentView;
            }

            if(this.mBigContentView != null) {
                v0.bigContentView = this.mBigContentView;
            }

            if(this.mHeadsUpContentView != null) {
                v0.headsUpContentView = this.mHeadsUpContentView;
            }

            if(this.mGroupAlertBehavior != 0) {
                if(v0.getGroup() != null && (v0.flags & 0x200) != 0 && this.mGroupAlertBehavior == v3) {
                    this.removeSoundAndVibration(v0);
                }

                if(v0.getGroup() == null) {
                    return v0;
                }

                if((v0.flags & 0x200) != 0) {
                    return v0;
                }

                if(this.mGroupAlertBehavior != 1) {
                    return v0;
                }

                this.removeSoundAndVibration(v0);
            }

            return v0;
        }

        if(Build$VERSION.SDK_INT >= 20) {
            this.mBuilder.setExtras(this.mExtras);
            v0 = this.mBuilder.build();
            if(this.mContentView != null) {
                v0.contentView = this.mContentView;
            }

            if(this.mBigContentView != null) {
                v0.bigContentView = this.mBigContentView;
            }

            if(this.mGroupAlertBehavior != 0) {
                if(v0.getGroup() != null && (v0.flags & 0x200) != 0 && this.mGroupAlertBehavior == v3) {
                    this.removeSoundAndVibration(v0);
                }

                if(v0.getGroup() == null) {
                    return v0;
                }

                if((v0.flags & 0x200) != 0) {
                    return v0;
                }

                if(this.mGroupAlertBehavior != 1) {
                    return v0;
                }

                this.removeSoundAndVibration(v0);
            }

            return v0;
        }

        if(Build$VERSION.SDK_INT >= 19) {
            SparseArray v0_1 = NotificationCompatJellybean.buildActionExtrasMap(this.mActionExtrasList);
            if(v0_1 != null) {
                this.mExtras.putSparseParcelableArray("android.support.actionExtras", v0_1);
            }

            this.mBuilder.setExtras(this.mExtras);
            v0 = this.mBuilder.build();
            if(this.mContentView != null) {
                v0.contentView = this.mContentView;
            }

            if(this.mBigContentView != null) {
                v0.bigContentView = this.mBigContentView;
            }

            return v0;
        }

        if(Build$VERSION.SDK_INT >= 16) {
            v0 = this.mBuilder.build();
            Bundle v1 = NotificationCompat.getExtras(v0);
            Bundle v2 = new Bundle(this.mExtras);
            Iterator v3_1 = this.mExtras.keySet().iterator();
            while(v3_1.hasNext()) {
                Object v4 = v3_1.next();
                if(!v1.containsKey(((String)v4))) {
                    continue;
                }

                v2.remove(((String)v4));
            }

            v1.putAll(v2);
            SparseArray v1_1 = NotificationCompatJellybean.buildActionExtrasMap(this.mActionExtrasList);
            if(v1_1 != null) {
                NotificationCompat.getExtras(v0).putSparseParcelableArray("android.support.actionExtras", v1_1);
            }

            if(this.mContentView != null) {
                v0.contentView = this.mContentView;
            }

            if(this.mBigContentView != null) {
                v0.bigContentView = this.mBigContentView;
            }

            return v0;
        }

        return this.mBuilder.getNotification();
    }

    public Notification$Builder getBuilder() {
        return this.mBuilder;
    }

    private void removeSoundAndVibration(Notification arg2) {
        arg2.sound = null;
        arg2.vibrate = null;
        arg2.defaults &= -2;
        arg2.defaults &= -3;
    }
}

