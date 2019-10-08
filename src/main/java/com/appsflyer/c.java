package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;

final class c {
    final class a {
        static final c ˏ;

        static {
            a.ˏ = new c();
        }
    }

    final class d {
        private final float ˊ;
        private final String ˎ;

        d(float arg1, String arg2) {
            super();
            this.ˊ = arg1;
            this.ˎ = arg2;
        }

        d() {
            super();
        }

        final String ˎ() {
            return this.ˎ;
        }

        final float ˏ() {
            return this.ˊ;
        }
    }

    private IntentFilter ˋ;

    c() {
        super();
        this.ˋ = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    @NonNull final d ˎ(Context arg6) {
        int v6_1;
        String v2_1;
        int v2;
        BroadcastReceiver v0 = null;
        float v1 = 0f;
        try {
            Intent v6 = arg6.registerReceiver(v0, this.ˋ);
            if(v6 != null) {
                int v4 = -1;
                v2 = 2 == v6.getIntExtra("status", v4) ? 1 : 0;
                if(v2 != 0) {
                    v2 = v6.getIntExtra("plugged", v4);
                    if(v2 != 4) {
                        switch(v2) {
                            case 1: {
                                goto label_23;
                            }
                            case 2: {
                                goto label_21;
                            }
                        }

                        v2_1 = "other";
                    }
                    else {
                        goto label_25;
                    }
                }
                else {
                    goto label_27;
                }

            label_28:
                String v0_1 = v2_1;
                v2 = v6.getIntExtra("level", v4);
                v6_1 = v6.getIntExtra("scale", v4);
                if(v4 == v2) {
                    goto label_41;
                }

                goto label_34;
            label_21:
                v2_1 = "usb";
                goto label_28;
            label_23:
                v2_1 = "ac";
                goto label_28;
            label_25:
                v2_1 = "wireless";
                goto label_28;
            label_27:
                v2_1 = "no";
                goto label_28;
            }
        }
        catch(Throwable ) {
        }

        goto label_41;
    label_34:
        if(v4 != v6_1) {
            v1 = (((float)v2)) * 100f / (((float)v6_1));
        }

    label_41:
        return new d(v1, ((String)v0));
    }
}

