package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.GmsClientEventManager$GmsClientEventState;

final class zaax implements GmsClientEventState {
    zaax(zaaw arg1) {
        this.zahg = arg1;
        super();
    }

    public final Bundle getConnectionHint() {
        return null;
    }

    public final boolean isConnected() {
        return this.zahg.isConnected();
    }
}

