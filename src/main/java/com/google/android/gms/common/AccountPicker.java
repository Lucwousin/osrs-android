package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import java.io.Serializable;
import java.util.ArrayList;

public final class AccountPicker {
    private AccountPicker() {
        super();
    }

    public static Intent newChooseAccountIntent(Account arg3, ArrayList arg4, String[] arg5, boolean arg6, String arg7, String arg8, String[] arg9, Bundle arg10) {
        Intent v0 = new Intent();
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        v0.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        v0.setPackage("com.google.android.gms");
        v0.putExtra("allowableAccounts", ((Serializable)arg4));
        v0.putExtra("allowableAccountTypes", arg5);
        v0.putExtra("addAccountOptions", arg10);
        v0.putExtra("selectedAccount", ((Parcelable)arg3));
        v0.putExtra("alwaysPromptForAccount", arg6);
        v0.putExtra("descriptionTextOverride", arg7);
        v0.putExtra("authTokenType", arg8);
        v0.putExtra("addAccountRequiredFeatures", arg9);
        v0.putExtra("setGmsCoreAccount", false);
        v0.putExtra("overrideTheme", 0);
        v0.putExtra("overrideCustomTheme", 0);
        v0.putExtra("hostedDomainFilter", null);
        return v0;
    }
}

