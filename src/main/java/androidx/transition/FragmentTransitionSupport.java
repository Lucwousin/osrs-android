package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.FragmentTransitionImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class FragmentTransitionSupport extends FragmentTransitionImpl {
    public FragmentTransitionSupport() {
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
        else if(!FragmentTransitionSupport.hasSimpleTarget(((Transition)arg4)) && (FragmentTransitionSupport.isNullOrEmpty(((Transition)arg4).getTargets()))) {
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
        if(arg1 != null) {
            Transition v1 = ((Transition)arg1).clone();
        }
        else {
            arg1 = null;
        }

        return arg1;
    }

    private static boolean hasSimpleTarget(Transition arg1) {
        boolean v1 = !FragmentTransitionSupport.isNullOrEmpty(arg1.getTargetIds()) || !FragmentTransitionSupport.isNullOrEmpty(arg1.getTargetNames()) || !FragmentTransitionSupport.isNullOrEmpty(arg1.getTargetTypes()) ? true : false;
        return v1;
    }

    public Object mergeTransitionsInSequence(Object arg2, Object arg3, Object arg4) {
        if(arg2 != null && arg3 != null) {
            TransitionSet v2 = new TransitionSet().addTransition(((Transition)arg2)).addTransition(((Transition)arg3)).setOrdering(1);
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
            if(arg2 != null) {
                v3.addTransition(((Transition)arg2));
            }

            v3.addTransition(((Transition)arg4));
            return v3;
        }

        return arg2;
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
        else if(!FragmentTransitionSupport.hasSimpleTarget(((Transition)arg5))) {
            List v0_1 = ((Transition)arg5).getTargets();
            if(v0_1.size() == arg6.size() && (v0_1.containsAll(((Collection)arg6)))) {
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
        ((Transition)arg2).addListener(new TransitionListener(arg3, arg4) {
            public void onTransitionCancel(@NonNull Transition arg1) {
            }

            public void onTransitionEnd(@NonNull Transition arg4) {
                arg4.removeListener(((TransitionListener)this));
                this.val$fragmentView.setVisibility(8);
                int v4 = this.val$exitingViews.size();
                int v1;
                for(v1 = 0; v1 < v4; ++v1) {
                    this.val$exitingViews.get(v1).setVisibility(0);
                }
            }

            public void onTransitionPause(@NonNull Transition arg1) {
            }

            public void onTransitionResume(@NonNull Transition arg1) {
            }

            public void onTransitionStart(@NonNull Transition arg1) {
            }
        });
    }

    public void scheduleRemoveTargets(Object arg11, Object arg12, ArrayList arg13, Object arg14, ArrayList arg15, Object arg16, ArrayList arg17) {
        arg11.addListener(new TransitionListener(arg12, arg13, arg14, arg15, arg16, arg17) {
            public void onTransitionCancel(@NonNull Transition arg1) {
            }

            public void onTransitionEnd(@NonNull Transition arg1) {
            }

            public void onTransitionPause(@NonNull Transition arg1) {
            }

            public void onTransitionResume(@NonNull Transition arg1) {
            }

            public void onTransitionStart(@NonNull Transition arg4) {
                ArrayList v0 = null;
                if(this.val$enterTransition != null) {
                    FragmentTransitionSupport.this.replaceTargets(this.val$enterTransition, this.val$enteringViews, v0);
                }

                if(this.val$exitTransition != null) {
                    FragmentTransitionSupport.this.replaceTargets(this.val$exitTransition, this.val$exitingViews, v0);
                }

                if(this.val$sharedElementTransition != null) {
                    FragmentTransitionSupport.this.replaceTargets(this.val$sharedElementTransition, this.val$sharedElementsIn, v0);
                }
            }
        });
    }

    public void setEpicenter(Object arg2, Rect arg3) {
        if(arg2 != null) {
            ((Transition)arg2).setEpicenterCallback(new EpicenterCallback(arg3) {
                public Rect onGetEpicenter(@NonNull Transition arg1) {
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
            ((Transition)arg2).setEpicenterCallback(new EpicenterCallback(v0) {
                public Rect onGetEpicenter(@NonNull Transition arg1) {
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
            FragmentTransitionSupport.bfsAddViewChildren(v0, arg7.get(v2));
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

