package com.jagex.oldscape.android;

import ai;
import android.app.NativeActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import av;
import client;
import com.jagex.android.AndroidKeyboard;
import com.jagex.mobilesdk.federatedLogin.FederatedLoginService;
import hp;
import java.net.MalformedURLException;
import java.net.URL;
import jr;
import lx;

public class AndroidLauncher extends NativeActivity {
    ab al;
    static client ax;

    public AndroidLauncher() {
        super();
    }

    void ad() {
        this.getWindow().getDecorView().setSystemUiVisibility(0x5A9D6A07);
    }

    void ae(int arg3) {
        try {
            this.getWindow().getDecorView().setSystemUiVisibility(0x1707);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/AndroidLauncher.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void aj(Intent arg4) {
        if(arg4 == null) {
            return;
        }

        Bundle v0 = arg4.getExtras();
        if(v0 != null && (v0.keySet().contains("google.message_id"))) {
            AndroidLauncher.ax.aw(new aj().ax(arg4, 0xB2B2EC1D), -63);
        }
    }

    void al(Intent arg3, int arg4) {
        if(arg3 == null) {
            return;
        }

        try {
            Bundle v4 = arg3.getExtras();
            if(v4 != null && (v4.keySet().contains("google.message_id"))) {
                AndroidLauncher.ax.aw(new aj().ax(arg3, -1814395101), -35);
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v4_1 = new StringBuilder();
            v4_1.append("com/jagex/oldscape/android/AndroidLauncher.al(");
            v4_1.append(')');
            throw lx.al(((Throwable)v3), v4_1.toString());
        }
    }

    void an(Intent arg4) {
        if(arg4 == null) {
            return;
        }

        Bundle v0 = arg4.getExtras();
        if(v0 != null && (v0.keySet().contains("google.message_id"))) {
            AndroidLauncher.ax.aw(new aj().ax(arg4, 0xB2F9F293), -31);
        }
    }

    void ap(Intent arg4) {
        if(arg4 == null) {
            return;
        }

        Bundle v0 = arg4.getExtras();
        if(v0 != null && (v0.keySet().contains("google.message_id"))) {
            AndroidLauncher.ax.aw(new aj().ax(arg4, -1639223901), -68);
        }
    }

    void aq() {
        this.getWindow().getDecorView().setSystemUiVisibility(0xDCC61FA1);
    }

    void ar(String arg5) {
        AndroidLauncher.ax = new client();
        AndroidLauncher.ax.au = true;
        AndroidLauncher.ax.abf(2, 7);
        AndroidLauncher.ax.am("https://oldschool.runescape.com/slr.ws?order=LPWM", 0xB4434A10);
        this.al = new ab(this);
        this.al.ba(false, 2);
        AndroidLauncher.ax.abr(this.al, 360705470);
        arg5 = this.al.gs(arg5, 0x12DC6E19);
        try {
            AndroidLauncher.ax.acw(new jr(new URL(arg5)), 0x56D65D8F);
        }
        catch(MalformedURLException ) {
            return;
        }

        AndroidLauncher.ax.av(0x601373A9);
    }

    void ax(String arg4, byte arg5) {
        try {
            AndroidLauncher.ax = new client();
            AndroidLauncher.ax.au = true;
            AndroidLauncher.ax.abf(2, 7);
            AndroidLauncher.ax.am("https://oldschool.runescape.com/slr.ws?order=LPWM", -730044435);
            this.al = new ab(this);
            this.al.ba(false, 2);
            AndroidLauncher.ax.abr(this.al, 0x73D61A70);
            arg4 = this.al.gs(arg4, 0x12DC6E19);
            try {
                AndroidLauncher.ax.acw(new jr(new URL(arg4)), 0x56D65D8F);
            }
            catch(MalformedURLException ) {
                return;
            }
        }
        catch(RuntimeException v4) {
            goto label_41;
        }

        try {
            AndroidLauncher.ax.av(0x1BF9891A);
            return;
        }
        catch(RuntimeException v4) {
        label_41:
            StringBuilder v5 = new StringBuilder();
            v5.append("com/jagex/oldscape/android/AndroidLauncher.ax(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    public static void init() {
        AndroidLauncher.ax.ack(0xB54CA53C);
    }

    public void onActivityResult(int arg5, int arg6, Intent arg7) {
        try {
            super.onActivityResult(arg5, arg6, arg7);
            if(2205 == arg5 && arg7 != null) {
                int v0 = 0x7FCD6E81;
                if(arg6 == 0) {
                    String v6 = arg7.getStringExtra(FederatedLoginService.EXTRA_ONE_TIME_LOGIN_TOKEN);
                    hp.ea.ah(new av(true, -1), v0);
                    hp.ea.aa(new ai(v6, 0), 0xBC5CDEAD);
                }
                else if(arg6 != 1402) {
                    hp.ea.ah(new av(false, 2), v0);
                }
                else {
                    hp.ea.ah(new av(false, 1), v0);
                }
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v6_1 = new StringBuilder();
            v6_1.append("com/jagex/oldscape/android/AndroidLauncher.onActivityResult(");
            v6_1.append(')');
            throw lx.al(((Throwable)v5), v6_1.toString());
        }
    }

    public void onCreate(Bundle arg5) {
        StringBuilder v0_1;
        try {
            if(!this.isTaskRoot()) {
                super.onCreate(arg5);
                this.finish();
                return;
            }

            System.setOut(new af(this, System.out));
            AndroidKeyboard.SetupMainActivity(((NativeActivity)this));
            this.getWindow().setFormat(3);
            super.onCreate(arg5);
            Intent v5_1 = this.getIntent();
            this.getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            String v0 = this.getString(0x7F0E0072);
            if(v5_1 != null) {
                Uri v1 = v5_1.getData();
                String v2 = v5_1.getAction();
                if(v1 != null && v2 != null && (v2.equals("android.intent.action.VIEW"))) {
                    v0_1 = new StringBuilder();
                    v0_1.append("https://");
                    v0_1.append(v1.toString().split("//")[1]);
                    v0 = v0_1.toString().replace(":7", ":50");
                }
            }

            this.ax(v0, -119);
            this.al(v5_1, 0x5CF640C5);
            return;
        }
        catch(RuntimeException v5) {
            v0_1 = new StringBuilder();
            v0_1.append("com/jagex/oldscape/android/AndroidLauncher.onCreate(");
            v0_1.append(')');
            throw lx.al(((Throwable)v5), v0_1.toString());
        }
    }

    public void onDestroy() {
        try {
            super.onDestroy();
            if(!this.isTaskRoot()) {
                return;
            }

            AndroidLauncher.ax.adv(0xE388A054);
            AndroidLauncher.ax = null;
            this.al.ae(-1520196132);
            System.exit(0);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/oldscape/android/AndroidLauncher.onDestroy(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public void onPause() {
        try {
            if(!this.isTaskRoot()) {
                super.onPause();
                return;
            }

            AndroidLauncher.ax.adt(42);
            this.al.ar(0x7011F0B0);
            AndroidLauncher.ax.hu(0x763E6F93);
            super.onPause();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/oldscape/android/AndroidLauncher.onPause(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public void onResume() {
        try {
            super.onResume();
            View v0_1 = this.getWindow().getDecorView();
            v0_1.setFocusableInTouchMode(true);
            this.ae(0x9C8237D8);
            this.al.an(35);
            v0_1.setOnSystemUiVisibilityChangeListener(new ad(this));
            v0_1.setOnFocusChangeListener(new aq(this));
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/oldscape/android/AndroidLauncher.onResume(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }
}

