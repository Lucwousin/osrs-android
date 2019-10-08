package com.jagex.mobilesdk.payments.comms;

import com.jagex.mobilesdk.auth.model.MobileAuthState;
import com.jagex.mobilesdk.payments.model.PaymentCompletionRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class PaymentComms {
    public PaymentComms() {
        super();
    }

    public static void FetchImageComms(String arg1, FetchImageCallback arg2, boolean arg3) {
        FetchImageComms v0 = new FetchImageComms(arg1, arg2);
        if(arg3) {
            v0.execute(new Void[0]);
        }
        else {
            v0.fetchImagePostAction(v0.fetchImageAction(arg1), arg2);
        }
    }

    public static void completePaymentsComms(String arg3, MobileAuthState arg4, PaymentCompletionRequest arg5, CompletePaymentCallback arg6, boolean arg7) {
        HashMap v0 = new HashMap();
        ((Map)v0).put("Authorization", "Bearer " + arg4.getAccessToken());
        ((Map)v0).put("Content-Type", "application/json");
        ((Map)v0).put("Accept-Type", "application/json");
        CompletePaymentComms v4 = new CompletePaymentComms(arg3, ((Map)v0), arg5, arg6);
        if(arg7) {
            v4.execute(new Void[0]);
        }
        else {
            v4.completePaymentPostAction(v4.completePaymentAction(arg3, ((Map)v0), arg5), arg6);
        }
    }

    public static void fetchCategoriesComms(String arg3, MobileAuthState arg4, float arg5, FetchCategoriesCallback arg6, boolean arg7) {
        HashMap v0 = new HashMap();
        ((Map)v0).put("Authorization", "Bearer " + arg4.getAccessToken());
        ((Map)v0).put("Accept-Resolution", arg5 + ",d=android");
        ((Map)v0).put("Accept-Language", Locale.getDefault().getLanguage());
        FetchCategoriesComms v4 = new FetchCategoriesComms(arg3, ((Map)v0), arg6);
        if(arg7) {
            v4.execute(new Void[0]);
        }
        else {
            v4.fetchCategoriesPostAction(v4.fetchCategoriesAction(arg3, ((Map)v0)), arg6);
        }
    }
}

