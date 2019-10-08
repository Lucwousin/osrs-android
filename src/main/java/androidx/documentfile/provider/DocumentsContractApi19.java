package androidx.documentfile.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(value=19) class DocumentsContractApi19 {
    private static final int FLAG_VIRTUAL_DOCUMENT = 0x200;
    private static final String TAG = "DocumentFile";

    private DocumentsContractApi19() {
        super();
    }

    public static boolean canRead(Context arg3, Uri arg4) {
        if(arg3.checkCallingOrSelfUriPermission(arg4, 1) != 0) {
            return 0;
        }

        if(TextUtils.isEmpty(DocumentsContractApi19.getRawType(arg3, arg4))) {
            return 0;
        }

        return 1;
    }

    public static boolean canWrite(Context arg4, Uri arg5) {
        int v0 = 2;
        if(arg4.checkCallingOrSelfUriPermission(arg5, v0) != 0) {
            return 0;
        }

        String v1 = DocumentsContractApi19.getRawType(arg4, arg5);
        int v4 = DocumentsContractApi19.queryForInt(arg4, arg5, "flags", 0);
        if(TextUtils.isEmpty(((CharSequence)v1))) {
            return 0;
        }

        if((v4 & 4) != 0) {
            return 1;
        }

        if(("vnd.android.document/directory".equals(v1)) && (v4 & 8) != 0) {
            return 1;
        }

        if(!TextUtils.isEmpty(((CharSequence)v1)) && (v4 & v0) != 0) {
            return 1;
        }

        return 0;
    }

    private static void closeQuietly(@Nullable AutoCloseable arg0) {
        if(arg0 != null) {
            try {
                arg0.close();
                return;
            }
            catch(Exception ) {
                return;
            }
            catch(RuntimeException v0) {
                throw v0;
            }
        }
    }

    public static boolean exists(Context arg7, Uri arg8) {
        Cursor v6_1;
        Cursor v8;
        ContentResolver v0 = arg7.getContentResolver();
        boolean v7 = false;
        AutoCloseable v6 = null;
        try {
            v8 = v0.query(arg8, new String[]{"document_id"}, null, null, null);
            goto label_10;
        }
        catch(Throwable v7_1) {
        }
        catch(Exception v0_1) {
            goto label_24;
            try {
            label_10:
                if(v8.getCount() <= 0) {
                    goto label_13;
                }

                goto label_12;
            }
            catch(Throwable v7_1) {
                v6_1 = v8;
            }
            catch(Exception v0_1) {
                v6_1 = v8;
                try {
                label_24:
                    Log.w("DocumentFile", "Failed query: " + v0_1);
                }
                catch(Throwable v7_1) {
                    goto label_34;
                }

                DocumentsContractApi19.closeQuietly(v6);
                return 0;
            }
        }

    label_34:
        DocumentsContractApi19.closeQuietly(v6);
        throw v7_1;
    label_12:
        v7 = true;
    label_13:
        DocumentsContractApi19.closeQuietly(((AutoCloseable)v8));
        return v7;
    }

    public static long getFlags(Context arg3, Uri arg4) {
        return DocumentsContractApi19.queryForLong(arg3, arg4, "flags", 0);
    }

    @Nullable public static String getName(Context arg2, Uri arg3) {
        return DocumentsContractApi19.queryForString(arg2, arg3, "_display_name", null);
    }

    @Nullable private static String getRawType(Context arg2, Uri arg3) {
        return DocumentsContractApi19.queryForString(arg2, arg3, "mime_type", null);
    }

    @Nullable public static String getType(Context arg0, Uri arg1) {
        String v0 = DocumentsContractApi19.getRawType(arg0, arg1);
        if("vnd.android.document/directory".equals(v0)) {
            return null;
        }

        return v0;
    }

    public static boolean isDirectory(Context arg1, Uri arg2) {
        return "vnd.android.document/directory".equals(DocumentsContractApi19.getRawType(arg1, arg2));
    }

    public static boolean isFile(Context arg0, Uri arg1) {
        String v0 = DocumentsContractApi19.getRawType(arg0, arg1);
        if(!"vnd.android.document/directory".equals(v0)) {
            if(TextUtils.isEmpty(((CharSequence)v0))) {
            }
            else {
                return 1;
            }
        }

        return 0;
    }

    public static boolean isVirtual(Context arg4, Uri arg5) {
        boolean v1 = false;
        if(!DocumentsContract.isDocumentUri(arg4, arg5)) {
            return 0;
        }

        if((DocumentsContractApi19.getFlags(arg4, arg5) & 0x200) != 0) {
            v1 = true;
        }

        return v1;
    }

    public static long lastModified(Context arg3, Uri arg4) {
        return DocumentsContractApi19.queryForLong(arg3, arg4, "last_modified", 0);
    }

    public static long length(Context arg3, Uri arg4) {
        return DocumentsContractApi19.queryForLong(arg3, arg4, "_size", 0);
    }

    private static int queryForInt(Context arg2, Uri arg3, String arg4, int arg5) {
        return ((int)DocumentsContractApi19.queryForLong(arg2, arg3, arg4, ((long)arg5)));
    }

    private static long queryForLong(Context arg7, Uri arg8, String arg9, long arg10) {
        Cursor v6_1;
        long v0_1;
        Cursor v8;
        ContentResolver v0 = arg7.getContentResolver();
        AutoCloseable v6 = null;
        try {
            v8 = v0.query(arg8, new String[]{arg9}, null, null, null);
            goto label_11;
        }
        catch(Throwable v7) {
        }
        catch(Exception v7_1) {
            goto label_29;
            try {
            label_11:
                if((v8.moveToFirst()) && !v8.isNull(0)) {
                    v0_1 = v8.getLong(0);
                    goto label_16;
                }

                goto label_18;
            }
            catch(Throwable v7) {
                v6_1 = v8;
            }
            catch(Exception v7_1) {
                v6_1 = v8;
                try {
                label_29:
                    Log.w("DocumentFile", "Failed query: " + v7_1);
                }
                catch(Throwable v7) {
                    goto label_39;
                }

                DocumentsContractApi19.closeQuietly(v6);
                return arg10;
            }
        }

    label_39:
        DocumentsContractApi19.closeQuietly(v6);
        throw v7;
    label_16:
        DocumentsContractApi19.closeQuietly(((AutoCloseable)v8));
        return v0_1;
    label_18:
        DocumentsContractApi19.closeQuietly(((AutoCloseable)v8));
        return arg10;
    }

    @Nullable private static String queryForString(Context arg7, Uri arg8, String arg9, @Nullable String arg10) {
        Cursor v6_1;
        String v7_2;
        Cursor v8;
        ContentResolver v0 = arg7.getContentResolver();
        AutoCloseable v6 = null;
        try {
            v8 = v0.query(arg8, new String[]{arg9}, null, null, null);
            goto label_11;
        }
        catch(Throwable v7) {
        }
        catch(Exception v7_1) {
            goto label_29;
            try {
            label_11:
                if((v8.moveToFirst()) && !v8.isNull(0)) {
                    v7_2 = v8.getString(0);
                    goto label_16;
                }

                goto label_18;
            }
            catch(Throwable v7) {
                v6_1 = v8;
            }
            catch(Exception v7_1) {
                v6_1 = v8;
                try {
                label_29:
                    Log.w("DocumentFile", "Failed query: " + v7_1);
                }
                catch(Throwable v7) {
                    goto label_39;
                }

                DocumentsContractApi19.closeQuietly(v6);
                return arg10;
            }
        }

    label_39:
        DocumentsContractApi19.closeQuietly(v6);
        throw v7;
    label_16:
        DocumentsContractApi19.closeQuietly(((AutoCloseable)v8));
        return v7_2;
    label_18:
        DocumentsContractApi19.closeQuietly(((AutoCloseable)v8));
        return arg10;
    }
}

