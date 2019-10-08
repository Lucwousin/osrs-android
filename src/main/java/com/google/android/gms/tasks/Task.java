package com.google.android.gms.tasks;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

public abstract class Task {
    public Task() {
        super();
    }

    @NonNull public Task addOnCanceledListener(@NonNull Activity arg1, @NonNull OnCanceledListener arg2) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @NonNull public Task addOnCanceledListener(@NonNull OnCanceledListener arg2) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @NonNull public Task addOnCanceledListener(@NonNull Executor arg1, @NonNull OnCanceledListener arg2) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @NonNull public Task addOnCompleteListener(@NonNull OnCompleteListener arg2) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull public Task addOnCompleteListener(@NonNull Activity arg1, @NonNull OnCompleteListener arg2) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull public Task addOnCompleteListener(@NonNull Executor arg1, @NonNull OnCompleteListener arg2) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull public abstract Task addOnFailureListener(@NonNull Activity arg1, @NonNull OnFailureListener arg2);

    @NonNull public abstract Task addOnFailureListener(@NonNull OnFailureListener arg1);

    @NonNull public abstract Task addOnFailureListener(@NonNull Executor arg1, @NonNull OnFailureListener arg2);

    @NonNull public abstract Task addOnSuccessListener(@NonNull Activity arg1, @NonNull OnSuccessListener arg2);

    @NonNull public abstract Task addOnSuccessListener(@NonNull OnSuccessListener arg1);

    @NonNull public abstract Task addOnSuccessListener(@NonNull Executor arg1, @NonNull OnSuccessListener arg2);

    @NonNull public Task continueWith(@NonNull Continuation arg2) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull public Task continueWith(@NonNull Executor arg1, @NonNull Continuation arg2) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull public Task continueWithTask(@NonNull Continuation arg2) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @NonNull public Task continueWithTask(@NonNull Executor arg1, @NonNull Continuation arg2) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @Nullable public abstract Exception getException();

    @Nullable public abstract Object getResult();

    @Nullable public abstract Object getResult(@NonNull Class arg1) throws Throwable;

    public abstract boolean isCanceled();

    public abstract boolean isComplete();

    public abstract boolean isSuccessful();

    @NonNull public Task onSuccessTask(@NonNull SuccessContinuation arg2) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    @NonNull public Task onSuccessTask(@NonNull Executor arg1, @NonNull SuccessContinuation arg2) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}

