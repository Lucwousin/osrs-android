package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build$VERSION;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

class FragmentTransition {
    class FragmentContainerTransition {
        public Fragment firstOut;
        public boolean firstOutIsPop;
        public BackStackRecord firstOutTransaction;
        public Fragment lastIn;
        public boolean lastInIsPop;
        public BackStackRecord lastInTransaction;

        FragmentContainerTransition() {
            super();
        }
    }

    private static final int[] INVERSE_OPS;
    private static final FragmentTransitionImpl PLATFORM_IMPL;
    private static final FragmentTransitionImpl SUPPORT_IMPL;

    static {
        FragmentTransitionImpl v0_1;
        FragmentTransition.INVERSE_OPS = new int[]{0, 3, 0, 1, 5, 4, 7, 6, 9, 8};
        if(Build$VERSION.SDK_INT >= 21) {
            FragmentTransitionCompat21 v0 = new FragmentTransitionCompat21();
        }
        else {
            v0_1 = null;
        }

        FragmentTransition.PLATFORM_IMPL = v0_1;
        FragmentTransition.SUPPORT_IMPL = FragmentTransition.resolveSupportImpl();
    }

    private FragmentTransition() {
        super();
    }

    private static void addSharedElementsWithMatchingNames(ArrayList arg3, ArrayMap arg4, Collection arg5) {
        int v0;
        for(v0 = arg4.size() - 1; v0 >= 0; --v0) {
            Object v1 = arg4.valueAt(v0);
            if(arg5.contains(ViewCompat.getTransitionName(((View)v1)))) {
                arg3.add(v1);
            }
        }
    }

    private static void addToFirstInLastOut(BackStackRecord arg15, Op arg16, SparseArray arg17, boolean arg18, boolean arg19) {
        FragmentContainerTransition v14_1;
        boolean v1_2;
        int v12;
        int v13;
        BackStackRecord v0 = arg15;
        Op v1 = arg16;
        SparseArray v2 = arg17;
        boolean v3 = arg18;
        Fragment v10 = v1.fragment;
        if(v10 == null) {
            return;
        }

        int v11 = v10.mContainerId;
        if(v11 == 0) {
            return;
        }

        int v1_1 = v3 ? FragmentTransition.INVERSE_OPS[v1.cmd] : v1.cmd;
        boolean v4 = false;
        if(v1_1 != 1) {
            switch(v1_1) {
                case 4: {
                    if(arg19) {
                        if(!v10.mHiddenChanged) {
                            goto label_60;
                        }
                        else if(!v10.mAdded) {
                            goto label_60;
                        }
                        else if(v10.mHidden) {
                            goto label_58;
                        }
                        else {
                            goto label_60;
                        }
                    }
                    else if(!v10.mAdded) {
                        goto label_60;
                    }
                    else if(!v10.mHidden) {
                        goto label_58;
                    }
                    else {
                        goto label_60;
                    }

                    goto label_84;
                }
                case 5: {
                    if(!arg19) {
                        v1_2 = v10.mHidden;
                        goto label_81;
                    }
                    else if(!v10.mHiddenChanged) {
                        goto label_80;
                    }
                    else if(v10.mHidden) {
                        goto label_80;
                    }
                    else if(v10.mAdded) {
                        goto label_78;
                    }
                    else {
                        goto label_80;
                    }
                }
                case 3: 
                case 6: {
                    if(arg19) {
                        if(v10.mAdded) {
                            goto label_60;
                        }
                        else if(v10.mView == null) {
                            goto label_60;
                        }
                        else if(v10.mView.getVisibility() == 0) {
                            if(v10.mPostponedAlpha < 0f) {
                                goto label_60;
                            }

                            goto label_58;
                        }
                        else {
                            goto label_60;
                        }
                    }
                    else if(!v10.mAdded) {
                    label_60:
                        v1_1 = 0;
                    label_67:
                        v13 = v1_1;
                        v1_1 = 0;
                        v12 = 1;
                    }
                    else if(!v10.mHidden) {
                    label_58:
                        v1_1 = 1;
                        goto label_67;
                    }
                    else {
                        goto label_60;
                    }

                    goto label_84;
                }
                case 7: {
                    goto label_71;
                }
                default: {
                    v1_1 = 0;
                    goto label_21;
                }
            }
        }
        else {
        label_71:
            if(arg19) {
                v1_2 = v10.mIsNewlyAdded;
                goto label_81;
            }
            else if(v10.mAdded) {
            label_80:
                v1_2 = false;
            label_81:
                v4 = v1_2;
                v1_1 = 1;
            label_21:
                v12 = 0;
                v13 = 0;
            }
            else if(!v10.mHidden) {
            label_78:
                v1_2 = true;
                goto label_81;
            }
            else {
                goto label_80;
            }
        }

    label_84:
        Object v6 = v2.get(v11);
        if(v4) {
            FragmentContainerTransition v6_1 = FragmentTransition.ensureContainer(((FragmentContainerTransition)v6), v2, v11);
            v6_1.lastIn = v10;
            v6_1.lastInIsPop = v3;
            v6_1.lastInTransaction = v0;
        }

        Object v14 = v6;
        Fragment v9 = null;
        if(!arg19 && v1_1 != 0) {
            if(v14 != null && ((FragmentContainerTransition)v14).firstOut == v10) {
                ((FragmentContainerTransition)v14).firstOut = v9;
            }

            FragmentManagerImpl v4_1 = v0.mManager;
            if(v10.mState >= 1) {
                goto label_113;
            }

            if(v4_1.mCurState < 1) {
                goto label_113;
            }

            if(v0.mReorderingAllowed) {
                goto label_113;
            }

            v4_1.makeActive(v10);
            v4_1.moveToState(v10, 1, 0, 0, false);
        }

    label_113:
        if(v13 != 0 && (v14 == null || ((FragmentContainerTransition)v14).firstOut == null)) {
            v14_1 = FragmentTransition.ensureContainer(((FragmentContainerTransition)v14), v2, v11);
            v14_1.firstOut = v10;
            v14_1.firstOutIsPop = v3;
            v14_1.firstOutTransaction = v0;
        }

        if(!arg19 && v12 != 0 && v14_1 != null && v14_1.lastIn == v10) {
            v14_1.lastIn = null;
        }
    }

    public static void calculateFragments(BackStackRecord arg4, SparseArray arg5, boolean arg6) {
        int v0 = arg4.mOps.size();
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            FragmentTransition.addToFirstInLastOut(arg4, arg4.mOps.get(v2), arg5, false, arg6);
        }
    }

    private static ArrayMap calculateNameOverrides(int arg9, ArrayList arg10, ArrayList arg11, int arg12, int arg13) {
        ArrayList v1_1;
        ArrayList v2_1;
        ArrayMap v0 = new ArrayMap();
        --arg13;
        while(arg13 >= arg12) {
            Object v1 = arg10.get(arg13);
            if(!((BackStackRecord)v1).interactsWith(arg9)) {
            }
            else {
                boolean v2 = arg11.get(arg13).booleanValue();
                if(((BackStackRecord)v1).mSharedElementSourceNames != null) {
                    int v3 = ((BackStackRecord)v1).mSharedElementSourceNames.size();
                    if(v2) {
                        v2_1 = ((BackStackRecord)v1).mSharedElementSourceNames;
                        v1_1 = ((BackStackRecord)v1).mSharedElementTargetNames;
                    }
                    else {
                        ArrayList v8 = ((BackStackRecord)v1).mSharedElementSourceNames;
                        v2_1 = ((BackStackRecord)v1).mSharedElementTargetNames;
                        v1_1 = v8;
                    }

                    int v4;
                    for(v4 = 0; v4 < v3; ++v4) {
                        Object v5 = v1_1.get(v4);
                        Object v6 = v2_1.get(v4);
                        Object v7 = v0.remove(v6);
                        if(v7 != null) {
                            v0.put(v5, v7);
                        }
                        else {
                            v0.put(v5, v6);
                        }
                    }
                }
            }

            --arg13;
        }

        return v0;
    }

    public static void calculatePopFragments(BackStackRecord arg3, SparseArray arg4, boolean arg5) {
        if(!arg3.mManager.mContainer.onHasView()) {
            return;
        }

        int v0;
        for(v0 = arg3.mOps.size() - 1; v0 >= 0; --v0) {
            FragmentTransition.addToFirstInLastOut(arg3, arg3.mOps.get(v0), arg4, true, arg5);
        }
    }

    static void callSharedElementStartEnd(Fragment arg3, Fragment arg4, boolean arg5, ArrayMap arg6, boolean arg7) {
        SharedElementCallback v3 = arg5 ? arg4.getEnterTransitionCallback() : arg3.getEnterTransitionCallback();
        if(v3 != null) {
            ArrayList v4 = new ArrayList();
            ArrayList v5 = new ArrayList();
            int v0 = 0;
            int v1 = arg6 == null ? 0 : arg6.size();
            while(v0 < v1) {
                v5.add(arg6.keyAt(v0));
                v4.add(arg6.valueAt(v0));
                ++v0;
            }

            List v6 = null;
            if(arg7) {
                v3.onSharedElementStart(((List)v5), ((List)v4), v6);
                return;
            }

            v3.onSharedElementEnd(((List)v5), ((List)v4), v6);
        }
    }

    private static boolean canHandleAll(FragmentTransitionImpl arg4, List arg5) {
        int v0 = arg5.size();
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            if(!arg4.canHandle(arg5.get(v2))) {
                return 0;
            }
        }

        return 1;
    }

    static ArrayMap captureInSharedElements(FragmentTransitionImpl arg3, ArrayMap arg4, Object arg5, FragmentContainerTransition arg6) {
        String v0_2;
        ArrayList v3_1;
        SharedElementCallback v6;
        Fragment v0 = arg6.lastIn;
        View v1 = v0.getView();
        if(!arg4.isEmpty() && arg5 != null) {
            if(v1 == null) {
            }
            else {
                ArrayMap v5 = new ArrayMap();
                arg3.findNamedViews(((Map)v5), v1);
                BackStackRecord v3 = arg6.lastInTransaction;
                if(arg6.lastInIsPop) {
                    v6 = v0.getExitTransitionCallback();
                    v3_1 = v3.mSharedElementSourceNames;
                }
                else {
                    v6 = v0.getEnterTransitionCallback();
                    v3_1 = v3.mSharedElementTargetNames;
                }

                if(v3_1 != null) {
                    v5.retainAll(((Collection)v3_1));
                    v5.retainAll(arg4.values());
                }

                if(v6 != null) {
                    v6.onMapSharedElements(((List)v3_1), ((Map)v5));
                    int v6_1;
                    for(v6_1 = v3_1.size() - 1; v6_1 >= 0; --v6_1) {
                        Object v0_1 = v3_1.get(v6_1);
                        Object v1_1 = v5.get(v0_1);
                        if(v1_1 == null) {
                            v0_2 = FragmentTransition.findKeyForValue(arg4, ((String)v0_1));
                            if(v0_2 != null) {
                                arg4.remove(v0_2);
                            }
                        }
                        else if(!((String)v0_1).equals(ViewCompat.getTransitionName(((View)v1_1)))) {
                            v0_2 = FragmentTransition.findKeyForValue(arg4, ((String)v0_1));
                            if(v0_2 != null) {
                                arg4.put(v0_2, ViewCompat.getTransitionName(((View)v1_1)));
                            }
                        }
                    }
                }
                else {
                    FragmentTransition.retainValues(arg4, v5);
                }

                return v5;
            }
        }

        arg4.clear();
        return null;
    }

    private static ArrayMap captureOutSharedElements(FragmentTransitionImpl arg3, ArrayMap arg4, Object arg5, FragmentContainerTransition arg6) {
        ArrayList v3_1;
        SharedElementCallback v5_1;
        if(!arg4.isEmpty()) {
            if(arg5 == null) {
            }
            else {
                Fragment v5 = arg6.firstOut;
                ArrayMap v0 = new ArrayMap();
                arg3.findNamedViews(((Map)v0), v5.getView());
                BackStackRecord v3 = arg6.firstOutTransaction;
                if(arg6.firstOutIsPop) {
                    v5_1 = v5.getEnterTransitionCallback();
                    v3_1 = v3.mSharedElementTargetNames;
                }
                else {
                    v5_1 = v5.getExitTransitionCallback();
                    v3_1 = v3.mSharedElementSourceNames;
                }

                v0.retainAll(((Collection)v3_1));
                if(v5_1 != null) {
                    v5_1.onMapSharedElements(((List)v3_1), ((Map)v0));
                    int v5_2;
                    for(v5_2 = v3_1.size() - 1; v5_2 >= 0; --v5_2) {
                        Object v6 = v3_1.get(v5_2);
                        Object v1 = v0.get(v6);
                        if(v1 == null) {
                            arg4.remove(v6);
                        }
                        else if(!((String)v6).equals(ViewCompat.getTransitionName(((View)v1)))) {
                            arg4.put(ViewCompat.getTransitionName(((View)v1)), arg4.remove(v6));
                        }
                    }
                }
                else {
                    arg4.retainAll(v0.keySet());
                }

                return v0;
            }
        }

        arg4.clear();
        return null;
    }

    private static FragmentTransitionImpl chooseImpl(Fragment arg2, Fragment arg3) {
        Object v2;
        ArrayList v0 = new ArrayList();
        if(arg2 != null) {
            Object v1 = arg2.getExitTransition();
            if(v1 != null) {
                v0.add(v1);
            }

            v1 = arg2.getReturnTransition();
            if(v1 != null) {
                v0.add(v1);
            }

            v2 = arg2.getSharedElementReturnTransition();
            if(v2 == null) {
                goto label_12;
            }

            v0.add(v2);
        }

    label_12:
        if(arg3 != null) {
            v2 = arg3.getEnterTransition();
            if(v2 != null) {
                v0.add(v2);
            }

            v2 = arg3.getReenterTransition();
            if(v2 != null) {
                v0.add(v2);
            }

            v2 = arg3.getSharedElementEnterTransition();
            if(v2 == null) {
                goto label_22;
            }

            v0.add(v2);
        }

    label_22:
        FragmentTransitionImpl v3 = null;
        if(v0.isEmpty()) {
            return v3;
        }

        if(FragmentTransition.PLATFORM_IMPL != null && (FragmentTransition.canHandleAll(FragmentTransition.PLATFORM_IMPL, ((List)v0)))) {
            return FragmentTransition.PLATFORM_IMPL;
        }

        if(FragmentTransition.SUPPORT_IMPL != null && (FragmentTransition.canHandleAll(FragmentTransition.SUPPORT_IMPL, ((List)v0)))) {
            return FragmentTransition.SUPPORT_IMPL;
        }

        if(FragmentTransition.PLATFORM_IMPL == null && FragmentTransition.SUPPORT_IMPL == null) {
            return v3;
        }

        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList configureEnteringExitingViews(FragmentTransitionImpl arg1, Object arg2, Fragment arg3, ArrayList arg4, View arg5) {
        ArrayList v0;
        if(arg2 != null) {
            v0 = new ArrayList();
            View v3 = arg3.getView();
            if(v3 != null) {
                arg1.captureTransitioningViews(v0, v3);
            }

            if(arg4 != null) {
                v0.removeAll(((Collection)arg4));
            }

            if(v0.isEmpty()) {
                return v0;
            }

            v0.add(arg5);
            arg1.addTargets(arg2, v0);
        }
        else {
            v0 = null;
        }

        return v0;
    }

    private static Object configureSharedElementsOrdered(FragmentTransitionImpl arg17, ViewGroup arg18, View arg19, ArrayMap arg20, FragmentContainerTransition arg21, ArrayList arg22, ArrayList arg23, Object arg24, Object arg25) {
        Rect v15;
        Object v14;
        Object v1;
        ArrayMap v13;
        FragmentTransitionImpl v6 = arg17;
        FragmentContainerTransition v7 = arg21;
        ArrayList v10 = arg22;
        Object v11 = arg24;
        Fragment v8 = v7.lastIn;
        Fragment v9 = v7.firstOut;
        Object v0 = null;
        if(v8 != null) {
            if(v9 == null) {
            }
            else {
                boolean v12 = v7.lastInIsPop;
                if(arg20.isEmpty()) {
                    v13 = arg20;
                    v1 = v0;
                }
                else {
                    v1 = FragmentTransition.getSharedElementTransition(v6, v8, v9, v12);
                    v13 = arg20;
                }

                ArrayMap v3 = FragmentTransition.captureOutSharedElements(v6, v13, v1, v7);
                if(arg20.isEmpty()) {
                    v14 = v0;
                }
                else {
                    v10.addAll(v3.values());
                    v14 = v1;
                }

                if(v11 == null && arg25 == null && v14 == null) {
                    return v0;
                }

                FragmentTransition.callSharedElementStartEnd(v8, v9, v12, v3, true);
                if(v14 != null) {
                    v15 = new Rect();
                    v6.setSharedElementTargets(v14, arg19, v10);
                    FragmentTransition.setOutEpicenter(arg17, v14, arg25, v3, v7.firstOutIsPop, v7.firstOutTransaction);
                    if(v11 != null) {
                        v6.setEpicenter(v11, v15);
                    }
                }
                else {
                    v15 = ((Rect)v0);
                }

                OneShotPreDrawListener.add(arg18, new Runnable(arg17, arg20, v14, arg21, arg23, arg19, v8, v9, v12, arg22, arg24, v15) {
                    public void run() {
                        ArrayMap v0 = FragmentTransition.captureInSharedElements(this.val$impl, this.val$nameOverrides, this.val$finalSharedElementTransition, this.val$fragments);
                        if(v0 != null) {
                            this.val$sharedElementsIn.addAll(v0.values());
                            this.val$sharedElementsIn.add(this.val$nonExistentView);
                        }

                        FragmentTransition.callSharedElementStartEnd(this.val$inFragment, this.val$outFragment, this.val$inIsPop, v0, false);
                        if(this.val$finalSharedElementTransition != null) {
                            this.val$impl.swapSharedElementTargets(this.val$finalSharedElementTransition, this.val$sharedElementsOut, this.val$sharedElementsIn);
                            View v0_1 = FragmentTransition.getInEpicenterView(v0, this.val$fragments, this.val$enterTransition, this.val$inIsPop);
                            if(v0_1 != null) {
                                this.val$impl.getBoundsOnScreen(v0_1, this.val$inEpicenter);
                            }
                        }
                    }
                });
                return v14;
            }
        }

        return v0;
    }

    private static Object configureSharedElementsReordered(FragmentTransitionImpl arg16, ViewGroup arg17, View arg18, ArrayMap arg19, FragmentContainerTransition arg20, ArrayList arg21, ArrayList arg22, Object arg23, Object arg24) {
        View v5_1;
        Rect v7_1;
        Object v14;
        FragmentTransitionImpl v6 = arg16;
        View v0 = arg18;
        ArrayMap v1 = arg19;
        FragmentContainerTransition v7 = arg20;
        ArrayList v2 = arg21;
        ArrayList v3 = arg22;
        Object v8 = arg23;
        Fragment v9 = v7.lastIn;
        Fragment v10 = v7.firstOut;
        if(v9 != null) {
            v9.getView().setVisibility(0);
        }

        Object v4 = null;
        if(v9 != null) {
            if(v10 == null) {
            }
            else {
                boolean v11 = v7.lastInIsPop;
                Object v5 = arg19.isEmpty() ? v4 : FragmentTransition.getSharedElementTransition(v6, v9, v10, v11);
                ArrayMap v12 = FragmentTransition.captureOutSharedElements(v6, v1, v5, v7);
                ArrayMap v13 = FragmentTransition.captureInSharedElements(v6, v1, v5, v7);
                if(arg19.isEmpty()) {
                    if(v12 != null) {
                        v12.clear();
                    }

                    if(v13 != null) {
                        v13.clear();
                    }

                    v14 = v4;
                }
                else {
                    FragmentTransition.addSharedElementsWithMatchingNames(v2, v12, arg19.keySet());
                    FragmentTransition.addSharedElementsWithMatchingNames(v3, v13, arg19.values());
                    v14 = v5;
                }

                if(v8 == null && arg24 == null && v14 == null) {
                    return v4;
                }

                FragmentTransition.callSharedElementStartEnd(v9, v10, v11, v12, true);
                if(v14 != null) {
                    v3.add(v0);
                    v6.setSharedElementTargets(v14, v0, v2);
                    FragmentTransition.setOutEpicenter(arg16, v14, arg24, v12, v7.firstOutIsPop, v7.firstOutTransaction);
                    Rect v0_1 = new Rect();
                    View v1_1 = FragmentTransition.getInEpicenterView(v13, v7, v8, v11);
                    if(v1_1 != null) {
                        v6.setEpicenter(v8, v0_1);
                    }

                    v7_1 = v0_1;
                    v5_1 = v1_1;
                }
                else {
                    v5_1 = ((View)v4);
                    v7_1 = ((Rect)v5_1);
                }

                OneShotPreDrawListener.add(arg17, new Runnable(v9, v10, v11, v13, v5_1, arg16, v7_1) {
                    public void run() {
                        FragmentTransition.callSharedElementStartEnd(this.val$inFragment, this.val$outFragment, this.val$inIsPop, this.val$inSharedElements, false);
                        if(this.val$epicenterView != null) {
                            this.val$impl.getBoundsOnScreen(this.val$epicenterView, this.val$epicenter);
                        }
                    }
                });
                return v14;
            }
        }

        return v4;
    }

    private static void configureTransitionsOrdered(FragmentManagerImpl arg21, int arg22, FragmentContainerTransition arg23, View arg24, ArrayMap arg25) {
        Object v0_2;
        FragmentManagerImpl v0 = arg21;
        FragmentContainerTransition v9 = arg23;
        View v10 = arg24;
        ArrayMap v11 = arg25;
        View v13 = v0.mContainer.onHasView() ? v0.mContainer.onFindViewById(arg22) : null;
        if(v13 == null) {
            return;
        }

        Fragment v14 = v9.lastIn;
        Fragment v15 = v9.firstOut;
        FragmentTransitionImpl v8 = FragmentTransition.chooseImpl(v15, v14);
        if(v8 == null) {
            return;
        }

        boolean v0_1 = v9.lastInIsPop;
        boolean v1 = v9.firstOutIsPop;
        Object v7 = FragmentTransition.getEnterTransition(v8, v14, v0_1);
        Object v6 = FragmentTransition.getExitTransition(v8, v15, v1);
        ArrayList v5 = new ArrayList();
        ArrayList v16 = new ArrayList();
        ArrayList v17 = v5;
        Object v18 = v6;
        FragmentTransitionImpl v12 = v8;
        v6 = FragmentTransition.configureSharedElementsOrdered(v8, v13, arg24, arg25, arg23, v5, v16, v7, v18);
        Object v8_1 = v7;
        if(v8_1 != null || v6 != null) {
            v0_2 = v18;
        }
        else {
            v0_2 = v18;
            if(v0_2 == null) {
                return;
            }
        }

        ArrayList v15_1 = FragmentTransition.configureEnteringExitingViews(v12, v0_2, v15, v17, v10);
        Object v20 = v15_1 == null || (v15_1.isEmpty()) ? null : v0_2;
        v12.addTarget(v8_1, v10);
        Object v9_1 = FragmentTransition.mergeTransitions(v12, v8_1, v20, v6, v14, v9.lastInIsPop);
        if(v9_1 != null) {
            v17 = new ArrayList();
            v12.scheduleRemoveTargets(v9_1, v8_1, v17, v20, v15_1, v6, v16);
            FragmentTransition.scheduleTargetChange(v12, v13, v14, arg24, v16, v8_1, v17, v20, v15_1);
            v12.setNameOverridesOrdered(v13, v16, ((Map)v11));
            v12.beginDelayedTransition(((ViewGroup)v13), v9_1);
            v12.scheduleNameReset(((ViewGroup)v13), v16, ((Map)v11));
        }
    }

    private static void configureTransitionsReordered(FragmentManagerImpl arg19, int arg20, FragmentContainerTransition arg21, View arg22, ArrayMap arg23) {
        FragmentManagerImpl v0 = arg19;
        FragmentContainerTransition v4 = arg21;
        View v9 = arg22;
        View v0_1 = v0.mContainer.onHasView() ? v0.mContainer.onFindViewById(arg20) : null;
        View v10 = v0_1;
        if(v10 == null) {
            return;
        }

        Fragment v11 = v4.lastIn;
        Fragment v12 = v4.firstOut;
        FragmentTransitionImpl v13 = FragmentTransition.chooseImpl(v12, v11);
        if(v13 == null) {
            return;
        }

        boolean v14 = v4.lastInIsPop;
        boolean v0_2 = v4.firstOutIsPop;
        ArrayList v15 = new ArrayList();
        ArrayList v8 = new ArrayList();
        Object v7 = FragmentTransition.getEnterTransition(v13, v11, v14);
        View v1 = v10;
        Object v16 = FragmentTransition.getExitTransition(v13, v12, v0_2);
        View v18 = v10;
        ArrayList v10_1 = v8;
        Object v8_1 = FragmentTransition.configureSharedElementsReordered(v13, ((ViewGroup)v1), arg22, arg23, arg21, v8, v15, v7, v16);
        Object v6 = v7;
        if(v6 != null || v8_1 != null) {
            v7 = v16;
        }
        else {
            v7 = v16;
            if(v7 == null) {
                return;
            }
        }

        ArrayList v5 = FragmentTransition.configureEnteringExitingViews(v13, v7, v12, v10_1, v9);
        ArrayList v9_1 = FragmentTransition.configureEnteringExitingViews(v13, v6, v11, v15, v9);
        FragmentTransition.setViewVisibility(v9_1, 4);
        Fragment v4_1 = v11;
        ArrayList v11_1 = v5;
        Object v14_1 = FragmentTransition.mergeTransitions(v13, v6, v7, v8_1, v4_1, v14);
        if(v14_1 != null) {
            FragmentTransition.replaceHide(v13, v7, v12, v11_1);
            ArrayList v12_1 = v13.prepareSetNameOverridesReordered(v15);
            v13.scheduleRemoveTargets(v14_1, v6, v9_1, v7, v11_1, v8_1, v15);
            v13.beginDelayedTransition(v18, v14_1);
            v13.setNameOverridesReordered(v18, v10_1, v15, v12_1, arg23);
            FragmentTransition.setViewVisibility(v9_1, 0);
            v13.swapSharedElementTargets(v8_1, v10_1, v15);
        }
    }

    private static FragmentContainerTransition ensureContainer(FragmentContainerTransition arg0, SparseArray arg1, int arg2) {
        if(arg0 == null) {
            arg0 = new FragmentContainerTransition();
            arg1.put(arg2, arg0);
        }

        return arg0;
    }

    private static String findKeyForValue(ArrayMap arg3, String arg4) {
        int v0 = arg3.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            if(arg4.equals(arg3.valueAt(v1))) {
                return arg3.keyAt(v1);
            }
        }

        return null;
    }

    private static Object getEnterTransition(FragmentTransitionImpl arg0, Fragment arg1, boolean arg2) {
        if(arg1 == null) {
            return null;
        }

        Object v1 = arg2 ? arg1.getReenterTransition() : arg1.getEnterTransition();
        return arg0.cloneTransition(v1);
    }

    private static Object getExitTransition(FragmentTransitionImpl arg0, Fragment arg1, boolean arg2) {
        if(arg1 == null) {
            return null;
        }

        Object v1 = arg2 ? arg1.getReturnTransition() : arg1.getExitTransition();
        return arg0.cloneTransition(v1);
    }

    static View getInEpicenterView(ArrayMap arg0, FragmentContainerTransition arg1, Object arg2, boolean arg3) {
        BackStackRecord v1 = arg1.lastInTransaction;
        if(arg2 != null && arg0 != null && v1.mSharedElementSourceNames != null && !v1.mSharedElementSourceNames.isEmpty()) {
            Object v1_1 = arg3 ? v1.mSharedElementSourceNames.get(0) : v1.mSharedElementTargetNames.get(0);
            return arg0.get(v1_1);
        }

        return null;
    }

    private static Object getSharedElementTransition(FragmentTransitionImpl arg0, Fragment arg1, Fragment arg2, boolean arg3) {
        if(arg1 != null) {
            if(arg2 == null) {
            }
            else {
                Object v1 = arg3 ? arg2.getSharedElementReturnTransition() : arg1.getSharedElementEnterTransition();
                return arg0.wrapTransitionInSet(arg0.cloneTransition(v1));
            }
        }

        return null;
    }

    private static Object mergeTransitions(FragmentTransitionImpl arg0, Object arg1, Object arg2, Object arg3, Fragment arg4, boolean arg5) {
        boolean v4;
        if(arg1 == null || arg2 == null || arg4 == null) {
            v4 = true;
        }
        else if(arg5) {
            v4 = arg4.getAllowReturnTransitionOverlap();
        }
        else {
            v4 = arg4.getAllowEnterTransitionOverlap();
        }

        Object v0 = v4 ? arg0.mergeTransitionsTogether(arg2, arg1, arg3) : arg0.mergeTransitionsInSequence(arg2, arg1, arg3);
        return v0;
    }

    private static void replaceHide(FragmentTransitionImpl arg1, Object arg2, Fragment arg3, ArrayList arg4) {
        if(arg3 != null && arg2 != null && (arg3.mAdded) && (arg3.mHidden) && (arg3.mHiddenChanged)) {
            arg3.setHideReplaced(true);
            arg1.scheduleHideFragmentView(arg2, arg3.getView(), arg4);
            OneShotPreDrawListener.add(arg3.mContainer, new Runnable(arg4) {
                public void run() {
                    FragmentTransition.setViewVisibility(this.val$exitingViews, 4);
                }
            });
        }
    }

    private static FragmentTransitionImpl resolveSupportImpl() {
        try {
            return Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor().newInstance();
        }
        catch(Exception ) {
            return null;
        }
    }

    private static void retainValues(ArrayMap arg2, ArrayMap arg3) {
        int v0;
        for(v0 = arg2.size() - 1; v0 >= 0; --v0) {
            if(!arg3.containsKey(arg2.valueAt(v0))) {
                arg2.removeAt(v0);
            }
        }
    }

    private static void scheduleTargetChange(FragmentTransitionImpl arg10, ViewGroup arg11, Fragment arg12, View arg13, ArrayList arg14, Object arg15, ArrayList arg16, Object arg17, ArrayList arg18) {
        OneShotPreDrawListener.add(((View)arg11), new Runnable(arg15, arg10, arg13, arg12, arg14, arg16, arg18, arg17) {
            public void run() {
                if(this.val$enterTransition != null) {
                    this.val$impl.removeTarget(this.val$enterTransition, this.val$nonExistentView);
                    this.val$enteringViews.addAll(FragmentTransition.configureEnteringExitingViews(this.val$impl, this.val$enterTransition, this.val$inFragment, this.val$sharedElementsIn, this.val$nonExistentView));
                }

                if(this.val$exitingViews != null) {
                    if(this.val$exitTransition != null) {
                        ArrayList v0 = new ArrayList();
                        v0.add(this.val$nonExistentView);
                        this.val$impl.replaceTargets(this.val$exitTransition, this.val$exitingViews, v0);
                    }

                    this.val$exitingViews.clear();
                    this.val$exitingViews.add(this.val$nonExistentView);
                }
            }
        });
    }

    private static void setOutEpicenter(FragmentTransitionImpl arg1, Object arg2, Object arg3, ArrayMap arg4, boolean arg5, BackStackRecord arg6) {
        if(arg6.mSharedElementSourceNames != null && !arg6.mSharedElementSourceNames.isEmpty()) {
            Object v5 = arg5 ? arg6.mSharedElementTargetNames.get(0) : arg6.mSharedElementSourceNames.get(0);
            Object v4 = arg4.get(v5);
            arg1.setEpicenter(arg2, ((View)v4));
            if(arg3 == null) {
                return;
            }

            arg1.setEpicenter(arg3, ((View)v4));
        }
    }

    static void setViewVisibility(ArrayList arg2, int arg3) {
        if(arg2 == null) {
            return;
        }

        int v0;
        for(v0 = arg2.size() - 1; v0 >= 0; --v0) {
            arg2.get(v0).setVisibility(arg3);
        }
    }

    static void startTransitions(FragmentManagerImpl arg7, ArrayList arg8, ArrayList arg9, int arg10, int arg11, boolean arg12) {
        if(arg7.mCurState < 1) {
            return;
        }

        SparseArray v0 = new SparseArray();
        int v1;
        for(v1 = arg10; v1 < arg11; ++v1) {
            Object v2 = arg8.get(v1);
            if(arg9.get(v1).booleanValue()) {
                FragmentTransition.calculatePopFragments(((BackStackRecord)v2), v0, arg12);
            }
            else {
                FragmentTransition.calculateFragments(((BackStackRecord)v2), v0, arg12);
            }
        }

        if(v0.size() != 0) {
            View v1_1 = new View(arg7.mHost.getContext());
            int v2_1 = v0.size();
            int v3;
            for(v3 = 0; v3 < v2_1; ++v3) {
                int v4 = v0.keyAt(v3);
                ArrayMap v5 = FragmentTransition.calculateNameOverrides(v4, arg8, arg9, arg10, arg11);
                Object v6 = v0.valueAt(v3);
                if(arg12) {
                    FragmentTransition.configureTransitionsReordered(arg7, v4, ((FragmentContainerTransition)v6), v1_1, v5);
                }
                else {
                    FragmentTransition.configureTransitionsOrdered(arg7, v4, ((FragmentContainerTransition)v6), v1_1, v5);
                }
            }
        }
    }

    static boolean supportsTransition() {
        boolean v0 = FragmentTransition.PLATFORM_IMPL != null || FragmentTransition.SUPPORT_IMPL != null ? true : false;
        return v0;
    }
}

