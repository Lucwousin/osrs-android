package androidx.transition;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Scene {
    private Context mContext;
    private Runnable mEnterAction;
    private Runnable mExitAction;
    private View mLayout;
    private int mLayoutId;
    private ViewGroup mSceneRoot;

    public Scene(@NonNull ViewGroup arg2) {
        super();
        this.mLayoutId = -1;
        this.mSceneRoot = arg2;
    }

    private Scene(ViewGroup arg2, int arg3, Context arg4) {
        super();
        this.mLayoutId = -1;
        this.mContext = arg4;
        this.mSceneRoot = arg2;
        this.mLayoutId = arg3;
    }

    public Scene(@NonNull ViewGroup arg2, @NonNull View arg3) {
        super();
        this.mLayoutId = -1;
        this.mSceneRoot = arg2;
        this.mLayout = arg3;
    }

    public void enter() {
        if(this.mLayoutId > 0 || this.mLayout != null) {
            this.getSceneRoot().removeAllViews();
            if(this.mLayoutId > 0) {
                LayoutInflater.from(this.mContext).inflate(this.mLayoutId, this.mSceneRoot);
            }
            else {
                this.mSceneRoot.addView(this.mLayout);
            }
        }

        if(this.mEnterAction != null) {
            this.mEnterAction.run();
        }

        Scene.setCurrentScene(this.mSceneRoot, this);
    }

    public void exit() {
        if(Scene.getCurrentScene(this.mSceneRoot) == this && this.mExitAction != null) {
            this.mExitAction.run();
        }
    }

    static Scene getCurrentScene(View arg1) {
        return arg1.getTag(R$id.transition_current_scene);
    }

    @NonNull public static Scene getSceneForLayout(@NonNull ViewGroup arg2, @LayoutRes int arg3, @NonNull Context arg4) {
        SparseArray v0_1;
        Object v0 = arg2.getTag(R$id.transition_scene_layoutid_cache);
        if(v0 == null) {
            v0_1 = new SparseArray();
            arg2.setTag(R$id.transition_scene_layoutid_cache, v0_1);
        }

        Object v1 = v0_1.get(arg3);
        if(v1 != null) {
            return ((Scene)v1);
        }

        Scene v1_1 = new Scene(arg2, arg3, arg4);
        v0_1.put(arg3, v1_1);
        return v1_1;
    }

    @NonNull public ViewGroup getSceneRoot() {
        return this.mSceneRoot;
    }

    boolean isCreatedFromLayoutResource() {
        boolean v0 = this.mLayoutId > 0 ? true : false;
        return v0;
    }

    static void setCurrentScene(View arg1, Scene arg2) {
        arg1.setTag(R$id.transition_current_scene, arg2);
    }

    public void setEnterAction(@Nullable Runnable arg1) {
        this.mEnterAction = arg1;
    }

    public void setExitAction(@Nullable Runnable arg1) {
        this.mExitAction = arg1;
    }
}

