package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri$Builder;
import android.net.Uri;
import android.os.Build$VERSION;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider {
    interface PathStrategy {
        File getFileForUri(Uri arg1);

        Uri getUriForFile(File arg1);
    }

    class SimplePathStrategy implements PathStrategy {
        private final String mAuthority;
        private final HashMap mRoots;

        SimplePathStrategy(String arg2) {
            super();
            this.mRoots = new HashMap();
            this.mAuthority = arg2;
        }

        void addRoot(String arg4, File arg5) {
            File v0;
            if(!TextUtils.isEmpty(((CharSequence)arg4))) {
                try {
                    v0 = arg5.getCanonicalFile();
                }
                catch(IOException v4) {
                    StringBuilder v1 = new StringBuilder();
                    v1.append("Failed to resolve canonical path for ");
                    v1.append(arg5);
                    throw new IllegalArgumentException(v1.toString(), ((Throwable)v4));
                }

                this.mRoots.put(arg4, v0);
                return;
            }

            throw new IllegalArgumentException("Name must not be empty");
        }

        public File getFileForUri(Uri arg5) {
            StringBuilder v1_1;
            File v0_1;
            String v0 = arg5.getEncodedPath();
            int v2 = v0.indexOf(0x2F, 1);
            String v3 = Uri.decode(v0.substring(1, v2));
            v0 = Uri.decode(v0.substring(v2 + 1));
            Object v1 = this.mRoots.get(v3);
            if(v1 != null) {
                File v5 = new File(((File)v1), v0);
                try {
                    v0_1 = v5.getCanonicalFile();
                }
                catch(IOException ) {
                    v1_1 = new StringBuilder();
                    v1_1.append("Failed to resolve canonical path for ");
                    v1_1.append(v5);
                    throw new IllegalArgumentException(v1_1.toString());
                }

                if(v0_1.getPath().startsWith(((File)v1).getPath())) {
                    return v0_1;
                }

                throw new SecurityException("Resolved path jumped beyond configured root");
            }

            v1_1 = new StringBuilder();
            v1_1.append("Unable to find configured root for ");
            v1_1.append(arg5);
            throw new IllegalArgumentException(v1_1.toString());
        }

        public Uri getUriForFile(File arg6) {
            StringBuilder v1;
            String v0;
            try {
                v0 = arg6.getCanonicalPath();
            }
            catch(IOException ) {
                v1 = new StringBuilder();
                v1.append("Failed to resolve canonical path for ");
                v1.append(arg6);
                throw new IllegalArgumentException(v1.toString());
            }

            Object v6 = null;
            Iterator v1_1 = this.mRoots.entrySet().iterator();
            while(v1_1.hasNext()) {
                Object v2 = v1_1.next();
                String v3 = ((Map$Entry)v2).getValue().getPath();
                if(!v0.startsWith(v3)) {
                    continue;
                }

                if(v6 != null && v3.length() <= ((Map$Entry)v6).getValue().getPath().length()) {
                    continue;
                }

                v6 = v2;
            }

            if(v6 != null) {
                String v1_2 = ((Map$Entry)v6).getValue().getPath();
                v0 = v1_2.endsWith("/") ? v0.substring(v1_2.length()) : v0.substring(v1_2.length() + 1);
                v1 = new StringBuilder();
                v1.append(Uri.encode(((Map$Entry)v6).getKey()));
                v1.append('/');
                v1.append(Uri.encode(v0, "/"));
                return new Uri$Builder().scheme("content").authority(this.mAuthority).encodedPath(v1.toString()).build();
            }

            v1 = new StringBuilder();
            v1.append("Failed to find configured root that contains ");
            v1.append(v0);
            throw new IllegalArgumentException(v1.toString());
        }
    }

    private static final String ATTR_NAME = "name";
    private static final String ATTR_PATH = "path";
    private static final String[] COLUMNS = null;
    private static final File DEVICE_ROOT = null;
    private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final String TAG_CACHE_PATH = "cache-path";
    private static final String TAG_EXTERNAL = "external-path";
    private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final String TAG_EXTERNAL_FILES = "external-files-path";
    private static final String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final String TAG_FILES_PATH = "files-path";
    private static final String TAG_ROOT_PATH = "root-path";
    private PathStrategy mStrategy;
    @GuardedBy(value="sCache") private static HashMap sCache;

    static {
        FileProvider.COLUMNS = new String[]{"_display_name", "_size"};
        FileProvider.DEVICE_ROOT = new File("/");
        FileProvider.sCache = new HashMap();
    }

    public FileProvider() {
        super();
    }

    public void attachInfo(@NonNull Context arg2, @NonNull ProviderInfo arg3) {
        super.attachInfo(arg2, arg3);
        if(!arg3.exported) {
            if(arg3.grantUriPermissions) {
                this.mStrategy = FileProvider.getPathStrategy(arg2, arg3.authority);
                return;
            }

            throw new SecurityException("Provider must grant uri permissions");
        }

        throw new SecurityException("Provider must not be exported");
    }

    private static File buildPath(File arg4, String[] arg5) {
        int v0 = arg5.length;
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            String v2 = arg5[v1];
            if(v2 != null) {
                arg4 = new File(arg4, v2);
            }
        }

        return arg4;
    }

    private static Object[] copyOf(Object[] arg2, int arg3) {
        Object[] v0 = new Object[arg3];
        System.arraycopy(arg2, 0, v0, 0, arg3);
        return v0;
    }

    private static String[] copyOf(String[] arg2, int arg3) {
        String[] v0 = new String[arg3];
        System.arraycopy(arg2, 0, v0, 0, arg3);
        return v0;
    }

    public int delete(@NonNull Uri arg1, @Nullable String arg2, @Nullable String[] arg3) {
        return this.mStrategy.getFileForUri(arg1).delete();
    }

    private static PathStrategy getPathStrategy(Context arg2, String arg3) {
        PathStrategy v1_1;
        HashMap v0 = FileProvider.sCache;
        __monitor_enter(v0);
        try {
            Object v1 = FileProvider.sCache.get(arg3);
            if(v1 == null) {
                try {
                    v1_1 = FileProvider.parsePathStrategy(arg2, arg3);
                }
                catch(XmlPullParserException v2_1) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", ((Throwable)v2_1));
                }
                catch(IOException v2_2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", ((Throwable)v2_2));
                }

                FileProvider.sCache.put(arg3, v1_1);
            }

            __monitor_exit(v0);
            return v1_1;
        label_22:
            __monitor_exit(v0);
        }
        catch(Throwable v2) {
            goto label_22;
        }

        throw v2;
    }

    public String getType(@NonNull Uri arg3) {
        File v3 = this.mStrategy.getFileForUri(arg3);
        int v0 = v3.getName().lastIndexOf(46);
        if(v0 >= 0) {
            String v3_1 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(v3.getName().substring(v0 + 1));
            if(v3_1 != null) {
                return v3_1;
            }
        }

        return "application/octet-stream";
    }

    public static Uri getUriForFile(@NonNull Context arg0, @NonNull String arg1, @NonNull File arg2) {
        return FileProvider.getPathStrategy(arg0, arg1).getUriForFile(arg2);
    }

    public Uri insert(@NonNull Uri arg1, ContentValues arg2) {
        throw new UnsupportedOperationException("No external inserts");
    }

    private static int modeToMode(String arg3) {
        int v3;
        if("r".equals(arg3)) {
            v3 = 0x10000000;
        }
        else {
            if(!"w".equals(arg3)) {
                if("wt".equals(arg3)) {
                }
                else if("wa".equals(arg3)) {
                    return 0x2A000000;
                }
                else if("rw".equals(arg3)) {
                    return 0x38000000;
                }
                else if("rwt".equals(arg3)) {
                    return 0x3C000000;
                }
                else {
                    StringBuilder v1 = new StringBuilder();
                    v1.append("Invalid mode: ");
                    v1.append(arg3);
                    throw new IllegalArgumentException(v1.toString());
                }
            }

            v3 = 0x2C000000;
        }

        return v3;
    }

    public boolean onCreate() {
        return 1;
    }

    public ParcelFileDescriptor openFile(@NonNull Uri arg2, @NonNull String arg3) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.mStrategy.getFileForUri(arg2), FileProvider.modeToMode(arg3));
    }

    private static PathStrategy parsePathStrategy(Context arg9, String arg10) throws IOException, XmlPullParserException {
        File[] v1_2;
        File v4_1;
        SimplePathStrategy v0 = new SimplePathStrategy(arg10);
        XmlResourceParser v10 = arg9.getPackageManager().resolveContentProvider(arg10, 0x80).loadXmlMetaData(arg9.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if(v10 != null) {
            while(true) {
                int v1 = v10.next();
                if(v1 == 1) {
                    break;
                }

                if(v1 != 2) {
                    continue;
                }

                String v1_1 = v10.getName();
                String v4 = null;
                String v3 = v10.getAttributeValue(v4, "name");
                String v5 = v10.getAttributeValue(v4, "path");
                if("root-path".equals(v1_1)) {
                    v4_1 = FileProvider.DEVICE_ROOT;
                }
                else if("files-path".equals(v1_1)) {
                    v4_1 = arg9.getFilesDir();
                }
                else if("cache-path".equals(v1_1)) {
                    v4_1 = arg9.getCacheDir();
                }
                else if("external-path".equals(v1_1)) {
                    v4_1 = Environment.getExternalStorageDirectory();
                }
                else if("external-files-path".equals(v1_1)) {
                    v1_2 = ContextCompat.getExternalFilesDirs(arg9, v4);
                    if(v1_2.length > 0) {
                        v4_1 = v1_2[0];
                    }
                }
                else if("external-cache-path".equals(v1_1)) {
                    v1_2 = ContextCompat.getExternalCacheDirs(arg9);
                    if(v1_2.length > 0) {
                        v4_1 = v1_2[0];
                    }
                }
                else if(Build$VERSION.SDK_INT >= 21 && ("external-media-path".equals(v1_1))) {
                    v1_2 = arg9.getExternalMediaDirs();
                    if(v1_2.length > 0) {
                        v4_1 = v1_2[0];
                    }
                }

                if(v4_1 == null) {
                    continue;
                }

                v0.addRoot(v3, FileProvider.buildPath(v4_1, new String[]{v5}));
            }

            return ((PathStrategy)v0);
        }

        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    public Cursor query(@NonNull Uri arg6, @Nullable String[] arg7, @Nullable String arg8, @Nullable String[] arg9, @Nullable String arg10) {
        int v2_1;
        File v6 = this.mStrategy.getFileForUri(arg6);
        if(arg7 == null) {
            arg7 = FileProvider.COLUMNS;
        }

        String[] v8 = new String[arg7.length];
        Object[] v9 = new Object[arg7.length];
        int v10 = arg7.length;
        int v0 = 0;
        int v1 = 0;
        while(v0 < v10) {
            String v2 = arg7[v0];
            if("_display_name".equals(v2)) {
                v8[v1] = "_display_name";
                v2_1 = v1 + 1;
                v9[v1] = v6.getName();
                goto label_21;
            }
            else if("_size".equals(v2)) {
                v8[v1] = "_size";
                v2_1 = v1 + 1;
                v9[v1] = Long.valueOf(v6.length());
            label_21:
                v1 = v2_1;
            }

            ++v0;
        }

        String[] v6_1 = FileProvider.copyOf(v8, v1);
        Object[] v7 = FileProvider.copyOf(v9, v1);
        MatrixCursor v8_1 = new MatrixCursor(v6_1, 1);
        v8_1.addRow(v7);
        return ((Cursor)v8_1);
    }

    public int update(@NonNull Uri arg1, ContentValues arg2, @Nullable String arg3, @Nullable String[] arg4) {
        throw new UnsupportedOperationException("No external updates");
    }
}

