package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.annotation.NonNull;

public class AndroidViewModel extends ViewModel {
    @SuppressLint(value={"StaticFieldLeak"}) private Application mApplication;

    public AndroidViewModel(@NonNull Application arg1) {
        super();
        this.mApplication = arg1;
    }

    @NonNull public Application getApplication() {
        return this.mApplication;
    }
}

