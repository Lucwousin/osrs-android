package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import java.io.InputStream;
import java.io.OutputStream;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class ParcelUtils {
    private ParcelUtils() {
        super();
    }

    public static VersionedParcelable fromInputStream(InputStream arg2) {
        return new VersionedParcelStream(arg2, null).readVersionedParcelable();
    }

    public static VersionedParcelable fromParcelable(Parcelable arg1) {
        if((arg1 instanceof ParcelImpl)) {
            return ((ParcelImpl)arg1).getVersionedParcel();
        }

        throw new IllegalArgumentException("Invalid parcel");
    }

    public static void toOutputStream(VersionedParcelable arg2, OutputStream arg3) {
        VersionedParcelStream v0 = new VersionedParcelStream(null, arg3);
        v0.writeVersionedParcelable(arg2);
        v0.closeField();
    }

    public static Parcelable toParcelable(VersionedParcelable arg1) {
        return new ParcelImpl(arg1);
    }
}

