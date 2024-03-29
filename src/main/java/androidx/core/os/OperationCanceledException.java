package androidx.core.os;

public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(String arg1) {
        if(arg1 != null) {
        }
        else {
            arg1 = "The operation has been canceled.";
        }

        super(arg1);
    }
}

