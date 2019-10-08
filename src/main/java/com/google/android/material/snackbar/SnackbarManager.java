package com.google.android.material.snackbar;

import android.os.Handler$Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

class SnackbarManager {
    interface Callback {
        void dismiss(int arg1);

        void show();
    }

    class SnackbarRecord {
        final WeakReference callback;
        int duration;
        boolean paused;

        SnackbarRecord(int arg2, Callback arg3) {
            super();
            this.callback = new WeakReference(arg3);
            this.duration = arg2;
        }

        boolean isSnackbar(Callback arg2) {
            boolean v2 = arg2 == null || this.callback.get() != arg2 ? false : true;
            return v2;
        }
    }

    private static final int LONG_DURATION_MS = 2750;
    static final int MSG_TIMEOUT = 0;
    private static final int SHORT_DURATION_MS = 1500;
    private SnackbarRecord currentSnackbar;
    private final Handler handler;
    private final Object lock;
    private SnackbarRecord nextSnackbar;
    private static SnackbarManager snackbarManager;

    private SnackbarManager() {
        super();
        this.lock = new Object();
        this.handler = new Handler(Looper.getMainLooper(), new Handler$Callback() {
            public boolean handleMessage(Message arg2) {
                if(arg2.what != 0) {
                    return 0;
                }

                SnackbarManager.this.handleTimeout(arg2.obj);
                return 1;
            }
        });
    }

    private boolean cancelSnackbarLocked(SnackbarRecord arg3, int arg4) {
        Object v0 = arg3.callback.get();
        if(v0 != null) {
            this.handler.removeCallbacksAndMessages(arg3);
            ((Callback)v0).dismiss(arg4);
            return 1;
        }

        return 0;
    }

    public void dismiss(Callback arg3, int arg4) {
        Object v0 = this.lock;
        __monitor_enter(v0);
        try {
            if(this.isCurrentSnackbarLocked(arg3)) {
                this.cancelSnackbarLocked(this.currentSnackbar, arg4);
            }
            else if(this.isNextSnackbarLocked(arg3)) {
                this.cancelSnackbarLocked(this.nextSnackbar, arg4);
            }

            __monitor_exit(v0);
            return;
        label_14:
            __monitor_exit(v0);
        }
        catch(Throwable v3) {
            goto label_14;
        }

        throw v3;
    }

    static SnackbarManager getInstance() {
        if(SnackbarManager.snackbarManager == null) {
            SnackbarManager.snackbarManager = new SnackbarManager();
        }

        return SnackbarManager.snackbarManager;
    }

    void handleTimeout(SnackbarRecord arg3) {
        Object v0 = this.lock;
        __monitor_enter(v0);
        try {
            if(this.currentSnackbar == arg3 || this.nextSnackbar == arg3) {
                this.cancelSnackbarLocked(arg3, 2);
            }

            __monitor_exit(v0);
            return;
        label_11:
            __monitor_exit(v0);
        }
        catch(Throwable v3) {
            goto label_11;
        }

        throw v3;
    }

    public boolean isCurrent(Callback arg2) {
        Object v0 = this.lock;
        __monitor_enter(v0);
        try {
            __monitor_exit(v0);
            return this.isCurrentSnackbarLocked(arg2);
        label_6:
            __monitor_exit(v0);
        }
        catch(Throwable v2) {
            goto label_6;
        }

        throw v2;
    }

    public boolean isCurrentOrNext(Callback arg3) {
        Object v0 = this.lock;
        __monitor_enter(v0);
        try {
            boolean v3_1 = (this.isCurrentSnackbarLocked(arg3)) || (this.isNextSnackbarLocked(arg3)) ? true : false;
            __monitor_exit(v0);
            return v3_1;
        label_13:
            __monitor_exit(v0);
        }
        catch(Throwable v3) {
            goto label_13;
        }

        throw v3;
    }

    private boolean isCurrentSnackbarLocked(Callback arg2) {
        boolean v2 = this.currentSnackbar == null || !this.currentSnackbar.isSnackbar(arg2) ? false : true;
        return v2;
    }

    private boolean isNextSnackbarLocked(Callback arg2) {
        boolean v2 = this.nextSnackbar == null || !this.nextSnackbar.isSnackbar(arg2) ? false : true;
        return v2;
    }

    public void onDismissed(Callback arg2) {
        Object v0 = this.lock;
        __monitor_enter(v0);
        try {
            if(this.isCurrentSnackbarLocked(arg2)) {
                this.currentSnackbar = null;
                if(this.nextSnackbar != null) {
                    this.showNextSnackbarLocked();
                }
            }

            __monitor_exit(v0);
            return;
        label_12:
            __monitor_exit(v0);
        }
        catch(Throwable v2) {
            goto label_12;
        }

        throw v2;
    }

    public void onShown(Callback arg2) {
        Object v0 = this.lock;
        __monitor_enter(v0);
        try {
            if(this.isCurrentSnackbarLocked(arg2)) {
                this.scheduleTimeoutLocked(this.currentSnackbar);
            }

            __monitor_exit(v0);
            return;
        label_9:
            __monitor_exit(v0);
        }
        catch(Throwable v2) {
            goto label_9;
        }

        throw v2;
    }

    public void pauseTimeout(Callback arg3) {
        Object v0 = this.lock;
        __monitor_enter(v0);
        try {
            if((this.isCurrentSnackbarLocked(arg3)) && !this.currentSnackbar.paused) {
                this.currentSnackbar.paused = true;
                this.handler.removeCallbacksAndMessages(this.currentSnackbar);
            }

            __monitor_exit(v0);
            return;
        label_16:
            __monitor_exit(v0);
        }
        catch(Throwable v3) {
            goto label_16;
        }

        throw v3;
    }

    public void restoreTimeoutIfPaused(Callback arg3) {
        Object v0 = this.lock;
        __monitor_enter(v0);
        try {
            if((this.isCurrentSnackbarLocked(arg3)) && (this.currentSnackbar.paused)) {
                this.currentSnackbar.paused = false;
                this.scheduleTimeoutLocked(this.currentSnackbar);
            }

            __monitor_exit(v0);
            return;
        label_15:
            __monitor_exit(v0);
        }
        catch(Throwable v3) {
            goto label_15;
        }

        throw v3;
    }

    private void scheduleTimeoutLocked(SnackbarRecord arg5) {
        if(arg5.duration == -2) {
            return;
        }

        int v0 = 2750;
        if(arg5.duration > 0) {
            v0 = arg5.duration;
        }
        else if(arg5.duration == -1) {
            v0 = 1500;
        }

        this.handler.removeCallbacksAndMessages(arg5);
        this.handler.sendMessageDelayed(Message.obtain(this.handler, 0, arg5), ((long)v0));
    }

    public void show(int arg3, Callback arg4) {
        Object v0 = this.lock;
        __monitor_enter(v0);
        try {
            if(this.isCurrentSnackbarLocked(arg4)) {
                this.currentSnackbar.duration = arg3;
                this.handler.removeCallbacksAndMessages(this.currentSnackbar);
                this.scheduleTimeoutLocked(this.currentSnackbar);
                __monitor_exit(v0);
                return;
            }

            if(this.isNextSnackbarLocked(arg4)) {
                this.nextSnackbar.duration = arg3;
            }
            else {
                this.nextSnackbar = new SnackbarRecord(arg3, arg4);
            }

            if(this.currentSnackbar != null && (this.cancelSnackbarLocked(this.currentSnackbar, 4))) {
                __monitor_exit(v0);
                return;
            }

            this.currentSnackbar = null;
            this.showNextSnackbarLocked();
            __monitor_exit(v0);
            return;
        label_35:
            __monitor_exit(v0);
        }
        catch(Throwable v3) {
            goto label_35;
        }

        throw v3;
    }

    private void showNextSnackbarLocked() {
        if(this.nextSnackbar != null) {
            this.currentSnackbar = this.nextSnackbar;
            SnackbarRecord v0 = null;
            this.nextSnackbar = v0;
            Object v1 = this.currentSnackbar.callback.get();
            if(v1 != null) {
                ((Callback)v1).show();
            }
            else {
                this.currentSnackbar = v0;
            }
        }
    }
}

