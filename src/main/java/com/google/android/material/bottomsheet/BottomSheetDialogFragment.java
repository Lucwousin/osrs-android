package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatDialogFragment;

public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    public BottomSheetDialogFragment() {
        super();
    }

    public Dialog onCreateDialog(Bundle arg3) {
        return new BottomSheetDialog(this.getContext(), this.getTheme());
    }
}

