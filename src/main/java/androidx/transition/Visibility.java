package androidx.transition;

import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.xmlpull.v1.XmlPullParser;

public abstract class Visibility extends Transition {
    class DisappearListener extends AnimatorListenerAdapter implements AnimatorPauseListenerCompat, TransitionListener {
        boolean mCanceled;
        private final int mFinalVisibility;
        private boolean mLayoutSuppressed;
        private final ViewGroup mParent;
        private final boolean mSuppressLayout;
        private final View mView;

        DisappearListener(View arg2, int arg3, boolean arg4) {
            super();
            this.mCanceled = false;
            this.mView = arg2;
            this.mFinalVisibility = arg3;
            this.mParent = arg2.getParent();
            this.mSuppressLayout = arg4;
            this.suppressLayout(true);
        }

        private void hideViewWhenNotCanceled() {
            if(!this.mCanceled) {
                ViewUtils.setTransitionVisibility(this.mView, this.mFinalVisibility);
                if(this.mParent != null) {
                    this.mParent.invalidate();
                }
            }

            this.suppressLayout(false);
        }

        public void onAnimationCancel(Animator arg1) {
            this.mCanceled = true;
        }

        public void onAnimationEnd(Animator arg1) {
            this.hideViewWhenNotCanceled();
        }

        public void onAnimationPause(Animator arg2) {
            if(!this.mCanceled) {
                ViewUtils.setTransitionVisibility(this.mView, this.mFinalVisibility);
            }
        }

        public void onAnimationRepeat(Animator arg1) {
        }

        public void onAnimationResume(Animator arg2) {
            if(!this.mCanceled) {
                ViewUtils.setTransitionVisibility(this.mView, 0);
            }
        }

        public void onAnimationStart(Animator arg1) {
        }

        public void onTransitionCancel(@NonNull Transition arg1) {
        }

        public void onTransitionEnd(@NonNull Transition arg1) {
            this.hideViewWhenNotCanceled();
            arg1.removeListener(((TransitionListener)this));
        }

        public void onTransitionPause(@NonNull Transition arg1) {
            this.suppressLayout(false);
        }

        public void onTransitionResume(@NonNull Transition arg1) {
            this.suppressLayout(true);
        }

        public void onTransitionStart(@NonNull Transition arg1) {
        }

        private void suppressLayout(boolean arg2) {
            if((this.mSuppressLayout) && this.mLayoutSuppressed != arg2 && this.mParent != null) {
                this.mLayoutSuppressed = arg2;
                ViewGroupUtils.suppressLayout(this.mParent, arg2);
            }
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface Mode {
    }

    class VisibilityInfo {
        ViewGroup mEndParent;
        int mEndVisibility;
        boolean mFadeIn;
        ViewGroup mStartParent;
        int mStartVisibility;
        boolean mVisibilityChange;

        VisibilityInfo() {
            super();
        }
    }

    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final String PROPNAME_PARENT = "android:visibility:parent";
    private static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private int mMode;
    private static final String[] sTransitionProperties;

    static {
        Visibility.sTransitionProperties = new String[]{"android:visibility:visibility", "android:visibility:parent"};
    }

    public Visibility() {
        super();
        this.mMode = 3;
    }

    public Visibility(Context arg3, AttributeSet arg4) {
        super(arg3, arg4);
        this.mMode = 3;
        TypedArray v3 = arg3.obtainStyledAttributes(arg4, Styleable.VISIBILITY_TRANSITION);
        int v4 = TypedArrayUtils.getNamedInt(v3, ((XmlPullParser)arg4), "transitionVisibilityMode", 0, 0);
        v3.recycle();
        if(v4 != 0) {
            this.setMode(v4);
        }
    }

    public void captureEndValues(@NonNull TransitionValues arg1) {
        this.captureValues(arg1);
    }

    public void captureStartValues(@NonNull TransitionValues arg1) {
        this.captureValues(arg1);
    }

    private void captureValues(TransitionValues arg4) {
        arg4.values.put("android:visibility:visibility", Integer.valueOf(arg4.view.getVisibility()));
        arg4.values.put("android:visibility:parent", arg4.view.getParent());
        int[] v0 = new int[2];
        arg4.view.getLocationOnScreen(v0);
        arg4.values.put("android:visibility:screenLocation", v0);
    }

    @Nullable public Animator createAnimator(@NonNull ViewGroup arg9, @Nullable TransitionValues arg10, @Nullable TransitionValues arg11) {
        VisibilityInfo v0 = this.getVisibilityChangeInfo(arg10, arg11);
        if((v0.mVisibilityChange) && (v0.mStartParent != null || v0.mEndParent != null)) {
            if(v0.mFadeIn) {
                return this.onAppear(arg9, arg10, v0.mStartVisibility, arg11, v0.mEndVisibility);
            }

            return this.onDisappear(arg9, arg10, v0.mStartVisibility, arg11, v0.mEndVisibility);
        }

        return null;
    }

    public int getMode() {
        return this.mMode;
    }

    @Nullable public String[] getTransitionProperties() {
        return Visibility.sTransitionProperties;
    }

    private VisibilityInfo getVisibilityChangeInfo(TransitionValues arg7, TransitionValues arg8) {
        VisibilityInfo v0 = new VisibilityInfo();
        v0.mVisibilityChange = false;
        v0.mFadeIn = false;
        ViewGroup v2 = null;
        int v3 = -1;
        if(arg7 == null || !arg7.values.containsKey("android:visibility:visibility")) {
            v0.mStartVisibility = v3;
            v0.mStartParent = v2;
        }
        else {
            v0.mStartVisibility = arg7.values.get("android:visibility:visibility").intValue();
            v0.mStartParent = arg7.values.get("android:visibility:parent");
        }

        if(arg8 == null || !arg8.values.containsKey("android:visibility:visibility")) {
            v0.mEndVisibility = v3;
            v0.mEndParent = v2;
        }
        else {
            v0.mEndVisibility = arg8.values.get("android:visibility:visibility").intValue();
            v0.mEndParent = arg8.values.get("android:visibility:parent");
        }

        if(arg7 == null || arg8 == null) {
            if(arg7 == null && v0.mEndVisibility == 0) {
                v0.mFadeIn = true;
                v0.mVisibilityChange = true;
                return v0;
            }

            if(arg8 != null) {
                return v0;
            }

            if(v0.mStartVisibility != 0) {
                return v0;
            }

            v0.mFadeIn = false;
            v0.mVisibilityChange = true;
        }
        else {
            if(v0.mStartVisibility == v0.mEndVisibility && v0.mStartParent == v0.mEndParent) {
                return v0;
            }

            if(v0.mStartVisibility != v0.mEndVisibility) {
                if(v0.mStartVisibility == 0) {
                    v0.mFadeIn = false;
                    v0.mVisibilityChange = true;
                    return v0;
                }

                if(v0.mEndVisibility != 0) {
                    return v0;
                }

                v0.mFadeIn = true;
                v0.mVisibilityChange = true;
                return v0;
            }

            if(v0.mEndParent == null) {
                v0.mFadeIn = false;
                v0.mVisibilityChange = true;
                return v0;
            }

            if(v0.mStartParent != null) {
                return v0;
            }

            v0.mFadeIn = true;
            v0.mVisibilityChange = true;
        }

        return v0;
    }

    public boolean isTransitionRequired(TransitionValues arg5, TransitionValues arg6) {
        boolean v0 = false;
        if(arg5 == null && arg6 == null) {
            return 0;
        }

        if(arg5 != null && arg6 != null && arg6.values.containsKey("android:visibility:visibility") != arg5.values.containsKey("android:visibility:visibility")) {
            return 0;
        }

        VisibilityInfo v5 = this.getVisibilityChangeInfo(arg5, arg6);
        if((v5.mVisibilityChange) && (v5.mStartVisibility == 0 || v5.mEndVisibility == 0)) {
            v0 = true;
        }

        return v0;
    }

    public boolean isVisible(TransitionValues arg4) {
        boolean v0 = false;
        if(arg4 == null) {
            return 0;
        }

        int v1 = arg4.values.get("android:visibility:visibility").intValue();
        Object v4 = arg4.values.get("android:visibility:parent");
        if(v1 == 0 && v4 != null) {
            v0 = true;
        }

        return v0;
    }

    public Animator onAppear(ViewGroup arg3, TransitionValues arg4, int arg5, TransitionValues arg6, int arg7) {
        Animator v0 = null;
        if((this.mMode & 1) == 1) {
            if(arg6 == null) {
            }
            else {
                if(arg4 == null) {
                    ViewParent v5 = arg6.view.getParent();
                    if(this.getVisibilityChangeInfo(this.getMatchedTransitionValues(((View)v5), false), this.getTransitionValues(((View)v5), false)).mVisibilityChange) {
                        return v0;
                    }
                }

                return this.onAppear(arg3, arg6.view, arg4, arg6);
            }
        }

        return v0;
    }

    public Animator onAppear(ViewGroup arg1, View arg2, TransitionValues arg3, TransitionValues arg4) {
        return null;
    }

    public Animator onDisappear(ViewGroup arg7, TransitionValues arg8, int arg9, TransitionValues arg10, int arg11) {
        Animator v7;
        int v0 = 2;
        Animator v1 = null;
        if((this.mMode & v0) != v0) {
            return v1;
        }

        View v9 = arg8 != null ? arg8.view : ((View)v1);
        View v2 = arg10 != null ? arg10.view : ((View)v1);
        if(v2 == null || v2.getParent() == null) {
            if(v2 != null) {
                v9 = v2;
                goto label_33;
            }

            if(v9 != null) {
                if(v9.getParent() == null) {
                    goto label_33;
                }
                else if((v9.getParent() instanceof View)) {
                    ViewParent v2_1 = v9.getParent();
                    if(!this.getVisibilityChangeInfo(this.getTransitionValues(((View)v2_1), true), this.getMatchedTransitionValues(((View)v2_1), true)).mVisibilityChange) {
                        v9 = TransitionUtils.copyViewImage(arg7, v9, ((View)v2_1));
                        goto label_33;
                    }
                    else {
                        if(((View)v2_1).getParent() == null) {
                            int v2_2 = ((View)v2_1).getId();
                            if(v2_2 != -1 && arg7.findViewById(v2_2) != null && (this.mCanRemoveViews)) {
                                goto label_33;
                            }
                        }

                        v9 = ((View)v1);
                    label_33:
                        v2 = ((View)v1);
                        goto label_64;
                    }
                }
            }

            v9 = ((View)v1);
            v2 = v9;
        }
        else {
            if(arg11 == 4) {
            }
            else {
                if(v9 == v2) {
                    goto label_23;
                }

                goto label_25;
            }

        label_23:
            v9 = ((View)v1);
            goto label_64;
        label_25:
            if(this.mCanRemoveViews) {
                goto label_33;
            }

            v9 = TransitionUtils.copyViewImage(arg7, v9, v9.getParent());
            goto label_33;
        }

    label_64:
        if(v9 != null && arg8 != null) {
            Object v11 = arg8.values.get("android:visibility:screenLocation");
            int v1_1 = v11[0];
            arg11 = v11[1];
            int[] v0_1 = new int[v0];
            arg7.getLocationOnScreen(v0_1);
            v9.offsetLeftAndRight(v1_1 - v0_1[0] - v9.getLeft());
            v9.offsetTopAndBottom(arg11 - v0_1[1] - v9.getTop());
            ViewGroupOverlayImpl v11_1 = ViewGroupUtils.getOverlay(arg7);
            v11_1.add(v9);
            v7 = this.onDisappear(arg7, v9, arg8, arg10);
            if(v7 == null) {
                v11_1.remove(v9);
            }
            else {
                v7.addListener(new AnimatorListenerAdapter(v11_1, v9) {
                    public void onAnimationEnd(Animator arg2) {
                        this.val$overlay.remove(this.val$finalOverlayView);
                    }
                });
            }

            return v7;
        }

        if(v2 != null) {
            arg9 = v2.getVisibility();
            ViewUtils.setTransitionVisibility(v2, 0);
            v7 = this.onDisappear(arg7, v2, arg8, arg10);
            if(v7 != null) {
                DisappearListener v8 = new DisappearListener(v2, arg11, true);
                v7.addListener(((Animator$AnimatorListener)v8));
                AnimatorUtils.addPauseListener(v7, ((AnimatorListenerAdapter)v8));
                this.addListener(((TransitionListener)v8));
            }
            else {
                ViewUtils.setTransitionVisibility(v2, arg9);
            }

            return v7;
        }

        return v1;
    }

    public Animator onDisappear(ViewGroup arg1, View arg2, TransitionValues arg3, TransitionValues arg4) {
        return null;
    }

    public void setMode(int arg2) {
        if((arg2 & -4) == 0) {
            this.mMode = arg2;
            return;
        }

        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
}

