package androidx.transition;

import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import org.xmlpull.v1.XmlPullParser;

public class ChangeTransform extends Transition {
    final class androidx.transition.ChangeTransform$1 extends Property {
        androidx.transition.ChangeTransform$1(Class arg1, String arg2) {
            super(arg1, arg2);
        }

        public Object get(Object arg1) {
            return this.get(((PathAnimatorMatrix)arg1));
        }

        public float[] get(PathAnimatorMatrix arg1) {
            return null;
        }

        public void set(PathAnimatorMatrix arg1, float[] arg2) {
            arg1.setValues(arg2);
        }

        public void set(Object arg1, Object arg2) {
            this.set(((PathAnimatorMatrix)arg1), ((float[])arg2));
        }
    }

    final class androidx.transition.ChangeTransform$2 extends Property {
        androidx.transition.ChangeTransform$2(Class arg1, String arg2) {
            super(arg1, arg2);
        }

        public PointF get(PathAnimatorMatrix arg1) {
            return null;
        }

        public Object get(Object arg1) {
            return this.get(((PathAnimatorMatrix)arg1));
        }

        public void set(PathAnimatorMatrix arg1, PointF arg2) {
            arg1.setTranslation(arg2);
        }

        public void set(Object arg1, Object arg2) {
            this.set(((PathAnimatorMatrix)arg1), ((PointF)arg2));
        }
    }

    class GhostListener extends TransitionListenerAdapter {
        private GhostViewImpl mGhostView;
        private View mView;

        GhostListener(View arg1, GhostViewImpl arg2) {
            super();
            this.mView = arg1;
            this.mGhostView = arg2;
        }

        public void onTransitionEnd(@NonNull Transition arg3) {
            arg3.removeListener(((TransitionListener)this));
            GhostViewUtils.removeGhost(this.mView);
            this.mView.setTag(R$id.transition_transform, null);
            this.mView.setTag(R$id.parent_matrix, null);
        }

        public void onTransitionPause(@NonNull Transition arg2) {
            this.mGhostView.setVisibility(4);
        }

        public void onTransitionResume(@NonNull Transition arg2) {
            this.mGhostView.setVisibility(0);
        }
    }

    class PathAnimatorMatrix {
        private final Matrix mMatrix;
        private float mTranslationX;
        private float mTranslationY;
        private final float[] mValues;
        private final View mView;

        PathAnimatorMatrix(View arg2, float[] arg3) {
            super();
            this.mMatrix = new Matrix();
            this.mView = arg2;
            this.mValues = arg3.clone();
            this.mTranslationX = this.mValues[2];
            this.mTranslationY = this.mValues[5];
            this.setAnimationMatrix();
        }

        Matrix getMatrix() {
            return this.mMatrix;
        }

        private void setAnimationMatrix() {
            this.mValues[2] = this.mTranslationX;
            this.mValues[5] = this.mTranslationY;
            this.mMatrix.setValues(this.mValues);
            ViewUtils.setAnimationMatrix(this.mView, this.mMatrix);
        }

        void setTranslation(PointF arg2) {
            this.mTranslationX = arg2.x;
            this.mTranslationY = arg2.y;
            this.setAnimationMatrix();
        }

        void setValues(float[] arg4) {
            System.arraycopy(arg4, 0, this.mValues, 0, arg4.length);
            this.setAnimationMatrix();
        }
    }

    class Transforms {
        final float mRotationX;
        final float mRotationY;
        final float mRotationZ;
        final float mScaleX;
        final float mScaleY;
        final float mTranslationX;
        final float mTranslationY;
        final float mTranslationZ;

        Transforms(View arg2) {
            super();
            this.mTranslationX = arg2.getTranslationX();
            this.mTranslationY = arg2.getTranslationY();
            this.mTranslationZ = ViewCompat.getTranslationZ(arg2);
            this.mScaleX = arg2.getScaleX();
            this.mScaleY = arg2.getScaleY();
            this.mRotationX = arg2.getRotationX();
            this.mRotationY = arg2.getRotationY();
            this.mRotationZ = arg2.getRotation();
        }

        public boolean equals(Object arg4) {
            boolean v1 = false;
            if(!(arg4 instanceof Transforms)) {
                return 0;
            }

            if(((Transforms)arg4).mTranslationX == this.mTranslationX && ((Transforms)arg4).mTranslationY == this.mTranslationY && ((Transforms)arg4).mTranslationZ == this.mTranslationZ && ((Transforms)arg4).mScaleX == this.mScaleX && ((Transforms)arg4).mScaleY == this.mScaleY && ((Transforms)arg4).mRotationX == this.mRotationX && ((Transforms)arg4).mRotationY == this.mRotationY && ((Transforms)arg4).mRotationZ == this.mRotationZ) {
                v1 = true;
            }

            return v1;
        }

        public int hashCode() {
            int v1 = 0;
            int v0 = this.mTranslationX != 0f ? Float.floatToIntBits(this.mTranslationX) : 0;
            v0 *= 0x1F;
            int v3 = this.mTranslationY != 0f ? Float.floatToIntBits(this.mTranslationY) : 0;
            v0 = (v0 + v3) * 0x1F;
            v3 = this.mTranslationZ != 0f ? Float.floatToIntBits(this.mTranslationZ) : 0;
            v0 = (v0 + v3) * 0x1F;
            v3 = this.mScaleX != 0f ? Float.floatToIntBits(this.mScaleX) : 0;
            v0 = (v0 + v3) * 0x1F;
            v3 = this.mScaleY != 0f ? Float.floatToIntBits(this.mScaleY) : 0;
            v0 = (v0 + v3) * 0x1F;
            v3 = this.mRotationX != 0f ? Float.floatToIntBits(this.mRotationX) : 0;
            v0 = (v0 + v3) * 0x1F;
            v3 = this.mRotationY != 0f ? Float.floatToIntBits(this.mRotationY) : 0;
            v0 = (v0 + v3) * 0x1F;
            if(this.mRotationZ != 0f) {
                v1 = Float.floatToIntBits(this.mRotationZ);
            }

            return v0 + v1;
        }

        public void restore(View arg10) {
            ChangeTransform.setTransforms(arg10, this.mTranslationX, this.mTranslationY, this.mTranslationZ, this.mScaleX, this.mScaleY, this.mRotationX, this.mRotationY, this.mRotationZ);
        }
    }

    private static final Property NON_TRANSLATIONS_PROPERTY = null;
    private static final String PROPNAME_INTERMEDIATE_MATRIX = "android:changeTransform:intermediateMatrix";
    private static final String PROPNAME_INTERMEDIATE_PARENT_MATRIX = "android:changeTransform:intermediateParentMatrix";
    private static final String PROPNAME_MATRIX = "android:changeTransform:matrix";
    private static final String PROPNAME_PARENT = "android:changeTransform:parent";
    private static final String PROPNAME_PARENT_MATRIX = "android:changeTransform:parentMatrix";
    private static final String PROPNAME_TRANSFORMS = "android:changeTransform:transforms";
    private static final boolean SUPPORTS_VIEW_REMOVAL_SUPPRESSION;
    private static final Property TRANSLATIONS_PROPERTY;
    private boolean mReparent;
    private Matrix mTempMatrix;
    boolean mUseOverlay;
    private static final String[] sTransitionProperties;

    static {
        ChangeTransform.sTransitionProperties = new String[]{"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
        ChangeTransform.NON_TRANSLATIONS_PROPERTY = new androidx.transition.ChangeTransform$1(float[].class, "nonTranslations");
        ChangeTransform.TRANSLATIONS_PROPERTY = new androidx.transition.ChangeTransform$2(PointF.class, "translations");
        boolean v0 = Build$VERSION.SDK_INT >= 21 ? true : false;
        ChangeTransform.SUPPORTS_VIEW_REMOVAL_SUPPRESSION = v0;
    }

    public ChangeTransform(Context arg4, AttributeSet arg5) {
        super(arg4, arg5);
        this.mUseOverlay = true;
        this.mReparent = true;
        this.mTempMatrix = new Matrix();
        TypedArray v4 = arg4.obtainStyledAttributes(arg5, Styleable.CHANGE_TRANSFORM);
        this.mUseOverlay = TypedArrayUtils.getNamedBoolean(v4, ((XmlPullParser)arg5), "reparentWithOverlay", 1, true);
        this.mReparent = TypedArrayUtils.getNamedBoolean(v4, ((XmlPullParser)arg5), "reparent", 0, true);
        v4.recycle();
    }

    public ChangeTransform() {
        super();
        this.mUseOverlay = true;
        this.mReparent = true;
        this.mTempMatrix = new Matrix();
    }

    public void captureEndValues(@NonNull TransitionValues arg1) {
        this.captureValues(arg1);
    }

    public void captureStartValues(@NonNull TransitionValues arg2) {
        this.captureValues(arg2);
        if(!ChangeTransform.SUPPORTS_VIEW_REMOVAL_SUPPRESSION) {
            arg2.view.getParent().startViewTransition(arg2.view);
        }
    }

    private void captureValues(TransitionValues arg5) {
        Matrix v2;
        View v0 = arg5.view;
        if(v0.getVisibility() == 8) {
            return;
        }

        arg5.values.put("android:changeTransform:parent", v0.getParent());
        arg5.values.put("android:changeTransform:transforms", new Transforms(v0));
        Matrix v1 = v0.getMatrix();
        if(v1 == null || (v1.isIdentity())) {
            Object v2_1 = null;
        }
        else {
            v2 = new Matrix(v1);
        }

        arg5.values.put("android:changeTransform:matrix", v2);
        if(this.mReparent) {
            v1 = new Matrix();
            ViewParent v2_2 = v0.getParent();
            ViewUtils.transformMatrixToGlobal(((View)v2_2), v1);
            v1.preTranslate(((float)(-((ViewGroup)v2_2).getScrollX())), ((float)(-((ViewGroup)v2_2).getScrollY())));
            arg5.values.put("android:changeTransform:parentMatrix", v1);
            arg5.values.put("android:changeTransform:intermediateMatrix", v0.getTag(R$id.transition_transform));
            arg5.values.put("android:changeTransform:intermediateParentMatrix", v0.getTag(R$id.parent_matrix));
        }
    }

    public Animator createAnimator(@NonNull ViewGroup arg6, TransitionValues arg7, TransitionValues arg8) {
        if(arg7 != null && arg8 != null && (arg7.values.containsKey("android:changeTransform:parent"))) {
            if(!arg8.values.containsKey("android:changeTransform:parent")) {
            }
            else {
                Object v0 = arg7.values.get("android:changeTransform:parent");
                Object v1 = arg8.values.get("android:changeTransform:parent");
                boolean v1_1 = !this.mReparent || (this.parentsMatch(((ViewGroup)v0), ((ViewGroup)v1))) ? false : true;
                Object v2 = arg7.values.get("android:changeTransform:intermediateMatrix");
                if(v2 != null) {
                    arg7.values.put("android:changeTransform:matrix", v2);
                }

                v2 = arg7.values.get("android:changeTransform:intermediateParentMatrix");
                if(v2 != null) {
                    arg7.values.put("android:changeTransform:parentMatrix", v2);
                }

                if(v1_1) {
                    this.setMatricesForParent(arg7, arg8);
                }

                ObjectAnimator v2_1 = this.createTransformAnimator(arg7, arg8, v1_1);
                if((v1_1) && v2_1 != null && (this.mUseOverlay)) {
                    this.createGhostView(arg6, arg7, arg8);
                }
                else if(!ChangeTransform.SUPPORTS_VIEW_REMOVAL_SUPPRESSION) {
                    ((ViewGroup)v0).endViewTransition(arg7.view);
                }

                return ((Animator)v2_1);
            }
        }

        return null;
    }

    private void createGhostView(ViewGroup arg4, TransitionValues arg5, TransitionValues arg6) {
        View v0 = arg6.view;
        Matrix v2 = new Matrix(arg6.values.get("android:changeTransform:parentMatrix"));
        ViewUtils.transformMatrixToLocal(((View)arg4), v2);
        GhostViewImpl v4 = GhostViewUtils.addGhost(v0, arg4, v2);
        if(v4 == null) {
            return;
        }

        v4.reserveEndViewTransition(arg5.values.get("android:changeTransform:parent"), arg5.view);
        ChangeTransform v1 = this;
        while(((Transition)v1).mParent != null) {
            TransitionSet v1_1 = ((Transition)v1).mParent;
        }

        ((Transition)v1).addListener(new GhostListener(v0, v4));
        if(ChangeTransform.SUPPORTS_VIEW_REMOVAL_SUPPRESSION) {
            if(arg5.view != arg6.view) {
                ViewUtils.setTransitionAlpha(arg5.view, 0f);
            }

            ViewUtils.setTransitionAlpha(v0, 1f);
        }
    }

    private ObjectAnimator createTransformAnimator(TransitionValues arg13, TransitionValues arg14, boolean arg15) {
        Matrix v13_1;
        Object v13 = arg13.values.get("android:changeTransform:matrix");
        Object v0 = arg14.values.get("android:changeTransform:matrix");
        if(v13 == null) {
            v13_1 = MatrixUtils.IDENTITY_MATRIX;
        }

        if(v0 == null) {
            Matrix v0_1 = MatrixUtils.IDENTITY_MATRIX;
        }

        Object v4 = v0;
        if(v13_1.equals(v4)) {
            return null;
        }

        Object v6 = arg14.values.get("android:changeTransform:transforms");
        View v5 = arg14.view;
        ChangeTransform.setIdentityTransforms(v5);
        float[] v0_2 = new float[9];
        v13_1.getValues(v0_2);
        float[] v13_2 = new float[9];
        ((Matrix)v4).getValues(v13_2);
        PathAnimatorMatrix v7 = new PathAnimatorMatrix(v5, v0_2);
        ObjectAnimator v13_3 = ObjectAnimator.ofPropertyValuesHolder(v7, new PropertyValuesHolder[]{PropertyValuesHolder.ofObject(ChangeTransform.NON_TRANSLATIONS_PROPERTY, new FloatArrayEvaluator(new float[9]), new float[][]{v0_2, v13_2}), PropertyValuesHolderUtils.ofPointF(ChangeTransform.TRANSLATIONS_PROPERTY, this.getPathMotion().getPath(v0_2[2], v0_2[5], v13_2[2], v13_2[5]))});
        androidx.transition.ChangeTransform$3 v14 = new AnimatorListenerAdapter(arg15, ((Matrix)v4), v5, ((Transforms)v6), v7) {
            private boolean mIsCanceled;
            private Matrix mTempMatrix;

            public void onAnimationCancel(Animator arg1) {
                this.mIsCanceled = true;
            }

            public void onAnimationEnd(Animator arg3) {
                Object v0 = null;
                if(!this.mIsCanceled) {
                    if((this.val$handleParentChange) && (ChangeTransform.this.mUseOverlay)) {
                        this.setCurrentMatrix(this.val$finalEndMatrix);
                        goto label_17;
                    }

                    this.val$view.setTag(R$id.transition_transform, v0);
                    this.val$view.setTag(R$id.parent_matrix, v0);
                }

            label_17:
                ViewUtils.setAnimationMatrix(this.val$view, ((Matrix)v0));
                this.val$transforms.restore(this.val$view);
            }

            public void onAnimationPause(Animator arg1) {
                this.setCurrentMatrix(this.val$pathAnimatorMatrix.getMatrix());
            }

            public void onAnimationResume(Animator arg1) {
                ChangeTransform.setIdentityTransforms(this.val$view);
            }

            private void setCurrentMatrix(Matrix arg3) {
                this.mTempMatrix.set(arg3);
                this.val$view.setTag(R$id.transition_transform, this.mTempMatrix);
                this.val$transforms.restore(this.val$view);
            }
        };
        v13_3.addListener(((Animator$AnimatorListener)v14));
        AnimatorUtils.addPauseListener(((Animator)v13_3), ((AnimatorListenerAdapter)v14));
        return v13_3;
    }

    public boolean getReparent() {
        return this.mReparent;
    }

    public boolean getReparentWithOverlay() {
        return this.mUseOverlay;
    }

    public String[] getTransitionProperties() {
        return ChangeTransform.sTransitionProperties;
    }

    private boolean parentsMatch(ViewGroup arg4, ViewGroup arg5) {
        boolean v2 = false;
        if((this.isValidTarget(((View)arg4))) && (this.isValidTarget(((View)arg5)))) {
            TransitionValues v4 = this.getMatchedTransitionValues(((View)arg4), true);
            if(v4 != null) {
                if(arg5 != v4.view) {
                    return v2;
                }

                goto label_11;
            }
        }
        else if(arg4 == arg5) {
        label_11:
            v2 = true;
        }

        return v2;
    }

    static void setIdentityTransforms(View arg9) {
        ChangeTransform.setTransforms(arg9, 0f, 0f, 0f, 1f, 1f, 0f, 0f, 0f);
    }

    private void setMatricesForParent(TransitionValues arg4, TransitionValues arg5) {
        Matrix v0_1;
        Object v0 = arg5.values.get("android:changeTransform:parentMatrix");
        arg5.view.setTag(R$id.parent_matrix, v0);
        Matrix v5 = this.mTempMatrix;
        v5.reset();
        ((Matrix)v0).invert(v5);
        v0 = arg4.values.get("android:changeTransform:matrix");
        if(v0 == null) {
            v0_1 = new Matrix();
            arg4.values.put("android:changeTransform:matrix", v0_1);
        }

        v0_1.postConcat(arg4.values.get("android:changeTransform:parentMatrix"));
        v0_1.postConcat(v5);
    }

    public void setReparent(boolean arg1) {
        this.mReparent = arg1;
    }

    public void setReparentWithOverlay(boolean arg1) {
        this.mUseOverlay = arg1;
    }

    static void setTransforms(View arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
        arg0.setTranslationX(arg1);
        arg0.setTranslationY(arg2);
        ViewCompat.setTranslationZ(arg0, arg3);
        arg0.setScaleX(arg4);
        arg0.setScaleY(arg5);
        arg0.setRotationX(arg6);
        arg0.setRotationY(arg7);
        arg0.setRotation(arg8);
    }
}

