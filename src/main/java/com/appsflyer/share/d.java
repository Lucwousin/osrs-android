package com.appsflyer.share;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

final class d {
    private String ˏ;

    d() {
        super();
    }

    final void ˏ(String arg1) {
        this.ˏ = arg1;
    }

    final void ॱ(Context arg4) {
        if(this.ˏ != null) {
            arg4.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.ˏ)).setFlags(0x10000000));
        }
    }
}

