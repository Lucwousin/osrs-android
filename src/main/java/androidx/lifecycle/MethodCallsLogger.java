package androidx.lifecycle;

import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class MethodCallsLogger {
    private Map mCalledMethods;

    public MethodCallsLogger() {
        super();
        this.mCalledMethods = new HashMap();
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public boolean approveCall(String arg5, int arg6) {
        Object v0 = this.mCalledMethods.get(arg5);
        int v1 = 0;
        int v0_1 = v0 != null ? ((Integer)v0).intValue() : 0;
        if((v0_1 & arg6) != 0) {
            v1 = 1;
        }

        this.mCalledMethods.put(arg5, Integer.valueOf(arg6 | v0_1));
        return v1 ^ 1;
    }
}

