package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.R$string;
import com.google.android.gms.common.annotation.KeepForSdk;
import javax.annotation.Nullable;

@KeepForSdk public class StringResourceValueReader {
    private final Resources zzeu;
    private final String zzev;

    public StringResourceValueReader(Context arg2) {
        super();
        Preconditions.checkNotNull(arg2);
        this.zzeu = arg2.getResources();
        this.zzev = this.zzeu.getResourcePackageName(R$string.common_google_play_services_unknown_issue);
    }

    @KeepForSdk @Nullable public String getString(String arg4) {
        int v4 = this.zzeu.getIdentifier(arg4, "string", this.zzev);
        if(v4 == 0) {
            return null;
        }

        return this.zzeu.getString(v4);
    }
}

