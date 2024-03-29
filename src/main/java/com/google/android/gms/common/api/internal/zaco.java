package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zal;

final class zaco extends zal {
    public zaco(zacm arg1, Looper arg2) {
        this.zakv = arg1;
        super(arg2);
    }

    public final void handleMessage(Message arg5) {
        switch(arg5.what) {
            case 0: {
                goto label_27;
            }
            case 1: {
                goto label_13;
            }
        }

        int v5 = arg5.what;
        StringBuilder v2 = new StringBuilder(70);
        v2.append("TransformationResultHandler received unknown message type: ");
        v2.append(v5);
        Log.e("TransformedResultImpl", v2.toString());
        return;
    label_27:
        Object v5_1 = arg5.obj;
        Object v0 = zacm.zaf(this.zakv);
        __monitor_enter(v0);
        if(v5_1 == null) {
            try {
                zacm.zaa(zacm.zag(this.zakv), new Status(13, "Transform returned null"));
                goto label_52;
            label_42:
                if((v5_1 instanceof zacd)) {
                    zacm.zaa(zacm.zag(this.zakv), ((zacd)v5_1).getStatus());
                }
                else {
                    zacm.zag(this.zakv).zaa(((PendingResult)v5_1));
                }

            label_52:
                __monitor_exit(v0);
                return;
            label_54:
                __monitor_exit(v0);
                goto label_55;
            }
            catch(Throwable v5_2) {
                goto label_54;
            }
        }
        else {
            goto label_42;
        }

        goto label_52;
    label_55:
        throw v5_2;
    label_13:
        v5_1 = arg5.obj;
        String v0_1 = "Runtime exception on the transformation worker thread: ";
        String v1 = String.valueOf(((RuntimeException)v5_1).getMessage());
        v0_1 = v1.length() != 0 ? v0_1.concat(v1) : new String(v0_1);
        Log.e("TransformedResultImpl", v0_1);
        throw v5_1;
    }
}

