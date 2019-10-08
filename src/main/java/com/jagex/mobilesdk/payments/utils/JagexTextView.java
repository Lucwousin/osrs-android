package com.jagex.mobilesdk.payments.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Hashtable;
import java.util.Locale;

public class JagexTextView extends AppCompatTextView {
    public enum CustomFont {
        public static final enum CustomFont BAGUE_SANS_BLACK;
        public static final enum CustomFont BAGUE_SANS_THIN;
        private final String fileName;

        static {
            CustomFont.BAGUE_SANS_BLACK = new CustomFont("BAGUE_SANS_BLACK", 0, "fonts/bague_sans_black.otf");
            CustomFont.BAGUE_SANS_THIN = new CustomFont("BAGUE_SANS_THIN", 1, "fonts/bague_sans_thin.otf");
            CustomFont.$VALUES = new CustomFont[]{CustomFont.BAGUE_SANS_BLACK, CustomFont.BAGUE_SANS_THIN};
        }

        private CustomFont(String arg1, int arg2, String arg3) {
            super(arg1, arg2);
            this.fileName = arg3;
        }

        public Typeface asTypeface(Context arg2) {
            try {
                return Typeface.createFromAsset(arg2.getAssets(), this.fileName);
            }
            catch(Exception ) {
                return null;
            }
        }

        public static CustomFont fromString(String arg1) {
            return CustomFont.valueOf(arg1.toUpperCase(Locale.US));
        }

        public static CustomFont valueOf(String arg1) {
            return Enum.valueOf(CustomFont.class, arg1);
        }

        public static CustomFont[] values() {
            return CustomFont.$VALUES.clone();
        }
    }

    private static final String ATTRIBUTE = "customFont";
    private static final String SCHEME = "http://schemas.android.com/apk/res-auto";
    private static final Hashtable typeFaces;

    static {
        JagexTextView.typeFaces = new Hashtable(2);
    }

    public JagexTextView(Context arg1, AttributeSet arg2) {
        super(arg1, arg2);
        this.applyCustomFont(arg1, arg2);
    }

    public JagexTextView(Context arg1, AttributeSet arg2, int arg3) {
        super(arg1, arg2, arg3);
        this.applyCustomFont(arg1, arg2);
    }

    private void applyCustomFont(Context arg3, AttributeSet arg4) {
        if(!this.isInEditMode()) {
            String v4 = arg4.getAttributeValue("http://schemas.android.com/apk/res-auto", "customFont");
            if(v4 != null) {
                Object v0 = JagexTextView.typeFaces.get(v4);
                if(v0 == null) {
                    Typeface v3 = CustomFont.fromString(v4).asTypeface(arg3);
                    JagexTextView.typeFaces.put(v4, v3);
                    this.setTypeface(v3);
                }
                else {
                    this.setTypeface(((Typeface)v0));
                }
            }
            else {
                throw new IllegalArgumentException("You must provide \"customFont\" for your text view");
            }
        }
    }
}

