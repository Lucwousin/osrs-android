package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public final class ComplexColorCompat {
    private static final String LOG_TAG = "ComplexColorCompat";
    private int mColor;
    private final ColorStateList mColorStateList;
    private final Shader mShader;

    private ComplexColorCompat(Shader arg1, ColorStateList arg2, @ColorInt int arg3) {
        super();
        this.mShader = arg1;
        this.mColorStateList = arg2;
        this.mColor = arg3;
    }

    @NonNull private static ComplexColorCompat createFromXml(@NonNull Resources arg6, @ColorRes int arg7, @Nullable Resources$Theme arg8) throws IOException, XmlPullParserException {
        int v2;
        XmlResourceParser v7 = arg6.getXml(arg7);
        AttributeSet v0 = Xml.asAttributeSet(((XmlPullParser)v7));
        while(true) {
            int v1 = ((XmlPullParser)v7).next();
            v2 = 1;
            int v3 = 2;
            if(v1 != v3 && v1 != 1) {
                continue;
            }

            break;
        }

        if(v1 != v3) {
            goto label_45;
        }

        String v1_1 = ((XmlPullParser)v7).getName();
        int v4 = v1_1.hashCode();
        if(v4 != 0x557F730) {
            if(v4 != 0x4705F3DF) {
                goto label_26;
            }
            else if(v1_1.equals("selector")) {
                v2 = 0;
            }
            else {
                goto label_26;
            }
        }
        else if(v1_1.equals("gradient")) {
        }
        else {
        label_26:
            v2 = -1;
        }

        switch(v2) {
            case 0: {
                goto label_42;
            }
            case 1: {
                goto label_39;
            }
        }

        StringBuilder v8 = new StringBuilder();
        v8.append(((XmlPullParser)v7).getPositionDescription());
        v8.append(": unsupported complex color tag ");
        v8.append(v1_1);
        throw new XmlPullParserException(v8.toString());
    label_39:
        return ComplexColorCompat.from(GradientColorInflaterCompat.createFromXmlInner(arg6, ((XmlPullParser)v7), v0, arg8));
    label_42:
        return ComplexColorCompat.from(ColorStateListInflaterCompat.createFromXmlInner(arg6, ((XmlPullParser)v7), v0, arg8));
    label_45:
        throw new XmlPullParserException("No start tag found");
    }

    static ComplexColorCompat from(@NonNull Shader arg3) {
        return new ComplexColorCompat(arg3, null, 0);
    }

    static ComplexColorCompat from(@NonNull ColorStateList arg3) {
        return new ComplexColorCompat(null, arg3, arg3.getDefaultColor());
    }

    static ComplexColorCompat from(@ColorInt int arg2) {
        return new ComplexColorCompat(null, null, arg2);
    }

    @ColorInt public int getColor() {
        return this.mColor;
    }

    @Nullable public Shader getShader() {
        return this.mShader;
    }

    @Nullable public static ComplexColorCompat inflate(@NonNull Resources arg0, @ColorRes int arg1, @Nullable Resources$Theme arg2) {
        try {
            return ComplexColorCompat.createFromXml(arg0, arg1, arg2);
        }
        catch(Exception v0) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", ((Throwable)v0));
            return null;
        }
    }

    public boolean isGradient() {
        boolean v0 = this.mShader != null ? true : false;
        return v0;
    }

    public boolean isStateful() {
        boolean v0 = this.mShader != null || this.mColorStateList == null || !this.mColorStateList.isStateful() ? false : true;
        return v0;
    }

    public boolean onStateChanged(int[] arg3) {
        boolean v0;
        if(this.isStateful()) {
            int v3 = this.mColorStateList.getColorForState(arg3, this.mColorStateList.getDefaultColor());
            if(v3 != this.mColor) {
                v0 = true;
                this.mColor = v3;
            }
            else {
                goto label_11;
            }
        }
        else {
        label_11:
            v0 = false;
        }

        return v0;
    }

    public void setColor(@ColorInt int arg1) {
        this.mColor = arg1;
    }

    public boolean willDraw() {
        boolean v0 = (this.isGradient()) || this.mColor != 0 ? true : false;
        return v0;
    }
}

