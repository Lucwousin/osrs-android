package com.google.android.material.animation;

import android.util.Property;
import android.view.ViewGroup;
import com.google.android.material.R$id;

public class ChildrenAlphaProperty extends Property {
    public static final Property CHILDREN_ALPHA;

    static {
        ChildrenAlphaProperty.CHILDREN_ALPHA = new ChildrenAlphaProperty("childrenAlpha");
    }

    private ChildrenAlphaProperty(String arg2) {
        super(Float.class, arg2);
    }

    public Float get(ViewGroup arg2) {
        Object v2 = arg2.getTag(R$id.mtrl_internal_children_alpha_tag);
        if(v2 != null) {
            return ((Float)v2);
        }

        return Float.valueOf(1f);
    }

    public Object get(Object arg1) {
        return this.get(((ViewGroup)arg1));
    }

    public void set(ViewGroup arg4, Float arg5) {
        float v5 = arg5.floatValue();
        arg4.setTag(R$id.mtrl_internal_children_alpha_tag, Float.valueOf(v5));
        int v0 = arg4.getChildCount();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            arg4.getChildAt(v1).setAlpha(v5);
        }
    }

    public void set(Object arg1, Object arg2) {
        this.set(((ViewGroup)arg1), ((Float)arg2));
    }
}

