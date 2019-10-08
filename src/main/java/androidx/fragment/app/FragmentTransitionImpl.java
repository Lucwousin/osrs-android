package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map$Entry;
import java.util.Map;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public abstract class FragmentTransitionImpl {
    public FragmentTransitionImpl() {
        super();
    }

    public abstract void addTarget(Object arg1, View arg2);

    public abstract void addTargets(Object arg1, ArrayList arg2);

    public abstract void beginDelayedTransition(ViewGroup arg1, Object arg2);

    protected static void bfsAddViewChildren(List arg6, View arg7) {
        int v0 = arg6.size();
        if(FragmentTransitionImpl.containedBeforeIndex(arg6, arg7, v0)) {
            return;
        }

        arg6.add(arg7);
        int v7;
        for(v7 = v0; v7 < arg6.size(); ++v7) {
            Object v1 = arg6.get(v7);
            if((v1 instanceof ViewGroup)) {
                int v2 = ((ViewGroup)v1).getChildCount();
                int v3;
                for(v3 = 0; v3 < v2; ++v3) {
                    View v4 = ((ViewGroup)v1).getChildAt(v3);
                    if(!FragmentTransitionImpl.containedBeforeIndex(arg6, v4, v0)) {
                        arg6.add(v4);
                    }
                }
            }
        }
    }

    public abstract boolean canHandle(Object arg1);

    void captureTransitioningViews(ArrayList arg4, View arg5) {
        if(arg5.getVisibility() == 0) {
            if(!(arg5 instanceof ViewGroup)) {
                arg4.add(arg5);
            }
            else if(ViewGroupCompat.isTransitionGroup(((ViewGroup)arg5))) {
                arg4.add(arg5);
            }
            else {
                int v0 = ((ViewGroup)arg5).getChildCount();
                int v1;
                for(v1 = 0; v1 < v0; ++v1) {
                    this.captureTransitioningViews(arg4, ((ViewGroup)arg5).getChildAt(v1));
                }
            }
        }
    }

    public abstract Object cloneTransition(Object arg1);

    private static boolean containedBeforeIndex(List arg3, View arg4, int arg5) {
        int v1;
        for(v1 = 0; v1 < arg5; ++v1) {
            if(arg3.get(v1) == arg4) {
                return 1;
            }
        }

        return 0;
    }

    static String findKeyForValue(Map arg2, String arg3) {
        Object v0;
        Iterator v2 = arg2.entrySet().iterator();
        do {
            if(!v2.hasNext()) {
                return null;
            }

            v0 = v2.next();
        }
        while(!arg3.equals(((Map$Entry)v0).getValue()));

        return ((Map$Entry)v0).getKey();
    }

    void findNamedViews(Map arg4, View arg5) {
        if(arg5.getVisibility() == 0) {
            String v0 = ViewCompat.getTransitionName(arg5);
            if(v0 != null) {
                arg4.put(v0, arg5);
            }

            if(!(arg5 instanceof ViewGroup)) {
                return;
            }

            int v0_1 = ((ViewGroup)arg5).getChildCount();
            int v1;
            for(v1 = 0; v1 < v0_1; ++v1) {
                this.findNamedViews(arg4, ((ViewGroup)arg5).getChildAt(v1));
            }
        }
    }

    protected void getBoundsOnScreen(View arg7, Rect arg8) {
        int[] v0 = new int[2];
        arg7.getLocationOnScreen(v0);
        arg8.set(v0[0], v0[1], v0[0] + arg7.getWidth(), v0[1] + arg7.getHeight());
    }

    protected static boolean isNullOrEmpty(List arg0) {
        boolean v0 = arg0 == null || (arg0.isEmpty()) ? true : false;
        return v0;
    }

    public abstract Object mergeTransitionsInSequence(Object arg1, Object arg2, Object arg3);

    public abstract Object mergeTransitionsTogether(Object arg1, Object arg2, Object arg3);

    ArrayList prepareSetNameOverridesReordered(ArrayList arg6) {
        ArrayList v0 = new ArrayList();
        int v1 = arg6.size();
        int v2;
        for(v2 = 0; v2 < v1; ++v2) {
            Object v3 = arg6.get(v2);
            v0.add(ViewCompat.getTransitionName(((View)v3)));
            ViewCompat.setTransitionName(((View)v3), null);
        }

        return v0;
    }

    public abstract void removeTarget(Object arg1, View arg2);

    public abstract void replaceTargets(Object arg1, ArrayList arg2, ArrayList arg3);

    public abstract void scheduleHideFragmentView(Object arg1, View arg2, ArrayList arg3);

    void scheduleNameReset(ViewGroup arg2, ArrayList arg3, Map arg4) {
        OneShotPreDrawListener.add(((View)arg2), new Runnable(arg3, arg4) {
            public void run() {
                int v0 = this.val$sharedElementsIn.size();
                int v1;
                for(v1 = 0; v1 < v0; ++v1) {
                    Object v2 = this.val$sharedElementsIn.get(v1);
                    ViewCompat.setTransitionName(((View)v2), this.val$nameOverrides.get(ViewCompat.getTransitionName(((View)v2))));
                }
            }
        });
    }

    public abstract void scheduleRemoveTargets(Object arg1, Object arg2, ArrayList arg3, Object arg4, ArrayList arg5, Object arg6, ArrayList arg7);

    public abstract void setEpicenter(Object arg1, Rect arg2);

    public abstract void setEpicenter(Object arg1, View arg2);

    void setNameOverridesOrdered(View arg2, ArrayList arg3, Map arg4) {
        OneShotPreDrawListener.add(arg2, new Runnable(arg3, arg4) {
            public void run() {
                int v0 = this.val$sharedElementsIn.size();
                int v1;
                for(v1 = 0; v1 < v0; ++v1) {
                    Object v2 = this.val$sharedElementsIn.get(v1);
                    String v3 = ViewCompat.getTransitionName(((View)v2));
                    if(v3 != null) {
                        ViewCompat.setTransitionName(((View)v2), FragmentTransitionImpl.findKeyForValue(this.val$nameOverrides, v3));
                    }
                }
            }
        });
    }

    void setNameOverridesReordered(View arg9, ArrayList arg10, ArrayList arg11, ArrayList arg12, Map arg13) {
        int v2 = arg11.size();
        ArrayList v6 = new ArrayList();
        int v1;
        for(v1 = 0; v1 < v2; ++v1) {
            Object v3 = arg10.get(v1);
            String v4 = ViewCompat.getTransitionName(((View)v3));
            v6.add(v4);
            if(v4 == null) {
            }
            else {
                ViewCompat.setTransitionName(((View)v3), null);
                v3 = arg13.get(v4);
                int v5 = 0;
                while(v5 < v2) {
                    if(((String)v3).equals(arg12.get(v5))) {
                        ViewCompat.setTransitionName(arg11.get(v5), v4);
                    }
                    else {
                        ++v5;
                        continue;
                    }

                    break;
                }
            }
        }

        OneShotPreDrawListener.add(arg9, new Runnable(v2, arg11, arg12, arg10, v6) {
            public void run() {
                int v0;
                for(v0 = 0; v0 < this.val$numSharedElements; ++v0) {
                    ViewCompat.setTransitionName(this.val$sharedElementsIn.get(v0), this.val$inNames.get(v0));
                    ViewCompat.setTransitionName(this.val$sharedElementsOut.get(v0), this.val$outNames.get(v0));
                }
            }
        });
    }

    public abstract void setSharedElementTargets(Object arg1, View arg2, ArrayList arg3);

    public abstract void swapSharedElementTargets(Object arg1, ArrayList arg2, ArrayList arg3);

    public abstract Object wrapTransitionInSet(Object arg1);
}

