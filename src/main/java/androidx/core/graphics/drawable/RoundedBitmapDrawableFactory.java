package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build$VERSION;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.BitmapCompat;
import androidx.core.view.GravityCompat;
import java.io.InputStream;

public final class RoundedBitmapDrawableFactory {
    class DefaultRoundedBitmapDrawable extends RoundedBitmapDrawable {
        DefaultRoundedBitmapDrawable(Resources arg1, Bitmap arg2) {
            super(arg1, arg2);
        }

        void gravityCompatApply(int arg7, int arg8, int arg9, Rect arg10, Rect arg11) {
            GravityCompat.apply(arg7, arg8, arg9, arg10, arg11, 0);
        }

        public boolean hasMipMap() {
            boolean v0 = this.mBitmap == null || !BitmapCompat.hasMipMap(this.mBitmap) ? false : true;
            return v0;
        }

        public void setMipMap(boolean arg2) {
            if(this.mBitmap != null) {
                BitmapCompat.setHasMipMap(this.mBitmap, arg2);
                this.invalidateSelf();
            }
        }
    }

    private static final String TAG = "RoundedBitmapDrawableFa";

    private RoundedBitmapDrawableFactory() {
        super();
    }

    @NonNull public static RoundedBitmapDrawable create(@NonNull Resources arg2, @Nullable Bitmap arg3) {
        if(Build$VERSION.SDK_INT >= 21) {
            return new RoundedBitmapDrawable21(arg2, arg3);
        }

        return new DefaultRoundedBitmapDrawable(arg2, arg3);
    }

    @NonNull public static RoundedBitmapDrawable create(@NonNull Resources arg3, @NonNull InputStream arg4) {
        RoundedBitmapDrawable v3 = RoundedBitmapDrawableFactory.create(arg3, BitmapFactory.decodeStream(arg4));
        if(v3.getBitmap() == null) {
            Log.w("RoundedBitmapDrawableFa", "RoundedBitmapDrawable cannot decode " + arg4);
        }

        return v3;
    }

    @NonNull public static RoundedBitmapDrawable create(@NonNull Resources arg3, @NonNull String arg4) {
        RoundedBitmapDrawable v3 = RoundedBitmapDrawableFactory.create(arg3, BitmapFactory.decodeFile(arg4));
        if(v3.getBitmap() == null) {
            Log.w("RoundedBitmapDrawableFa", "RoundedBitmapDrawable cannot decode " + arg4);
        }

        return v3;
    }
}

