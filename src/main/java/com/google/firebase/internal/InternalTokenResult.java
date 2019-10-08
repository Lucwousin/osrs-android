package com.google.firebase.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;

@KeepForSdk public class InternalTokenResult {
    private String token;

    @KeepForSdk public InternalTokenResult(@Nullable String arg1) {
        super();
        this.token = arg1;
    }

    public boolean equals(Object arg2) {
        if(!(arg2 instanceof InternalTokenResult)) {
            return 0;
        }

        return Objects.equal(this.token, ((InternalTokenResult)arg2).token);
    }

    @Nullable @KeepForSdk public String getToken() {
        return this.token;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{this.token});
    }

    public String toString() {
        return Objects.toStringHelper(this).add("token", this.token).toString();
    }
}

