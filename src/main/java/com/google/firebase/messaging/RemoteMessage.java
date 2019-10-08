package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Reserved;
import com.google.android.gms.internal.firebase_messaging.zzac;
import com.google.android.gms.internal.firebase_messaging.zzq;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;

@Class(creator="RemoteMessageCreator") @Reserved(value={1}) public final class RemoteMessage extends AbstractSafeParcelable {
    public class Builder {
        private final Bundle zzdw;
        private final Map zzdx;

        public Builder(String arg4) {
            super();
            this.zzdw = new Bundle();
            this.zzdx = new ArrayMap();
            if(TextUtils.isEmpty(((CharSequence)arg4))) {
                String v1 = "Invalid to: ";
                arg4 = String.valueOf(arg4);
                arg4 = arg4.length() != 0 ? v1.concat(arg4) : new String(v1);
                throw new IllegalArgumentException(arg4);
            }

            this.zzdw.putString("google.to", arg4);
        }

        public Builder addData(String arg2, String arg3) {
            this.zzdx.put(arg2, arg3);
            return this;
        }

        public RemoteMessage build() {
            Bundle v0 = new Bundle();
            Iterator v1 = this.zzdx.entrySet().iterator();
            while(v1.hasNext()) {
                Object v2 = v1.next();
                v0.putString(((Map$Entry)v2).getKey(), ((Map$Entry)v2).getValue());
            }

            v0.putAll(this.zzdw);
            this.zzdw.remove("from");
            return new RemoteMessage(v0);
        }

        public Builder clearData() {
            this.zzdx.clear();
            return this;
        }

        public Builder setCollapseKey(String arg3) {
            this.zzdw.putString("collapse_key", arg3);
            return this;
        }

        public Builder setData(Map arg2) {
            this.zzdx.clear();
            this.zzdx.putAll(arg2);
            return this;
        }

        public Builder setMessageId(String arg3) {
            this.zzdw.putString("google.message_id", arg3);
            return this;
        }

        public Builder setMessageType(String arg3) {
            this.zzdw.putString("message_type", arg3);
            return this;
        }

        public Builder setTtl(@IntRange(from=0, to=86400) int arg3) {
            this.zzdw.putString("google.ttl", String.valueOf(arg3));
            return this;
        }
    }

    @Retention(value=RetentionPolicy.SOURCE) @public interface MessagePriority {
    }

    public class Notification {
        private final String tag;
        private final String zzdz;
        private final String zzea;
        private final String[] zzeb;
        private final String zzec;
        private final String zzed;
        private final String[] zzee;
        private final String zzef;
        private final String zzeg;
        private final String zzeh;
        private final String zzei;
        private final String zzej;
        private final Uri zzek;

        private Notification(zzq arg2) {
            super();
            this.zzdz = arg2.getString("gcm.n.title");
            this.zzea = arg2.zzp("gcm.n.title");
            this.zzeb = arg2.zzn("gcm.n.title");
            this.zzec = arg2.getString("gcm.n.body");
            this.zzed = arg2.zzp("gcm.n.body");
            this.zzee = arg2.zzn("gcm.n.body");
            this.zzef = arg2.getString("gcm.n.icon");
            this.zzeg = arg2.zzav();
            this.tag = arg2.getString("gcm.n.tag");
            this.zzeh = arg2.getString("gcm.n.color");
            this.zzei = arg2.getString("gcm.n.click_action");
            this.zzej = arg2.getString("gcm.n.android_channel_id");
            this.zzek = arg2.zzaw();
        }

        @Nullable public String getBody() {
            return this.zzec;
        }

        @Nullable public String[] getBodyLocalizationArgs() {
            return this.zzee;
        }

        @Nullable public String getBodyLocalizationKey() {
            return this.zzed;
        }

        @Nullable public String getChannelId() {
            return this.zzej;
        }

        @Nullable public String getClickAction() {
            return this.zzei;
        }

        @Nullable public String getColor() {
            return this.zzeh;
        }

        @Nullable public String getIcon() {
            return this.zzef;
        }

        @Nullable public Uri getLink() {
            return this.zzek;
        }

        @Nullable public String getSound() {
            return this.zzeg;
        }

        @Nullable public String getTag() {
            return this.tag;
        }

        @Nullable public String getTitle() {
            return this.zzdz;
        }

        @Nullable public String[] getTitleLocalizationArgs() {
            return this.zzeb;
        }

        @Nullable public String getTitleLocalizationKey() {
            return this.zzea;
        }

        @Nullable private static Notification zzf(Bundle arg3) {
            if(zzac.zzj(arg3)) {
                return new Notification(new zzq("FirebaseMessaging", arg3));
            }

            return null;
        }

        static Notification zzg(Bundle arg0) {
            return Notification.zzf(arg0);
        }
    }

    public static final Parcelable$Creator CREATOR = null;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN;
    @Field(id=2) Bundle zzdw;
    private Map zzdx;
    private Notification zzdy;

    static {
        RemoteMessage.CREATOR = new zzc();
    }

    @Constructor public RemoteMessage(@Param(id=2) Bundle arg1) {
        super();
        this.zzdw = arg1;
    }

    @Nullable public final String getCollapseKey() {
        return this.zzdw.getString("collapse_key");
    }

    public final Map getData() {
        if(this.zzdx == null) {
            Bundle v0 = this.zzdw;
            ArrayMap v1 = new ArrayMap();
            Iterator v2 = v0.keySet().iterator();
            while(v2.hasNext()) {
                Object v3 = v2.next();
                Object v4 = v0.get(((String)v3));
                if(!(v4 instanceof String)) {
                    continue;
                }

                if(((String)v3).startsWith("google.")) {
                    continue;
                }

                if(((String)v3).startsWith("gcm.")) {
                    continue;
                }

                if(((String)v3).equals("from")) {
                    continue;
                }

                if(((String)v3).equals("message_type")) {
                    continue;
                }

                if(((String)v3).equals("collapse_key")) {
                    continue;
                }

                v1.put(v3, v4);
            }

            this.zzdx = ((Map)v1);
        }

        return this.zzdx;
    }

    @Nullable public final String getFrom() {
        return this.zzdw.getString("from");
    }

    @Nullable public final String getMessageId() {
        String v0 = this.zzdw.getString("google.message_id");
        if(v0 == null) {
            v0 = this.zzdw.getString("message_id");
        }

        return v0;
    }

    @Nullable public final String getMessageType() {
        return this.zzdw.getString("message_type");
    }

    @Nullable public final Notification getNotification() {
        if(this.zzdy == null) {
            this.zzdy = Notification.zzg(this.zzdw);
        }

        return this.zzdy;
    }

    public final int getOriginalPriority() {
        String v0 = this.zzdw.getString("google.original_priority");
        if(v0 == null) {
            v0 = this.zzdw.getString("google.priority");
        }

        return RemoteMessage.zzm(v0);
    }

    public final int getPriority() {
        String v0 = this.zzdw.getString("google.delivered_priority");
        if(v0 == null) {
            if("1".equals(this.zzdw.getString("google.priority_reduced"))) {
                return 2;
            }
            else {
                v0 = this.zzdw.getString("google.priority");
            }
        }

        return RemoteMessage.zzm(v0);
    }

    public final long getSentTime() {
        Object v0 = this.zzdw.get("google.sent_time");
        if((v0 instanceof Long)) {
            return ((Long)v0).longValue();
        }

        if((v0 instanceof String)) {
            try {
                return Long.parseLong(v0);
            }
            catch(NumberFormatException ) {
                String v0_1 = String.valueOf(v0);
                StringBuilder v3 = new StringBuilder(String.valueOf(v0_1).length() + 19);
                v3.append("Invalid sent time: ");
                v3.append(v0_1);
                Log.w("FirebaseMessaging", v3.toString());
            }
        }

        return 0;
    }

    @Nullable public final String getTo() {
        return this.zzdw.getString("google.to");
    }

    public final int getTtl() {
        Object v0 = this.zzdw.get("google.ttl");
        if((v0 instanceof Integer)) {
            return ((Integer)v0).intValue();
        }

        if((v0 instanceof String)) {
            try {
                return Integer.parseInt(v0);
            }
            catch(NumberFormatException ) {
                String v0_1 = String.valueOf(v0);
                StringBuilder v3 = new StringBuilder(String.valueOf(v0_1).length() + 13);
                v3.append("Invalid TTL: ");
                v3.append(v0_1);
                Log.w("FirebaseMessaging", v3.toString());
            }
        }

        return 0;
    }

    @KeepForSdk public final Intent toIntent() {
        Intent v0 = new Intent();
        v0.putExtras(this.zzdw);
        return v0;
    }

    public final void writeToParcel(Parcel arg4, int arg5) {
        arg5 = SafeParcelWriter.beginObjectHeader(arg4);
        SafeParcelWriter.writeBundle(arg4, 2, this.zzdw, false);
        SafeParcelWriter.finishObjectHeader(arg4, arg5);
    }

    private static int zzm(String arg1) {
        if("high".equals(arg1)) {
            return 1;
        }

        if("normal".equals(arg1)) {
            return 2;
        }

        return 0;
    }
}

