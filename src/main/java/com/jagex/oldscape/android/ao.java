package com.jagex.oldscape.android;

import ai;
import com.jagex.mobilesdk.auth.MobileAuthServiceListener;
import com.jagex.mobilesdk.common.comms.CommsResult;
import hp;
import lx;

class ao implements MobileAuthServiceListener {
    ao(av arg1) {
        av.this = arg1;
        super();
    }

    public void ae(CommsResult arg4) {
        ai v4 = arg4 != null ? av.this.an(arg4.getResultValue(), arg4.responseCode, 0x125F860A) : av.this.an(null, arg4.responseCode, 0xDF490AC4);
        hp.ea.aa(v4, 0xBC5CDEAD);
    }

    public void al(CommsResult arg4) {
        ai v4 = arg4 != null ? av.this.an(arg4.getResultValue(), arg4.responseCode, 0x6FAB4632) : av.this.an(null, arg4.responseCode, 0xE2875149);
        hp.ea.aa(v4, 0xBC5CDEAD);
    }

    public void ar(CommsResult arg4) {
        ai v4 = arg4 != null ? av.this.an(arg4.getResultValue(), arg4.responseCode, 0x2AD56B9F) : av.this.an(null, arg4.responseCode, 0x796C7AA0);
        hp.ea.aa(v4, 0xBC5CDEAD);
    }

    public void ax(CommsResult arg4) {
        ai v4 = arg4 != null ? av.this.an(arg4.getResultValue(), arg4.responseCode, 1016257298) : av.this.an(null, arg4.responseCode, 0xEC8465B1);
        hp.ea.aa(v4, 0xBC5CDEAD);
    }

    public void onResult(CommsResult arg4) {
        if(arg4 != null) {
            try {
                ai v4_1 = av.this.an(arg4.getResultValue(), arg4.responseCode, 0x20D73BCD);
                goto label_12;
            label_7:
                v4_1 = av.this.an(null, arg4.responseCode, -1586032053);
            label_12:
                hp.ea.aa(v4_1, 0xBC5CDEAD);
                return;
            }
            catch(RuntimeException v4) {
                StringBuilder v0 = new StringBuilder();
                v0.append("com/jagex/oldscape/android/ao.onResult(");
                v0.append(')');
                throw lx.al(((Throwable)v4), v0.toString());
            }
        }
        else {
            goto label_7;
        }

        goto label_12;
    }
}

