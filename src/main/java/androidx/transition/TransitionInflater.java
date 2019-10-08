package androidx.transition;

import android.content.Context;
import android.content.res.Resources$NotFoundException;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.core.content.res.TypedArrayUtils;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class TransitionInflater {
    private static final ArrayMap CONSTRUCTORS;
    private static final Class[] CONSTRUCTOR_SIGNATURE;
    private final Context mContext;

    static {
        TransitionInflater.CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class};
        TransitionInflater.CONSTRUCTORS = new ArrayMap();
    }

    private TransitionInflater(@NonNull Context arg1) {
        super();
        this.mContext = arg1;
    }

    private Object createCustom(AttributeSet arg7, Class arg8, String arg9) {
        Constructor v1_1;
        ArrayMap v9;
        String v0 = arg7.getAttributeValue(null, "class");
        if(v0 != null) {
            try {
                v9 = TransitionInflater.CONSTRUCTORS;
                __monitor_enter(v9);
            }
            catch(Exception v7) {
                goto label_35;
            }

            try {
                Object v1 = TransitionInflater.CONSTRUCTORS.get(v0);
                if(v1 == null) {
                    Class v3 = this.mContext.getClassLoader().loadClass(v0).asSubclass(arg8);
                    if(v3 != null) {
                        v1_1 = v3.getConstructor(TransitionInflater.CONSTRUCTOR_SIGNATURE);
                        v1_1.setAccessible(true);
                        TransitionInflater.CONSTRUCTORS.put(v0, v1_1);
                    }
                }

                __monitor_exit(v9);
                return v1_1.newInstance(this.mContext, arg7);
            label_30:
                __monitor_exit(v9);
            }
            catch(Throwable v7_1) {
                goto label_30;
            }

            try {
                throw v7_1;
            }
            catch(Exception v7) {
            label_35:
                StringBuilder v1_2 = new StringBuilder();
                v1_2.append("Could not instantiate ");
                v1_2.append(arg8);
                v1_2.append(" class ");
                v1_2.append(v0);
                throw new InflateException(v1_2.toString(), ((Throwable)v7));
            }
        }

        StringBuilder v8 = new StringBuilder();
        v8.append(arg9);
        v8.append(" tag must have a \'class\' attribute");
        throw new InflateException(v8.toString());
    }

    private Transition createTransitionFromXml(XmlPullParser arg7, AttributeSet arg8, Transition arg9) throws XmlPullParserException, IOException {
        Slide v3_2;
        int v0 = arg7.getDepth();
        Transition v2 = null;
        Transition v1 = (arg9 instanceof TransitionSet) ? arg9 : v2;
        while(true) {
        label_7:
            Fade v3 = ((Fade)v2);
            while(true) {
            label_8:
                int v4 = arg7.next();
                if((v4 != 3 || arg7.getDepth() > v0) && v4 != 1) {
                    if(v4 != 2) {
                        continue;
                    }
                    else {
                        String v4_1 = arg7.getName();
                        if("fade".equals(v4_1)) {
                            v3 = new Fade(this.mContext, arg8);
                        }
                        else if("changeBounds".equals(v4_1)) {
                            ChangeBounds v3_1 = new ChangeBounds(this.mContext, arg8);
                        }
                        else if("slide".equals(v4_1)) {
                            v3_2 = new Slide(this.mContext, arg8);
                        }
                        else if("explode".equals(v4_1)) {
                            Explode v3_3 = new Explode(this.mContext, arg8);
                        }
                        else if("changeImageTransform".equals(v4_1)) {
                            ChangeImageTransform v3_4 = new ChangeImageTransform(this.mContext, arg8);
                        }
                        else if("changeTransform".equals(v4_1)) {
                            ChangeTransform v3_5 = new ChangeTransform(this.mContext, arg8);
                        }
                        else if("changeClipBounds".equals(v4_1)) {
                            ChangeClipBounds v3_6 = new ChangeClipBounds(this.mContext, arg8);
                        }
                        else if("autoTransition".equals(v4_1)) {
                            AutoTransition v3_7 = new AutoTransition(this.mContext, arg8);
                        }
                        else if("changeScroll".equals(v4_1)) {
                            ChangeScroll v3_8 = new ChangeScroll(this.mContext, arg8);
                        }
                        else if("transitionSet".equals(v4_1)) {
                            TransitionSet v3_9 = new TransitionSet(this.mContext, arg8);
                        }
                        else if("transition".equals(v4_1)) {
                            Object v3_10 = this.createCustom(arg8, Transition.class, "transition");
                        }
                        else if("targets".equals(v4_1)) {
                            this.getTargetIds(arg7, arg8, arg9);
                        }
                        else if("arcMotion".equals(v4_1)) {
                            if(arg9 != null) {
                                arg9.setPathMotion(new ArcMotion(this.mContext, arg8));
                            }
                            else {
                                throw new RuntimeException("Invalid use of arcMotion element");
                            }
                        }
                        else if("pathMotion".equals(v4_1)) {
                            if(arg9 != null) {
                                arg9.setPathMotion(this.createCustom(arg8, PathMotion.class, "pathMotion"));
                            }
                            else {
                                throw new RuntimeException("Invalid use of pathMotion element");
                            }
                        }
                        else if(!"patternPathMotion".equals(v4_1)) {
                            goto label_152;
                        }
                        else if(arg9 != null) {
                            arg9.setPathMotion(new PatternPathMotion(this.mContext, arg8));
                        }
                        else {
                            goto label_148;
                        }

                        if((((Fade)v3_2)) == null) {
                            continue;
                        }

                        if(!arg7.isEmptyElementTag()) {
                            this.createTransitionFromXml(arg7, arg8, ((Transition)v3_2));
                        }

                        if(v1 == null) {
                            break;
                        }

                        ((TransitionSet)v1).addTransition(((Transition)v3_2));
                        goto label_7;
                    }
                }

                goto label_162;
            }
        }

        if(arg9 == null) {
            goto label_8;
        }

        throw new InflateException("Could not add transition to another transition.");
    label_148:
        throw new RuntimeException("Invalid use of patternPathMotion element");
    label_152:
        StringBuilder v9 = new StringBuilder();
        v9.append("Unknown scene name: ");
        v9.append(arg7.getName());
        throw new RuntimeException(v9.toString());
    label_162:
        return ((Transition)v3_2);
    }

    private TransitionManager createTransitionManagerFromXml(XmlPullParser arg5, AttributeSet arg6, ViewGroup arg7) throws XmlPullParserException, IOException {
        int v0 = arg5.getDepth();
        TransitionManager v1 = null;
        while(true) {
            int v2 = arg5.next();
            if((v2 != 3 || arg5.getDepth() > v0) && v2 != 1) {
                if(v2 != 2) {
                    continue;
                }
                else {
                    String v2_1 = arg5.getName();
                    if(v2_1.equals("transitionManager")) {
                        v1 = new TransitionManager();
                        continue;
                    }
                    else {
                        if((v2_1.equals("transition")) && v1 != null) {
                            this.loadTransition(arg6, arg5, arg7, v1);
                            continue;
                        }

                        break;
                    }
                }
            }

            return v1;
        }

        StringBuilder v7 = new StringBuilder();
        v7.append("Unknown scene name: ");
        v7.append(arg5.getName());
        throw new RuntimeException(v7.toString());
        return v1;
    }

    public static TransitionInflater from(Context arg1) {
        return new TransitionInflater(arg1);
    }

    private void getTargetIds(XmlPullParser arg8, AttributeSet arg9, Transition arg10) throws XmlPullParserException, IOException {
        String v3;
        String v2_1;
        TypedArray v1_1;
        int v0 = arg8.getDepth();
        while(true) {
            int v1 = arg8.next();
            int v2 = 3;
            if((v1 != v2 || arg8.getDepth() > v0) && v1 != 1) {
                int v4 = 2;
                if(v1 != v4) {
                    continue;
                }
                else if(arg8.getName().equals("target")) {
                    v1_1 = this.mContext.obtainStyledAttributes(arg9, Styleable.TRANSITION_TARGET);
                    int v5 = TypedArrayUtils.getNamedResourceId(v1_1, arg8, "targetId", 1, 0);
                    if(v5 != 0) {
                        arg10.addTarget(v5);
                    }
                    else {
                        v4 = TypedArrayUtils.getNamedResourceId(v1_1, arg8, "excludeId", v4, 0);
                        if(v4 != 0) {
                            arg10.excludeTarget(v4, true);
                        }
                        else {
                            String v4_1 = TypedArrayUtils.getNamedString(v1_1, arg8, "targetName", 4);
                            if(v4_1 != null) {
                                arg10.addTarget(v4_1);
                            }
                            else {
                                v4_1 = TypedArrayUtils.getNamedString(v1_1, arg8, "excludeName", 5);
                                if(v4_1 != null) {
                                    arg10.excludeTarget(v4_1, true);
                                }
                                else {
                                    v2_1 = TypedArrayUtils.getNamedString(v1_1, arg8, "excludeClass", v2);
                                    if(v2_1 != null) {
                                        try {
                                            arg10.excludeTarget(Class.forName(v2_1), true);
                                            goto label_58;
                                        label_49:
                                            v3 = TypedArrayUtils.getNamedString(v1_1, arg8, "targetClass", 0);
                                            if(v3 != null) {
                                                goto label_52;
                                            }
                                        }
                                        catch(ClassNotFoundException v8) {
                                            goto label_60;
                                        }
                                    }
                                    else {
                                        goto label_49;
                                        try {
                                        label_52:
                                            arg10.addTarget(Class.forName(v3));
                                        }
                                        catch(ClassNotFoundException v8) {
                                            v2_1 = v3;
                                            goto label_60;
                                        }
                                    }
                                }
                            }
                        }
                    }

                label_58:
                    v1_1.recycle();
                    continue;
                }
                else {
                    break;
                }
            }

            return;
        }

        StringBuilder v10 = new StringBuilder();
        v10.append("Unknown scene name: ");
        v10.append(arg8.getName());
        throw new RuntimeException(v10.toString());
        return;
    label_60:
        v1_1.recycle();
        v10 = new StringBuilder();
        v10.append("Could not create ");
        v10.append(v2_1);
        throw new RuntimeException(v10.toString(), ((Throwable)v8));
    }

    public Transition inflateTransition(int arg5) {
        Transition v0_3;
        XmlResourceParser v5 = this.mContext.getResources().getXml(arg5);
        try {
            v0_3 = this.createTransitionFromXml(((XmlPullParser)v5), Xml.asAttributeSet(((XmlPullParser)v5)), null);
        }
        catch(Throwable v0) {
        }
        catch(IOException v0_1) {
            try {
                StringBuilder v2 = new StringBuilder();
                v2.append(v5.getPositionDescription());
                v2.append(": ");
                v2.append(v0_1.getMessage());
                throw new InflateException(v2.toString(), ((Throwable)v0_1));
            }
            catch(Throwable v0) {
            label_28:
                v5.close();
                throw v0;
            }
        }
        catch(XmlPullParserException v0_2) {
            try {
                throw new InflateException(v0_2.getMessage(), ((Throwable)v0_2));
            }
            catch(Throwable v0) {
                goto label_28;
            }
        }

        v5.close();
        return v0_3;
    }

    public TransitionManager inflateTransitionManager(int arg4, ViewGroup arg5) {
        InflateException v0;
        TransitionManager v5_3;
        XmlResourceParser v4 = this.mContext.getResources().getXml(arg4);
        try {
            v5_3 = this.createTransitionManagerFromXml(((XmlPullParser)v4), Xml.asAttributeSet(((XmlPullParser)v4)), arg5);
        }
        catch(Throwable v5) {
        }
        catch(IOException v5_1) {
            try {
                StringBuilder v1 = new StringBuilder();
                v1.append(v4.getPositionDescription());
                v1.append(": ");
                v1.append(v5_1.getMessage());
                v0 = new InflateException(v1.toString());
                v0.initCause(((Throwable)v5_1));
                throw v0;
            }
            catch(Throwable v5) {
            label_29:
                v4.close();
                throw v5;
            }
        }
        catch(XmlPullParserException v5_2) {
            try {
                v0 = new InflateException(v5_2.getMessage());
                v0.initCause(((Throwable)v5_2));
                throw v0;
            }
            catch(Throwable v5) {
                goto label_29;
            }
        }

        v4.close();
        return v5_3;
    }

    private void loadTransition(AttributeSet arg7, XmlPullParser arg8, ViewGroup arg9, TransitionManager arg10) throws Resources$NotFoundException {
        TypedArray v7 = this.mContext.obtainStyledAttributes(arg7, Styleable.TRANSITION_MANAGER);
        int v1 = -1;
        int v0 = TypedArrayUtils.getNamedResourceId(v7, arg8, "transition", 2, v1);
        int v2 = TypedArrayUtils.getNamedResourceId(v7, arg8, "fromScene", 0, v1);
        Scene v3 = null;
        Scene v2_1 = v2 < 0 ? v3 : Scene.getSceneForLayout(arg9, v2, this.mContext);
        int v8 = TypedArrayUtils.getNamedResourceId(v7, arg8, "toScene", 1, v1);
        if(v8 < 0) {
        }
        else {
            v3 = Scene.getSceneForLayout(arg9, v8, this.mContext);
        }

        if(v0 >= 0) {
            Transition v8_1 = this.inflateTransition(v0);
            if(v8_1 != null) {
                if(v3 == null) {
                    StringBuilder v8_2 = new StringBuilder();
                    v8_2.append("No toScene for transition ID ");
                    v8_2.append(v0);
                    throw new RuntimeException(v8_2.toString());
                }
                else if(v2_1 == null) {
                    arg10.setTransition(v3, v8_1);
                }
                else {
                    arg10.setTransition(v2_1, v3, v8_1);
                }
            }
        }

        v7.recycle();
    }
}

