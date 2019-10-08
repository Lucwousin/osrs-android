package androidx.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

class ViewOverlayApi14 implements ViewOverlayImpl {
    class OverlayViewGroup extends ViewGroup {
        class TouchInterceptor extends View {
            TouchInterceptor(Context arg1) {
                super(arg1);
            }
        }

        ArrayList mDrawables;
        ViewGroup mHostView;
        View mRequestingView;
        ViewOverlayApi14 mViewOverlay;
        static Method sInvalidateChildInParentFastMethod;

        static {
            try {
                OverlayViewGroup.sInvalidateChildInParentFastMethod = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", Integer.TYPE, Integer.TYPE, Rect.class);
                return;
            }
            catch(NoSuchMethodException ) {
                return;
            }
        }

        OverlayViewGroup(Context arg1, ViewGroup arg2, View arg3, ViewOverlayApi14 arg4) {
            super(arg1);
            this.mDrawables = null;
            this.mHostView = arg2;
            this.mRequestingView = arg3;
            this.setRight(arg2.getWidth());
            this.setBottom(arg2.getHeight());
            arg2.addView(((View)this));
            this.mViewOverlay = arg4;
        }

        public void add(Drawable arg2) {
            if(this.mDrawables == null) {
                this.mDrawables = new ArrayList();
            }

            if(!this.mDrawables.contains(arg2)) {
                this.mDrawables.add(arg2);
                this.invalidate(arg2.getBounds());
                arg2.setCallback(((Drawable$Callback)this));
            }
        }

        public void add(View arg7) {
            if((arg7.getParent() instanceof ViewGroup)) {
                ViewParent v0 = arg7.getParent();
                if(v0 != this.mHostView && ((ViewGroup)v0).getParent() != null && (ViewCompat.isAttachedToWindow(((View)v0)))) {
                    int[] v3 = new int[2];
                    int[] v2 = new int[2];
                    ((ViewGroup)v0).getLocationOnScreen(v3);
                    this.mHostView.getLocationOnScreen(v2);
                    ViewCompat.offsetLeftAndRight(arg7, v3[0] - v2[0]);
                    ViewCompat.offsetTopAndBottom(arg7, v3[1] - v2[1]);
                }

                ((ViewGroup)v0).removeView(arg7);
                if(arg7.getParent() == null) {
                    goto label_30;
                }

                ((ViewGroup)v0).removeView(arg7);
            }

        label_30:
            super.addView(arg7, this.getChildCount() - 1);
        }

        public void clear() {
            this.removeAllViews();
            if(this.mDrawables != null) {
                this.mDrawables.clear();
            }
        }

        protected void dispatchDraw(Canvas arg6) {
            int[] v1 = new int[2];
            int[] v0 = new int[2];
            this.mHostView.getLocationOnScreen(v1);
            this.mRequestingView.getLocationOnScreen(v0);
            int v2 = 0;
            arg6.translate(((float)(v0[0] - v1[0])), ((float)(v0[1] - v1[1])));
            arg6.clipRect(new Rect(0, 0, this.mRequestingView.getWidth(), this.mRequestingView.getHeight()));
            super.dispatchDraw(arg6);
            int v0_1 = this.mDrawables == null ? 0 : this.mDrawables.size();
            while(v2 < v0_1) {
                this.mDrawables.get(v2).draw(arg6);
                ++v2;
            }
        }

        public boolean dispatchTouchEvent(MotionEvent arg1) {
            return 0;
        }

        private void getOffset(int[] arg6) {
            int[] v1 = new int[2];
            int[] v0 = new int[2];
            this.mHostView.getLocationOnScreen(v1);
            this.mRequestingView.getLocationOnScreen(v0);
            arg6[0] = v0[0] - v1[0];
            arg6[1] = v0[1] - v1[1];
        }

        public void invalidateChildFast(View arg4, Rect arg5) {
            if(this.mHostView != null) {
                int v0 = arg4.getLeft();
                int v4 = arg4.getTop();
                int[] v1 = new int[2];
                this.getOffset(v1);
                arg5.offset(v0 + v1[0], v4 + v1[1]);
                this.mHostView.invalidate(arg5);
            }
        }

        public ViewParent invalidateChildInParent(int[] arg5, Rect arg6) {
            if(this.mHostView != null) {
                arg6.offset(arg5[0], arg5[1]);
                if((this.mHostView instanceof ViewGroup)) {
                    arg5[0] = 0;
                    arg5[1] = 0;
                    int[] v1 = new int[2];
                    this.getOffset(v1);
                    arg6.offset(v1[0], v1[1]);
                    return super.invalidateChildInParent(arg5, arg6);
                }
                else {
                    this.invalidate(arg6);
                }
            }

            return null;
        }

        @RestrictTo(value={Scope.LIBRARY_GROUP}) protected ViewParent invalidateChildInParentFast(int arg6, int arg7, Rect arg8) {
            if(((this.mHostView instanceof ViewGroup)) && OverlayViewGroup.sInvalidateChildInParentFastMethod != null) {
                int v0 = 2;
                try {
                    this.getOffset(new int[v0]);
                    Method v1 = OverlayViewGroup.sInvalidateChildInParentFastMethod;
                    ViewGroup v2 = this.mHostView;
                    Object[] v3 = new Object[3];
                    v3[0] = Integer.valueOf(arg6);
                    v3[1] = Integer.valueOf(arg7);
                    v3[v0] = arg8;
                    v1.invoke(v2, v3);
                }
                catch(InvocationTargetException v6) {
                    v6.printStackTrace();
                }
                catch(IllegalAccessException v6_1) {
                    v6_1.printStackTrace();
                }
            }

            return null;
        }

        public void invalidateDrawable(@NonNull Drawable arg1) {
            this.invalidate(arg1.getBounds());
        }

        boolean isEmpty() {
            boolean v0;
            if(this.getChildCount() == 0) {
                if(this.mDrawables != null && this.mDrawables.size() != 0) {
                    goto label_9;
                }

                v0 = true;
            }
            else {
            label_9:
                v0 = false;
            }

            return v0;
        }

        protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        }

        public void remove(Drawable arg2) {
            if(this.mDrawables != null) {
                this.mDrawables.remove(arg2);
                this.invalidate(arg2.getBounds());
                arg2.setCallback(null);
            }
        }

        public void remove(View arg1) {
            super.removeView(arg1);
            if(this.isEmpty()) {
                this.mHostView.removeView(((View)this));
            }
        }

        protected boolean verifyDrawable(@NonNull Drawable arg2) {
            boolean v2;
            if(!super.verifyDrawable(arg2)) {
                if(this.mDrawables != null && (this.mDrawables.contains(arg2))) {
                    goto label_10;
                }

                v2 = false;
            }
            else {
            label_10:
                v2 = true;
            }

            return v2;
        }
    }

    protected OverlayViewGroup mOverlayViewGroup;

    private ViewOverlayApi14() {
        super();
    }

    ViewOverlayApi14(Context arg2, ViewGroup arg3, View arg4) {
        super();
        this.mOverlayViewGroup = new OverlayViewGroup(arg2, arg3, arg4, this);
    }

    public void add(@NonNull Drawable arg2) {
        this.mOverlayViewGroup.add(arg2);
    }

    public void clear() {
        this.mOverlayViewGroup.clear();
    }

    static ViewOverlayApi14 createFrom(View arg5) {
        ViewGroup v0 = ViewOverlayApi14.getContentView(arg5);
        if(v0 != null) {
            int v1 = v0.getChildCount();
            int v2;
            for(v2 = 0; v2 < v1; ++v2) {
                View v3 = v0.getChildAt(v2);
                if((v3 instanceof OverlayViewGroup)) {
                    return ((OverlayViewGroup)v3).mViewOverlay;
                }
            }

            return new ViewGroupOverlayApi14(v0.getContext(), v0, arg5);
        }

        return null;
    }

    static ViewGroup getContentView(View arg2) {
        while(arg2 != null) {
            if(arg2.getId() == 0x1020002 && ((arg2 instanceof ViewGroup))) {
                return arg2;
            }

            if(!(arg2.getParent() instanceof ViewGroup)) {
                continue;
            }

            ViewParent v2 = ((View)v2).getParent();
        }

        return null;
    }

    ViewGroup getOverlayView() {
        return this.mOverlayViewGroup;
    }

    boolean isEmpty() {
        return this.mOverlayViewGroup.isEmpty();
    }

    public void remove(@NonNull Drawable arg2) {
        this.mOverlayViewGroup.remove(arg2);
    }
}

