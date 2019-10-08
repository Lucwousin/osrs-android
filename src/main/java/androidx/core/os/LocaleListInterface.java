package androidx.core.os;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import java.util.Locale;

@RestrictTo(value={Scope.LIBRARY_GROUP}) interface LocaleListInterface {
    boolean equals(Object arg1);

    Locale get(int arg1);

    @Nullable Locale getFirstMatch(String[] arg1);

    Object getLocaleList();

    int hashCode();

    @IntRange(from=-1) int indexOf(Locale arg1);

    boolean isEmpty();

    void setLocaleList(@NonNull Locale[] arg1);

    @IntRange(from=0) int size();

    String toLanguageTags();

    String toString();
}

