package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.DialogFragment;

public class AppCompatDialogFragment extends DialogFragment {
    public AppCompatDialogFragment() {
        super();
    }

    public Dialog onCreateDialog(Bundle arg3) {
        return new AppCompatDialog(this.getContext(), this.getTheme());
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public void setupDialog(Dialog arg2, int arg3) {
        if((arg2 instanceof AppCompatDialog)) {
            Dialog v0 = arg2;
            switch(arg3) {
                case 1: 
                case 2: {
                    goto label_8;
                }
                case 3: {
                    goto label_5;
                }
            }

            return;
        label_5:
            arg2.getWindow().addFlags(24);
        label_8:
            ((AppCompatDialog)v0).supportRequestWindowFeature(1);
        }
        else {
            super.setupDialog(arg2, arg3);
        }
    }
}

