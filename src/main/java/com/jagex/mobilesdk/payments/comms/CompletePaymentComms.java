package com.jagex.mobilesdk.payments.comms;

import android.os.AsyncTask;
import com.google.gson.Gson;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.payments.model.PaymentCompletionRequest;
import com.jagex.mobilesdk.payments.model.PaymentCompletionResponse;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;
import java.util.Set;

public class CompletePaymentComms extends AsyncTask {
    public interface CompletePaymentCallback {
        void onCompletePaymentResult(CommsResult arg1, Exception arg2);
    }

    PaymentCompletionRequest body;
    private CompletePaymentCallback callback;
    private Exception exception;
    private Map headers;
    private int responseCode;
    private String url;

    CompletePaymentComms(String arg2, Map arg3, PaymentCompletionRequest arg4, CompletePaymentCallback arg5) {
        super();
        this.responseCode = 0;
        this.url = arg2;
        this.headers = arg3;
        this.body = arg4;
        this.callback = arg5;
    }

    public PaymentCompletionResponse completePaymentAction(String arg4, Map arg5, PaymentCompletionRequest arg6) {
        Object v5_6;
        StringBuilder v6;
        BufferedReader v5_5;
        Set v5_2;
        URLConnection v4;
        PaymentCompletionResponse v0 = null;
        try {
            v4 = new URL(arg4).openConnection();
        }
        catch(Exception v5) {
            goto label_67;
        }
        catch(Throwable v5_1) {
            goto label_64;
        }

        try {
            v5_2 = arg5.entrySet();
            goto label_5;
        }
        catch(Throwable v5_1) {
        }
        catch(Exception v5) {
        label_62:
            try {
            label_68:
                this.exception = v5;
                if(v4 == null) {
                    return v0;
                }
            }
            catch(Throwable v5_1) {
                goto label_73;
            }

        label_70:
            ((HttpURLConnection)v4).disconnect();
            return v0;
        }
        catch(Throwable v5_1) {
        label_64:
            v4 = ((URLConnection)v0);
            goto label_73;
            try {
            label_5:
                Iterator v5_3 = v5_2.iterator();
                while(v5_3.hasNext()) {
                    Object v1 = v5_3.next();
                    ((HttpURLConnection)v4).setRequestProperty(((Map$Entry)v1).getKey(), ((Map$Entry)v1).getValue());
                }

                String v5_4 = new Gson().toJson(arg6);
                ((HttpURLConnection)v4).setRequestMethod("POST");
                ((HttpURLConnection)v4).setDoOutput(true);
                ((HttpURLConnection)v4).getOutputStream().write(v5_4.getBytes("UTF-8"));
                ((HttpURLConnection)v4).connect();
                this.responseCode = ((HttpURLConnection)v4).getResponseCode();
                if(this.responseCode == 200) {
                    v5_5 = new BufferedReader(new InputStreamReader(((HttpURLConnection)v4).getInputStream()));
                    v6 = new StringBuilder();
                    goto label_37;
                }

                this.exception = new Exception("Invalid HTTP Response");
                if(v4 == null) {
                    return v0;
                }
            }
            catch(Exception v5) {
                goto label_62;
            }
            catch(Throwable v5_1) {
                goto label_73;
            }

            goto label_70;
            try {
                while(true) {
                label_37:
                    String v1_1 = v5_5.readLine();
                    if(v1_1 == null) {
                        break;
                    }

                    v6.append(v1_1 + '\n');
                }

                v5_6 = new Gson().fromJson(v6.toString(), PaymentCompletionResponse.class);
                if(v4 != null) {
                    goto label_53;
                }

                goto label_54;
            }
            catch(Exception v5) {
                goto label_62;
            }
            catch(Throwable v5_1) {
                goto label_73;
            }

        label_53:
            ((HttpURLConnection)v4).disconnect();
        label_54:
            return ((PaymentCompletionResponse)v5_6);
        }
        catch(Exception v5) {
        label_67:
            v4 = ((URLConnection)v0);
            goto label_68;
        }

    label_73:
        if(v4 != null) {
            ((HttpURLConnection)v4).disconnect();
        }

        throw v5_1;
    }

    public void completePaymentPostAction(PaymentCompletionResponse arg3, CompletePaymentCallback arg4) {
        arg4.onCompletePaymentResult(new CommsResult(arg3, this.responseCode), this.exception);
    }

    protected PaymentCompletionResponse doInBackground(Void[] arg3) {
        return this.completePaymentAction(this.url, this.headers, this.body);
    }

    protected Object doInBackground(Object[] arg1) {
        return this.doInBackground(((Void[])arg1));
    }

    protected void onPostExecute(PaymentCompletionResponse arg2) {
        this.completePaymentPostAction(arg2, this.callback);
    }

    protected void onPostExecute(Object arg1) {
        this.onPostExecute(((PaymentCompletionResponse)arg1));
    }
}

