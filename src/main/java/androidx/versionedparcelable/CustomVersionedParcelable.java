package androidx.versionedparcelable;

import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public abstract class CustomVersionedParcelable implements VersionedParcelable {
    public CustomVersionedParcelable() {
        super();
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public void onPostParceling() {
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public void onPreParceling(boolean arg1) {
    }
}

