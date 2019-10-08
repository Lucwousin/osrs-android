package androidx.core.content.res;

import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.core.R$styleable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo(value={Scope.LIBRARY_GROUP}) final class GradientColorInflaterCompat {
    final class ColorStops {
        final int[] mColors;
        final float[] mOffsets;

        ColorStops(@ColorInt int arg4, @ColorInt int arg5, @ColorInt int arg6) {
            super();
            this.mColors = new int[]{arg4, arg5, arg6};
            this.mOffsets = new float[]{0f, 0.5f, 1f};
        }

        ColorStops(@ColorInt int arg4, @ColorInt int arg5) {
            super();
            this.mColors = new int[]{arg4, arg5};
            this.mOffsets = new float[]{0f, 1f};
        }

        ColorStops(@NonNull List arg5, @NonNull List arg6) {
            super();
            int v0 = arg5.size();
            this.mColors = new int[v0];
            this.mOffsets = new float[v0];
            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                this.mColors[v1] = arg5.get(v1).intValue();
                this.mOffsets[v1] = arg6.get(v1).floatValue();
            }
        }
    }

    private static final int TILE_MODE_CLAMP = 0;
    private static final int TILE_MODE_MIRROR = 2;
    private static final int TILE_MODE_REPEAT = 1;

    private GradientColorInflaterCompat() {
        super();
    }

    private static ColorStops checkColors(@Nullable ColorStops arg0, @ColorInt int arg1, @ColorInt int arg2, boolean arg3, @ColorInt int arg4) {
        if(arg0 != null) {
            return arg0;
        }

        if(arg3) {
            return new ColorStops(arg1, arg4, arg2);
        }

        return new ColorStops(arg1, arg2);
    }

    static Shader createFromXml(@NonNull Resources arg4, @NonNull XmlPullParser arg5, @Nullable Resources$Theme arg6) throws XmlPullParserException, IOException {
        AttributeSet v0 = Xml.asAttributeSet(arg5);
        while(true) {
            int v1 = arg5.next();
            int v2 = 2;
            if(v1 != v2 && v1 != 1) {
                continue;
            }

            break;
        }

        if(v1 == v2) {
            return GradientColorInflaterCompat.createFromXmlInner(arg4, arg5, v0, arg6);
        }

        throw new XmlPullParserException("No start tag found");
    }

    static Shader createFromXmlInner(@NonNull Resources arg21, @NonNull XmlPullParser arg22, @NonNull AttributeSet arg23, @Nullable Resources$Theme arg24) throws IOException, XmlPullParserException {
        XmlPullParser v0 = arg22;
        String v1 = arg22.getName();
        if(!v1.equals("gradient")) {
            goto label_85;
        }

        TypedArray v1_1 = TypedArrayUtils.obtainAttributes(arg21, arg24, arg23, R$styleable.GradientColor);
        float v9 = TypedArrayUtils.getNamedFloat(v1_1, v0, "startX", R$styleable.GradientColor_android_startX, 0f);
        float v10 = TypedArrayUtils.getNamedFloat(v1_1, v0, "startY", R$styleable.GradientColor_android_startY, 0f);
        float v11 = TypedArrayUtils.getNamedFloat(v1_1, v0, "endX", R$styleable.GradientColor_android_endX, 0f);
        float v12 = TypedArrayUtils.getNamedFloat(v1_1, v0, "endY", R$styleable.GradientColor_android_endY, 0f);
        float v14 = TypedArrayUtils.getNamedFloat(v1_1, v0, "centerX", R$styleable.GradientColor_android_centerX, 0f);
        float v15 = TypedArrayUtils.getNamedFloat(v1_1, v0, "centerY", R$styleable.GradientColor_android_centerY, 0f);
        int v5 = TypedArrayUtils.getNamedInt(v1_1, v0, "type", R$styleable.GradientColor_android_type, 0);
        int v6 = TypedArrayUtils.getNamedColor(v1_1, v0, "startColor", R$styleable.GradientColor_android_startColor, 0);
        boolean v13 = TypedArrayUtils.hasAttribute(v0, "centerColor");
        int v2 = TypedArrayUtils.getNamedColor(v1_1, v0, "centerColor", R$styleable.GradientColor_android_centerColor, 0);
        int v3 = TypedArrayUtils.getNamedColor(v1_1, v0, "endColor", R$styleable.GradientColor_android_endColor, 0);
        int v4 = TypedArrayUtils.getNamedInt(v1_1, v0, "tileMode", R$styleable.GradientColor_android_tileMode, 0);
        float v20 = v12;
        float v16 = TypedArrayUtils.getNamedFloat(v1_1, v0, "gradientRadius", R$styleable.GradientColor_android_gradientRadius, 0f);
        v1_1.recycle();
        ColorStops v0_1 = GradientColorInflaterCompat.checkColors(GradientColorInflaterCompat.inflateChildElements(arg21, arg22, arg23, arg24), v6, v3, v13, v2);
        switch(v5) {
            case 1: {
                goto label_70;
            }
            case 2: {
                goto label_65;
            }
        }

        return new LinearGradient(v9, v10, v11, v20, v0_1.mColors, v0_1.mOffsets, GradientColorInflaterCompat.parseTileMode(v4));
    label_65:
        return new SweepGradient(v14, v15, v0_1.mColors, v0_1.mOffsets);
    label_70:
        if(v16 > 0f) {
            return new RadialGradient(v14, v15, v16, v0_1.mColors, v0_1.mOffsets, GradientColorInflaterCompat.parseTileMode(v4));
        }

        throw new XmlPullParserException("<gradient> tag requires \'gradientRadius\' attribute with radial type");
    label_85:
        StringBuilder v3_1 = new StringBuilder();
        v3_1.append(arg22.getPositionDescription());
        v3_1.append(": invalid gradient color tag ");
        v3_1.append(v1);
        throw new XmlPullParserException(v3_1.toString());
    }

    private static ColorStops inflateChildElements(@NonNull Resources arg8, @NonNull XmlPullParser arg9, @NonNull AttributeSet arg10, @Nullable Resources$Theme arg11) throws XmlPullParserException, IOException {
        int v0 = arg9.getDepth() + 1;
        ArrayList v2 = new ArrayList(20);
        ArrayList v4 = new ArrayList(20);
        while(true) {
            int v3 = arg9.next();
            if(v3 != 1) {
                int v5 = arg9.getDepth();
                if(v5 < v0 && v3 == 3) {
                    goto label_55;
                }

                if(v3 != 2) {
                    continue;
                }

                if(v5 > v0) {
                    continue;
                }

                if(!arg9.getName().equals("item")) {
                    continue;
                }

                TypedArray v3_1 = TypedArrayUtils.obtainAttributes(arg8, arg11, arg10, R$styleable.GradientColorItem);
                boolean v5_1 = v3_1.hasValue(R$styleable.GradientColorItem_android_color);
                boolean v6 = v3_1.hasValue(R$styleable.GradientColorItem_android_offset);
                if((v5_1) && (v6)) {
                    v5 = v3_1.getColor(R$styleable.GradientColorItem_android_color, 0);
                    float v6_1 = v3_1.getFloat(R$styleable.GradientColorItem_android_offset, 0f);
                    v3_1.recycle();
                    ((List)v4).add(Integer.valueOf(v5));
                    ((List)v2).add(Float.valueOf(v6_1));
                    continue;
                }

                break;
            }

            goto label_55;
        }

        StringBuilder v10 = new StringBuilder();
        v10.append(arg9.getPositionDescription());
        v10.append(": <item> tag requires a \'color\' attribute and a \'offset\' ");
        v10.append("attribute!");
        throw new XmlPullParserException(v10.toString());
    label_55:
        if(((List)v4).size() > 0) {
            return new ColorStops(((List)v4), ((List)v2));
        }

        return null;
    }

    private static Shader$TileMode parseTileMode(int arg0) {
        switch(arg0) {
            case 1: {
                goto label_5;
            }
            case 2: {
                goto label_3;
            }
        }

        return Shader$TileMode.CLAMP;
    label_3:
        return Shader$TileMode.MIRROR;
    label_5:
        return Shader$TileMode.REPEAT;
    }
}

