package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender$SendIntentException;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.util.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class FragmentHostCallback extends FragmentContainer {
    @Nullable private final Activity mActivity;
    @NonNull private final Context mContext;
    final FragmentManagerImpl mFragmentManager;
    @NonNull private final Handler mHandler;
    private final int mWindowAnimations;

    FragmentHostCallback(@Nullable Activity arg2, @NonNull Context arg3, @NonNull Handler arg4, int arg5) {
        super();
        this.mFragmentManager = new FragmentManagerImpl();
        this.mActivity = arg2;
        this.mContext = Preconditions.checkNotNull(arg3, "context == null");
        this.mHandler = Preconditions.checkNotNull(arg4, "handler == null");
        this.mWindowAnimations = arg5;
    }

    public FragmentHostCallback(@NonNull Context arg2, @NonNull Handler arg3, int arg4) {
        Context v0;
        if((arg2 instanceof Activity)) {
            v0 = arg2;
        }
        else {
            Activity v0_1 = null;
        }

        this(((Activity)v0), arg2, arg3, arg4);
    }

    FragmentHostCallback(@NonNull FragmentActivity arg3) {
        this(((Activity)arg3), ((Context)arg3), arg3.mHandler, 0);
    }

    @Nullable Activity getActivity() {
        return this.mActivity;
    }

    @NonNull Context getContext() {
        return this.mContext;
    }

    FragmentManagerImpl getFragmentManagerImpl() {
        return this.mFragmentManager;
    }

    @NonNull Handler getHandler() {
        return this.mHandler;
    }

    void onAttachFragment(Fragment arg1) {
    }

    public void onDump(String arg1, FileDescriptor arg2, PrintWriter arg3, String[] arg4) {
    }

    @Nullable public View onFindViewById(int arg1) {
        return null;
    }

    @Nullable public abstract Object onGetHost();

    @NonNull public LayoutInflater onGetLayoutInflater() {
        return LayoutInflater.from(this.mContext);
    }

    public int onGetWindowAnimations() {
        return this.mWindowAnimations;
    }

    public boolean onHasView() {
        return 1;
    }

    public boolean onHasWindowAnimations() {
        return 1;
    }

    public void onRequestPermissionsFromFragment(@NonNull Fragment arg1, @NonNull String[] arg2, int arg3) {
    }

    public boolean onShouldSaveFragmentState(Fragment arg1) {
        return 1;
    }

    public boolean onShouldShowRequestPermissionRationale(@NonNull String arg1) {
        return 0;
    }

    public void onStartActivityFromFragment(Fragment arg1, Intent arg2, int arg3, @Nullable Bundle arg4) {
        if(arg3 == -1) {
            this.mContext.startActivity(arg2);
            return;
        }

        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public void onStartActivityFromFragment(Fragment arg2, Intent arg3, int arg4) {
        this.onStartActivityFromFragment(arg2, arg3, arg4, null);
    }

    public void onStartIntentSenderFromFragment(Fragment arg10, IntentSender arg11, int arg12, @Nullable Intent arg13, int arg14, int arg15, int arg16, Bundle arg17) throws IntentSender$SendIntentException {
        if(arg12 == -1) {
            ActivityCompat.startIntentSenderForResult(this.mActivity, arg11, arg12, arg13, arg14, arg15, arg16, arg17);
            return;
        }

        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }

    public void onSupportInvalidateOptionsMenu() {
    }
}

