package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;

public class ViewModelProvider {
    public class AndroidViewModelFactory extends NewInstanceFactory {
        private Application mApplication;
        private static AndroidViewModelFactory sInstance;

        public AndroidViewModelFactory(@NonNull Application arg1) {
            super();
            this.mApplication = arg1;
        }

        @NonNull public ViewModel create(@NonNull Class arg5) {
            StringBuilder v2;
            if(AndroidViewModel.class.isAssignableFrom(arg5)) {
                try {
                    return arg5.getConstructor(Application.class).newInstance(this.mApplication);
                }
                catch(InvocationTargetException v0) {
                    v2 = new StringBuilder();
                    v2.append("Cannot create an instance of ");
                    v2.append(arg5);
                    throw new RuntimeException(v2.toString(), ((Throwable)v0));
                }
                catch(InstantiationException v0_1) {
                    v2 = new StringBuilder();
                    v2.append("Cannot create an instance of ");
                    v2.append(arg5);
                    throw new RuntimeException(v2.toString(), ((Throwable)v0_1));
                }
                catch(IllegalAccessException v0_2) {
                    v2 = new StringBuilder();
                    v2.append("Cannot create an instance of ");
                    v2.append(arg5);
                    throw new RuntimeException(v2.toString(), ((Throwable)v0_2));
                }
                catch(NoSuchMethodException v0_3) {
                    v2 = new StringBuilder();
                    v2.append("Cannot create an instance of ");
                    v2.append(arg5);
                    throw new RuntimeException(v2.toString(), ((Throwable)v0_3));
                }
            }

            return super.create(arg5);
        }

        @NonNull public static AndroidViewModelFactory getInstance(@NonNull Application arg1) {
            if(AndroidViewModelFactory.sInstance == null) {
                AndroidViewModelFactory.sInstance = new AndroidViewModelFactory(arg1);
            }

            return AndroidViewModelFactory.sInstance;
        }
    }

    public interface Factory {
        @NonNull ViewModel create(@NonNull Class arg1);
    }

    public class NewInstanceFactory implements Factory {
        public NewInstanceFactory() {
            super();
        }

        @NonNull public ViewModel create(@NonNull Class arg5) {
            StringBuilder v2;
            try {
                return arg5.newInstance();
            }
            catch(IllegalAccessException v0) {
                v2 = new StringBuilder();
                v2.append("Cannot create an instance of ");
                v2.append(arg5);
                throw new RuntimeException(v2.toString(), ((Throwable)v0));
            }
            catch(InstantiationException v0_1) {
                v2 = new StringBuilder();
                v2.append("Cannot create an instance of ");
                v2.append(arg5);
                throw new RuntimeException(v2.toString(), ((Throwable)v0_1));
            }
        }
    }

    private static final String DEFAULT_KEY = "androidx.lifecycle.ViewModelProvider.DefaultKey";
    private final Factory mFactory;
    private final ViewModelStore mViewModelStore;

    public ViewModelProvider(@NonNull ViewModelStore arg1, @NonNull Factory arg2) {
        super();
        this.mFactory = arg2;
        this.mViewModelStore = arg1;
    }

    public ViewModelProvider(@NonNull ViewModelStoreOwner arg1, @NonNull Factory arg2) {
        this(arg1.getViewModelStore(), arg2);
    }

    @MainThread @NonNull public ViewModel get(@NonNull Class arg4) {
        String v0 = arg4.getCanonicalName();
        if(v0 != null) {
            StringBuilder v1 = new StringBuilder();
            v1.append("androidx.lifecycle.ViewModelProvider.DefaultKey:");
            v1.append(v0);
            return this.get(v1.toString(), arg4);
        }

        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @MainThread @NonNull public ViewModel get(@NonNull String arg3, @NonNull Class arg4) {
        ViewModel v0 = this.mViewModelStore.get(arg3);
        if(arg4.isInstance(v0)) {
            return v0;
        }

        ViewModel v4 = this.mFactory.create(arg4);
        this.mViewModelStore.put(arg3, v4);
        return v4;
    }
}

