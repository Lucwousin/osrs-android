package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

public class ChangeBounds extends Transition {
    final class androidx.transition.ChangeBounds$1 extends Property {
        private Rect mBounds;

        androidx.transition.ChangeBounds$1(Class arg1, String arg2) {
            super(arg1, arg2);
            this.mBounds = new Rect();
        }

        public PointF get(Drawable arg3) {
            arg3.copyBounds(this.mBounds);
            return new PointF(((float)this.mBounds.left), ((float)this.mBounds.top));
        }

        public Object get(Object arg1) {
            return this.get(((Drawable)arg1));
        }

        public void set(Drawable arg3, PointF arg4) {
            arg3.copyBounds(this.mBounds);
            this.mBounds.offsetTo(Math.round(arg4.x), Math.round(arg4.y));
            arg3.setBounds(this.mBounds);
        }

        public void set(Object arg1, Object arg2) {
            this.set(((Drawable)arg1), ((PointF)arg2));
        }
    }

    final class androidx.transition.ChangeBounds$2 extends Property {
        androidx.transition.ChangeBounds$2(Class arg1, String arg2) {
            super(arg1, arg2);
        }

        public PointF get(ViewBounds arg1) {
            return null;
        }

        public Object get(Object arg1) {
            return this.get(((ViewBounds)arg1));
        }

        public void set(ViewBounds arg1, PointF arg2) {
            arg1.setTopLeft(arg2);
        }

        public void set(Object arg1, Object arg2) {
            this.set(((ViewBounds)arg1), ((PointF)arg2));
        }
    }

    final class androidx.transition.ChangeBounds$3 extends Property {
        androidx.transition.ChangeBounds$3(Class arg1, String arg2) {
            super(arg1, arg2);
        }

        public PointF get(ViewBounds arg1) {
            return null;
        }

        public Object get(Object arg1) {
            return this.get(((ViewBounds)arg1));
        }

        public void set(ViewBounds arg1, PointF arg2) {
            arg1.setBottomRight(arg2);
        }

        public void set(Object arg1, Object arg2) {
            this.set(((ViewBounds)arg1), ((PointF)arg2));
        }
    }

    final class androidx.transition.ChangeBounds$4 extends Property {
        androidx.transition.ChangeBounds$4(Class arg1, String arg2) {
            super(arg1, arg2);
        }

        public PointF get(View arg1) {
            return null;
        }

        public Object get(Object arg1) {
            return this.get(((View)arg1));
        }

        public void set(View arg4, PointF arg5) {
            ViewUtils.setLeftTopRightBottom(arg4, arg4.getLeft(), arg4.getTop(), Math.round(arg5.x), Math.round(arg5.y));
        }

        public void set(Object arg1, Object arg2) {
            this.set(((View)arg1), ((PointF)arg2));
        }
    }

    final class androidx.transition.ChangeBounds$5 extends Property {
        androidx.transition.ChangeBounds$5(Class arg1, String arg2) {
            super(arg1, arg2);
        }

        public PointF get(View arg1) {
            return null;
        }

        public Object get(Object arg1) {
            return this.get(((View)arg1));
        }

        public void set(View arg4, PointF arg5) {
            ViewUtils.setLeftTopRightBottom(arg4, Math.round(arg5.x), Math.round(arg5.y), arg4.getRight(), arg4.getBottom());
        }

        public void set(Object arg1, Object arg2) {
            this.set(((View)arg1), ((PointF)arg2));
        }
    }

    final class androidx.transition.ChangeBounds$6 extends Property {
        androidx.transition.ChangeBounds$6(Class arg1, String arg2) {
            super(arg1, arg2);
        }

        public PointF get(View arg1) {
            return null;
        }

        public Object get(Object arg1) {
            return this.get(((View)arg1));
        }

        public void set(View arg4, PointF arg5) {
            int v0 = Math.round(arg5.x);
            int v5 = Math.round(arg5.y);
            ViewUtils.setLeftTopRightBottom(arg4, v0, v5, arg4.getWidth() + v0, arg4.getHeight() + v5);
        }

        public void set(Object arg1, Object arg2) {
            this.set(((View)arg1), ((PointF)arg2));
        }
    }

    class ViewBounds {
        private int mBottom;
        private int mBottomRightCalls;
        private int mLeft;
        private int mRight;
        private int mTop;
        private int mTopLeftCalls;
        private View mView;

        ViewBounds(View arg1) {
            super();
            this.mView = arg1;
        }

        void setBottomRight(PointF arg2) {
            this.mRight = Math.round(arg2.x);
            this.mBottom = Math.round(arg2.y);
            ++this.mBottomRightCalls;
            if(this.mTopLeftCalls == this.mBottomRightCalls) {
                this.setLeftTopRightBottom();
            }
        }

        private void setLeftTopRightBottom() {
            ViewUtils.setLeftTopRightBottom(this.mView, this.mLeft, this.mTop, this.mRight, this.mBottom);
            this.mTopLeftCalls = 0;
            this.mBottomRightCalls = 0;
        }

        void setTopLeft(PointF arg2) {
            this.mLeft = Math.round(arg2.x);
            this.mTop = Math.round(arg2.y);
            ++this.mTopLeftCalls;
            if(this.mTopLeftCalls == this.mBottomRightCalls) {
                this.setLeftTopRightBottom();
            }
        }
    }

    private static final Property BOTTOM_RIGHT_ONLY_PROPERTY = null;
    private static final Property BOTTOM_RIGHT_PROPERTY = null;
    private static final Property DRAWABLE_ORIGIN_PROPERTY = null;
    private static final Property POSITION_PROPERTY = null;
    private static final String PROPNAME_BOUNDS = "android:changeBounds:bounds";
    private static final String PROPNAME_CLIP = "android:changeBounds:clip";
    private static final String PROPNAME_PARENT = "android:changeBounds:parent";
    private static final String PROPNAME_WINDOW_X = "android:changeBounds:windowX";
    private static final String PROPNAME_WINDOW_Y = "android:changeBounds:windowY";
    private static final Property TOP_LEFT_ONLY_PROPERTY;
    private static final Property TOP_LEFT_PROPERTY;
    private boolean mReparent;
    private boolean mResizeClip;
    private int[] mTempLocation;
    private static RectEvaluator sRectEvaluator;
    private static final String[] sTransitionProperties;

    static {
        ChangeBounds.sTransitionProperties = new String[]{"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
        ChangeBounds.DRAWABLE_ORIGIN_PROPERTY = new androidx.transition.ChangeBounds$1(PointF.class, "boundsOrigin");
        ChangeBounds.TOP_LEFT_PROPERTY = new androidx.transition.ChangeBounds$2(PointF.class, "topLeft");
        ChangeBounds.BOTTOM_RIGHT_PROPERTY = new androidx.transition.ChangeBounds$3(PointF.class, "bottomRight");
        ChangeBounds.BOTTOM_RIGHT_ONLY_PROPERTY = new androidx.transition.ChangeBounds$4(PointF.class, "bottomRight");
        ChangeBounds.TOP_LEFT_ONLY_PROPERTY = new androidx.transition.ChangeBounds$5(PointF.class, "topLeft");
        ChangeBounds.POSITION_PROPERTY = new androidx.transition.ChangeBounds$6(PointF.class, "position");
        ChangeBounds.sRectEvaluator = new RectEvaluator();
    }

    public ChangeBounds(Context arg3, AttributeSet arg4) {
        super(arg3, arg4);
        this.mTempLocation = new int[2];
        this.mResizeClip = false;
        this.mReparent = false;
        TypedArray v3 = arg3.obtainStyledAttributes(arg4, Styleable.CHANGE_BOUNDS);
        boolean v4 = TypedArrayUtils.getNamedBoolean(v3, ((XmlPullParser)arg4), "resizeClip", 0, false);
        v3.recycle();
        this.setResizeClip(v4);
    }

    public ChangeBounds() {
        super();
        this.mTempLocation = new int[2];
        this.mResizeClip = false;
        this.mReparent = false;
    }

    public void captureEndValues(@NonNull TransitionValues arg1) {
        this.captureValues(arg1);
    }

    public void captureStartValues(@NonNull TransitionValues arg1) {
        this.captureValues(arg1);
    }

    private void captureValues(TransitionValues arg9) {
        View v0 = arg9.view;
        if((ViewCompat.isLaidOut(v0)) || v0.getWidth() != 0 || v0.getHeight() != 0) {
            arg9.values.put("android:changeBounds:bounds", new Rect(v0.getLeft(), v0.getTop(), v0.getRight(), v0.getBottom()));
            arg9.values.put("android:changeBounds:parent", arg9.view.getParent());
            if(this.mReparent) {
                arg9.view.getLocationInWindow(this.mTempLocation);
                arg9.values.put("android:changeBounds:windowX", Integer.valueOf(this.mTempLocation[0]));
                arg9.values.put("android:changeBounds:windowY", Integer.valueOf(this.mTempLocation[1]));
            }

            if(!this.mResizeClip) {
                return;
            }

            arg9.values.put("android:changeBounds:clip", ViewCompat.getClipBounds(v0));
        }
    }

    @Nullable public Animator createAnimator(@NonNull ViewGroup arg21, @Nullable TransitionValues arg22, @Nullable TransitionValues arg23) {
        Animator v10_2;
        ObjectAnimator v10_1;
        Rect v2_2;
        Object v1_4;
        ObjectAnimator v11_2;
        ObjectAnimator v0_3;
        int v0_2;
        int v1_1;
        int v2;
        int v3_2;
        ChangeBounds v8 = this;
        TransitionValues v0 = arg22;
        TransitionValues v1 = arg23;
        if(v0 != null) {
            if(v1 == null) {
            }
            else {
                Map v3 = v0.values;
                Map v4 = v1.values;
                Object v3_1 = v3.get("android:changeBounds:parent");
                Object v4_1 = v4.get("android:changeBounds:parent");
                if(v3_1 != null) {
                    if(v4_1 == null) {
                    }
                    else {
                        View v9 = v1.view;
                        if(v8.parentMatches(((View)v3_1), ((View)v4_1))) {
                            v3_1 = v0.values.get("android:changeBounds:bounds");
                            Object v5 = v1.values.get("android:changeBounds:bounds");
                            int v6 = ((Rect)v3_1).left;
                            int v7 = ((Rect)v5).left;
                            int v11 = ((Rect)v3_1).top;
                            int v12 = ((Rect)v5).top;
                            int v13 = ((Rect)v3_1).right;
                            int v14 = ((Rect)v5).right;
                            v3_2 = ((Rect)v3_1).bottom;
                            int v15 = ((Rect)v5).bottom;
                            int v5_1 = v13 - v6;
                            v2 = v3_2 - v11;
                            int v10 = v14 - v7;
                            int v4_2 = v15 - v12;
                            View v16 = v9;
                            Object v0_1 = v0.values.get("android:changeBounds:clip");
                            Object v9_1 = v1.values.get("android:changeBounds:clip");
                            if(v5_1 == 0 || v2 == 0) {
                                if(v10 != 0 && v4_2 != 0) {
                                label_48:
                                    v1_1 = v6 != v7 || v11 != v12 ? 1 : 0;
                                    if(v13 == v14 && v3_2 == v15) {
                                        goto label_59;
                                    }

                                    ++v1_1;
                                    goto label_59;
                                }

                                v1_1 = 0;
                            }
                            else {
                                goto label_48;
                            }

                        label_59:
                            if(v0_1 != null && !((Rect)v0_1).equals(v9_1) || v0_1 == null && v9_1 != null) {
                                ++v1_1;
                            }

                            if(v1_1 <= 0) {
                                return null;
                            }

                            Object v18 = v9_1;
                            Object v19 = v0_1;
                            v0_2 = 2;
                            if(!v8.mResizeClip) {
                                v9 = v16;
                                ViewUtils.setLeftTopRightBottom(v9, v6, v11, v13, v3_2);
                                if(v1_1 == v0_2) {
                                    if(v5_1 == v10 && v2 == v4_2) {
                                        v0_3 = ObjectAnimatorUtils.ofPointF(v9, ChangeBounds.POSITION_PROPERTY, this.getPathMotion().getPath(((float)v6), ((float)v11), ((float)v7), ((float)v12)));
                                        goto label_194;
                                    }

                                    ViewBounds v1_2 = new ViewBounds(v9);
                                    ObjectAnimator v2_1 = ObjectAnimatorUtils.ofPointF(v1_2, ChangeBounds.TOP_LEFT_PROPERTY, this.getPathMotion().getPath(((float)v6), ((float)v11), ((float)v7), ((float)v12)));
                                    ObjectAnimator v3_3 = ObjectAnimatorUtils.ofPointF(v1_2, ChangeBounds.BOTTOM_RIGHT_PROPERTY, this.getPathMotion().getPath(((float)v13), ((float)v3_2), ((float)v14), ((float)v15)));
                                    AnimatorSet v4_3 = new AnimatorSet();
                                    Animator[] v0_4 = new Animator[v0_2];
                                    v0_4[0] = v2_1;
                                    v0_4[1] = v3_3;
                                    v4_3.playTogether(v0_4);
                                    v4_3.addListener(new AnimatorListenerAdapter(v1_2) {
                                        private ViewBounds mViewBounds;

                                    });
                                    AnimatorSet v0_5 = v4_3;
                                }
                                else {
                                    if(v6 == v7) {
                                        if(v11 != v12) {
                                        }
                                        else {
                                            v0_3 = ObjectAnimatorUtils.ofPointF(v9, ChangeBounds.BOTTOM_RIGHT_ONLY_PROPERTY, this.getPathMotion().getPath(((float)v13), ((float)v3_2), ((float)v14), ((float)v15)));
                                            goto label_194;
                                        }
                                    }

                                    v0_3 = ObjectAnimatorUtils.ofPointF(v9, ChangeBounds.TOP_LEFT_ONLY_PROPERTY, this.getPathMotion().getPath(((float)v6), ((float)v11), ((float)v7), ((float)v12)));
                                }
                            }
                            else {
                                v9 = v16;
                                ViewUtils.setLeftTopRightBottom(v9, v6, v11, Math.max(v5_1, v10) + v6, Math.max(v2, v4_2) + v11);
                                if(v6 != v7 || v11 != v12) {
                                    v11_2 = ObjectAnimatorUtils.ofPointF(v9, ChangeBounds.POSITION_PROPERTY, this.getPathMotion().getPath(((float)v6), ((float)v11), ((float)v7), ((float)v12)));
                                }
                                else {
                                    Animator v11_1 = null;
                                }

                                if(v19 == null) {
                                    v3_2 = 0;
                                    Rect v1_3 = new Rect(0, 0, v5_1, v2);
                                }
                                else {
                                    v3_2 = 0;
                                    v1_4 = v19;
                                }

                                if(v18 == null) {
                                    v2_2 = new Rect(v3_2, v3_2, v10, v4_2);
                                }
                                else {
                                    Object v2_3 = v18;
                                }

                                if(!((Rect)v1_4).equals(v2_2)) {
                                    ViewCompat.setClipBounds(v9, ((Rect)v1_4));
                                    RectEvaluator v5_2 = ChangeBounds.sRectEvaluator;
                                    Object[] v0_6 = new Object[v0_2];
                                    v0_6[v3_2] = ((Rect)v1_4);
                                    v0_6[1] = v2_2;
                                    v10_1 = ObjectAnimator.ofObject(v9, "clipBounds", ((TypeEvaluator)v5_2), v0_6);
                                    v10_1.addListener(new AnimatorListenerAdapter(v9, v18, v7, v12, v14, v15) {
                                        private boolean mIsCanceled;

                                        public void onAnimationCancel(Animator arg1) {
                                            this.mIsCanceled = true;
                                        }

                                        public void onAnimationEnd(Animator arg5) {
                                            if(!this.mIsCanceled) {
                                                ViewCompat.setClipBounds(this.val$view, this.val$finalClip);
                                                ViewUtils.setLeftTopRightBottom(this.val$view, this.val$endLeft, this.val$endTop, this.val$endRight, this.val$endBottom);
                                            }
                                        }
                                    });
                                }
                                else {
                                    v10_2 = null;
                                }

                                Animator v0_7 = TransitionUtils.mergeAnimators(((Animator)v11_2), v10_2);
                            }

                        label_194:
                            if((v9.getParent() instanceof ViewGroup)) {
                                ViewParent v1_5 = v9.getParent();
                                ViewGroupUtils.suppressLayout(((ViewGroup)v1_5), true);
                                v8.addListener(new TransitionListenerAdapter(((ViewGroup)v1_5)) {
                                    boolean mCanceled;

                                    public void onTransitionCancel(@NonNull Transition arg2) {
                                        ViewGroupUtils.suppressLayout(this.val$parent, false);
                                        this.mCanceled = true;
                                    }

                                    public void onTransitionEnd(@NonNull Transition arg3) {
                                        if(!this.mCanceled) {
                                            ViewGroupUtils.suppressLayout(this.val$parent, false);
                                        }

                                        arg3.removeListener(((TransitionListener)this));
                                    }

                                    public void onTransitionPause(@NonNull Transition arg2) {
                                        ViewGroupUtils.suppressLayout(this.val$parent, false);
                                    }

                                    public void onTransitionResume(@NonNull Transition arg2) {
                                        ViewGroupUtils.suppressLayout(this.val$parent, true);
                                    }
                                });
                            }

                            return ((Animator)v0_3);
                        }
                        else {
                            v2 = v0.values.get("android:changeBounds:windowX").intValue();
                            v0_2 = v0.values.get("android:changeBounds:windowY").intValue();
                            v3_2 = v1.values.get("android:changeBounds:windowX").intValue();
                            v1_1 = v1.values.get("android:changeBounds:windowY").intValue();
                            if(v2 == v3_2) {
                                if(v0_2 != v1_1) {
                                }
                                else {
                                    return null;
                                }
                            }

                            goto label_225;
                        }

                        return null;
                    label_225:
                        arg21.getLocationInWindow(v8.mTempLocation);
                        Bitmap v4_4 = Bitmap.createBitmap(v9.getWidth(), v9.getHeight(), Bitmap$Config.ARGB_8888);
                        v9.draw(new Canvas(v4_4));
                        BitmapDrawable v6_1 = new BitmapDrawable(v4_4);
                        float v7_1 = ViewUtils.getTransitionAlpha(v9);
                        ViewUtils.setTransitionAlpha(v9, 0f);
                        ViewUtils.getOverlay(((View)arg21)).add(((Drawable)v6_1));
                        v10_1 = ObjectAnimator.ofPropertyValuesHolder(v6_1, new PropertyValuesHolder[]{PropertyValuesHolderUtils.ofPointF(ChangeBounds.DRAWABLE_ORIGIN_PROPERTY, this.getPathMotion().getPath(((float)(v2 - v8.mTempLocation[0])), ((float)(v0_2 - v8.mTempLocation[1])), ((float)(v3_2 - v8.mTempLocation[0])), ((float)(v1_1 - v8.mTempLocation[1]))))});
                        v10_1.addListener(new AnimatorListenerAdapter(arg21, v6_1, v9, v7_1) {
                            public void onAnimationEnd(Animator arg2) {
                                ViewUtils.getOverlay(this.val$sceneRoot).remove(this.val$drawable);
                                ViewUtils.setTransitionAlpha(this.val$view, this.val$transitionAlpha);
                            }
                        });
                        return ((Animator)v10_1);
                    }
                }

                return null;
            }
        }

        return null;
    }

    public boolean getResizeClip() {
        return this.mResizeClip;
    }

    @Nullable public String[] getTransitionProperties() {
        return ChangeBounds.sTransitionProperties;
    }

    private boolean parentMatches(View arg4, View arg5) {
        boolean v1 = true;
        if(this.mReparent) {
            TransitionValues v0 = this.getMatchedTransitionValues(arg4, true);
            if(v0 != null) {
                if(arg5 != v0.view) {
                    goto label_8;
                }

                return v1;
            }
            else if(arg4 == arg5) {
                return v1;
            }

        label_8:
            v1 = false;
        }

        return v1;
    }

    public void setResizeClip(boolean arg1) {
        this.mResizeClip = arg1;
    }
}

