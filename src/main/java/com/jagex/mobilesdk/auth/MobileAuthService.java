package com.jagex.mobilesdk.auth;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsIntent;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.auth.createaccount.AuthJagexCustomTabs;
import com.jagex.mobilesdk.auth.createaccount.CreateAccountManagementActivity;
import com.jagex.mobilesdk.auth.model.MobileAuthState;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.payments.MobilePaymentService$PendingTransactionUpdate;
import com.jagex.mobilesdk.payments.MobilePaymentService;
import com.jagex.mobilesdk.payments.utils.SecurityProviderUpdate;

public class MobileAuthService {
    private MobileAuthStateManager authStateManager;
    private MobileAuthStateWriter authStateWriter;
    private MobilePaymentService mPaymentService;

    public MobileAuthService(@NonNull Activity arg3, @NonNull JagexConfig arg4) {
        super();
        this.authStateWriter = new MobileAuthStateWriter(arg3.getApplicationContext());
        this.authStateManager = MobileAuthStateManager.getInstance(this.authStateWriter, arg4);
        this.mPaymentService = new MobilePaymentService(arg3, arg4);
        SecurityProviderUpdate.ProviderUpdate(arg3);
    }

    static MobileAuthStateManager access$000(MobileAuthService arg0) {
        return arg0.authStateManager;
    }

    static MobilePaymentService access$100(MobileAuthService arg0) {
        return arg0.mPaymentService;
    }

    public void createAccount(@NonNull Activity arg3, Uri arg4) {
        arg3.startActivityForResult(CreateAccountManagementActivity.createStartIntent(arg3.getApplicationContext(), this.createAccountCreationIntent(new AuthJagexCustomTabs(arg3.getApplicationContext()).build(), arg4)), 2204);
    }

    private Intent createAccountCreationIntent(CustomTabsIntent arg1, Uri arg2) {
        Intent v1 = arg1.intent;
        v1.setData(arg2);
        return v1;
    }

    public boolean isUserAuthenticated() {
        return this.authStateManager.isUserAuthenticated();
    }

    public void logout(@NonNull MobileAuthServiceListener arg2) {
        this.authStateManager.logout(arg2);
    }

    @Deprecated public void requestGameToken(Activity arg2, @NonNull MobileAuthServiceListener arg3) {
        this.requestGameToken(arg2, true, arg3);
    }

    public void requestGameToken(Activity arg2, boolean arg3, @NonNull MobileAuthServiceListener arg4) {
        this.requestGameToken(arg2, arg3, false, arg4);
    }

    public void requestGameToken(Activity arg9, boolean arg10, boolean arg11, @NonNull MobileAuthServiceListener arg12) {
        this.authStateManager.performActionWithFreshTokens(arg9, new AuthManagerAction(arg12, arg10, arg9, arg11) {
            public void execute(@Nullable String arg2, Exception arg3) {
                if(arg3 != null) {
                    this.val$listener.onResult(new CommsResult("", 1401));
                    return;
                }

                if(this.val$ignorePendingTransactions) {
                    MobileAuthService.this.authStateManager.requestGameToken(this.val$listener);
                    return;
                }

                MobileAuthService.this.mPaymentService.checkForPendingTransactions(this.val$activity, new PendingTransactionUpdate() {
                    public void applyComplete() {
                    }

                    public void applyFailed() {
                    }

                    public void transactionsAvailable(boolean arg3) {
                        if(!arg3) {
                            this.this$1.this$0.authStateManager.requestGameToken(this.this$1.val$listener);
                        }
                        else if(this.this$1.val$forceGameToken) {
                            this.this$1.this$0.authStateManager.requestGameToken(new MobileAuthServiceListener() {
                                public void onResult(CommsResult arg2) {
                                    if(arg2.responseCode == 0) {
                                        arg2.responseCode = 0x57F;
                                    }

                                    this.this$2.this$1.val$listener.onResult(arg2);
                                }
                            });
                        }
                        else {
                            this.this$1.val$listener.onResult(new CommsResult("", 0x57F));
                        }
                    }
                });
            }
        });
    }

    public void requestOAuth2Tokens(@NonNull Activity arg8, String arg9, String arg10, String arg11, String arg12, @NonNull MobileAuthServiceListener arg13) {
        this.authStateManager.requestOAuth2Tokens(arg8, arg9, arg10, arg11, arg12, arg13);
    }

    public void storeTokens(@NonNull Activity arg2, @NonNull String arg3, @NonNull String arg4, @NonNull long arg5) {
        this.authStateManager.storeTokens(new MobileAuthState(arg3, arg4, arg5));
    }
}

