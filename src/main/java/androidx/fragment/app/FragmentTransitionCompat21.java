package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition$EpicenterCallback;
import android.transition.Transition$TransitionListener;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RequiresApi(value=21) class FragmentTransitionCompat21 extends FragmentTransitionImpl {
    FragmentTransitionCompat21() {
        super();
    }

    public void addTarget(Object arg1, View arg2) {
        if(arg1 != null) {
            ((Transition)arg1).addTarget(arg2);
        }
    }

    public void addTargets(Object arg4, ArrayList arg5) {
        int v0;
        if(arg4 == null) {
            return;
        }

        int v1 = 0;
        if((arg4 instanceof TransitionSet)) {
            v0 = ((TransitionSet)arg4).getTransitionCount();
            while(v1 < v0) {
                this.addTargets(((TransitionSet)arg4).getTransitionAt(v1), arg5);
                ++v1;
            }
        }
        else if(!FragmentTransitionCompat21.hasSimpleTarget(((Transition)arg4)) && (FragmentTransitionCompat21.isNullOrEmpty(((Transition)arg4).getTargets()))) {
            v0 = arg5.size();
            while(v1 < v0) {
                ((Transition)arg4).addTarget(arg5.get(v1));
                ++v1;
            }
        }
    }

    public void beginDelayedTransition(ViewGroup arg1, Object arg2) {
        TransitionManager.beginDelayedTransition(arg1, ((Transition)arg2));
    }

    public boolean canHandle(Object arg1) {
        return arg1 instanceof Transition;
    }

    public Object cloneTransition(Object arg1) {
        Transition v1;
        if(arg1 != null) {
            v1 = ((Transition)arg1).clone();
        }
        else {
            arg1 = null;
        }

        return v1;
    }

    private static boolean hasSimpleTarget(Transition arg1) {
        boolean v1 = !FragmentTransitionCompat21.isNullOrEmpty(arg1.getTargetIds()) || !FragmentTransitionCompat21.isNullOrEmpty(arg1.getTargetNames()) || !FragmentTransitionCompat21.isNullOrEmpty(arg1.getTargetTypes()) ? true : false;
        return v1;
    }

    public Object mergeTransitionsInSequence(Object arg2, Object arg3, Object arg4) {
        TransitionSet v2;
        if(arg2 != null && arg3 != null) {
            v2 = new TransitionSet().addTransition(((Transition)arg2)).addTransition(((Transition)arg3)).setOrdering(1);
        }
        else if(arg2 != null) {
        }
        else if(arg3 != null) {
            arg2 = arg3;
        }
        else {
            arg2 = null;
        }

        if(arg4 != null) {
            TransitionSet v3 = new TransitionSet();
            if(v2 != null) {
                v3.addTransition(((Transition)v2));
            }

            v3.addTransition(((Transition)arg4));
            return v3;
        }

        return v2;
    }

    public Object mergeTransitionsTogether(Object arg2, Object arg3, Object arg4) {
        TransitionSet v0 = new TransitionSet();
        if(arg2 != null) {
            v0.addTransition(((Transition)arg2));
        }

        if(arg3 != null) {
            v0.addTransition(((Transition)arg3));
        }

        if(arg4 != null) {
            v0.addTransition(((Transition)arg4));
        }

        return v0;
    }

    public void removeTarget(Object arg1, View arg2) {
        if(arg1 != null) {
            ((Transition)arg1).removeTarget(arg2);
        }
    }

    public void replaceTargets(Object arg5, ArrayList arg6, ArrayList arg7) {
        int v0;
        int v1 = 0;
        if((arg5 instanceof TransitionSet)) {
            v0 = ((TransitionSet)arg5).getTransitionCount();
            while(v1 < v0) {
                this.replaceTargets(((TransitionSet)arg5).getTransitionAt(v1), arg6, arg7);
                ++v1;
            }
        }
        else if(!FragmentTransitionCompat21.hasSimpleTarget(((Transition)arg5))) {
            List v0_1 = ((Transition)arg5).getTargets();
            if(v0_1 != null && v0_1.size() == arg6.size() && (v0_1.containsAll(((Collection)arg6)))) {
                v0 = arg7 == null ? 0 : arg7.size();
                while(v1 < v0) {
                    ((Transition)arg5).addTarget(arg7.get(v1));
                    ++v1;
                }

                int v7;
                for(v7 = arg6.size() - 1; v7 >= 0; --v7) {
                    ((Transition)arg5).removeTarget(arg6.get(v7));
                }
            }
        }
    }

    public void scheduleHideFragmentView(Object arg2, View arg3, ArrayList arg4) {
        ((Transition)arg2).addListener(new Transition$TransitionListener(arg3, arg4) {
            public void onTransitionCancel(Transition arg1) {
            }

            public void onTransitionEnd(Transition arg4) {
                arg4.removeListener(((Transition$TransitionListener)this));
                this.val$fragmentView.setVisibility(8);
                int v4 = this.val$exitingViews.size();
                int v1;
                for(v1 = 0; v1 < v4; ++v1) {
                    this.val$exitingViews.get(v1).setVisibility(0);
                }
            }

            public void onTransitionPause(Transition arg1) {
            }

            public void onTransitionResume(Transition arg1) {
            }

            public void onTransitionStart(Transition arg1) {
            }
        });
    }

    public void scheduleRemoveTargets(Object arg11, Object arg12, ArrayList arg13, Object arg14, ArrayList arg15, Object arg16, ArrayList arg17) {
        arg11.addListener(new Transition$TransitionListener(arg12, arg13, arg14, arg15, arg16, arg17) {
            public void onTransitionCancel(Transition arg1) {
            }

            public void onTransitionEnd(Transition arg1) {
            }

            public void onTransitionPause(Transition arg1) {
            }

            public void onTransitionResume(Transition arg1) {
            }

            public void onTransitionStart(Transition arg4) {
                ArrayList v0 = null;
                if(this.val$enterTransition != null) {
                    FragmentTransitionCompat21.this.replaceTargets(this.val$enterTransition, this.val$enteringViews, v0);
                }

                if(this.val$exitTransition != null) {
                    FragmentTransitionCompat21.this.replaceTargets(this.val$exitTransition, this.val$exitingViews, v0);
                }

                if(this.val$sharedElementTransition != null) {
                    FragmentTransitionCompat21.this.replaceTargets(this.val$sharedElementTransition, this.val$sharedElementsIn, v0);
                }
            }
        });
    }

    public void setEpicenter(Object arg2, Rect arg3) {
        if(arg2 != null) {
            ((Transition)arg2).setEpicenterCallback(new Transition$EpicenterCallback(arg3) {
                public Rect onGetEpicenter(Transition arg1) {
                    if(this.val$epicenter != null) {
                        if(this.val$epicenter.isEmpty()) {
                        }
                        else {
                            return this.val$epicenter;
                        }
                    }

                    return null;
                }
            });
        }
    }

    public void setEpicenter(Object arg2, View arg3) {
        if(arg3 != null) {
            Rect v0 = new Rect();
            this.getBoundsOnScreen(arg3, v0);
            ((Transition)arg2).setEpicenterCallback(new Transition$EpicenterCallback(v0) {
                public Rect onGetEpicenter(Transition arg1) {
                    return this.val$epicenter;
                }
            });
        }
    }

    public void setSharedElementTargets(Object arg5, View arg6, ArrayList arg7) {
        List v0 = ((TransitionSet)arg5).getTargets();
        v0.clear();
        int v1 = arg7.size();
        int v2;
        for(v2 = 0; v2 < v1; ++v2) {
            FragmentTransitionCompat21.bfsAddViewChildren(v0, arg7.get(v2));
        }

        v0.add(arg6);
        arg7.add(arg6);
        this.addTargets(arg5, arg7);
    }

    public void swapSharedElementTargets(Object arg2, ArrayList arg3, ArrayList arg4) {
        if(arg2 != null) {
            ((TransitionSet)arg2).getTargets().clear();
            ((TransitionSet)arg2).getTargets().addAll(((Collection)arg4));
            this.replaceTargets(arg2, arg3, arg4);
        }
    }

    public Object wrapTransitionInSet(Object arg2) {
        if(arg2 == null) {
            return null;
        }

        TransitionSet v0 = new TransitionSet();
        v0.addTransition(((Transition)arg2));
        return v0;
    }
}

