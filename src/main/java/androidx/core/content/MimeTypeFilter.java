package androidx.core.content;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public final class MimeTypeFilter {
    private MimeTypeFilter() {
        super();
    }

    @Nullable public static String matches(@Nullable String arg5, @NonNull String[] arg6) {
        String v0 = null;
        if(arg5 == null) {
            return v0;
        }

        String[] v5 = arg5.split("/");
        int v1 = arg6.length;
        int v2;
        for(v2 = 0; v2 < v1; ++v2) {
            String v3 = arg6[v2];
            if(MimeTypeFilter.mimeTypeAgainstFilter(v5, v3.split("/"))) {
                return v3;
            }
        }

        return v0;
    }

    @Nullable public static String matches(@Nullable String[] arg5, @NonNull String arg6) {
        String v0 = null;
        if(arg5 == null) {
            return v0;
        }

        String[] v6 = arg6.split("/");
        int v1 = arg5.length;
        int v2;
        for(v2 = 0; v2 < v1; ++v2) {
            String v3 = arg5[v2];
            if(MimeTypeFilter.mimeTypeAgainstFilter(v3.split("/"), v6)) {
                return v3;
            }
        }

        return v0;
    }

    public static boolean matches(@Nullable String arg1, @NonNull String arg2) {
        if(arg1 == null) {
            return 0;
        }

        return MimeTypeFilter.mimeTypeAgainstFilter(arg1.split("/"), arg2.split("/"));
    }

    @NonNull public static String[] matchesMany(@Nullable String[] arg5, @NonNull String arg6) {
        int v0 = 0;
        if(arg5 == null) {
            return new String[0];
        }

        ArrayList v1 = new ArrayList();
        String[] v6 = arg6.split("/");
        int v2 = arg5.length;
        while(v0 < v2) {
            String v3 = arg5[v0];
            if(MimeTypeFilter.mimeTypeAgainstFilter(v3.split("/"), v6)) {
                v1.add(v3);
            }

            ++v0;
        }

        return v1.toArray(new String[v1.size()]);
    }

    private static boolean mimeTypeAgainstFilter(@NonNull String[] arg4, @NonNull String[] arg5) {
        int v1 = 2;
        if(arg5.length == v1) {
            if(!arg5[0].isEmpty() && !arg5[1].isEmpty()) {
                if(arg4.length != v1) {
                    return 0;
                }
                else {
                    if(!"*".equals(arg5[0]) && !arg5[0].equals(arg4[0])) {
                        return 0;
                    }

                    if(!"*".equals(arg5[1]) && !arg5[1].equals(arg4[1])) {
                        return 0;
                    }

                    return 1;
                }
            }

            throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
        }

        throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
    }
}

