package com.jagex.oldscape.android;

import aa;
import ah;
import ai;
import am;
import android.app.Activity;
import android.net.Uri;
import au;
import cf;
import com.jagex.mobilesdk.attribution.MobileAttributionService;
import com.jagex.mobilesdk.auth.MobileAuthService;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.auth.config.JagexConfigBuilder;
import com.jagex.mobilesdk.federatedLogin.FederatedLoginService;
import com.jagex.mobilesdk.notifications.LocalNotificationsManager;
import com.jagex.mobilesdk.notifications.MobileNotificationService;
import com.jagex.mobilesdk.payments.MobilePaymentService$PendingTransactionUpdate;
import com.jagex.mobilesdk.payments.MobilePaymentService;
import com.jagex.mobilesdk.utils.MobileUtilsService;
import dt;
import java.util.HashMap;
import java.util.Map;
import lx;
import po;

public class av extends ah {
    final MobileUtilsService ab;
    final FederatedLoginService ad;
    static final String ae = "gamesso.token.create payments payments.android.oldschool";
    final PendingTransactionUpdate af;
    aa ai;
    final MobilePaymentService aj;
    static final String al = "com_jagex_auth_mobile_android_osrs";
    final Activity an;
    final MobileAuthService ap;
    final LocalNotificationsManager aq;
    boolean av;

    av(String arg1, String arg2, String arg3, Activity arg4) {
        try {
            super(arg1, arg2, arg3);
            this.av = false;
            this.an = arg4;
            JagexConfig v1_1 = this.cj(0x7F0F00FB);
            this.aq = new LocalNotificationsManager(arg4);
            this.ap = new MobileAuthService(arg4, v1_1);
            this.aj = new MobilePaymentService(arg4, v1_1);
            this.ad = new FederatedLoginService(v1_1, dt.aq(0xE2B04B78), arg4.getPackageName());
            this.ab = new MobileUtilsService();
            this.af = new as(this);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("com/jagex/oldscape/android/av.<init>(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public void aa(int arg3) {
        try {
            MobileNotificationService.initPushNotificationService(this.an.getApplicationContext());
        }
        catch(RuntimeException v3) {
        }
        catch(Throwable v3_1) {
            String v0 = null;
            int v1 = 0x19BD5EF6;
            try {
                po.ax(v0, v3_1, v1);
            }
            catch(RuntimeException v3) {
                StringBuilder v0_1 = new StringBuilder();
                v0_1.append("com/jagex/oldscape/android/av.aa(");
                v0_1.append(')');
                throw lx.al(((Throwable)v3), v0_1.toString());
            }
        }
    }

    public void ab(int arg3) {
        try {
            this.aj.openStore(this.an);
        }
        catch(RuntimeException v3) {
        }
        catch(Throwable v3_1) {
            String v0 = null;
            int v1 = 1428513570;
            try {
                po.ax(v0, v3_1, v1);
            }
            catch(RuntimeException v3) {
                StringBuilder v0_1 = new StringBuilder();
                v0_1.append("com/jagex/oldscape/android/av.ab(");
                v0_1.append(')');
                throw lx.al(((Throwable)v3), v0_1.toString());
            }
        }
    }

    public void ac(byte arg3) {
        try {
            this.bd = au.al;
            try {
                this.an.runOnUiThread(new ag(this));
            }
            catch(Throwable v3_1) {
                String v0 = null;
                int v1 = 0xFFEB61EE;
                try {
                    po.ax(v0, v3_1, v1);
                    this.bd = au.ar;
                }
                catch(RuntimeException v3) {
                label_16:
                    StringBuilder v0_1 = new StringBuilder();
                    v0_1.append("com/jagex/oldscape/android/av.ac(");
                    v0_1.append(')');
                    throw lx.al(((Throwable)v3), v0_1.toString());
                }
            }
        }
        catch(RuntimeException v3) {
            goto label_16;
        }
    }

    public boolean ad(int arg1) {
        return 1;
    }

    public void ae(String arg8, String arg9, String arg10, String arg11, int arg12) {
        try {
            this.ap.requestOAuth2Tokens(this.an, arg8, arg9, arg10, arg11, new bd(this));
        }
        catch(RuntimeException v8) {
        }
        catch(Throwable v8_1) {
            arg9 = null;
            int v10 = 0x91D10E84;
            try {
                po.ax(arg9, v8_1, v10);
            }
            catch(RuntimeException v8) {
                StringBuilder v9 = new StringBuilder();
                v9.append("com/jagex/oldscape/android/av.ae(");
                v9.append(')');
                throw lx.al(((Throwable)v8), v9.toString());
            }
        }
    }

    public void af(cf arg1, boolean arg2, int arg3) {
        int v1_1;
        try {
            switch(arg1.ar * -1301906989) {
                case 1: {
                    v1_1 = 1;
                    goto label_9;
                }
                case 2: {
                    v1_1 = 4;
                    goto label_9;
                }
                default: {
                    v1_1 = 15;
                    goto label_9;
                }
            }
        }
        catch(RuntimeException v1) {
            goto label_20;
        }

        try {
        label_9:
            this.aj.openStore(this.an, v1_1, v1_1);
        }
        catch(RuntimeException v1) {
        }
        catch(Throwable v1_2) {
            String v2 = null;
            arg3 = 0xADD6B024;
            try {
                po.ax(v2, v1_2, arg3);
            }
            catch(RuntimeException v1) {
            label_20:
                StringBuilder v2_1 = new StringBuilder();
                v2_1.append("com/jagex/oldscape/android/av.af(");
                v2_1.append(')');
                throw lx.al(((Throwable)v1), v2_1.toString());
            }
        }
    }

    public void ag(long arg2) {
        try {
            if(!this.ao) {
                return;
            }

            try {
                MobileAttributionService.setUserID(String.valueOf(arg2));
            }
            catch(Throwable v2_1) {
                String v3 = null;
                int v0 = 0x820A1712;
                try {
                    po.ax(v3, v2_1, v0);
                }
                catch(RuntimeException v2) {
                label_12:
                    StringBuilder v3_1 = new StringBuilder();
                    v3_1.append("com/jagex/oldscape/android/av.ag(");
                    v3_1.append(')');
                    throw lx.al(((Throwable)v2), v3_1.toString());
                }
            }
        }
        catch(RuntimeException v2) {
            goto label_12;
        }
    }

    public void ah(String arg2, int arg3) {
        Map v3 = null;
        int v0 = -1200255464;
        try {
            this.at(arg2, v3, v0);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3_1 = new StringBuilder();
            v3_1.append("com/jagex/oldscape/android/av.ah(");
            v3_1.append(')');
            throw lx.al(((Throwable)v2), v3_1.toString());
        }
    }

    public void ai(int arg2, int arg3, int arg4) {
        try {
            this.aj.openStore(this.an, arg2, arg3);
        }
        catch(RuntimeException v2) {
        }
        catch(Throwable v2_1) {
            String v3 = null;
            arg4 = 0x99EB8AC5;
            try {
                po.ax(v3, v2_1, arg4);
            }
            catch(RuntimeException v2) {
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append("com/jagex/oldscape/android/av.ai(");
                v3_1.append(')');
                throw lx.al(((Throwable)v2), v3_1.toString());
            }
        }
    }

    public void aj(int arg3) {
        try {
            this.ad.authenticateWithGooglePlay(this.an);
        }
        catch(RuntimeException v3) {
        }
        catch(Throwable v3_1) {
            String v0 = null;
            int v1 = -560407531;
            try {
                po.ax(v0, v3_1, v1);
            }
            catch(RuntimeException v3) {
                StringBuilder v0_1 = new StringBuilder();
                v0_1.append("com/jagex/oldscape/android/av.aj(");
                v0_1.append(')');
                throw lx.al(((Throwable)v3), v0_1.toString());
            }
        }
    }

    public void ak(byte arg3) {
        try {
            this.aj.beginPurchaseHistoryQuery();
        }
        catch(RuntimeException v3) {
        }
        catch(Throwable v3_1) {
            String v0 = null;
            int v1 = 0xCD7F95CD;
            try {
                po.ax(v0, v3_1, v1);
            }
            catch(RuntimeException v3) {
                StringBuilder v0_1 = new StringBuilder();
                v0_1.append("com/jagex/oldscape/android/av.ak(");
                v0_1.append(')');
                throw lx.al(((Throwable)v3), v0_1.toString());
            }
        }
    }

    public void al(int arg3) {
        try {
            this.ap.logout(new ak(this));
        }
        catch(RuntimeException v3) {
        }
        catch(Throwable v3_1) {
            String v0 = null;
            int v1 = 0x9743EC72;
            try {
                po.ax(v0, v3_1, v1);
            }
            catch(RuntimeException v3) {
                StringBuilder v0_1 = new StringBuilder();
                v0_1.append("com/jagex/oldscape/android/av.al(");
                v0_1.append(')');
                throw lx.al(((Throwable)v3), v0_1.toString());
            }
        }
    }

    public void am(int arg3) {
        try {
            this.aq.openNotificationSettings(this.an);
        }
        catch(RuntimeException v3) {
        }
        catch(Throwable v3_1) {
            String v0 = null;
            int v1 = 826696026;
            try {
                po.ax(v0, v3_1, v1);
            }
            catch(RuntimeException v3) {
                StringBuilder v0_1 = new StringBuilder();
                v0_1.append("com/jagex/oldscape/android/av.am(");
                v0_1.append(')');
                throw lx.al(((Throwable)v3), v0_1.toString());
            }
        }
    }

    ai an(String arg1, int arg2, int arg3) {
        if(arg2 == 0) {
            arg2 = 0;
        }
        else if(arg2 != 0x57F) {
            switch(arg2) {
                case 1401: {
                    goto label_12;
                }
                case 1402: {
                    goto label_10;
                }
                case 1403: {
                    goto label_8;
                }
                case 1404: {
                    goto label_6;
                }
            }

            arg2 = 2;
            goto label_17;
        label_6:
            arg2 = 4;
            goto label_17;
        label_8:
            arg2 = 5;
            goto label_17;
        label_10:
            arg2 = 1;
            goto label_17;
        label_12:
            arg2 = 3;
        }
        else {
            arg2 = 6;
        }

        try {
        label_17:
            return new ai(arg1, arg2);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("com/jagex/oldscape/android/av.an(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public void ao(int arg3) {
        try {
            if(this.ak) {
                return;
            }

            this.ak = true;
            am v3_1 = null;
            this.as = v3_1;
            try {
                this.an.runOnUiThread(new ar(this));
            }
            catch(Throwable v0) {
                int v1 = 473900042;
                try {
                    po.ax(((String)v3_1), v0, v1);
                    this.as = new am(false);
                    this.ak = false;
                }
                catch(RuntimeException v3) {
                label_22:
                    StringBuilder v0_1 = new StringBuilder();
                    v0_1.append("com/jagex/oldscape/android/av.ao(");
                    v0_1.append(')');
                    throw lx.al(((Throwable)v3), v0_1.toString());
                }
            }
        }
        catch(RuntimeException v3) {
            goto label_22;
        }
    }

    public void ap(byte arg3) {
        try {
            throw new UnsupportedOperationException();
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/av.ap(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void aq(int arg3) {
        try {
            this.ap.createAccount(this.an, Uri.parse(this.aw));
        }
        catch(RuntimeException v3) {
        }
        catch(Throwable v3_1) {
            String v0 = null;
            int v1 = 0xE069DFA3;
            try {
                po.ax(v0, v3_1, v1);
            }
            catch(RuntimeException v3) {
                StringBuilder v0_1 = new StringBuilder();
                v0_1.append("com/jagex/oldscape/android/av.aq(");
                v0_1.append(')');
                throw lx.al(((Throwable)v3), v0_1.toString());
            }
        }
    }

    public boolean ar(byte arg4) {
        try {
            this.ap.requestGameToken(this.an, this.ba, new ao(this));
            return 1;
        }
        catch(RuntimeException v4) {
        }
        catch(Throwable v4_1) {
            String v0 = null;
            int v1 = 0xE61ED5AC;
            try {
                po.ax(v0, v4_1, v1);
                return 0;
            }
            catch(RuntimeException v4) {
                StringBuilder v0_1 = new StringBuilder();
                v0_1.append("com/jagex/oldscape/android/av.ar(");
                v0_1.append(')');
                throw lx.al(((Throwable)v4), v0_1.toString());
            }
        }
    }

    public void as(String arg2, int arg3) {
        try {
            this.ac = au.al;
            try {
                this.an.runOnUiThread(new com.jagex.oldscape.android.ah(this, arg2));
            }
            catch(Throwable v2_1) {
                String v3 = null;
                int v0 = 1138901082;
                try {
                    po.ax(v3, v2_1, v0);
                    this.ac = au.ar;
                }
                catch(RuntimeException v2) {
                label_16:
                    StringBuilder v3_1 = new StringBuilder();
                    v3_1.append("com/jagex/oldscape/android/av.as(");
                    v3_1.append(')');
                    throw lx.al(((Throwable)v2), v3_1.toString());
                }
            }
        }
        catch(RuntimeException v2) {
            goto label_16;
        }
    }

    public void at(String arg1, Map arg2, int arg3) {
        if(arg1 == null) {
            return;
        }

        if(arg2 == null) {
            try {
                HashMap v2 = new HashMap();
            label_9:
                MobileAttributionService.sendEvent(this.an, arg1, ((Map)v2));
                return;
            label_6:
                goto label_16;
            }
            catch(RuntimeException v1) {
                goto label_6;
            }
            catch(Throwable v1_1) {
                goto label_12;
            }
        }

        goto label_9;
    label_16:
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append("com/jagex/oldscape/android/av.at(");
        v2_1.append(')');
        throw lx.al(((Throwable)v1), v2_1.toString());
    label_12:
        String v2_2 = null;
        arg3 = 0x9FEC5C76;
        try {
            po.ax(v2_2, v1_1, arg3);
        }
        catch(RuntimeException v1) {
            goto label_6;
        }
    }

    public void au(int arg3) {
        try {
            MobileNotificationService.getLatestDeviceToken(new com.jagex.oldscape.android.ai(this));
        }
        catch(RuntimeException v3) {
        }
        catch(Throwable v3_1) {
            String v0 = null;
            int v1 = 0xEFB9BDE1;
            try {
                po.ax(v0, v3_1, v1);
            }
            catch(RuntimeException v3) {
                StringBuilder v0_1 = new StringBuilder();
                v0_1.append("com/jagex/oldscape/android/av.au(");
                v0_1.append(')');
                throw lx.al(((Throwable)v3), v0_1.toString());
            }
        }
    }

    public void av(int arg3) {
        try {
            if(this.ao) {
                return;
            }

            try {
                MobileAttributionService.init(this.an, "D26Pdv7QqeyK23LpPkdUAA");
                this.ao = true;
            }
            catch(Throwable v3_1) {
                String v0 = null;
                int v1 = -676520628;
                try {
                    po.ax(v0, v3_1, v1);
                }
                catch(RuntimeException v3) {
                label_15:
                    StringBuilder v0_1 = new StringBuilder();
                    v0_1.append("com/jagex/oldscape/android/av.av(");
                    v0_1.append(')');
                    throw lx.al(((Throwable)v3), v0_1.toString());
                }
            }
        }
        catch(RuntimeException v3) {
            goto label_15;
        }
    }

    public void aw(int arg3) {
        try {
            if(this.av) {
                return;
            }

            this.av = true;
            aa v3_1 = null;
            this.ai = v3_1;
            try {
                this.an.runOnUiThread(new com.jagex.oldscape.android.am(this));
            }
            catch(Throwable v0) {
                int v1 = 0x1DABA38F;
                try {
                    po.ax(((String)v3_1), v0, v1);
                    this.ai = new aa(false);
                    this.av = false;
                }
                catch(RuntimeException v3) {
                label_22:
                    StringBuilder v0_1 = new StringBuilder();
                    v0_1.append("com/jagex/oldscape/android/av.aw(");
                    v0_1.append(')');
                    throw lx.al(((Throwable)v3), v0_1.toString());
                }
            }
        }
        catch(RuntimeException v3) {
            goto label_22;
        }
    }

    public boolean ax(int arg3) {
        try {
            return this.ap.isUserAuthenticated();
        }
        catch(RuntimeException v3) {
        }
        catch(Throwable v3_1) {
            String v0 = null;
            int v1 = -1279110047;
            try {
                po.ax(v0, v3_1, v1);
                return 0;
            }
            catch(RuntimeException v3) {
                StringBuilder v0_1 = new StringBuilder();
                v0_1.append("com/jagex/oldscape/android/av.ax(");
                v0_1.append(')');
                throw lx.al(((Throwable)v3), v0_1.toString());
            }
        }
    }

    public aa ay(int arg3) {
        try {
            return this.ai;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/av.ay(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void az(String arg2, byte arg3) {
        try {
            this.ab.openBrowser(this.an, Uri.parse(arg2));
        }
        catch(RuntimeException v2) {
        }
        catch(Throwable v2_1) {
            String v3 = null;
            int v0 = 0x2B732E99;
            try {
                po.ax(v3, v2_1, v0);
            }
            catch(RuntimeException v2) {
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append("com/jagex/oldscape/android/av.az(");
                v3_1.append(')');
                throw lx.al(((Throwable)v2), v3_1.toString());
            }
        }
    }

    public int ba(int arg3) {
        try {
            return this.aj.getCategoryCount();
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/av.ba(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public String bb(int arg1, int arg2, int arg3) {
        try {
            return this.aj.getProductIntroductoryPrice(arg1, arg2);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("com/jagex/oldscape/android/av.bb(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public String bc(int arg1, int arg2, int arg3) {
        try {
            return this.aj.getProductIntroductoryPriceAsMicroUnits(arg1, arg2);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("com/jagex/oldscape/android/av.bc(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public boolean bd(int arg3) {
        try {
            return this.aj.purchaseHistoryQueryCompleted();
        }
        catch(RuntimeException v3) {
        }
        catch(Throwable v3_1) {
            String v0 = null;
            int v1 = 0x55FD2F6B;
            try {
                po.ax(v0, v3_1, v1);
                return 1;
            }
            catch(RuntimeException v3) {
                StringBuilder v0_1 = new StringBuilder();
                v0_1.append("com/jagex/oldscape/android/av.bd(");
                v0_1.append(')');
                throw lx.al(((Throwable)v3), v0_1.toString());
            }
        }
    }

    public void be(int arg2, int arg3) {
        try {
            this.aq.cancelNotification(arg2);
        }
        catch(RuntimeException v2) {
        }
        catch(Throwable v2_1) {
            String v3 = null;
            int v0 = 0x6B8C1505;
            try {
                po.ax(v3, v2_1, v0);
            }
            catch(RuntimeException v2) {
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append("com/jagex/oldscape/android/av.be(");
                v3_1.append(')');
                throw lx.al(((Throwable)v2), v3_1.toString());
            }
        }
    }

    public int bf(int arg2, int arg3) {
        try {
            return this.aj.getCategoryID(arg2);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/oldscape/android/av.bf(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public String bg(int arg1, int arg2, int arg3) {
        try {
            return this.aj.getProductPrice(arg1, arg2);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("com/jagex/oldscape/android/av.bg(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public String bh(int arg1, int arg2, int arg3) {
        try {
            return this.aj.getProductCurrencyCode(arg1, arg2);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("com/jagex/oldscape/android/av.bh(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public void bi(int arg1) {
    }

    public boolean bj(int arg3) {
        try {
            return this.aj.eligibleForIntroductoryPrice();
        }
        catch(RuntimeException v3) {
        }
        catch(Throwable v3_1) {
            String v0 = null;
            int v1 = 0x969C5A19;
            try {
                po.ax(v0, v3_1, v1);
                return 0;
            }
            catch(RuntimeException v3) {
                StringBuilder v0_1 = new StringBuilder();
                v0_1.append("com/jagex/oldscape/android/av.bj(");
                v0_1.append(')');
                throw lx.al(((Throwable)v3), v0_1.toString());
            }
        }
    }

    public String bk(int arg1, int arg2, byte arg3) {
        try {
            return this.aj.getProductFreeTrialPeriod(arg1, arg2);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("com/jagex/oldscape/android/av.bk(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public void bl(int arg1, int arg2) {
    }

    public boolean bm(int arg3) {
        try {
            return this.aj.eligibleForTrialPurchase();
        }
        catch(RuntimeException v3) {
        }
        catch(Throwable v3_1) {
            String v0 = null;
            int v1 = 0xFC885980;
            try {
                po.ax(v0, v3_1, v1);
                return 0;
            }
            catch(RuntimeException v3) {
                StringBuilder v0_1 = new StringBuilder();
                v0_1.append("com/jagex/oldscape/android/av.bm(");
                v0_1.append(')');
                throw lx.al(((Throwable)v3), v0_1.toString());
            }
        }
    }

    public int bn(int arg2, int arg3) {
        try {
            return this.aj.getIndexForCategoryID(arg2);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/oldscape/android/av.bn(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public int bo(int arg2, byte arg3) {
        try {
            return this.aj.getProductCount(arg2);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/oldscape/android/av.bo(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public int bp(String arg2, byte arg3) {
        try {
            return this.aj.getIndexForCategoryName(arg2);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/oldscape/android/av.bp(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public String bq(int arg1, int arg2, byte arg3) {
        try {
            return this.aj.getProductName(arg1, arg2);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("com/jagex/oldscape/android/av.bq(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public int br(int arg2, int arg3) {
        try {
            if(!this.aq.isNotificationScheduled(arg2)) {
                return 2;
            }
        }
        catch(RuntimeException v2) {
        }
        catch(Throwable v2_1) {
            String v3 = null;
            int v0 = 0xDD1BF9E4;
            try {
                po.ax(v3, v2_1, v0);
                return 0;
            }
            catch(RuntimeException v2) {
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append("com/jagex/oldscape/android/av.br(");
                v3_1.append(')');
                throw lx.al(((Throwable)v2), v3_1.toString());
            }
        }

        return 1;
    }

    public int bs(String arg8, String arg9, int arg10, int arg11, String arg12, int arg13, int arg14) {
        try {
            return this.aq.sendGroupedNotification(arg8, arg9, arg10, arg11, arg12, arg13);
        }
        catch(RuntimeException v8) {
        }
        catch(Throwable v8_1) {
            arg9 = null;
            arg10 = 0x29677DDE;
            try {
                po.ax(arg9, v8_1, arg10);
                return -1;
            }
            catch(RuntimeException v8) {
                StringBuilder v9 = new StringBuilder();
                v9.append("com/jagex/oldscape/android/av.bs(");
                v9.append(')');
                throw lx.al(((Throwable)v8), v9.toString());
            }
        }
    }

    public boolean bt(int arg1, int arg2, int arg3) {
        try {
            return this.aj.isProductRecommended(arg1, arg2);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("com/jagex/oldscape/android/av.bt(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public int bu(String arg1, String arg2, int arg3, int arg4, int arg5) {
        try {
            return this.aq.sendNotification(arg1, arg2, arg3, arg4);
        }
        catch(RuntimeException v1) {
        }
        catch(Throwable v1_1) {
            arg2 = null;
            arg3 = 916603859;
            try {
                po.ax(arg2, v1_1, arg3);
                return -1;
            }
            catch(RuntimeException v1) {
                StringBuilder v2 = new StringBuilder();
                v2.append("com/jagex/oldscape/android/av.bu(");
                v2.append(')');
                throw lx.al(((Throwable)v1), v2.toString());
            }
        }
    }

    public String bv(int arg1, int arg2, int arg3) {
        try {
            return this.aj.getProductID(arg1, arg2);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("com/jagex/oldscape/android/av.bv(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public String bw(int arg2, byte arg3) {
        try {
            return this.aj.getCategoryDescription(arg2);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/oldscape/android/av.bw(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public String bx(int arg1, int arg2, int arg3) {
        try {
            return this.aj.getProductType(arg1, arg2);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("com/jagex/oldscape/android/av.bx(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public boolean by(int arg1, int arg2, int arg3) {
        try {
            return this.aj.isProductAvailable(arg1, arg2);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("com/jagex/oldscape/android/av.by(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public String bz(int arg1, int arg2, byte arg3) {
        try {
            return this.aj.getProductPriceAsMicroUnits(arg1, arg2);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("com/jagex/oldscape/android/av.bz(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public int ca(byte arg3) {
        try {
            if(!this.aq.getNotificationSetting(this.an)) {
                return 2;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/av.ca(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }

        int v3_1 = 1;
        return v3_1;
    }

    public void cb() {
        try {
            this.ap.logout(new ak(this));
        }
        catch(Throwable v0) {
            po.ax(null, v0, 0xE3F5E002);
        }
    }

    public void cc() {
        try {
            this.ap.logout(new ak(this));
        }
        catch(Throwable v0) {
            po.ax(null, v0, 1710521420);
        }
    }

    public boolean cd() {
        try {
            return this.ap.isUserAuthenticated();
        }
        catch(Throwable v0) {
            po.ax(null, v0, -1517842073);
            return 0;
        }
    }

    public boolean ce() {
        try {
            this.ap.requestGameToken(this.an, this.ba, new ao(this));
            return 1;
        }
        catch(Throwable v0) {
            po.ax(null, v0, 0xE2D3CA24);
            return 0;
        }
    }

    public boolean cf() {
        try {
            return this.ap.isUserAuthenticated();
        }
        catch(Throwable v0) {
            po.ax(null, v0, 0x176C51CE);
            return 0;
        }
    }

    public void cg() {
        try {
            this.ap.createAccount(this.an, Uri.parse(this.aw));
        }
        catch(Throwable v0) {
            po.ax(null, v0, 0x1A023164);
        }
    }

    public boolean ch() {
        try {
            this.ap.requestGameToken(this.an, this.ba, new ao(this));
            return 1;
        }
        catch(Throwable v0) {
            po.ax(null, v0, 470075937);
            return 0;
        }
    }

    public boolean ci() {
        try {
            this.ap.requestGameToken(this.an, this.ba, new ao(this));
            return 1;
        }
        catch(Throwable v0) {
            po.ax(null, v0, 0x1B7EB057);
            return 0;
        }
    }

    JagexConfig cj(int arg3) {
        try {
            JagexConfigBuilder v3_1 = new JagexConfigBuilder(this.an);
            v3_1.setClientId("com_jagex_auth_mobile_android_osrs");
            v3_1.setScope("gamesso.token.create payments payments.android.oldschool");
            v3_1.setRedirectUri("com.jagex.mobilesdk.android.osrs:/oauth2redirect");
            v3_1.setIssuerUri(this.at);
            v3_1.setShopName("oldschool");
            v3_1.setPaymentUri(this.ay);
            v3_1.setClientSecret("public");
            return v3_1.build();
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/av.cj(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void ck() {
        throw new UnsupportedOperationException();
    }

    public void cl() {
        throw new UnsupportedOperationException();
    }

    public void cm() {
        try {
            this.ad.authenticateWithGooglePlay(this.an);
        }
        catch(Throwable v0) {
            po.ax(null, v0, 1203245079);
        }
    }

    ai cn(String arg2, int arg3) {
        if(arg3 == 0) {
            arg3 = 0;
        }
        else if(arg3 != 0x57F) {
            switch(arg3) {
                case 1401: {
                    goto label_12;
                }
                case 1402: {
                    goto label_10;
                }
                case 1403: {
                    goto label_8;
                }
                case 1404: {
                    goto label_6;
                }
            }

            arg3 = 2;
            goto label_17;
        label_6:
            arg3 = 4;
            goto label_17;
        label_8:
            arg3 = 5;
            goto label_17;
        label_10:
            arg3 = 1;
            goto label_17;
        label_12:
            arg3 = 3;
        }
        else {
            arg3 = 6;
        }

    label_17:
        return new ai(arg2, arg3);
    }

    public void co() {
        try {
            this.ap.createAccount(this.an, Uri.parse(this.aw));
        }
        catch(Throwable v0) {
            po.ax(null, v0, 1052101714);
        }
    }

    public void cp(String arg8, String arg9, String arg10, String arg11) {
        try {
            this.ap.requestOAuth2Tokens(this.an, arg8, arg9, arg10, arg11, new bd(this));
        }
        catch(Throwable v8) {
            po.ax(null, v8, 0xA2EA8B9B);
        }
    }

    public boolean cq() {
        return 1;
    }

    public boolean cr() {
        try {
            this.ap.requestGameToken(this.an, this.ba, new ao(this));
            return 1;
        }
        catch(Throwable v0) {
            po.ax(null, v0, 0xE6B05A74);
            return 0;
        }
    }

    ai cs(String arg2, int arg3) {
        if(arg3 == 0) {
            arg3 = 0;
        }
        else if(arg3 != 0x57F) {
            switch(arg3) {
                case 1401: {
                    goto label_12;
                }
                case 1402: {
                    goto label_10;
                }
                case 1403: {
                    goto label_8;
                }
                case 1404: {
                    goto label_6;
                }
            }

            arg3 = 2;
            goto label_17;
        label_6:
            arg3 = 4;
            goto label_17;
        label_8:
            arg3 = 5;
            goto label_17;
        label_10:
            arg3 = 1;
            goto label_17;
        label_12:
            arg3 = 3;
        }
        else {
            arg3 = 6;
        }

    label_17:
        return new ai(arg2, arg3);
    }

    public void ct() {
        try {
            this.ad.authenticateWithGooglePlay(this.an);
        }
        catch(Throwable v0) {
            po.ax(null, v0, -90642281);
        }
    }

    public void cu() {
        try {
            this.ad.authenticateWithGooglePlay(this.an);
        }
        catch(Throwable v0) {
            po.ax(null, v0, 0x7C0B9281);
        }
    }

    public boolean cv() {
        return 1;
    }

    public void cw() {
        try {
            this.ap.logout(new ak(this));
        }
        catch(Throwable v0) {
            po.ax(null, v0, 0xF57D5CFC);
        }
    }

    public boolean cx() {
        try {
            return this.ap.isUserAuthenticated();
        }
        catch(Throwable v0) {
            po.ax(null, v0, 0x5CAF033F);
            return 0;
        }
    }

    public void cy() {
        try {
            this.ap.logout(new ak(this));
        }
        catch(Throwable v0) {
            po.ax(null, v0, 0x50B27DA4);
        }
    }

    ai cz(String arg2, int arg3) {
        if(arg3 == 0) {
            arg3 = 0;
        }
        else if(arg3 != 0x57F) {
            switch(arg3) {
                case 1401: {
                    goto label_12;
                }
                case 1402: {
                    goto label_10;
                }
                case 1403: {
                    goto label_8;
                }
                case 1404: {
                    goto label_6;
                }
            }

            arg3 = 2;
            goto label_17;
        label_6:
            arg3 = 4;
            goto label_17;
        label_8:
            arg3 = 5;
            goto label_17;
        label_10:
            arg3 = 1;
            goto label_17;
        label_12:
            arg3 = 3;
        }
        else {
            arg3 = 6;
        }

    label_17:
        return new ai(arg2, arg3);
    }

    public void da(long arg2) {
        if(this.ao) {
            try {
                MobileAttributionService.setUserID(String.valueOf(arg2));
            }
            catch(Throwable v2) {
                po.ax(null, v2, 0x614EB505);
            }
        }
    }

    public void db(int arg3, int arg4) {
        try {
            this.aj.openStore(this.an, arg3, arg4);
        }
        catch(Throwable v3) {
            po.ax(null, v3, -1397064473);
        }
    }

    public void dc() {
        try {
            MobileNotificationService.initPushNotificationService(this.an.getApplicationContext());
        }
        catch(Throwable v0) {
            po.ax(null, v0, 0x7EA757A6);
        }
    }

    public aa dd() {
        return this.ai;
    }

    public void de() {
        if(!this.ao) {
            try {
                MobileAttributionService.init(this.an, "D26Pdv7QqeyK23LpPkdUAA");
                this.ao = true;
            }
            catch(Throwable v0) {
                po.ax(null, v0, 0x96807FEE);
            }
        }
    }

    public void df() {
        try {
            MobileNotificationService.getLatestDeviceToken(new com.jagex.oldscape.android.ai(this));
        }
        catch(Throwable v0) {
            po.ax(null, v0, 0x31FE2E07);
        }
    }

    public aa dg() {
        return this.ai;
    }

    public void dh(cf arg2, boolean arg3) {
        int v2;
        switch(arg2.ar * -1301906989) {
            case 1: {
                v2 = 1;
                break;
            }
            case 2: {
                v2 = 4;
                break;
            }
            default: {
                v2 = 15;
                break;
            }
        }

        try {
            this.aj.openStore(this.an, v2, v2);
        }
        catch(Throwable v2_1) {
            po.ax(null, v2_1, 0x850FD973);
        }
    }

    public void di(long arg2) {
        if(this.ao) {
            try {
                MobileAttributionService.setUserID(String.valueOf(arg2));
            }
            catch(Throwable v2) {
                po.ax(null, v2, -563649430);
            }
        }
    }

    public void dj() {
        try {
            MobileNotificationService.initPushNotificationService(this.an.getApplicationContext());
        }
        catch(Throwable v0) {
            po.ax(null, v0, 0xD505F3E4);
        }
    }

    public void dk() {
        if(!this.ao) {
            try {
                MobileAttributionService.init(this.an, "D26Pdv7QqeyK23LpPkdUAA");
                this.ao = true;
            }
            catch(Throwable v0) {
                po.ax(null, v0, 0x977A5A5E);
            }
        }
    }

    public void dl() {
        try {
            this.aq.openNotificationSettings(this.an);
        }
        catch(Throwable v0) {
            po.ax(null, v0, 0xDF842C03);
        }
    }

    public void dm(int arg3, int arg4) {
        try {
            this.aj.openStore(this.an, arg3, arg4);
        }
        catch(Throwable v3) {
            po.ax(null, v3, 0x1D9056B6);
        }
    }

    public void dn(String arg3) {
        try {
            this.ab.openBrowser(this.an, Uri.parse(arg3));
        }
        catch(Throwable v3) {
            po.ax(null, v3, 0x99A1C40A);
        }
    }

    public void do(String arg3) {
        this.at(arg3, null, -1200255464);
    }

    public void dp(cf arg2, boolean arg3) {
        int v2;
        switch(arg2.ar * -1301906989) {
            case 1: {
                v2 = 1;
                break;
            }
            case 2: {
                v2 = 4;
                break;
            }
            default: {
                v2 = 15;
                break;
            }
        }

        try {
            this.aj.openStore(this.an, v2, v2);
        }
        catch(Throwable v2_1) {
            po.ax(null, v2_1, 0x73980FD);
        }
    }

    public void dq(String arg2, Map arg3) {
        if(arg2 == null) {
            return;
        }

        if(arg3 == null) {
            try {
                HashMap v3 = new HashMap();
            label_7:
                MobileAttributionService.sendEvent(this.an, arg2, ((Map)v3));
                return;
            label_6:
                goto label_10;
            }
            catch(Throwable v2) {
                goto label_6;
            }
        }

        goto label_7;
    label_10:
        po.ax(null, v2, 0xA9BD9D01);
    }

    public void dr(String arg3) {
        try {
            this.ab.openBrowser(this.an, Uri.parse(arg3));
        }
        catch(Throwable v3) {
            po.ax(null, v3, 0xB15E32BD);
        }
    }

    public void ds() {
        try {
            MobileNotificationService.getLatestDeviceToken(new com.jagex.oldscape.android.ai(this));
        }
        catch(Throwable v0) {
            po.ax(null, v0, 1289559092);
        }
    }

    public void dt(String arg2, Map arg3) {
        if(arg2 == null) {
            return;
        }

        if(arg3 == null) {
            try {
                HashMap v3 = new HashMap();
            label_7:
                MobileAttributionService.sendEvent(this.an, arg2, ((Map)v3));
                return;
            label_6:
                goto label_10;
            }
            catch(Throwable v2) {
                goto label_6;
            }
        }

        goto label_7;
    label_10:
        po.ax(null, v2, 0x6089E6BE);
    }

    public void du(int arg3, int arg4) {
        try {
            this.aj.openStore(this.an, arg3, arg4);
        }
        catch(Throwable v3) {
            po.ax(null, v3, 0x691130F9);
        }
    }

    public void dv() {
        try {
            this.ap.createAccount(this.an, Uri.parse(this.aw));
        }
        catch(Throwable v0) {
            po.ax(null, v0, 2009309971);
        }
    }

    public void dw(cf arg2, boolean arg3) {
        int v2;
        switch(arg2.ar * -1301906989) {
            case 1: {
                v2 = 1;
                break;
            }
            case 2: {
                v2 = 4;
                break;
            }
            default: {
                v2 = 15;
                break;
            }
        }

        try {
            this.aj.openStore(this.an, v2, v2);
        }
        catch(Throwable v2_1) {
            po.ax(null, v2_1, 0xBB0CA740);
        }
    }

    public void dx(String arg3) {
        try {
            this.ab.openBrowser(this.an, Uri.parse(arg3));
        }
        catch(Throwable v3) {
            po.ax(null, v3, 0xD9A41AF0);
        }
    }

    public void dy() {
        try {
            MobileNotificationService.getLatestDeviceToken(new com.jagex.oldscape.android.ai(this));
        }
        catch(Throwable v0) {
            po.ax(null, v0, -935204069);
        }
    }

    public void dz(long arg2) {
        if(this.ao) {
            try {
                MobileAttributionService.setUserID(String.valueOf(arg2));
            }
            catch(Throwable v2) {
                po.ax(null, v2, 750106987);
            }
        }
    }

    public aa ea() {
        return this.ai;
    }

    public int eb() {
        return this.aj.getCategoryCount();
    }

    public int ec(int arg2) {
        return this.aj.getCategoryID(arg2);
    }

    public boolean ed() {
        try {
            return this.aj.purchaseHistoryQueryCompleted();
        }
        catch(Throwable v0) {
            po.ax(null, v0, 0x6140B90);
            return 1;
        }
    }

    public boolean ee() {
        try {
            return this.aj.purchaseHistoryQueryCompleted();
        }
        catch(Throwable v0) {
            po.ax(null, v0, 0x3AFFEC85);
            return 1;
        }
    }

    public int ef(String arg2) {
        return this.aj.getIndexForCategoryName(arg2);
    }

    public void eg() {
        this.bd = au.al;
        try {
            this.an.runOnUiThread(new ag(this));
        }
        catch(Throwable v0) {
            po.ax(null, v0, 0x6C40A652);
            this.bd = au.ar;
        }
    }

    public int eh(int arg2) {
        return this.aj.getCategoryID(arg2);
    }

    public int ei(int arg2) {
        return this.aj.getCategoryID(arg2);
    }

    public void ej() {
        if(!this.av) {
            this.av = true;
            aa v0 = null;
            this.ai = v0;
            try {
                this.an.runOnUiThread(new com.jagex.oldscape.android.am(this));
            }
            catch(Throwable v1) {
                po.ax(((String)v0), v1, 0x40A274AD);
                this.ai = new aa(false);
                this.av = false;
            }
        }
    }

    public aa ek() {
        return this.ai;
    }

    public void el(String arg3) {
        this.ac = au.al;
        try {
            this.an.runOnUiThread(new com.jagex.oldscape.android.ah(this, arg3));
        }
        catch(Throwable v3) {
            po.ax(null, v3, 0x76360E39);
            this.ac = au.ar;
        }
    }

    public void em() {
        if(!this.ak) {
            this.ak = true;
            am v0 = null;
            this.as = v0;
            try {
                this.an.runOnUiThread(new ar(this));
            }
            catch(Throwable v1) {
                po.ax(((String)v0), v1, 0x725E1AF8);
                this.as = new am(false);
                this.ak = false;
            }
        }
    }

    public void en(String arg3) {
        this.ac = au.al;
        try {
            this.an.runOnUiThread(new com.jagex.oldscape.android.ah(this, arg3));
        }
        catch(Throwable v3) {
            po.ax(null, v3, 0xF7DA6308);
            this.ac = au.ar;
        }
    }

    public int eo(String arg2) {
        return this.aj.getIndexForCategoryName(arg2);
    }

    public int ep(int arg2) {
        return this.aj.getIndexForCategoryID(arg2);
    }

    public void eq() {
        if(!this.av) {
            this.av = true;
            aa v0 = null;
            this.ai = v0;
            try {
                this.an.runOnUiThread(new com.jagex.oldscape.android.am(this));
            }
            catch(Throwable v1) {
                po.ax(((String)v0), v1, 0x8D6F78CA);
                this.ai = new aa(false);
                this.av = false;
            }
        }
    }

    public void er() {
        if(!this.av) {
            this.av = true;
            aa v0 = null;
            this.ai = v0;
            try {
                this.an.runOnUiThread(new com.jagex.oldscape.android.am(this));
            }
            catch(Throwable v1) {
                po.ax(((String)v0), v1, 730290516);
                this.ai = new aa(false);
                this.av = false;
            }
        }
    }

    public int es() {
        return this.aj.getCategoryCount();
    }

    public String et(int arg2) {
        return this.aj.getCategoryDescription(arg2);
    }

    public void eu() {
        this.bd = au.al;
        try {
            this.an.runOnUiThread(new ag(this));
        }
        catch(Throwable v0) {
            po.ax(null, v0, 1378036661);
            this.bd = au.ar;
        }
    }

    public void ev() {
        this.bd = au.al;
        try {
            this.an.runOnUiThread(new ag(this));
        }
        catch(Throwable v0) {
            po.ax(null, v0, 0x734AB548);
            this.bd = au.ar;
        }
    }

    public void ew() {
        try {
            this.aj.beginPurchaseHistoryQuery();
        }
        catch(Throwable v0) {
            po.ax(null, v0, 0xDD56015E);
        }
    }

    public int ex(int arg2) {
        return this.aj.getIndexForCategoryID(arg2);
    }

    public void ey() {
        if(!this.ak) {
            this.ak = true;
            am v0 = null;
            this.as = v0;
            try {
                this.an.runOnUiThread(new ar(this));
            }
            catch(Throwable v1) {
                po.ax(((String)v0), v1, -244030265);
                this.as = new am(false);
                this.ak = false;
            }
        }
    }

    public aa ez() {
        return this.ai;
    }

    public int fa(int arg2) {
        return this.aj.getProductCount(arg2);
    }

    public String fb(int arg2, int arg3) {
        return this.aj.getProductPrice(arg2, arg3);
    }

    public String fc(int arg2, int arg3) {
        return this.aj.getProductType(arg2, arg3);
    }

    public boolean fd(int arg2, int arg3) {
        return this.aj.isProductRecommended(arg2, arg3);
    }

    public boolean fe(int arg2, int arg3) {
        return this.aj.isProductRecommended(arg2, arg3);
    }

    public String ff(int arg2, int arg3) {
        return this.aj.getProductCurrencyCode(arg2, arg3);
    }

    public String fg(int arg2, int arg3) {
        return this.aj.getProductIntroductoryPriceAsMicroUnits(arg2, arg3);
    }

    public String fh(int arg2, int arg3) {
        return this.aj.getProductID(arg2, arg3);
    }

    public String fi(int arg2, int arg3) {
        return this.aj.getProductType(arg2, arg3);
    }

    public String fj(int arg2, int arg3) {
        return this.aj.getProductIntroductoryPriceAsMicroUnits(arg2, arg3);
    }

    public String fk(int arg2, int arg3) {
        return this.aj.getProductName(arg2, arg3);
    }

    public String fl(int arg2, int arg3) {
        return this.aj.getProductID(arg2, arg3);
    }

    public String fm(int arg2, int arg3) {
        return this.aj.getProductPriceAsMicroUnits(arg2, arg3);
    }

    public String fn(int arg2, int arg3) {
        return this.aj.getProductPriceAsMicroUnits(arg2, arg3);
    }

    public String fo(int arg2, int arg3) {
        return this.aj.getProductPrice(arg2, arg3);
    }

    public String fp(int arg2, int arg3) {
        return this.aj.getProductIntroductoryPrice(arg2, arg3);
    }

    public String fq(int arg2, int arg3) {
        return this.aj.getProductCurrencyCode(arg2, arg3);
    }

    public String fr(int arg2, int arg3) {
        return this.aj.getProductIntroductoryPriceAsMicroUnits(arg2, arg3);
    }

    public String fs(int arg2, int arg3) {
        return this.aj.getProductFreeTrialPeriod(arg2, arg3);
    }

    public String ft(int arg2, int arg3) {
        return this.aj.getProductIntroductoryPrice(arg2, arg3);
    }

    public String fu(int arg2, int arg3) {
        return this.aj.getProductPrice(arg2, arg3);
    }

    public String fv(int arg2, int arg3) {
        return this.aj.getProductType(arg2, arg3);
    }

    public String fw(int arg2, int arg3) {
        return this.aj.getProductIntroductoryPrice(arg2, arg3);
    }

    public String fx(int arg2, int arg3) {
        return this.aj.getProductPriceAsMicroUnits(arg2, arg3);
    }

    public boolean fy(int arg2, int arg3) {
        return this.aj.isProductRecommended(arg2, arg3);
    }

    public boolean fz(int arg2, int arg3) {
        return this.aj.isProductRecommended(arg2, arg3);
    }

    public int ga(String arg2, String arg3, int arg4, int arg5) {
        try {
            return this.aq.sendNotification(arg2, arg3, arg4, arg5);
        }
        catch(Throwable v2) {
            po.ax(null, v2, 1990807383);
            return -1;
        }
    }

    public int gb(String arg8, String arg9, int arg10, int arg11, String arg12, int arg13) {
        try {
            return this.aq.sendGroupedNotification(arg8, arg9, arg10, arg11, arg12, arg13);
        }
        catch(Throwable v8) {
            po.ax(null, v8, 1849407090);
            return -1;
        }
    }

    public String gc(int arg2, int arg3) {
        return this.aj.getProductFreeTrialPeriod(arg2, arg3);
    }

    public int gd() {
        int v0 = this.aq.getNotificationSetting(this.an) ? 1 : 2;
        return v0;
    }

    public void ge() {
    }

    public void gf() {
        try {
            this.aj.openStore(this.an);
        }
        catch(Throwable v0) {
            po.ax(null, v0, 0x45A6DF82);
        }
    }

    public String gg(int arg2, int arg3) {
        return this.aj.getProductFreeTrialPeriod(arg2, arg3);
    }

    JagexConfig gh() {
        JagexConfigBuilder v0 = new JagexConfigBuilder(this.an);
        v0.setClientId("com_jagex_auth_mobile_android_osrs");
        v0.setScope("gamesso.token.create payments payments.android.oldschool");
        v0.setRedirectUri("com.jagex.mobilesdk.android.osrs:/oauth2redirect");
        v0.setIssuerUri(this.at);
        v0.setShopName("oldschool");
        v0.setPaymentUri(this.ay);
        v0.setClientSecret("public");
        return v0.build();
    }

    public void gi(int arg1) {
    }

    public int gj(String arg2, String arg3, int arg4, int arg5) {
        try {
            return this.aq.sendNotification(arg2, arg3, arg4, arg5);
        }
        catch(Throwable v2) {
            po.ax(null, v2, -428448807);
            return -1;
        }
    }

    public void gk(int arg3) {
        try {
            this.aq.cancelNotification(arg3);
        }
        catch(Throwable v3) {
            po.ax(null, v3, -1440082799);
        }
    }

    public boolean gl() {
        try {
            return this.aj.eligibleForTrialPurchase();
        }
        catch(Throwable v0) {
            po.ax(null, v0, -1793484760);
            return 0;
        }
    }

    public String gm(int arg2, int arg3) {
        return this.aj.getProductFreeTrialPeriod(arg2, arg3);
    }

    public boolean gn() {
        try {
            return this.aj.eligibleForIntroductoryPrice();
        }
        catch(Throwable v0) {
            po.ax(null, v0, 0x25407B54);
            return 0;
        }
    }

    public int go() {
        int v0 = this.aq.getNotificationSetting(this.an) ? 1 : 2;
        return v0;
    }

    JagexConfig gp() {
        JagexConfigBuilder v0 = new JagexConfigBuilder(this.an);
        v0.setClientId("com_jagex_auth_mobile_android_osrs");
        v0.setScope("gamesso.token.create payments payments.android.oldschool");
        v0.setRedirectUri("com.jagex.mobilesdk.android.osrs:/oauth2redirect");
        v0.setIssuerUri(this.at);
        v0.setShopName("oldschool");
        v0.setPaymentUri(this.ay);
        v0.setClientSecret("public");
        return v0.build();
    }

    JagexConfig gq() {
        JagexConfigBuilder v0 = new JagexConfigBuilder(this.an);
        v0.setClientId("com_jagex_auth_mobile_android_osrs");
        v0.setScope("gamesso.token.create payments payments.android.oldschool");
        v0.setRedirectUri("com.jagex.mobilesdk.android.osrs:/oauth2redirect");
        v0.setIssuerUri(this.at);
        v0.setShopName("oldschool");
        v0.setPaymentUri(this.ay);
        v0.setClientSecret("public");
        return v0.build();
    }

    public void gr(int arg3) {
        try {
            this.aq.cancelNotification(arg3);
        }
        catch(Throwable v3) {
            po.ax(null, v3, 0x7BD29B6);
        }
    }

    public int gs(String arg2, String arg3, int arg4, int arg5) {
        try {
            return this.aq.sendNotification(arg2, arg3, arg4, arg5);
        }
        catch(Throwable v2) {
            po.ax(null, v2, 0x5F3A952A);
            return -1;
        }
    }

    public void gt(int arg3) {
        try {
            this.aq.cancelNotification(arg3);
        }
        catch(Throwable v3) {
            po.ax(null, v3, 0xCE301917);
        }
    }

    public boolean gu() {
        try {
            return this.aj.eligibleForIntroductoryPrice();
        }
        catch(Throwable v0) {
            po.ax(null, v0, 0x6A22CF04);
            return 0;
        }
    }

    public void gv() {
        try {
            this.aj.openStore(this.an);
        }
        catch(Throwable v0) {
            po.ax(null, v0, 0x8F1B2D66);
        }
    }

    public int gw(int arg3) {
        try {
            if(!this.aq.isNotificationScheduled(arg3)) {
                return 2;
            }
        }
        catch(Throwable v3) {
            po.ax(null, v3, -204239989);
            return 0;
        }

        return 1;
    }

    public int gx(String arg8, String arg9, int arg10, int arg11, String arg12, int arg13) {
        try {
            return this.aq.sendGroupedNotification(arg8, arg9, arg10, arg11, arg12, arg13);
        }
        catch(Throwable v8) {
            po.ax(null, v8, 0x9211D303);
            return -1;
        }
    }

    public int gy(String arg8, String arg9, int arg10, int arg11, String arg12, int arg13) {
        try {
            return this.aq.sendGroupedNotification(arg8, arg9, arg10, arg11, arg12, arg13);
        }
        catch(Throwable v8) {
            po.ax(null, v8, 1966702078);
            return -1;
        }
    }

    public int gz(int arg3) {
        try {
            if(!this.aq.isNotificationScheduled(arg3)) {
                return 2;
            }
        }
        catch(Throwable v3) {
            po.ax(null, v3, 1179442670);
            return 0;
        }

        return 1;
    }

    public void hb() {
        try {
            this.aj.openStore(this.an);
        }
        catch(Throwable v0) {
            po.ax(null, v0, 970302487);
        }
    }

    public void hc() {
        try {
            this.aj.openStore(this.an);
        }
        catch(Throwable v0) {
            po.ax(null, v0, 0x2263EEBE);
        }
    }

    public void hi() {
        try {
            this.aj.openStore(this.an);
        }
        catch(Throwable v0) {
            po.ax(null, v0, 0x35A5A3);
        }
    }
}

