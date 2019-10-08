package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint$Align;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.constraint.R$styleable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup$LayoutParams;

public class Placeholder extends View {
    private View mContent;
    private int mContentId;
    private int mEmptyVisibility;

    public Placeholder(Context arg2) {
        super(arg2);
        this.mContentId = -1;
        this.mContent = null;
        this.mEmptyVisibility = 4;
        this.init(null);
    }

    public Placeholder(Context arg1, AttributeSet arg2) {
        super(arg1, arg2);
        this.mContentId = -1;
        this.mContent = null;
        this.mEmptyVisibility = 4;
        this.init(arg2);
    }

    public Placeholder(Context arg1, AttributeSet arg2, int arg3) {
        super(arg1, arg2, arg3);
        this.mContentId = -1;
        this.mContent = null;
        this.mEmptyVisibility = 4;
        this.init(arg2);
    }

    public Placeholder(Context arg1, AttributeSet arg2, int arg3, int arg4) {
        super(arg1, arg2, arg3);
        this.mContentId = -1;
        this.mContent = null;
        this.mEmptyVisibility = 4;
        this.init(arg2);
    }

    public View getContent() {
        return this.mContent;
    }

    public int getEmptyVisibility() {
        return this.mEmptyVisibility;
    }

    private void init(AttributeSet arg5) {
        super.setVisibility(this.mEmptyVisibility);
        this.mContentId = -1;
        if(arg5 != null) {
            TypedArray v5 = this.getContext().obtainStyledAttributes(arg5, R$styleable.ConstraintLayout_placeholder);
            int v0 = v5.getIndexCount();
            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                int v2 = v5.getIndex(v1);
                if(v2 == R$styleable.ConstraintLayout_placeholder_content) {
                    this.mContentId = v5.getResourceId(v2, this.mContentId);
                }
                else if(v2 == R$styleable.ConstraintLayout_placeholder_emptyVisibility) {
                    this.mEmptyVisibility = v5.getInt(v2, this.mEmptyVisibility);
                }
            }
        }
    }

    public void onDraw(Canvas arg8) {
        if(this.isInEditMode()) {
            arg8.drawRGB(0xDF, 0xDF, 0xDF);
            Paint v0 = new Paint();
            v0.setARGB(0xFF, 210, 210, 210);
            v0.setTextAlign(Paint$Align.CENTER);
            v0.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect v1 = new Rect();
            arg8.getClipBounds(v1);
            v0.setTextSize(((float)v1.height()));
            int v3 = v1.height();
            int v4 = v1.width();
            v0.setTextAlign(Paint$Align.LEFT);
            v0.getTextBounds("?", 0, "?".length(), v1);
            arg8.drawText("?", (((float)v4)) / 2f - (((float)v1.width())) / 2f - (((float)v1.left)), (((float)v3)) / 2f + (((float)v1.height())) / 2f - (((float)v1.bottom)), v0);
        }
    }

    public void setContentId(int arg3) {
        if(this.mContentId == arg3) {
            return;
        }

        if(this.mContent != null) {
            this.mContent.setVisibility(0);
            this.mContent.getLayoutParams().isInPlaceholder = false;
            this.mContent = null;
        }

        this.mContentId = arg3;
        if(arg3 != -1) {
            View v3 = this.getParent().findViewById(arg3);
            if(v3 != null) {
                v3.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int arg1) {
        this.mEmptyVisibility = arg1;
    }

    public void updatePostMeasure(ConstraintLayout arg4) {
        if(this.mContent == null) {
            return;
        }

        ViewGroup$LayoutParams v4 = this.getLayoutParams();
        ViewGroup$LayoutParams v0 = this.mContent.getLayoutParams();
        ((LayoutParams)v0).widget.setVisibility(0);
        ((LayoutParams)v4).widget.setWidth(((LayoutParams)v0).widget.getWidth());
        ((LayoutParams)v4).widget.setHeight(((LayoutParams)v0).widget.getHeight());
        ((LayoutParams)v0).widget.setVisibility(8);
    }

    public void updatePreLayout(ConstraintLayout arg3) {
        if(this.mContentId == -1 && !this.isInEditMode()) {
            this.setVisibility(this.mEmptyVisibility);
        }

        this.mContent = arg3.findViewById(this.mContentId);
        if(this.mContent != null) {
            this.mContent.getLayoutParams().isInPlaceholder = true;
            this.mContent.setVisibility(0);
            this.setVisibility(0);
        }
    }
}

