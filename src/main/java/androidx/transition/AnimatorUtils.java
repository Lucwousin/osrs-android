package androidx.transition;

import android.animation.Animator$AnimatorPauseListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build$VERSION;
import androidx.annotation.NonNull;
import java.util.ArrayList;

class AnimatorUtils {
    interface AnimatorPauseListenerCompat {
        void onAnimationPause(Animator arg1);

        void onAnimationResume(Animator arg1);
    }

    private AnimatorUtils() {
        super();
    }

    static void addPauseListener(@NonNull Animator arg2, @NonNull AnimatorListenerAdapter arg3) {
        if(Build$VERSION.SDK_INT >= 19) {
            arg2.addPauseListener(((Animator$AnimatorPauseListener)arg3));
        }
    }

    static void pause(@NonNull Animator arg5) {
        if(Build$VERSION.SDK_INT >= 19) {
            arg5.pause();
        }
        else {
            ArrayList v0 = arg5.getListeners();
            if(v0 != null) {
                int v1 = 0;
                int v2 = v0.size();
                while(v1 < v2) {
                    Object v3 = v0.get(v1);
                    if((v3 instanceof AnimatorPauseListenerCompat)) {
                        ((AnimatorPauseListenerCompat)v3).onAnimationPause(arg5);
                    }

                    ++v1;
                }
            }
        }
    }

    static void resume(@NonNull Animator arg5) {
        if(Build$VERSION.SDK_INT >= 19) {
            arg5.resume();
        }
        else {
            ArrayList v0 = arg5.getListeners();
            if(v0 != null) {
                int v1 = 0;
                int v2 = v0.size();
                while(v1 < v2) {
                    Object v3 = v0.get(v1);
                    if((v3 instanceof AnimatorPauseListenerCompat)) {
                        ((AnimatorPauseListenerCompat)v3).onAnimationResume(arg5);
                    }

                    ++v1;
                }
            }
        }
    }
}

