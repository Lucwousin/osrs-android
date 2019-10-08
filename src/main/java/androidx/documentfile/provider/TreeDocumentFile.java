package androidx.documentfile.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;

@RequiresApi(value=21) class TreeDocumentFile extends DocumentFile {
    private Context mContext;
    private Uri mUri;

    TreeDocumentFile(@Nullable DocumentFile arg1, Context arg2, Uri arg3) {
        super(arg1);
        this.mContext = arg2;
        this.mUri = arg3;
    }

    public boolean canRead() {
        return DocumentsContractApi19.canRead(this.mContext, this.mUri);
    }

    public boolean canWrite() {
        return DocumentsContractApi19.canWrite(this.mContext, this.mUri);
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

    @Nullable public DocumentFile createDirectory(String arg4) {
        DocumentFile v0_1;
        Uri v4 = TreeDocumentFile.createFile(this.mContext, this.mUri, "vnd.android.document/directory", arg4);
        if(v4 != null) {
            TreeDocumentFile v0 = new TreeDocumentFile(((DocumentFile)this), this.mContext, v4);
        }
        else {
            v0_1 = null;
        }

        return v0_1;
    }

    @Nullable private static Uri createFile(Context arg0, Uri arg1, String arg2, String arg3) {
        try {
            return DocumentsContract.createDocument(arg0.getContentResolver(), arg1, arg2, arg3);
        }
        catch(Exception ) {
            return null;
        }
    }

    @Nullable public DocumentFile createFile(String arg3, String arg4) {
        DocumentFile v4_1;
        Uri v3 = TreeDocumentFile.createFile(this.mContext, this.mUri, arg3, arg4);
        if(v3 != null) {
            TreeDocumentFile v4 = new TreeDocumentFile(((DocumentFile)this), this.mContext, v3);
        }
        else {
            v4_1 = null;
        }

        return v4_1;
    }

    public boolean delete() {
        try {
            return DocumentsContract.deleteDocument(this.mContext.getContentResolver(), this.mUri);
        }
        catch(Exception ) {
            return 0;
        }
    }

    public boolean exists() {
        return DocumentsContractApi19.exists(this.mContext, this.mUri);
    }

    @Nullable public String getName() {
        return DocumentsContractApi19.getName(this.mContext, this.mUri);
    }

    @Nullable public String getType() {
        return DocumentsContractApi19.getType(this.mContext, this.mUri);
    }

    public Uri getUri() {
        return this.mUri;
    }

    public boolean isDirectory() {
        return DocumentsContractApi19.isDirectory(this.mContext, this.mUri);
    }

    public boolean isFile() {
        return DocumentsContractApi19.isFile(this.mContext, this.mUri);
    }

    public boolean isVirtual() {
        return DocumentsContractApi19.isVirtual(this.mContext, this.mUri);
    }

    public long lastModified() {
        return DocumentsContractApi19.lastModified(this.mContext, this.mUri);
    }

    public long length() {
        return DocumentsContractApi19.length(this.mContext, this.mUri);
    }

    public DocumentFile[] listFiles() {
        Cursor v8_1;
        Cursor v1_1;
        ContentResolver v1 = this.mContext.getContentResolver();
        Uri v2 = DocumentsContract.buildChildDocumentsUriUsingTree(this.mUri, DocumentsContract.getDocumentId(this.mUri));
        ArrayList v0 = new ArrayList();
        int v7 = 0;
        AutoCloseable v8 = null;
        try {
            v1_1 = v1.query(v2, new String[]{"document_id"}, null, null, null);
            goto label_16;
        }
        catch(Throwable v0_1) {
        }
        catch(Exception v2_1) {
            goto label_34;
            try {
            label_16:
                while(v1_1.moveToNext()) {
                    v0.add(DocumentsContract.buildDocumentUriUsingTree(this.mUri, v1_1.getString(0)));
                }
            }
            catch(Throwable v0_1) {
                v8_1 = v1_1;
                goto label_58;
            }
            catch(Exception v2_1) {
                v8_1 = v1_1;
                goto label_34;
            }

            TreeDocumentFile.closeQuietly(((AutoCloseable)v1_1));
            goto label_43;
            try {
            label_34:
                Log.w("DocumentFile", "Failed query: " + v2_1);
            }
            catch(Throwable v0_1) {
                goto label_58;
            }
        }

        TreeDocumentFile.closeQuietly(v8);
        goto label_43;
    label_58:
        TreeDocumentFile.closeQuietly(v8);
        throw v0_1;
    label_43:
        Object[] v0_2 = v0.toArray(new Uri[v0.size()]);
        DocumentFile[] v1_2 = new DocumentFile[v0_2.length];
        while(v7 < v0_2.length) {
            v1_2[v7] = new TreeDocumentFile(((DocumentFile)this), this.mContext, v0_2[v7]);
            ++v7;
        }

        return v1_2;
    }

    public boolean renameTo(String arg4) {
        try {
            Uri v4 = DocumentsContract.renameDocument(this.mContext.getContentResolver(), this.mUri, arg4);
            if(v4 == null) {
                return 0;
            }

            this.mUri = v4;
            return 1;
        }
        catch(Exception ) {
            return 0;
        }

        return 0;
    }
}

