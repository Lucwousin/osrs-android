package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.core.R$styleable;
import androidx.core.provider.FontRequest;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class FontResourcesParserCompat {
    public interface FamilyResourceEntry {
    }

    @Retention(value=RetentionPolicy.SOURCE) @public interface FetchStrategy {
    }

    public final class FontFamilyFilesResourceEntry implements FamilyResourceEntry {
        @NonNull private final FontFileResourceEntry[] mEntries;

        public FontFamilyFilesResourceEntry(@NonNull FontFileResourceEntry[] arg1) {
            super();
            this.mEntries = arg1;
        }

        @NonNull public FontFileResourceEntry[] getEntries() {
            return this.mEntries;
        }
    }

    public final class FontFileResourceEntry {
        @NonNull private final String mFileName;
        private boolean mItalic;
        private int mResourceId;
        private int mTtcIndex;
        private String mVariationSettings;
        private int mWeight;

        public FontFileResourceEntry(@NonNull String arg1, int arg2, boolean arg3, @Nullable String arg4, int arg5, int arg6) {
            super();
            this.mFileName = arg1;
            this.mWeight = arg2;
            this.mItalic = arg3;
            this.mVariationSettings = arg4;
            this.mTtcIndex = arg5;
            this.mResourceId = arg6;
        }

        @NonNull public String getFileName() {
            return this.mFileName;
        }

        public int getResourceId() {
            return this.mResourceId;
        }

        public int getTtcIndex() {
            return this.mTtcIndex;
        }

        @Nullable public String getVariationSettings() {
            return this.mVariationSettings;
        }

        public int getWeight() {
            return this.mWeight;
        }

        public boolean isItalic() {
            return this.mItalic;
        }
    }

    public final class ProviderResourceEntry implements FamilyResourceEntry {
        @NonNull private final FontRequest mRequest;
        private final int mStrategy;
        private final int mTimeoutMs;

        public ProviderResourceEntry(@NonNull FontRequest arg1, int arg2, int arg3) {
            super();
            this.mRequest = arg1;
            this.mStrategy = arg2;
            this.mTimeoutMs = arg3;
        }

        public int getFetchStrategy() {
            return this.mStrategy;
        }

        @NonNull public FontRequest getRequest() {
            return this.mRequest;
        }

        public int getTimeout() {
            return this.mTimeoutMs;
        }
    }

    private static final int DEFAULT_TIMEOUT_MILLIS = 500;
    public static final int FETCH_STRATEGY_ASYNC = 1;
    public static final int FETCH_STRATEGY_BLOCKING = 0;
    public static final int INFINITE_TIMEOUT_VALUE = -1;
    private static final int ITALIC = 1;
    private static final int NORMAL_WEIGHT = 400;

    private FontResourcesParserCompat() {
        super();
    }

    private static int getType(TypedArray arg2, int arg3) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.getType(arg3);
        }

        TypedValue v0 = new TypedValue();
        arg2.getValue(arg3, v0);
        return v0.type;
    }

    @Nullable public static FamilyResourceEntry parse(XmlPullParser arg3, Resources arg4) throws XmlPullParserException, IOException {
        while(true) {
            int v0 = arg3.next();
            int v1 = 2;
            if(v0 != v1 && v0 != 1) {
                continue;
            }

            break;
        }

        if(v0 == v1) {
            return FontResourcesParserCompat.readFamilies(arg3, arg4);
        }

        throw new XmlPullParserException("No start tag found");
    }

    public static List readCerts(Resources arg5, @ArrayRes int arg6) {
        ArrayList v1;
        List v5_1;
        if(arg6 == 0) {
            return Collections.emptyList();
        }

        TypedArray v0 = arg5.obtainTypedArray(arg6);
        try {
            if(v0.length() != 0) {
                goto label_9;
            }

            v5_1 = Collections.emptyList();
        }
        catch(Throwable v5) {
            goto label_31;
        }

        v0.recycle();
        return v5_1;
        try {
        label_9:
            v1 = new ArrayList();
            if(FontResourcesParserCompat.getType(v0, 0) == 1) {
                for(arg6 = 0; arg6 < v0.length(); ++arg6) {
                    int v3 = v0.getResourceId(arg6, 0);
                    if(v3 != 0) {
                        ((List)v1).add(FontResourcesParserCompat.toByteArrayList(arg5.getStringArray(v3)));
                    }
                }
            }
            else {
                ((List)v1).add(FontResourcesParserCompat.toByteArrayList(arg5.getStringArray(arg6)));
            }
        }
        catch(Throwable v5) {
        label_31:
            v0.recycle();
            throw v5;
        }

        v0.recycle();
        return ((List)v1);
    }

    @Nullable private static FamilyResourceEntry readFamilies(XmlPullParser arg3, Resources arg4) throws XmlPullParserException, IOException {
        String v1 = null;
        arg3.require(2, v1, "font-family");
        if(arg3.getName().equals("font-family")) {
            return FontResourcesParserCompat.readFamily(arg3, arg4);
        }

        FontResourcesParserCompat.skip(arg3);
        return ((FamilyResourceEntry)v1);
    }

    @Nullable private static FamilyResourceEntry readFamily(XmlPullParser arg8, Resources arg9) throws XmlPullParserException, IOException {
        TypedArray v0 = arg9.obtainAttributes(Xml.asAttributeSet(arg8), R$styleable.FontFamily);
        String v1 = v0.getString(R$styleable.FontFamily_fontProviderAuthority);
        String v2 = v0.getString(R$styleable.FontFamily_fontProviderPackage);
        String v3 = v0.getString(R$styleable.FontFamily_fontProviderQuery);
        int v4 = v0.getResourceId(R$styleable.FontFamily_fontProviderCerts, 0);
        int v5 = v0.getInteger(R$styleable.FontFamily_fontProviderFetchStrategy, 1);
        int v6 = v0.getInteger(R$styleable.FontFamily_fontProviderFetchTimeout, 500);
        v0.recycle();
        int v0_1 = 3;
        if(v1 != null && v2 != null && v3 != null) {
            while(arg8.next() != v0_1) {
                FontResourcesParserCompat.skip(arg8);
            }

            return new ProviderResourceEntry(new FontRequest(v1, v2, v3, FontResourcesParserCompat.readCerts(arg9, v4)), v5, v6);
        }

        ArrayList v1_1 = new ArrayList();
        while(arg8.next() != v0_1) {
            if(arg8.getEventType() != 2) {
                continue;
            }

            if(arg8.getName().equals("font")) {
                ((List)v1_1).add(FontResourcesParserCompat.readFont(arg8, arg9));
                continue;
            }

            FontResourcesParserCompat.skip(arg8);
        }

        if(((List)v1_1).isEmpty()) {
            return null;
        }

        return new FontFamilyFilesResourceEntry(((List)v1_1).toArray(new FontFileResourceEntry[((List)v1_1).size()]));
    }

    private static FontFileResourceEntry readFont(XmlPullParser arg9, Resources arg10) throws XmlPullParserException, IOException {
        TypedArray v10 = arg10.obtainAttributes(Xml.asAttributeSet(arg9), R$styleable.FontFamilyFont);
        int v0 = v10.hasValue(R$styleable.FontFamilyFont_fontWeight) ? R$styleable.FontFamilyFont_fontWeight : R$styleable.FontFamilyFont_android_fontWeight;
        int v4 = v10.getInt(v0, 400);
        v0 = v10.hasValue(R$styleable.FontFamilyFont_fontStyle) ? R$styleable.FontFamilyFont_fontStyle : R$styleable.FontFamilyFont_android_fontStyle;
        boolean v5 = 1 == v10.getInt(v0, 0) ? true : false;
        v0 = v10.hasValue(R$styleable.FontFamilyFont_ttcIndex) ? R$styleable.FontFamilyFont_ttcIndex : R$styleable.FontFamilyFont_android_ttcIndex;
        int v2 = v10.hasValue(R$styleable.FontFamilyFont_fontVariationSettings) ? R$styleable.FontFamilyFont_fontVariationSettings : R$styleable.FontFamilyFont_android_fontVariationSettings;
        String v6 = v10.getString(v2);
        int v7 = v10.getInt(v0, 0);
        v0 = v10.hasValue(R$styleable.FontFamilyFont_font) ? R$styleable.FontFamilyFont_font : R$styleable.FontFamilyFont_android_font;
        int v8 = v10.getResourceId(v0, 0);
        String v3 = v10.getString(v0);
        v10.recycle();
        while(arg9.next() != 3) {
            FontResourcesParserCompat.skip(arg9);
        }

        return new FontFileResourceEntry(v3, v4, v5, v6, v7, v8);
    }

    private static void skip(XmlPullParser arg2) throws XmlPullParserException, IOException {
        int v0;
        for(v0 = 1; v0 > 0; ++v0) {
            switch(arg2.next()) {
                case 2: {
                    goto label_7;
                }
                case 3: {
                    goto label_5;
                }
            }

            continue;
        label_5:
            --v0;
            continue;
        label_7:
        }
    }

    private static List toByteArrayList(String[] arg5) {
        ArrayList v0 = new ArrayList();
        int v1 = arg5.length;
        int v3;
        for(v3 = 0; v3 < v1; ++v3) {
            ((List)v0).add(Base64.decode(arg5[v3], 0));
        }

        return ((List)v0);
    }
}

