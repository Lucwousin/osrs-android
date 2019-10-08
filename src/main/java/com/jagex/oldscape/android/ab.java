package com.jagex.oldscape.android;

import ah;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences$Editor;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build$VERSION;
import android.view.OrientationEventListener;
import androidx.core.view.ViewCompat;
import cb;
import client;
import com.jagex.jagex3.client.input.softkeyboard.ar;
import cs;
import ef;
import es;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import ko;
import lq;
import ls;
import lx;
import mh;
import od;
import po;

public class ab extends ls {
    final int[] aa;
    boolean ab;
    volatile boolean ad;
    static int[] ae = null;
    BroadcastReceiver af;
    BroadcastReceiver ai;
    volatile boolean aj;
    static final String al = "fontmetrics.font";
    final Rect an;
    volatile int ap;
    volatile boolean aq;
    final AndroidLauncher ar;
    final OrientationEventListener av;
    static final String ax = "font.font";

    static {
        ab.ae = new int[]{-1, -1, -1, -1, 13, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0x30, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 0x20, 35, 49, 36, 38, 67, 33, 65, 37, 0x40, 71, 72, 86, -1, 81, -1, 80, 83, -1, -1, -1, 84, 85, -1, 26, 27, -1, -1, 74, 57, 58, 73, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 104, 105, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 13, 101, 82, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, -1, -1, -1, 91, -1, -1, -1, -1, 90, 89, 88, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }

    ab(AndroidLauncher arg3) {
        try {
            super();
            this.an = new Rect();
            this.ap = 0x9DBAFFE7;
            this.aj = false;
            this.ad = false;
            this.aq = false;
            this.ab = false;
            this.af = new al(this);
            this.ai = new az(this);
            this.aa = new int[2];
            this.ar = arg3;
            this.aw = new ax(((Activity)arg3));
            this.al(this.ar, -2080172007);
            this.av = this.ax(0xD700E425);
            if(this.av.canDetectOrientation()) {
                this.av.enable();
            }

            this.ao = this.by("mglwnafh", false, 0x403C8BE);
            this.bb(0xF428CA1B);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ab.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public String aa(int arg3) {
        try {
            if(Build$VERSION.SDK_INT >= 21) {
                return this.ar.getNoBackupFilesDir().getAbsolutePath();
            }

            return this.ar.getFilesDir().getAbsolutePath();
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ab.aa(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public boolean ab(int arg3) {
        try {
            return this.aj;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ab.ab(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void ac(byte arg3) {
        try {
            Intent v3_1 = new Intent("android.intent.action.VIEW");
            v3_1.setData(Uri.parse("market://details?id=com.jagex.oldscape.android"));
            this.ar.startActivity(v3_1);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ab.ac(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public int ad(int arg3) {
        try {
            return Build$VERSION.SDK_INT;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ab.ad(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void ae(int arg3) {
        try {
            this.av.disable();
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ab.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public boolean af(int arg3) {
        try {
            return this.ad;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ab.af(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public es ag(byte[] arg2, int arg3) {
        try {
            return this.ao(BitmapFactory.decodeByteArray(arg2, 0, arg2.length), 0xE8CE082D);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/oldscape/android/ab.ag(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public Object ah(mh arg2, int arg3) {
        arg3 = 0x6416803F;
        try {
            switch(arg2.ap * arg3) {
                case 0: {
                    goto label_21;
                }
                case 1: {
                    goto label_18;
                }
                case 2: {
                    goto label_14;
                }
                case 3: {
                    goto label_10;
                }
                case 4: {
                    goto label_6;
                }
            }

            return null;
        label_18:
            return this.as(0x632A700C);
        label_21:
            return this.at(0x7F0D0000, 0x34F4CB7C);
        label_6:
            return this.ay(0x7F0D0002, 0x2A07A83C);
        label_10:
            return this.at(0x7F0D0001, 1019493004);
        label_14:
            return this.bg("license.txt", -1);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/oldscape/android/ab.ah(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public int[] ai(int arg3) {
        try {
            if(this.ar != null) {
                this.ar.getWindow().getDecorView().getLocationOnScreen(this.aa);
            }

            return this.aa;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ab.ai(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void aj(int arg3) {
        try {
            this.ar.unregisterReceiver(this.af);
            this.ar.unregisterReceiver(this.ai);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ab.aj(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    byte[] ak(String arg3, int arg4) {
        DataInputStream v1;
        byte[] v0;
        DataInputStream v4 = null;
        try {
            AssetFileDescriptor v3_1 = this.ar.getAssets().openFd(arg3);
            v0 = new byte[((int)v3_1.getLength())];
            v1 = new DataInputStream(v3_1.createInputStream());
        }
        catch(Throwable v3) {
            goto label_17;
        }
        catch(IOException ) {
            v1 = v4;
            goto label_21;
        }

        try {
            v1.readFully(v0);
            goto label_11;
        }
        catch(Throwable v3) {
        }
        catch(IOException ) {
        label_21:
            if(v1 != null) {
                try {
                    v1.close();
                    goto label_34;
                }
                catch(RuntimeException v3_2) {
                }
                catch(IOException ) {
                label_34:
                    return ((byte[])v4);
                    v4 = v1;
                label_17:
                    if(v4 != null) {
                        try {
                            v4.close();
                            goto label_19;
                        }
                        catch(RuntimeException v3_2) {
                        }
                        catch(IOException ) {
                            try {
                            label_19:
                                throw v3;
                            }
                            catch(RuntimeException v3_2) {
                                goto label_26;
                            }

                            try {
                            label_11:
                                v1.close();
                                return v0;
                            }
                            catch(IOException ) {
                                return v0;
                            }
                            catch(RuntimeException v3_2) {
                            label_26:
                                StringBuilder v4_1 = new StringBuilder();
                                v4_1.append("com/jagex/oldscape/android/ab.ak(");
                                v4_1.append(')');
                                throw lx.al(((Throwable)v3_2), v4_1.toString());
                            }
                        }
                    }

                    goto label_19;
                }
            }

            goto label_34;
        }
    }

    void al(Context arg2, int arg3) {
        try {
            NetworkInfo v2_1 = arg2.getSystemService("connectivity").getActiveNetworkInfo();
            boolean v3 = false;
            this.ad = false;
            this.aq = false;
            if(v2_1 != null) {
                boolean v2_2 = v2_1.getType() == 1 ? true : false;
                this.ad = v2_2;
                if(!this.ad) {
                    v3 = true;
                }

                this.aq = v3;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3_1 = new StringBuilder();
            v3_1.append("com/jagex/oldscape/android/ab.al(");
            v3_1.append(')');
            throw lx.al(((Throwable)v2), v3_1.toString());
        }
    }

    public float am(int arg3) {
        try {
            if(this.ar == null) {
                return -1f;
            }

            this.ar.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.an);
            return (((float)this.an.height())) / (((float)this.ar.getWindow().getDecorView().getHeight()));
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ab.am(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void an(byte arg3) {
        arg3 = 81;
        try {
            super.an(arg3);
            client.al.aco(true, 0x7F030118);
            this.ap(28);
            this.bf(this.ab, 0x55F130BE);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ab.an(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    es ao(Bitmap arg11, int arg12) {
        try {
            arg12 = arg11.getWidth();
            int v8 = arg11.getHeight();
            int[] v9 = new int[arg12 * v8];
            arg11.getPixels(v9, 0, arg12, 0, 0, arg12, v8);
            return new es(v9, arg12, v8);
        }
        catch(RuntimeException v11) {
            StringBuilder v12 = new StringBuilder();
            v12.append("com/jagex/oldscape/android/ab.ao(");
            v12.append(')');
            throw lx.al(((Throwable)v11), v12.toString());
        }
    }

    void ap(byte arg4) {
        try {
            this.ar.registerReceiver(this.af, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.ar.registerReceiver(this.ai, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        catch(RuntimeException v4) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ab.ap(");
            v0.append(')');
            throw lx.al(((Throwable)v4), v0.toString());
        }
    }

    public int aq(int arg3) {
        try {
            return this.ap * 0x237A5C29;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ab.aq(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void ar(int arg3) {
        arg3 = 0x6869CE55;
        try {
            super.ar(arg3);
            client.al.aco(false, 0x7F030118);
            this.aj(0x44A032E4);
            this.bf(false, 0x30058291);
            this.gc(0xEB98834F);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ab.ar(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    od as(int arg3) {
        try {
            byte[] v3_1 = this.ak("font.font", -868843040);
            byte[] v0 = this.ak("fontmetrics.font", 0x30F57FB2);
            if(v3_1 != null) {
                if(v0 == null) {
                }
                else {
                    return ko.aa(v3_1, v0, 100);
                }
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("com/jagex/oldscape/android/ab.as(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }

        return null;
    }

    ef at(int arg2, int arg3) {
        byte v3 = -112;
        try {
            byte[] v2_1 = this.aw(arg2, v3);
            if(v2_1 == null) {
                return null;
            }

            return cb.ae(v2_1, 0x6203CC63);
        }
        catch(RuntimeException v2) {
            StringBuilder v3_1 = new StringBuilder();
            v3_1.append("com/jagex/oldscape/android/ab.at(");
            v3_1.append(')');
            throw lx.al(((Throwable)v2), v3_1.toString());
        }
    }

    public int au(int arg2, int arg3) {
        if(arg2 >= 0) {
            try {
                if(arg2 < ab.ae.length) {
                    return ab.ae[arg2];
                }
            }
            catch(RuntimeException v2) {
                StringBuilder v3 = new StringBuilder();
                v3.append("com/jagex/oldscape/android/ab.au(");
                v3.append(')');
                throw lx.al(((Throwable)v2), v3.toString());
            }
        }

        return -1;
    }

    public boolean av(int arg3) {
        try {
            if(this.ad) {
                return true;
            }
            else if(!this.aq) {
                goto label_5;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ab.av(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }

        return true;
    label_5:
        boolean v3_1 = false;
        return v3_1;
    }

    byte[] aw(int arg3, byte arg4) {
        try {
            BufferedInputStream v4 = new BufferedInputStream(new GZIPInputStream(this.ar.getResources().openRawResource(arg3)));
            lq v3_2 = new lq(4);
            ((InputStream)v4).read(v3_2.ae);
            byte[] v3_3 = new byte[v3_2.ac(108)];
            ((InputStream)v4).read(v3_3);
            ((InputStream)v4).close();
            return v3_3;
        }
        catch(RuntimeException v3) {
        }
        catch(IOException v3_1) {
            try {
                po.ax("", ((Throwable)v3_1), 0x538B40A7);
                return null;
            }
            catch(RuntimeException v3) {
                StringBuilder v4_1 = new StringBuilder();
                v4_1.append("com/jagex/oldscape/android/ab.aw(");
                v4_1.append(')');
                throw lx.al(((Throwable)v3), v4_1.toString());
            }
        }
    }

    OrientationEventListener ax(int arg3) {
        try {
            return new ay(this, this.ar, 2);
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ab.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    ef[] ay(int arg2, int arg3) {
        byte v3 = -127;
        try {
            byte[] v2_1 = this.aw(arg2, v3);
            if(v2_1 == null) {
                return null;
            }

            return cs.ax(v2_1, 0x8B9D5521);
        }
        catch(RuntimeException v2) {
            StringBuilder v3_1 = new StringBuilder();
            v3_1.append("com/jagex/oldscape/android/ab.ay(");
            v3_1.append(')');
            throw lx.al(((Throwable)v2), v3_1.toString());
        }
    }

    public ar az(int arg2, int arg3) {
        try {
            if(this.at == null || this.at.az(-1816594050) != arg2) {
                this.gc(0xCD74CFA4);
                this.at = new ae(this.ar, arg2, ((ls)this));
                this.at.ah(client.al.acr(0x6B05F29D), 316570716);
            }
            else {
                this.at.bd(0x7F0F0037);
            }

            return this.at;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/oldscape/android/ab.az(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void ba(boolean arg2, byte arg3) {
        try {
            this.ab = arg2;
            this.bf(this.ab, 0x5EBA1337);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/oldscape/android/ab.ba(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    void bb(int arg3) {
        try {
            ViewCompat.setOnApplyWindowInsetsListener(this.ar.getWindow().getDecorView().getRootView(), new ac(this));
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ab.bb(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    OrientationEventListener bc() {
        return new ay(this, this.ar, 2);
    }

    public void bd(int arg3) {
        try {
            this.ar.moveTaskToBack(true);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ab.bd(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void be() {
        this.av.disable();
    }

    void bf(boolean arg2, int arg3) {
        try {
            this.ar.runOnUiThread(new at(this, arg2));
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/oldscape/android/ab.bf(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    String bg(String arg4, byte arg5) {
        String v1;
        Throwable v5_1;
        InputStream v4_1;
        String v5 = null;
        try {
            v4_1 = this.ar.getAssets().open(arg4);
        }
        catch(Throwable v4) {
            String v2 = v5;
            v5_1 = v4;
            v4_1 = ((InputStream)v2);
            goto label_18;
        }
        catch(IOException ) {
            v4_1 = ((InputStream)v5);
            goto label_22;
        }

        try {
            byte[] v0 = new byte[v4_1.available()];
            v4_1.read(v0);
            v1 = new String(v0);
            if(v4_1 == null) {
                return v1;
            }

            goto label_10;
        }
        catch(Throwable v5_1) {
        }
        catch(IOException ) {
        label_22:
            if(v4_1 != null) {
                try {
                    v4_1.close();
                    return v5;
                }
                catch(RuntimeException v4_2) {
                }
                catch(IOException ) {
                    return v5;
                label_18:
                    if(v4_1 != null) {
                        try {
                            v4_1.close();
                            goto label_20;
                        }
                        catch(RuntimeException v4_2) {
                        }
                        catch(IOException ) {
                            try {
                            label_20:
                                throw v5_1;
                            }
                            catch(RuntimeException v4_2) {
                                goto label_27;
                            }

                            try {
                            label_10:
                                v4_1.close();
                                return v1;
                            }
                            catch(IOException ) {
                                return v1;
                            }
                            catch(RuntimeException v4_2) {
                            label_27:
                                StringBuilder v5_2 = new StringBuilder();
                                v5_2.append("com/jagex/oldscape/android/ab.bg(");
                                v5_2.append(')');
                                throw lx.al(((Throwable)v4_2), v5_2.toString());
                            }
                        }
                    }

                    goto label_20;
                }
            }

            return v5;
        }
    }

    public ah bh(int arg3) {
        try {
            return this.ay;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ab.bh(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void bi() {
        super.an(97);
        client.al.aco(true, 0x7F030118);
        this.ap(22);
        this.bf(this.ab, 0x3A950843);
    }

    void bj() {
        this.av.disable();
    }

    void bk(Context arg3) {
        NetworkInfo v3 = arg3.getSystemService("connectivity").getActiveNetworkInfo();
        boolean v0 = false;
        this.ad = false;
        this.aq = false;
        if(v3 != null) {
            boolean v3_1 = v3.getType() == 1 ? true : false;
            this.ad = v3_1;
            if(!this.ad) {
                v0 = true;
            }

            this.aq = v0;
        }
    }

    public void bl() {
        super.ar(0x5AE38CB7);
        client.al.aco(false, 0x7F030118);
        this.aj(-2061754025);
        this.bf(false, 0x3F23E52);
        this.gc(0x1DBE11D2);
    }

    void bm(Context arg3) {
        NetworkInfo v3 = arg3.getSystemService("connectivity").getActiveNetworkInfo();
        boolean v0 = false;
        this.ad = false;
        this.aq = false;
        if(v3 != null) {
            boolean v3_1 = v3.getType() == 1 ? true : false;
            this.ad = v3_1;
            if(!this.ad) {
                v0 = true;
            }

            this.aq = v0;
        }
    }

    public void bn(Runnable arg2, byte arg3) {
        try {
            this.ar.runOnUiThread(arg2);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/oldscape/android/ab.bn(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void bo(String arg2, int arg3, byte arg4) {
        try {
            SharedPreferences$Editor v4 = this.ar.getPreferences(0).edit();
            v4.putInt(arg2, arg3);
            v4.apply();
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/oldscape/android/ab.bo(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void bp(String arg2, boolean arg3, int arg4) {
        try {
            SharedPreferences$Editor v4 = this.ar.getPreferences(0).edit();
            v4.putBoolean(arg2, arg3);
            v4.apply();
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/oldscape/android/ab.bp(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void bq(String[] arg3, byte arg4) {
        try {
            int v0 = 0;
            SharedPreferences$Editor v4 = this.ar.getPreferences(0).edit();
            while(v0 < arg3.length) {
                v4.remove(arg3[v0]);
                ++v0;
            }

            v4.apply();
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4_1 = new StringBuilder();
            v4_1.append("com/jagex/oldscape/android/ab.bq(");
            v4_1.append(')');
            throw lx.al(((Throwable)v3), v4_1.toString());
        }
    }

    public void br() {
        super.ar(0x54F30C46);
        client.al.aco(false, 0x7F030118);
        this.aj(0xADB50C1A);
        this.bf(false, 2020051177);
        this.gc(-2102006560);
    }

    void bs() {
        this.av.disable();
    }

    public String bt(String arg2, String arg3, byte arg4) {
        try {
            return this.ar.getPreferences(0).getString(arg2, arg3);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/oldscape/android/ab.bt(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    void bu() {
        this.av.disable();
    }

    public int bv(String arg2, int arg3, byte arg4) {
        try {
            return this.ar.getPreferences(0).getInt(arg2, arg3);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/oldscape/android/ab.bv(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void bw(String arg2, String arg3, byte arg4) {
        try {
            SharedPreferences$Editor v4 = this.ar.getPreferences(0).edit();
            v4.putString(arg2, arg3);
            v4.apply();
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/oldscape/android/ab.bw(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void bx(String arg2, String arg3, byte arg4) {
        try {
            this.ar.runOnUiThread(new aw(this, arg2, arg3));
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/oldscape/android/ab.bx(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public boolean by(String arg2, boolean arg3, int arg4) {
        try {
            return this.ar.getPreferences(0).getBoolean(arg2, arg3);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/oldscape/android/ab.by(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void bz(String arg2, String arg3, String arg4, int arg5) {
        try {
            if(this.ay != null) {
                return;
            }

            try {
                this.ay = new av(arg2, arg3, arg4, this.ar);
            }
            catch(Throwable v2_1) {
                arg3 = null;
                int v4 = 0x8F87A6A4;
                try {
                    po.ax(arg3, v2_1, v4);
                }
                catch(RuntimeException v2) {
                label_14:
                    StringBuilder v3 = new StringBuilder();
                    v3.append("com/jagex/oldscape/android/ab.bz(");
                    v3.append(')');
                    throw lx.al(((Throwable)v2), v3.toString());
                }
            }
        }
        catch(RuntimeException v2) {
            goto label_14;
        }
    }

    void ca() {
        this.ar.registerReceiver(this.af, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.ar.registerReceiver(this.ai, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public int cb() {
        return this.ap * 0x237A5C29;
    }

    public boolean cc() {
        return this.aj;
    }

    void cd() {
        this.ar.registerReceiver(this.af, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.ar.registerReceiver(this.ai, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public boolean ce() {
        return this.ad;
    }

    void cf() {
        this.ar.unregisterReceiver(this.af);
        this.ar.unregisterReceiver(this.ai);
    }

    public String cg() {
        if(Build$VERSION.SDK_INT >= 21) {
            return this.ar.getNoBackupFilesDir().getAbsolutePath();
        }

        return this.ar.getFilesDir().getAbsolutePath();
    }

    public boolean ch() {
        return this.ad;
    }

    public boolean ci() {
        return this.aj;
    }

    void cj() {
        this.ar.registerReceiver(this.af, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.ar.registerReceiver(this.ai, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public int[] ck() {
        if(this.ar != null) {
            this.ar.getWindow().getDecorView().getLocationOnScreen(this.aa);
        }

        return this.aa;
    }

    public int[] cl() {
        if(this.ar != null) {
            this.ar.getWindow().getDecorView().getLocationOnScreen(this.aa);
        }

        return this.aa;
    }

    public boolean cm() {
        boolean v0 = (this.ad) || (this.aq) ? true : false;
        return v0;
    }

    public int[] cn() {
        if(this.ar != null) {
            this.ar.getWindow().getDecorView().getLocationOnScreen(this.aa);
        }

        return this.aa;
    }

    public int co(int arg2) {
        if(arg2 >= 0 && arg2 < ab.ae.length) {
            return ab.ae[arg2];
        }

        return -1;
    }

    public boolean cp() {
        return this.aj;
    }

    public boolean cq() {
        boolean v0 = (this.ad) || (this.aq) ? true : false;
        return v0;
    }

    public boolean cr() {
        return this.ad;
    }

    public int[] cs() {
        if(this.ar != null) {
            this.ar.getWindow().getDecorView().getLocationOnScreen(this.aa);
        }

        return this.aa;
    }

    public boolean ct() {
        boolean v0 = (this.ad) || (this.aq) ? true : false;
        return v0;
    }

    public boolean cu() {
        boolean v0 = (this.ad) || (this.aq) ? true : false;
        return v0;
    }

    public String cv() {
        if(Build$VERSION.SDK_INT >= 21) {
            return this.ar.getNoBackupFilesDir().getAbsolutePath();
        }

        return this.ar.getFilesDir().getAbsolutePath();
    }

    public int cw() {
        return this.ap * 0x178ED3F5;
    }

    void cx() {
        this.ar.unregisterReceiver(this.af);
        this.ar.unregisterReceiver(this.ai);
    }

    public int cy() {
        return this.ap * 0x237A5C29;
    }

    public int[] cz() {
        if(this.ar != null) {
            this.ar.getWindow().getDecorView().getLocationOnScreen(this.aa);
        }

        return this.aa;
    }

    public void da() {
        Intent v0 = new Intent("android.intent.action.VIEW");
        v0.setData(Uri.parse("market://details?id=com.jagex.oldscape.android"));
        this.ar.startActivity(v0);
    }

    public es db(byte[] arg3) {
        return this.ao(BitmapFactory.decodeByteArray(arg3, 0, arg3.length), 0x43CC9CD5);
    }

    ef[] dc(int arg2) {
        byte[] v2 = this.aw(arg2, -65);
        if(v2 == null) {
            return null;
        }

        return cs.ax(v2, 0x9CC0EF95);
    }

    public void dd(boolean arg2) {
        this.ab = arg2;
        this.bf(this.ab, 0x7FA184D1);
    }

    ef[] de(int arg2) {
        byte[] v2 = this.aw(arg2, -71);
        if(v2 == null) {
            return null;
        }

        return cs.ax(v2, 0x9616759F);
    }

    es df(Bitmap arg12) {
        int v8 = arg12.getWidth();
        int v9 = arg12.getHeight();
        int[] v10 = new int[v8 * v9];
        arg12.getPixels(v10, 0, v8, 0, 0, v8, v9);
        return new es(v10, v8, v9);
    }

    public void dg(boolean arg2) {
        this.ab = arg2;
        this.bf(this.ab, 1857332104);
    }

    public float dh() {
        if(this.ar == null) {
            return -1f;
        }

        this.ar.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.an);
        return (((float)this.an.height())) / (((float)this.ar.getWindow().getDecorView().getHeight()));
    }

    public void di() {
        Intent v0 = new Intent("android.intent.action.VIEW");
        v0.setData(Uri.parse("market://details?id=com.jagex.oldscape.android"));
        this.ar.startActivity(v0);
    }

    byte[] dj(int arg4) {
        try {
            BufferedInputStream v0 = new BufferedInputStream(new GZIPInputStream(this.ar.getResources().openRawResource(arg4)));
            lq v4_1 = new lq(4);
            ((InputStream)v0).read(v4_1.ae);
            byte[] v4_2 = new byte[v4_1.ac(40)];
            ((InputStream)v0).read(v4_2);
            ((InputStream)v0).close();
            return v4_2;
        }
        catch(IOException v4) {
            po.ax("", ((Throwable)v4), 165419860);
            return null;
        }
    }

    ef[] dk(int arg2) {
        byte[] v2 = this.aw(arg2, -54);
        if(v2 == null) {
            return null;
        }

        return cs.ax(v2, 0x8104E976);
    }

    od dl() {
        byte[] v0 = this.ak("font.font", -1221800900);
        byte[] v1 = this.ak("fontmetrics.font", -1642560215);
        if(v0 != null) {
            if(v1 == null) {
            }
            else {
                return ko.aa(v0, v1, 100);
            }
        }

        return null;
    }

    ef[] dm(int arg2) {
        byte[] v2 = this.aw(arg2, -75);
        if(v2 == null) {
            return null;
        }

        return cs.ax(v2, -1901298193);
    }

    byte[] dn(String arg4) {
        DataInputStream v2;
        byte[] v1;
        DataInputStream v0 = null;
        try {
            AssetFileDescriptor v4_1 = this.ar.getAssets().openFd(arg4);
            v1 = new byte[((int)v4_1.getLength())];
            v2 = new DataInputStream(v4_1.createInputStream());
        }
        catch(Throwable v4) {
            goto label_17;
        }
        catch(IOException ) {
            v2 = v0;
            goto label_21;
        }

        try {
            v2.readFully(v1);
            goto label_11;
        }
        catch(Throwable v4) {
            v0 = v2;
        }
        catch(IOException ) {
        label_21:
            if(v2 != null) {
                try {
                    v2.close();
                    goto label_23;
                }
                catch(IOException ) {
                label_23:
                    return ((byte[])v0);
                }
            }

            goto label_23;
        }

    label_17:
        if(v0 != null) {
            try {
                v0.close();
                goto label_19;
            }
            catch(IOException ) {
            label_19:
                throw v4;
            }
        }

        goto label_19;
        try {
        label_11:
            v2.close();
            return v1;
        }
        catch(IOException ) {
            return v1;
        }
    }

    public void do() {
        this.ar.moveTaskToBack(true);
    }

    public float dp() {
        if(this.ar == null) {
            return -1f;
        }

        this.ar.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.an);
        return (((float)this.an.height())) / (((float)this.ar.getWindow().getDecorView().getHeight()));
    }

    public void dq() {
        this.ar.moveTaskToBack(true);
    }

    byte[] dr(String arg4) {
        DataInputStream v2;
        byte[] v1;
        DataInputStream v0 = null;
        try {
            AssetFileDescriptor v4_1 = this.ar.getAssets().openFd(arg4);
            v1 = new byte[((int)v4_1.getLength())];
            v2 = new DataInputStream(v4_1.createInputStream());
        }
        catch(Throwable v4) {
            goto label_17;
        }
        catch(IOException ) {
            v2 = v0;
            goto label_21;
        }

        try {
            v2.readFully(v1);
            goto label_11;
        }
        catch(Throwable v4) {
            v0 = v2;
        }
        catch(IOException ) {
        label_21:
            if(v2 != null) {
                try {
                    v2.close();
                    goto label_23;
                }
                catch(IOException ) {
                label_23:
                    return ((byte[])v0);
                }
            }

            goto label_23;
        }

    label_17:
        if(v0 != null) {
            try {
                v0.close();
                goto label_19;
            }
            catch(IOException ) {
            label_19:
                throw v4;
            }
        }

        goto label_19;
        try {
        label_11:
            v2.close();
            return v1;
        }
        catch(IOException ) {
            return v1;
        }
    }

    byte[] ds(int arg4) {
        try {
            BufferedInputStream v0 = new BufferedInputStream(new GZIPInputStream(this.ar.getResources().openRawResource(arg4)));
            lq v4_1 = new lq(4);
            ((InputStream)v0).read(v4_1.ae);
            byte[] v4_2 = new byte[v4_1.ac(0x79)];
            ((InputStream)v0).read(v4_2);
            ((InputStream)v0).close();
            return v4_2;
        }
        catch(IOException v4) {
            po.ax("", ((Throwable)v4), 0x701ED319);
            return null;
        }
    }

    public void dt(boolean arg2) {
        this.ab = arg2;
        this.bf(this.ab, 900912199);
    }

    ef du(int arg2) {
        byte[] v2 = this.aw(arg2, -51);
        if(v2 == null) {
            return null;
        }

        return cb.ae(v2, 751320545);
    }

    public int dv(int arg2) {
        if(arg2 >= 0 && arg2 < ab.ae.length) {
            return ab.ae[arg2];
        }

        return -1;
    }

    public ar dw(int arg3) {
        if(this.at == null || this.at.az(0x163A564C) != arg3) {
            this.gc(-177045);
            this.at = new ae(this.ar, arg3, ((ls)this));
            this.at.ah(client.al.acr(0x6B05F29D), -1450882695);
        }
        else {
            this.at.bd(0x7F0F0037);
        }

        return this.at;
    }

    public void dx() {
        Intent v0 = new Intent("android.intent.action.VIEW");
        v0.setData(Uri.parse("market://details?id=com.jagex.oldscape.android"));
        this.ar.startActivity(v0);
    }

    byte[] dy(int arg4) {
        try {
            BufferedInputStream v0 = new BufferedInputStream(new GZIPInputStream(this.ar.getResources().openRawResource(arg4)));
            lq v4_1 = new lq(4);
            ((InputStream)v0).read(v4_1.ae);
            byte[] v4_2 = new byte[v4_1.ac(10)];
            ((InputStream)v0).read(v4_2);
            ((InputStream)v0).close();
            return v4_2;
        }
        catch(IOException v4) {
            po.ax("", ((Throwable)v4), 0xF805D477);
            return null;
        }
    }

    public void dz() {
        this.ar.moveTaskToBack(true);
    }

    public void ea(Runnable arg2) {
        this.ar.runOnUiThread(arg2);
    }

    public void eb(String arg3, String arg4) {
        this.ar.runOnUiThread(new aw(this, arg3, arg4));
    }

    String ec(String arg5) {
        String v2;
        Throwable v0_1;
        InputStream v5_1;
        String v0 = null;
        try {
            v5_1 = this.ar.getAssets().open(arg5);
        }
        catch(Throwable v5) {
            String v3 = v0;
            v0_1 = v5;
            v5_1 = ((InputStream)v3);
            goto label_18;
        }
        catch(IOException ) {
            v5_1 = ((InputStream)v0);
            goto label_22;
        }

        try {
            byte[] v1 = new byte[v5_1.available()];
            v5_1.read(v1);
            v2 = new String(v1);
            if(v5_1 == null) {
                return v2;
            }

            goto label_10;
        }
        catch(Throwable v0_1) {
        }
        catch(IOException ) {
        label_22:
            if(v5_1 != null) {
                try {
                    v5_1.close();
                    return v0;
                }
                catch(IOException ) {
                    return v0;
                }
            }

            return v0;
        }

    label_18:
        if(v5_1 != null) {
            try {
                v5_1.close();
                goto label_20;
            }
            catch(IOException ) {
            label_20:
                throw v0_1;
            }
        }

        goto label_20;
        try {
        label_10:
            v5_1.close();
            return v2;
        }
        catch(IOException ) {
            return v2;
        }
    }

    public void ed(String[] arg4) {
        int v1 = 0;
        SharedPreferences$Editor v0 = this.ar.getPreferences(0).edit();
        while(v1 < arg4.length) {
            v0.remove(arg4[v1]);
            ++v1;
        }

        v0.apply();
    }

    public int ee(String arg3, int arg4) {
        return this.ar.getPreferences(0).getInt(arg3, arg4);
    }

    public void ef(String arg3, String arg4, String arg5) {
        if(this.ay == null) {
            try {
                this.ay = new av(arg3, arg4, arg5, this.ar);
            }
            catch(Throwable v3) {
                po.ax(null, v3, 0xA2E7FD12);
            }
        }
    }

    public boolean eg(String arg3, boolean arg4) {
        return this.ar.getPreferences(0).getBoolean(arg3, arg4);
    }

    String eh(String arg5) {
        String v2;
        Throwable v0_1;
        InputStream v5_1;
        String v0 = null;
        try {
            v5_1 = this.ar.getAssets().open(arg5);
        }
        catch(Throwable v5) {
            String v3 = v0;
            v0_1 = v5;
            v5_1 = ((InputStream)v3);
            goto label_18;
        }
        catch(IOException ) {
            v5_1 = ((InputStream)v0);
            goto label_22;
        }

        try {
            byte[] v1 = new byte[v5_1.available()];
            v5_1.read(v1);
            v2 = new String(v1);
            if(v5_1 == null) {
                return v2;
            }

            goto label_10;
        }
        catch(Throwable v0_1) {
        }
        catch(IOException ) {
        label_22:
            if(v5_1 != null) {
                try {
                    v5_1.close();
                    return v0;
                }
                catch(IOException ) {
                    return v0;
                }
            }

            return v0;
        }

    label_18:
        if(v5_1 != null) {
            try {
                v5_1.close();
                goto label_20;
            }
            catch(IOException ) {
            label_20:
                throw v0_1;
            }
        }

        goto label_20;
        try {
        label_10:
            v5_1.close();
            return v2;
        }
        catch(IOException ) {
            return v2;
        }
    }

    String ei(String arg5) {
        String v2;
        Throwable v0_1;
        InputStream v5_1;
        String v0 = null;
        try {
            v5_1 = this.ar.getAssets().open(arg5);
        }
        catch(Throwable v5) {
            String v3 = v0;
            v0_1 = v5;
            v5_1 = ((InputStream)v3);
            goto label_18;
        }
        catch(IOException ) {
            v5_1 = ((InputStream)v0);
            goto label_22;
        }

        try {
            byte[] v1 = new byte[v5_1.available()];
            v5_1.read(v1);
            v2 = new String(v1);
            if(v5_1 == null) {
                return v2;
            }

            goto label_10;
        }
        catch(Throwable v0_1) {
        }
        catch(IOException ) {
        label_22:
            if(v5_1 != null) {
                try {
                    v5_1.close();
                    return v0;
                }
                catch(IOException ) {
                    return v0;
                }
            }

            return v0;
        }

    label_18:
        if(v5_1 != null) {
            try {
                v5_1.close();
                goto label_20;
            }
            catch(IOException ) {
            label_20:
                throw v0_1;
            }
        }

        goto label_20;
        try {
        label_10:
            v5_1.close();
            return v2;
        }
        catch(IOException ) {
            return v2;
        }
    }

    public void ej(String arg3, boolean arg4) {
        SharedPreferences$Editor v0 = this.ar.getPreferences(0).edit();
        v0.putBoolean(arg3, arg4);
        v0.apply();
    }

    void ek(boolean arg3) {
        this.ar.runOnUiThread(new at(this, arg3));
    }

    public void el(String arg3, String arg4) {
        SharedPreferences$Editor v0 = this.ar.getPreferences(0).edit();
        v0.putString(arg3, arg4);
        v0.apply();
    }

    public void em(String arg3, boolean arg4) {
        SharedPreferences$Editor v0 = this.ar.getPreferences(0).edit();
        v0.putBoolean(arg3, arg4);
        v0.apply();
    }

    public void en(String arg3, String arg4) {
        SharedPreferences$Editor v0 = this.ar.getPreferences(0).edit();
        v0.putString(arg3, arg4);
        v0.apply();
    }

    public ah eo() {
        return this.ay;
    }

    public void ep(String arg3, String arg4, String arg5) {
        if(this.ay == null) {
            try {
                this.ay = new av(arg3, arg4, arg5, this.ar);
            }
            catch(Throwable v3) {
                po.ax(null, v3, -403381370);
            }
        }
    }

    public void eq(Runnable arg2) {
        this.ar.runOnUiThread(arg2);
    }

    public void er(Runnable arg2) {
        this.ar.runOnUiThread(arg2);
    }

    public void es(String arg3, String arg4) {
        this.ar.runOnUiThread(new aw(this, arg3, arg4));
    }

    public ah et() {
        return this.ay;
    }

    public boolean eu(String arg3, boolean arg4) {
        return this.ar.getPreferences(0).getBoolean(arg3, arg4);
    }

    public void ev(String arg3, int arg4) {
        SharedPreferences$Editor v0 = this.ar.getPreferences(0).edit();
        v0.putInt(arg3, arg4);
        v0.apply();
    }

    public void ew(String arg3, int arg4) {
        SharedPreferences$Editor v0 = this.ar.getPreferences(0).edit();
        v0.putInt(arg3, arg4);
        v0.apply();
    }

    public void ex(String arg3, String arg4, String arg5) {
        if(this.ay == null) {
            try {
                this.ay = new av(arg3, arg4, arg5, this.ar);
            }
            catch(Throwable v3) {
                po.ax(null, v3, 0x8C07B78E);
            }
        }
    }

    public void ey(String arg3, String arg4) {
        SharedPreferences$Editor v0 = this.ar.getPreferences(0).edit();
        v0.putString(arg3, arg4);
        v0.apply();
    }

    void ez(boolean arg3) {
        this.ar.runOnUiThread(new at(this, arg3));
    }

    public ah fa() {
        return this.ay;
    }

    void fd() {
        ViewCompat.setOnApplyWindowInsetsListener(this.ar.getWindow().getDecorView().getRootView(), new ac(this));
    }

    void fe() {
        ViewCompat.setOnApplyWindowInsetsListener(this.ar.getWindow().getDecorView().getRootView(), new ac(this));
    }

    public int fh() {
        return Build$VERSION.SDK_INT;
    }

    public Object fk(mh arg2) {
        switch(arg2.ap * 0x6416803F) {
            case 0: {
                goto label_21;
            }
            case 1: {
                goto label_18;
            }
            case 2: {
                goto label_14;
            }
            case 3: {
                goto label_10;
            }
            case 4: {
                goto label_6;
            }
        }

        return null;
    label_18:
        return this.as(0x48CA5461);
    label_21:
        return this.at(0x7F0D0000, 0x624DFDED);
    label_6:
        return this.ay(0x7F0D0002, 0x4AC9A1D5);
    label_10:
        return this.at(0x7F0D0001, 0x39731B4D);
    label_14:
        return this.bg("license.txt", -1);
    }

    public Object fl(mh arg2) {
        switch(arg2.ap * 343093981) {
            case 0: {
                goto label_21;
            }
            case 1: {
                goto label_18;
            }
            case 2: {
                goto label_14;
            }
            case 3: {
                goto label_10;
            }
            case 4: {
                goto label_6;
            }
        }

        return null;
    label_18:
        return this.as(1651123860);
    label_21:
        return this.at(0x7F0D0000, 0x7CD50402);
    label_6:
        return this.ay(0x7F0D0002, 0x7056F2DB);
    label_10:
        return this.at(-636065043, 0x8DC8617);
    label_14:
        return this.bg("license.txt", -1);
    }

    public String fv(String arg3, String arg4) {
        return this.ar.getPreferences(0).getString(arg3, arg4);
    }

    public int fy() {
        return Build$VERSION.SDK_INT;
    }

    public int fz() {
        return Build$VERSION.SDK_INT;
    }
}

