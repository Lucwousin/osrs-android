package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;
import java.util.List;

public final class Batch extends BasePendingResult {
    public final class Builder {
        private List zabe;
        private GoogleApiClient zabf;

        public Builder(GoogleApiClient arg2) {
            super();
            this.zabe = new ArrayList();
            this.zabf = arg2;
        }

        public final BatchResultToken add(PendingResult arg3) {
            BatchResultToken v0 = new BatchResultToken(this.zabe.size());
            this.zabe.add(arg3);
            return v0;
        }

        public final Batch build() {
            return new Batch(this.zabe, this.zabf, null);
        }
    }

    private final Object mLock;
    private int zaaz;
    private boolean zaba;
    private boolean zabb;
    private final PendingResult[] zabc;

    private Batch(List arg3, GoogleApiClient arg4) {
        super(arg4);
        this.mLock = new Object();
        this.zaaz = arg3.size();
        this.zabc = new PendingResult[this.zaaz];
        if(arg3.isEmpty()) {
            ((BasePendingResult)this).setResult(new BatchResult(Status.RESULT_SUCCESS, this.zabc));
            return;
        }

        int v4;
        for(v4 = 0; v4 < arg3.size(); ++v4) {
            Object v0 = arg3.get(v4);
            this.zabc[v4] = v0;
            ((PendingResult)v0).addStatusListener(new zaa(this));
        }
    }

    Batch(List arg1, GoogleApiClient arg2, zaa arg3) {
        this(arg1, arg2);
    }

    public final void cancel() {
        super.cancel();
        PendingResult[] v0 = this.zabc;
        int v1 = v0.length;
        int v2;
        for(v2 = 0; v2 < v1; ++v2) {
            v0[v2].cancel();
        }
    }

    public final BatchResult createFailedResult(Status arg3) {
        return new BatchResult(arg3, this.zabc);
    }

    public final Result createFailedResult(Status arg1) {
        return this.createFailedResult(arg1);
    }

    static Object zaa(Batch arg0) {
        return arg0.mLock;
    }

    static boolean zaa(Batch arg0, boolean arg1) {
        arg0.zabb = true;
        return 1;
    }

    static boolean zab(Batch arg0, boolean arg1) {
        arg0.zaba = true;
        return 1;
    }

    static int zab(Batch arg2) {
        int v0 = arg2.zaaz;
        arg2.zaaz = v0 - 1;
        return v0;
    }

    static int zac(Batch arg0) {
        return arg0.zaaz;
    }

    static boolean zad(Batch arg0) {
        return arg0.zabb;
    }

    static void zae(Batch arg0) {
        super.cancel();
    }

    static boolean zaf(Batch arg0) {
        return arg0.zaba;
    }

    static PendingResult[] zag(Batch arg0) {
        return arg0.zabc;
    }
}

