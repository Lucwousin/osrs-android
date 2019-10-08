package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import android.os.Build$VERSION;
import android.provider.DocumentsContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

public abstract class DocumentFile {
    static final String TAG = "DocumentFile";
    @Nullable private final DocumentFile mParent;

    DocumentFile(@Nullable DocumentFile arg1) {
        super();
        this.mParent = arg1;
    }

    public abstract boolean canRead();

    public abstract boolean canWrite();

    @Nullable public abstract DocumentFile createDirectory(@NonNull String arg1);

    @Nullable public abstract DocumentFile createFile(@NonNull String arg1, @NonNull String arg2);

    public abstract boolean delete();

    public abstract boolean exists();

    @Nullable public DocumentFile findFile(@NonNull String arg6) {
        DocumentFile[] v0 = this.listFiles();
        int v1 = v0.length;
        int v2;
        for(v2 = 0; v2 < v1; ++v2) {
            DocumentFile v3 = v0[v2];
            if(arg6.equals(v3.getName())) {
                return v3;
            }
        }

        return null;
    }

    @NonNull public static DocumentFile fromFile(@NonNull File arg2) {
        return new RawDocumentFile(null, arg2);
    }

    @Nullable public static DocumentFile fromSingleUri(@NonNull Context arg3, @NonNull Uri arg4) {
        DocumentFile v1 = null;
        if(Build$VERSION.SDK_INT >= 19) {
            return new SingleDocumentFile(v1, arg3, arg4);
        }

        return v1;
    }

    @Nullable public static DocumentFile fromTreeUri(@NonNull Context arg3, @NonNull Uri arg4) {
        DocumentFile v1 = null;
        if(Build$VERSION.SDK_INT >= 21) {
            return new TreeDocumentFile(v1, arg3, DocumentsContract.buildDocumentUriUsingTree(arg4, DocumentsContract.getTreeDocumentId(arg4)));
        }

        return v1;
    }

    @Nullable public abstract String getName();

    @Nullable public DocumentFile getParentFile() {
        return this.mParent;
    }

    @Nullable public abstract String getType();

    @NonNull public abstract Uri getUri();

    public abstract boolean isDirectory();

    public static boolean isDocumentUri(@NonNull Context arg2, @Nullable Uri arg3) {
        if(Build$VERSION.SDK_INT >= 19) {
            return DocumentsContract.isDocumentUri(arg2, arg3);
        }

        return 0;
    }

    public abstract boolean isFile();

    public abstract boolean isVirtual();

    public abstract long lastModified();

    public abstract long length();

    @NonNull public abstract DocumentFile[] listFiles();

    public abstract boolean renameTo(@NonNull String arg1);
}

