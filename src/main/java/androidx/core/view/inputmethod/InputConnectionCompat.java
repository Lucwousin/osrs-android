package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class InputConnectionCompat {
    public interface OnCommitContentListener {
        boolean onCommitContent(InputContentInfoCompat arg1, int arg2, Bundle arg3);
    }

    private static final String COMMIT_CONTENT_ACTION = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final String COMMIT_CONTENT_CONTENT_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final String COMMIT_CONTENT_DESCRIPTION_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final String COMMIT_CONTENT_FLAGS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final String COMMIT_CONTENT_LINK_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final String COMMIT_CONTENT_OPTS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final String COMMIT_CONTENT_RESULT_RECEIVER = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;

    @Deprecated public InputConnectionCompat() {
        super();
    }

    public static boolean commitContent(@NonNull InputConnection arg5, @NonNull EditorInfo arg6, @NonNull InputContentInfoCompat arg7, int arg8, @Nullable Bundle arg9) {
        int v6_1;
        ClipDescription v0 = arg7.getDescription();
        String[] v6 = EditorInfoCompat.getContentMimeTypes(arg6);
        int v1 = v6.length;
        int v3 = 0;
        while(true) {
            if(v3 >= v1) {
                break;
            }
            else if(v0.hasMimeType(v6[v3])) {
                v6_1 = 1;
            }
            else {
                ++v3;
                continue;
            }

            goto label_14;
        }

        v6_1 = 0;
    label_14:
        if(v6_1 == 0) {
            return 0;
        }

        if(Build$VERSION.SDK_INT >= 25) {
            return arg5.commitContent(arg7.unwrap(), arg8, arg9);
        }

        Bundle v6_2 = new Bundle();
        v6_2.putParcelable("androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI", arg7.getContentUri());
        v6_2.putParcelable("androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION", arg7.getDescription());
        v6_2.putParcelable("androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI", arg7.getLinkUri());
        v6_2.putInt("androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS", arg8);
        v6_2.putParcelable("androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS", ((Parcelable)arg9));
        return arg5.performPrivateCommand("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", v6_2);
    }

    @NonNull public static InputConnection createWrapper(@NonNull InputConnection arg3, @NonNull EditorInfo arg4, @NonNull OnCommitContentListener arg5) {
        if(arg3 != null) {
            if(arg4 != null) {
                if(arg5 != null) {
                    if(Build$VERSION.SDK_INT >= 25) {
                        return new InputConnectionWrapper(arg3, false, arg5) {
                            public boolean commitContent(InputContentInfo arg3, int arg4, Bundle arg5) {
                                if(this.val$listener.onCommitContent(InputContentInfoCompat.wrap(arg3), arg4, arg5)) {
                                    return 1;
                                }

                                return super.commitContent(arg3, arg4, arg5);
                            }
                        };
                    }

                    if(EditorInfoCompat.getContentMimeTypes(arg4).length == 0) {
                        return arg3;
                    }

                    return new InputConnectionWrapper(arg3, false, arg5) {
                        public boolean performPrivateCommand(String arg2, Bundle arg3) {
                            if(InputConnectionCompat.handlePerformPrivateCommand(arg2, arg3, this.val$listener)) {
                                return 1;
                            }

                            return super.performPrivateCommand(arg2, arg3);
                        }
                    };
                }

                throw new IllegalArgumentException("onCommitContentListener must be non-null");
            }

            throw new IllegalArgumentException("editorInfo must be non-null");
        }

        throw new IllegalArgumentException("inputConnection must be non-null");
    }

    static boolean handlePerformPrivateCommand(@Nullable String arg7, @NonNull Bundle arg8, @NonNull OnCommitContentListener arg9) {
        boolean v8_1;
        String v2;
        Parcelable v1;
        if(!TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", ((CharSequence)arg7))) {
            return 0;
        }

        if(arg8 == null) {
            return 0;
        }

        Bundle v7 = null;
        try {
            v1 = arg8.getParcelable("androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
        }
        catch(Throwable v8) {
            goto label_29;
        }

        try {
            v2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
            goto label_11;
        }
        catch(Throwable v8) {
        }
        catch(Throwable v8) {
        label_29:
            v1 = ((Parcelable)v7);
            goto label_30;
            try {
            label_11:
                v8_1 = arg9.onCommitContent(new InputContentInfoCompat(arg8.getParcelable(v2), arg8.getParcelable("androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"), arg8.getParcelable("androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI")), arg8.getInt("androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"), arg8.getParcelable("androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"));
                if(v1 == null) {
                    return v8_1;
                }

                goto label_24;
            }
            catch(Throwable v8) {
            }
        }

    label_30:
        if(v1 != null) {
            ((ResultReceiver)v1).send(0, v7);
        }

        throw v8;
    label_24:
        ((ResultReceiver)v1).send(((int)v8_1), v7);
        return v8_1;
    }
}

