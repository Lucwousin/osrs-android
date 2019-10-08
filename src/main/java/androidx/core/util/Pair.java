package androidx.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Pair {
    @Nullable public final Object first;
    @Nullable public final Object second;

    public Pair(@Nullable Object arg1, @Nullable Object arg2) {
        super();
        this.first = arg1;
        this.second = arg2;
    }

    @NonNull public static Pair create(@Nullable Object arg1, @Nullable Object arg2) {
        return new Pair(arg1, arg2);
    }

    public boolean equals(Object arg4) {
        boolean v1 = false;
        if(!(arg4 instanceof Pair)) {
            return 0;
        }

        if((ObjectsCompat.equals(((Pair)arg4).first, this.first)) && (ObjectsCompat.equals(((Pair)arg4).second, this.second))) {
            v1 = true;
        }

        return v1;
    }

    public int hashCode() {
        int v1 = 0;
        int v0 = this.first == null ? 0 : this.first.hashCode();
        if(this.second == null) {
        }
        else {
            v1 = this.second.hashCode();
        }

        return v0 ^ v1;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.first) + " " + String.valueOf(this.second) + "}";
    }
}

