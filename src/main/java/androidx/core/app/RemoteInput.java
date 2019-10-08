package androidx.core.app;

import android.app.RemoteInput$Builder;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;
import java.util.Set;

public final class RemoteInput {
    public final class Builder {
        private boolean mAllowFreeFormTextInput;
        private final Set mAllowedDataTypes;
        private CharSequence[] mChoices;
        private final Bundle mExtras;
        private CharSequence mLabel;
        private final String mResultKey;

        public Builder(@NonNull String arg2) {
            super();
            this.mAllowedDataTypes = new HashSet();
            this.mExtras = new Bundle();
            this.mAllowFreeFormTextInput = true;
            if(arg2 != null) {
                this.mResultKey = arg2;
                return;
            }

            throw new IllegalArgumentException("Result key can\'t be null");
        }

        @NonNull public Builder addExtras(@NonNull Bundle arg2) {
            if(arg2 != null) {
                this.mExtras.putAll(arg2);
            }

            return this;
        }

        @NonNull public RemoteInput build() {
            return new RemoteInput(this.mResultKey, this.mLabel, this.mChoices, this.mAllowFreeFormTextInput, this.mExtras, this.mAllowedDataTypes);
        }

        @NonNull public Bundle getExtras() {
            return this.mExtras;
        }

        @NonNull public Builder setAllowDataType(@NonNull String arg1, boolean arg2) {
            if(arg2) {
                this.mAllowedDataTypes.add(arg1);
            }
            else {
                this.mAllowedDataTypes.remove(arg1);
            }

            return this;
        }

        @NonNull public Builder setAllowFreeFormInput(boolean arg1) {
            this.mAllowFreeFormTextInput = arg1;
            return this;
        }

        @NonNull public Builder setChoices(@Nullable CharSequence[] arg1) {
            this.mChoices = arg1;
            return this;
        }

        @NonNull public Builder setLabel(@Nullable CharSequence arg1) {
            this.mLabel = arg1;
            return this;
        }
    }

    private static final String EXTRA_DATA_TYPE_RESULTS_DATA = "android.remoteinput.dataTypeResultsData";
    public static final String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
    public static final String RESULTS_CLIP_LABEL = "android.remoteinput.results";
    private static final String TAG = "RemoteInput";
    private final boolean mAllowFreeFormTextInput;
    private final Set mAllowedDataTypes;
    private final CharSequence[] mChoices;
    private final Bundle mExtras;
    private final CharSequence mLabel;
    private final String mResultKey;

    RemoteInput(String arg1, CharSequence arg2, CharSequence[] arg3, boolean arg4, Bundle arg5, Set arg6) {
        super();
        this.mResultKey = arg1;
        this.mLabel = arg2;
        this.mChoices = arg3;
        this.mAllowFreeFormTextInput = arg4;
        this.mExtras = arg5;
        this.mAllowedDataTypes = arg6;
    }

    public static void addDataResultToIntent(RemoteInput arg5, Intent arg6, Map arg7) {
        if(Build$VERSION.SDK_INT >= 26) {
            android.app.RemoteInput.addDataResultToIntent(RemoteInput.fromCompat(arg5), arg6, arg7);
        }
        else if(Build$VERSION.SDK_INT >= 16) {
            Intent v0 = RemoteInput.getClipDataIntentFromIntent(arg6);
            if(v0 == null) {
                v0 = new Intent();
            }

            Iterator v7 = arg7.entrySet().iterator();
            while(v7.hasNext()) {
                Object v1 = v7.next();
                Object v2 = ((Map$Entry)v1).getKey();
                v1 = ((Map$Entry)v1).getValue();
                if(v2 == null) {
                    continue;
                }

                Bundle v3 = v0.getBundleExtra(RemoteInput.getExtraResultsKeyForData(((String)v2)));
                if(v3 == null) {
                    v3 = new Bundle();
                }

                v3.putString(arg5.getResultKey(), ((Uri)v1).toString());
                v0.putExtra(RemoteInput.getExtraResultsKeyForData(((String)v2)), v3);
            }

            arg6.setClipData(ClipData.newIntent("android.remoteinput.results", v0));
        }
        else {
            Log.w("RemoteInput", "RemoteInput is only supported from API Level 16");
        }
    }

    public static void addResultsToIntent(RemoteInput[] arg7, Intent arg8, Bundle arg9) {
        if(Build$VERSION.SDK_INT >= 26) {
            android.app.RemoteInput.addResultsToIntent(RemoteInput.fromCompat(arg7), arg8, arg9);
        }
        else {
            int v2 = 0;
            if(Build$VERSION.SDK_INT >= 20) {
                Bundle v0 = RemoteInput.getResultsFromIntent(arg8);
                if(v0 == null) {
                }
                else {
                    v0.putAll(arg9);
                    arg9 = v0;
                }

                int v0_1 = arg7.length;
                int v1;
                for(v1 = 0; v1 < v0_1; ++v1) {
                    RemoteInput v3 = arg7[v1];
                    Map v4 = RemoteInput.getDataResultsFromIntent(arg8, v3.getResultKey());
                    android.app.RemoteInput.addResultsToIntent(RemoteInput.fromCompat(new RemoteInput[]{v3}), arg8, arg9);
                    if(v4 != null) {
                        RemoteInput.addDataResultToIntent(v3, arg8, v4);
                    }
                }
            }
            else {
                if(Build$VERSION.SDK_INT >= 16) {
                    Intent v0_2 = RemoteInput.getClipDataIntentFromIntent(arg8);
                    if(v0_2 == null) {
                        v0_2 = new Intent();
                    }

                    Bundle v1_1 = v0_2.getBundleExtra("android.remoteinput.resultsData");
                    if(v1_1 == null) {
                        v1_1 = new Bundle();
                    }

                    int v3_1 = arg7.length;
                    while(v2 < v3_1) {
                        RemoteInput v4_1 = arg7[v2];
                        Object v5 = arg9.get(v4_1.getResultKey());
                        if((v5 instanceof CharSequence)) {
                            v1_1.putCharSequence(v4_1.getResultKey(), ((CharSequence)v5));
                        }

                        ++v2;
                    }

                    v0_2.putExtra("android.remoteinput.resultsData", v1_1);
                    arg8.setClipData(ClipData.newIntent("android.remoteinput.results", v0_2));
                    return;
                }

                Log.w("RemoteInput", "RemoteInput is only supported from API Level 16");
            }
        }
    }

    @RequiresApi(value=20) static android.app.RemoteInput[] fromCompat(RemoteInput[] arg3) {
        if(arg3 == null) {
            return null;
        }

        android.app.RemoteInput[] v0 = new android.app.RemoteInput[arg3.length];
        int v1;
        for(v1 = 0; v1 < arg3.length; ++v1) {
            v0[v1] = RemoteInput.fromCompat(arg3[v1]);
        }

        return v0;
    }

    @RequiresApi(value=20) static android.app.RemoteInput fromCompat(RemoteInput arg2) {
        return new RemoteInput$Builder(arg2.getResultKey()).setLabel(arg2.getLabel()).setChoices(arg2.getChoices()).setAllowFreeFormInput(arg2.getAllowFreeFormInput()).addExtras(arg2.getExtras()).build();
    }

    public boolean getAllowFreeFormInput() {
        return this.mAllowFreeFormTextInput;
    }

    public Set getAllowedDataTypes() {
        return this.mAllowedDataTypes;
    }

    public CharSequence[] getChoices() {
        return this.mChoices;
    }

    @RequiresApi(value=16) private static Intent getClipDataIntentFromIntent(Intent arg3) {
        ClipData v3 = arg3.getClipData();
        Intent v0 = null;
        if(v3 == null) {
            return v0;
        }

        ClipDescription v1 = v3.getDescription();
        if(!v1.hasMimeType("text/vnd.android.intent")) {
            return v0;
        }

        if(!v1.getLabel().equals("android.remoteinput.results")) {
            return v0;
        }

        return v3.getItemAt(0).getIntent();
    }

    public static Map getDataResultsFromIntent(Intent arg6, String arg7) {
        if(Build$VERSION.SDK_INT >= 26) {
            return android.app.RemoteInput.getDataResultsFromIntent(arg6, arg7);
        }

        Map v2 = null;
        if(Build$VERSION.SDK_INT >= 16) {
            arg6 = RemoteInput.getClipDataIntentFromIntent(arg6);
            if(arg6 == null) {
                return v2;
            }

            HashMap v0 = new HashMap();
            Iterator v1 = arg6.getExtras().keySet().iterator();
            while(v1.hasNext()) {
                Object v3 = v1.next();
                if(!((String)v3).startsWith("android.remoteinput.dataTypeResultsData")) {
                    continue;
                }

                String v4 = ((String)v3).substring("android.remoteinput.dataTypeResultsData".length());
                if(v4.isEmpty()) {
                    continue;
                }

                String v3_1 = arg6.getBundleExtra(((String)v3)).getString(arg7);
                if(v3_1 == null) {
                    continue;
                }

                if(v3_1.isEmpty()) {
                    continue;
                }

                ((Map)v0).put(v4, Uri.parse(v3_1));
            }

            if(((Map)v0).isEmpty()) {
                Map v0_1 = v2;
            }

            return ((Map)v0);
        }

        Log.w("RemoteInput", "RemoteInput is only supported from API Level 16");
        return v2;
    }

    private static String getExtraResultsKeyForData(String arg2) {
        return "android.remoteinput.dataTypeResultsData" + arg2;
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public CharSequence getLabel() {
        return this.mLabel;
    }

    public String getResultKey() {
        return this.mResultKey;
    }

    public static Bundle getResultsFromIntent(Intent arg3) {
        if(Build$VERSION.SDK_INT >= 20) {
            return android.app.RemoteInput.getResultsFromIntent(arg3);
        }

        Bundle v2 = null;
        if(Build$VERSION.SDK_INT >= 16) {
            arg3 = RemoteInput.getClipDataIntentFromIntent(arg3);
            if(arg3 == null) {
                return v2;
            }

            return arg3.getExtras().getParcelable("android.remoteinput.resultsData");
        }

        Log.w("RemoteInput", "RemoteInput is only supported from API Level 16");
        return v2;
    }

    public boolean isDataOnly() {
        boolean v0;
        if(!this.getAllowFreeFormInput()) {
            if(this.getChoices() != null && this.getChoices().length != 0) {
                goto label_14;
            }

            if(this.getAllowedDataTypes() == null) {
                goto label_14;
            }

            if(this.getAllowedDataTypes().isEmpty()) {
                goto label_14;
            }

            v0 = true;
        }
        else {
        label_14:
            v0 = false;
        }

        return v0;
    }
}

