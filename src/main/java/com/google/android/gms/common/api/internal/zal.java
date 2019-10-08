package com.google.android.gms.common.api.internal;

import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zal extends LifecycleCallback implements DialogInterface$OnCancelListener {
    protected volatile boolean mStarted;
    protected final GoogleApiAvailability zacc;
    protected final AtomicReference zade;
    private final Handler zadf;

    protected zal(LifecycleFragment arg2) {
        this(arg2, GoogleApiAvailability.getInstance());
    }

    @VisibleForTesting private zal(LifecycleFragment arg2, GoogleApiAvailability arg3) {
        super(arg2);
        this.zade = new AtomicReference(null);
        this.zadf = new com.google.android.gms.internal.base.zal(Looper.getMainLooper());
        this.zacc = arg3;
    }

    public void onActivityResult(int arg4, int arg5, Intent arg6) {
        Object v0 = this.zade.get();
        int v1 = 1;
        switch(arg4) {
            case 1: {
                if(arg5 == -1) {
                    goto label_38;
                }

                if(arg5 == 0) {
                    arg4 = 13;
                    if(arg6 != null) {
                        arg4 = arg6.getIntExtra("<<ResolutionFailureErrorDetail>>", arg4);
                    }

                    zam v5 = new zam(new ConnectionResult(arg4, null), zal.zaa(((zam)v0)));
                    this.zade.set(v5);
                    zam v0_1 = v5;
                }

            label_37:
                v1 = 0;
                break;
            }
            case 2: {
                arg4 = this.zacc.isGooglePlayServicesAvailable(this.getActivity());
                if(arg4 == 0) {
                }
                else {
                    v1 = 0;
                }

                if(v0 == null) {
                    return;
                }

                int v6 = 18;
                if(((zam)v0).getConnectionResult().getErrorCode() != v6) {
                    goto label_38;
                }

                if(arg4 != v6) {
                    goto label_38;
                }

                return;
            }
            default: {
                goto label_37;
            }
        }

    label_38:
        if(v1 != 0) {
            this.zaq();
            return;
        }

        if(v0 != null) {
            this.zaa(((zam)v0).getConnectionResult(), ((zam)v0).zar());
        }
    }

    public void onCancel(DialogInterface arg3) {
        this.zaa(new ConnectionResult(13, null), zal.zaa(this.zade.get()));
        this.zaq();
    }

    public void onCreate(Bundle arg5) {
        zam v2;
        super.onCreate(arg5);
        if(arg5 != null) {
            AtomicReference v0 = this.zade;
            if(arg5.getBoolean("resolving_error", false)) {
                v2 = new zam(new ConnectionResult(arg5.getInt("failed_status"), arg5.getParcelable("failed_resolution")), arg5.getInt("failed_client_id", -1));
            }
            else {
                Object v2_1 = null;
            }

            v0.set(v2);
        }
    }

    public void onSaveInstanceState(Bundle arg4) {
        super.onSaveInstanceState(arg4);
        Object v0 = this.zade.get();
        if(v0 != null) {
            arg4.putBoolean("resolving_error", true);
            arg4.putInt("failed_client_id", ((zam)v0).zar());
            arg4.putInt("failed_status", ((zam)v0).getConnectionResult().getErrorCode());
            arg4.putParcelable("failed_resolution", ((zam)v0).getConnectionResult().getResolution());
        }
    }

    public void onStart() {
        super.onStart();
        this.mStarted = true;
    }

    public void onStop() {
        super.onStop();
        this.mStarted = false;
    }

    protected abstract void zaa(ConnectionResult arg1, int arg2);

    private static int zaa(@Nullable zam arg0) {
        if(arg0 == null) {
            return -1;
        }

        return arg0.zar();
    }

    public final void zab(ConnectionResult arg2, int arg3) {
        zam v0 = new zam(arg2, arg3);
        if(this.zade.compareAndSet(null, v0)) {
            this.zadf.post(new zan(this, v0));
        }
    }

    protected abstract void zao();

    protected final void zaq() {
        this.zade.set(null);
        this.zao();
    }
}

