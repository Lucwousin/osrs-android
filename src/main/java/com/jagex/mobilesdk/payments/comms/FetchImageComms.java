package com.jagex.mobilesdk.payments.comms;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import com.jagex.mobilesdk.common.comms.CommsResult;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class FetchImageComms extends AsyncTask {
    public interface FetchImageCallback {
        void onFetchImageResult(CommsResult arg1, Exception arg2);
    }

    private FetchImageCallback callback;
    private Exception exception;
    private int responseCode;
    private String url;

    FetchImageComms(String arg2, FetchImageCallback arg3) {
        super();
        this.responseCode = 0;
        this.url = arg2;
        this.callback = arg3;
    }

    protected Bitmap doInBackground(Void[] arg1) {
        return this.fetchImageAction(this.url);
    }

    protected Object doInBackground(Object[] arg1) {
        return this.doInBackground(((Void[])arg1));
    }

    public Bitmap fetchImageAction(String arg5) {
        Bitmap v1_3;
        String v1_1;
        URLConnection v5_1;
        Bitmap v0 = null;
        try {
            v5_1 = new URL(arg5).openConnection();
        }
        catch(Exception v1) {
            goto label_28;
        }
        catch(Throwable v5) {
            goto label_23;
        }

        try {
            v1_1 = "GET";
            goto label_5;
        }
        catch(Throwable v0_1) {
        }
        catch(Exception v1) {
        }
        catch(Throwable v5) {
        label_23:
            Bitmap v3 = v0;
            v0_1 = v5;
            v5_1 = ((URLConnection)v3);
            goto label_34;
            try {
            label_5:
                ((HttpURLConnection)v5_1).setRequestMethod(v1_1);
                ((HttpURLConnection)v5_1).connect();
                this.responseCode = ((HttpURLConnection)v5_1).getResponseCode();
                if(this.responseCode == 200) {
                    InputStream v1_2 = ((HttpURLConnection)v5_1).getInputStream();
                    if(v1_2 != null) {
                        v1_3 = BitmapFactory.decodeStream(v1_2);
                        if(v5_1 == null) {
                            return v1_3;
                        }

                        goto label_16;
                    }
                }

                goto label_18;
            }
            catch(Throwable v0_1) {
            }
            catch(Exception v1) {
                try {
                label_29:
                    this.exception = v1;
                    if(v5_1 == null) {
                        return v0;
                    }

                    goto label_31;
                }
                catch(Throwable v0_1) {
                }
            }
        }
        catch(Exception v1) {
        label_28:
            v5_1 = ((URLConnection)v0);
            goto label_29;
        }

    label_34:
        if(v5_1 != null) {
            ((HttpURLConnection)v5_1).disconnect();
        }

        throw v0_1;
    label_16:
        ((HttpURLConnection)v5_1).disconnect();
        return v1_3;
    label_18:
        if(v5_1 != null) {
        label_31:
            ((HttpURLConnection)v5_1).disconnect();
        }

        return v0;
    }

    public void fetchImagePostAction(Bitmap arg3, FetchImageCallback arg4) {
        arg4.onFetchImageResult(new CommsResult(arg3, this.responseCode), this.exception);
    }

    protected void onPostExecute(Bitmap arg2) {
        this.fetchImagePostAction(arg2, this.callback);
    }

    protected void onPostExecute(Object arg1) {
        this.onPostExecute(((Bitmap)arg1));
    }
}

