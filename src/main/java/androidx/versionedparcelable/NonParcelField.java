package androidx.versionedparcelable;

import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @Target(value={ElementType.FIELD}) @public interface NonParcelField {
}

