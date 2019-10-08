package com.jagex.oldscape.android;

import android.content.ClipData;
import android.widget.Toast;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.notifications.MobileNotificationServiceListener;
import lx;

class ai implements MobileNotificationServiceListener {
    static final String ar = "com.jagex.mobilesdk.android.osrs:/oauth2redirect";

    ai(av arg1) {
        av.this = arg1;
        super();
    }

    public void ax(CommsResult arg3) {
        String v0 = "There was a problem retrieving the device token";
        if(arg3.responseCode == 0) {
            av.this.an.getSystemService("clipboard").setPrimaryClip(ClipData.newPlainText("Device Token", arg3.getResultValue()));
            v0 = "Device token has been copied to your clipboard";
        }

        Toast.makeText(av.this.an, ((CharSequence)v0), 0).show();
    }

    public void onResult(CommsResult arg3) {
        try {
            String v0 = "There was a problem retrieving the device token";
            if(arg3.responseCode == 0) {
                av.this.an.getSystemService("clipboard").setPrimaryClip(ClipData.newPlainText("Device Token", arg3.getResultValue()));
                v0 = "Device token has been copied to your clipboard";
            }

            Toast.makeText(av.this.an, ((CharSequence)v0), 0).show();
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("com/jagex/oldscape/android/ai.onResult(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }
    }
}

