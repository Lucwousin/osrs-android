package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.core.content.res.TypedArrayUtils;
import org.xmlpull.v1.XmlPullParser;

public class ArcMotion extends PathMotion {
    private static final float DEFAULT_MAX_ANGLE_DEGREES = 70f;
    private static final float DEFAULT_MAX_TANGENT;
    private static final float DEFAULT_MIN_ANGLE_DEGREES;
    private float mMaximumAngle;
    private float mMaximumTangent;
    private float mMinimumHorizontalAngle;
    private float mMinimumHorizontalTangent;
    private float mMinimumVerticalAngle;
    private float mMinimumVerticalTangent;

    static {
        ArcMotion.DEFAULT_MAX_TANGENT = ((float)Math.tan(Math.toRadians(35)));
    }

    public ArcMotion(Context arg5, AttributeSet arg6) {
        super(arg5, arg6);
        this.mMinimumHorizontalAngle = 0f;
        this.mMinimumVerticalAngle = 0f;
        this.mMaximumAngle = 70f;
        this.mMinimumHorizontalTangent = 0f;
        this.mMinimumVerticalTangent = 0f;
        this.mMaximumTangent = ArcMotion.DEFAULT_MAX_TANGENT;
        TypedArray v5 = arg5.obtainStyledAttributes(arg6, Styleable.ARC_MOTION);
        this.setMinimumVerticalAngle(TypedArrayUtils.getNamedFloat(v5, ((XmlPullParser)arg6), "minimumVerticalAngle", 1, 0f));
        this.setMinimumHorizontalAngle(TypedArrayUtils.getNamedFloat(v5, ((XmlPullParser)arg6), "minimumHorizontalAngle", 0, 0f));
        this.setMaximumAngle(TypedArrayUtils.getNamedFloat(v5, ((XmlPullParser)arg6), "maximumAngle", 2, 70f));
        v5.recycle();
    }

    public ArcMotion() {
        super();
        this.mMinimumHorizontalAngle = 0f;
        this.mMinimumVerticalAngle = 0f;
        this.mMaximumAngle = 70f;
        this.mMinimumHorizontalTangent = 0f;
        this.mMinimumVerticalTangent = 0f;
        this.mMaximumTangent = ArcMotion.DEFAULT_MAX_TANGENT;
    }

    public float getMaximumAngle() {
        return this.mMaximumAngle;
    }

    public float getMinimumHorizontalAngle() {
        return this.mMinimumHorizontalAngle;
    }

    public float getMinimumVerticalAngle() {
        return this.mMinimumVerticalAngle;
    }

    public Path getPath(float arg12, float arg13, float arg14, float arg15) {
        Path v7 = new Path();
        v7.moveTo(arg12, arg13);
        float v0 = arg14 - arg12;
        float v1 = arg15 - arg13;
        float v2 = v0 * v0 + v1 * v1;
        float v4 = 2f;
        float v3 = (arg12 + arg14) / v4;
        float v5 = (arg13 + arg15) / v4;
        float v6 = 0.25f * v2;
        int v8 = arg13 > arg15 ? 1 : 0;
        if(Math.abs(v0) < Math.abs(v1)) {
            v0 = Math.abs(v2 / (v1 * v4));
            if(v8 != 0) {
                v1 = v0 + arg15;
                v0 = arg14;
            }
            else {
                v1 = v0 + arg13;
                v0 = arg12;
            }

            v2 = this.mMinimumVerticalTangent * v6 * this.mMinimumVerticalTangent;
        }
        else {
            v2 /= v0 * v4;
            if(v8 != 0) {
                v1 = arg13;
                v0 = v2 + arg12;
            }
            else {
                v0 = arg14 - v2;
                v1 = arg15;
            }

            v2 = this.mMinimumHorizontalTangent * v6 * this.mMinimumHorizontalTangent;
        }

        float v8_1 = v3 - v0;
        float v9 = v5 - v1;
        v8_1 = v8_1 * v8_1 + v9 * v9;
        v6 = v6 * this.mMaximumTangent * this.mMaximumTangent;
        if(v8_1 < v2) {
        }
        else if(v8_1 > v6) {
            v2 = v6;
        }
        else {
            v2 = 0f;
        }

        if(v2 != 0f) {
            v2 = ((float)Math.sqrt(((double)(v2 / v8_1))));
            v0 = (v0 - v3) * v2 + v3;
            v1 = v5 + v2 * (v1 - v5);
        }

        v7.cubicTo((arg12 + v0) / v4, (arg13 + v1) / v4, (v0 + arg14) / v4, (v1 + arg15) / v4, arg14, arg15);
        return v7;
    }

    public void setMaximumAngle(float arg1) {
        this.mMaximumAngle = arg1;
        this.mMaximumTangent = ArcMotion.toTangent(arg1);
    }

    public void setMinimumHorizontalAngle(float arg1) {
        this.mMinimumHorizontalAngle = arg1;
        this.mMinimumHorizontalTangent = ArcMotion.toTangent(arg1);
    }

    public void setMinimumVerticalAngle(float arg1) {
        this.mMinimumVerticalAngle = arg1;
        this.mMinimumVerticalTangent = ArcMotion.toTangent(arg1);
    }

    private static float toTangent(float arg2) {
        if(arg2 >= 0f && arg2 <= 90f) {
            return ((float)Math.tan(Math.toRadians(((double)(arg2 / 2f)))));
        }

        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }
}

