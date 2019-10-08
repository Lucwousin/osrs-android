package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentActivity;
import androidx.loader.app.LoaderManager$LoaderCallbacks;
import androidx.loader.content.Loader;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

@KeepName public class SignInHubActivity extends FragmentActivity {
    final class zzc implements LoaderCallbacks {
        zzc(SignInHubActivity arg1, zzy arg2) {
            this(arg1);
        }

        private zzc(SignInHubActivity arg1) {
            this.zzbz = arg1;
            super();
        }

        public final Loader onCreateLoader(int arg2, Bundle arg3) {
            return new zze(this.zzbz, GoogleApiClient.getAllClients());
        }

        public final void onLoadFinished(Loader arg2, Object arg3) {
            this.zzbz.setResult(SignInHubActivity.zzc(this.zzbz), SignInHubActivity.zzd(this.zzbz));
            this.zzbz.finish();
        }

        public final void onLoaderReset(Loader arg1) {
        }
    }

    private static boolean zzbt = false;
    private boolean zzbu;
    private SignInConfiguration zzbv;
    private boolean zzbw;
    private int zzbx;
    private Intent zzby;

    static {
    }

    public SignInHubActivity() {
        super();
        this.zzbu = false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent arg1) {
        return 1;
    }

    protected void onActivityResult(int arg3, int arg4, Intent arg5) {
        if(this.zzbu) {
            return;
        }

        this.setResult(0);
        if(arg3 != 0xA002) {
        }
        else {
            arg3 = 8;
            if(arg5 != null) {
                Parcelable v0 = arg5.getParcelableExtra("signInAccount");
                if(v0 != null && ((SignInAccount)v0).getGoogleSignInAccount() != null) {
                    GoogleSignInAccount v3 = ((SignInAccount)v0).getGoogleSignInAccount();
                    zzp.zzd(((Context)this)).zzc(this.zzbv.zzm(), v3);
                    arg5.removeExtra("signInAccount");
                    arg5.putExtra("googleSignInAccount", ((Parcelable)v3));
                    this.zzbw = true;
                    this.zzbx = arg4;
                    this.zzby = arg5;
                    this.zzn();
                    return;
                }

                if(!arg5.hasExtra("errorCode")) {
                    goto label_40;
                }

                arg3 = arg5.getIntExtra("errorCode", arg3);
                if(arg3 == 13) {
                    arg3 = 0x30D5;
                }

                this.zzc(arg3);
                return;
            }

        label_40:
            this.zzc(arg3);
        }
    }

    protected void onCreate(Bundle arg5) {
        super.onCreate(arg5);
        Intent v0 = this.getIntent();
        String v1 = v0.getAction();
        if("com.google.android.gms.auth.NO_IMPL".equals(v1)) {
            this.zzc(12500);
            return;
        }

        if(!v1.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !v1.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            String v5 = "AuthSignInClient";
            v1 = "Unknown action: ";
            String v0_1 = String.valueOf(v0.getAction());
            v0_1 = v0_1.length() != 0 ? v1.concat(v0_1) : new String(v1);
            Log.e(v5, v0_1);
            this.finish();
            return;
        }

        this.zzbv = v0.getBundleExtra("config").getParcelable("config");
        if(this.zzbv == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            this.setResult(0);
            this.finish();
            return;
        }

        int v3 = arg5 == null ? 1 : 0;
        if(v3 != 0) {
            if(SignInHubActivity.zzbt) {
                this.setResult(0);
                this.zzc(0x30D6);
                return;
            }

            SignInHubActivity.zzbt = true;
            Intent v5_1 = new Intent(v1);
            if(v1.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                v5_1.setPackage("com.google.android.gms");
            }
            else {
                v5_1.setPackage(this.getPackageName());
            }

            v5_1.putExtra("config", this.zzbv);
            int v1_1 = 0xA002;
            try {
                this.startActivityForResult(v5_1, v1_1);
                return;
            }
            catch(ActivityNotFoundException ) {
                this.zzbu = true;
                Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                this.zzc(17);
                return;
            }
        }

        this.zzbw = arg5.getBoolean("signingInGoogleApiClients");
        if(this.zzbw) {
            this.zzbx = arg5.getInt("signInResultCode");
            this.zzby = arg5.getParcelable("signInResultData");
            this.zzn();
        }
    }

    protected void onSaveInstanceState(Bundle arg3) {
        super.onSaveInstanceState(arg3);
        arg3.putBoolean("signingInGoogleApiClients", this.zzbw);
        if(this.zzbw) {
            arg3.putInt("signInResultCode", this.zzbx);
            arg3.putParcelable("signInResultData", this.zzby);
        }
    }

    static int zzc(SignInHubActivity arg0) {
        return arg0.zzbx;
    }

    private final void zzc(int arg3) {
        Status v0 = new Status(arg3);
        Intent v3 = new Intent();
        v3.putExtra("googleSignInStatus", ((Parcelable)v0));
        this.setResult(0, v3);
        this.finish();
        SignInHubActivity.zzbt = false;
    }

    static Intent zzd(SignInHubActivity arg0) {
        return arg0.zzby;
    }

    private final void zzn() {
        this.getSupportLoaderManager().initLoader(0, null, new zzc(this, null));
        SignInHubActivity.zzbt = false;
    }
}

