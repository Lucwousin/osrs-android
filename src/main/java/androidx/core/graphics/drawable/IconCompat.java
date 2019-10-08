package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.Intent$ShortcutIconResource;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources$NotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap$CompressFormat;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff$Mode;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.Preconditions;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {
    @RestrictTo(value={Scope.LIBRARY}) @Retention(value=RetentionPolicy.SOURCE) @public interface IconType {
    }

    private static final float ADAPTIVE_ICON_INSET_FACTOR = 0.25f;
    private static final int AMBIENT_SHADOW_ALPHA = 30;
    private static final float BLUR_FACTOR = 0.010417f;
    static final PorterDuff$Mode DEFAULT_TINT_MODE = null;
    private static final float DEFAULT_VIEW_PORT_SCALE = 0.666667f;
    private static final String EXTRA_INT1 = "int1";
    private static final String EXTRA_INT2 = "int2";
    private static final String EXTRA_OBJ = "obj";
    private static final String EXTRA_TINT_LIST = "tint_list";
    private static final String EXTRA_TINT_MODE = "tint_mode";
    private static final String EXTRA_TYPE = "type";
    private static final float ICON_DIAMETER_FACTOR = 0.916667f;
    private static final int KEY_SHADOW_ALPHA = 61;
    private static final float KEY_SHADOW_OFFSET_FACTOR = 0.020833f;
    private static final String TAG = "IconCompat";
    public static final int TYPE_UNKNOWN = -1;
    @RestrictTo(value={Scope.LIBRARY}) public byte[] mData;
    @RestrictTo(value={Scope.LIBRARY}) public int mInt1;
    @RestrictTo(value={Scope.LIBRARY}) public int mInt2;
    Object mObj1;
    @RestrictTo(value={Scope.LIBRARY}) public Parcelable mParcelable;
    @RestrictTo(value={Scope.LIBRARY}) public ColorStateList mTintList;
    PorterDuff$Mode mTintMode;
    @RestrictTo(value={Scope.LIBRARY}) public String mTintModeStr;
    @RestrictTo(value={Scope.LIBRARY}) public int mType;

    static {
        IconCompat.DEFAULT_TINT_MODE = PorterDuff$Mode.SRC_IN;
    }

    @RestrictTo(value={Scope.LIBRARY}) public IconCompat() {
        super();
        this.mTintList = null;
        this.mTintMode = IconCompat.DEFAULT_TINT_MODE;
    }

    private IconCompat(int arg2) {
        super();
        this.mTintList = null;
        this.mTintMode = IconCompat.DEFAULT_TINT_MODE;
        this.mType = arg2;
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public void addToShortcutIntent(@NonNull Intent arg5, @Nullable Drawable arg6, @NonNull Context arg7) {
        Bitmap v7_1;
        this.checkResource(arg7);
        int v0 = this.mType;
        if(v0 != 5) {
            switch(v0) {
                case 1: {
                    goto label_54;
                }
                case 2: {
                    goto label_10;
                }
            }

            throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
        label_54:
            Object v7 = this.mObj1;
            if(arg6 != null) {
                v7_1 = ((Bitmap)v7).copy(((Bitmap)v7).getConfig(), true);
                goto label_61;
                try {
                label_10:
                    arg7 = arg7.createPackageContext(this.getResPackage(), 0);
                    if(arg6 == null) {
                        arg5.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent$ShortcutIconResource.fromContext(arg7, this.mInt1));
                        return;
                    }
                    else {
                        Drawable v0_1 = ContextCompat.getDrawable(arg7, this.mInt1);
                        if(v0_1.getIntrinsicWidth() <= 0 || v0_1.getIntrinsicHeight() <= 0) {
                            int v7_2 = arg7.getSystemService("activity").getLauncherLargeIconSize();
                            v7_1 = Bitmap.createBitmap(v7_2, v7_2, Bitmap$Config.ARGB_8888);
                        }
                        else {
                            v7_1 = Bitmap.createBitmap(v0_1.getIntrinsicWidth(), v0_1.getIntrinsicHeight(), Bitmap$Config.ARGB_8888);
                        }

                        v0_1.setBounds(0, 0, v7_1.getWidth(), v7_1.getHeight());
                        v0_1.draw(new Canvas(v7_1));
                    }
                }
                catch(PackageManager$NameNotFoundException v5) {
                    StringBuilder v7_3 = new StringBuilder();
                    v7_3.append("Can\'t find package ");
                    v7_3.append(this.mObj1);
                    throw new IllegalArgumentException(v7_3.toString(), ((Throwable)v5));
                }
            }
        }
        else {
            v7_1 = IconCompat.createLegacyIconFromAdaptiveIcon(this.mObj1, true);
        }

    label_61:
        if(arg6 != null) {
            v0 = v7_1.getWidth();
            int v1 = v7_1.getHeight();
            arg6.setBounds(v0 / 2, v1 / 2, v0, v1);
            arg6.draw(new Canvas(v7_1));
        }

        arg5.putExtra("android.intent.extra.shortcut.ICON", ((Parcelable)v7_1));
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public void checkResource(Context arg8) {
        if(this.mType == 2) {
            Object v0 = this.mObj1;
            if(!((String)v0).contains(":")) {
                return;
            }
            else {
                String v1 = ((String)v0).split(":", -1)[1];
                String v4 = v1.split("/", -1)[0];
                v1 = v1.split("/", -1)[1];
                String v0_1 = ((String)v0).split(":", -1)[0];
                int v8 = IconCompat.getResources(arg8, v0_1).getIdentifier(v1, v4, v0_1);
                if(this.mInt1 != v8) {
                    Log.i("IconCompat", "Id has changed for " + v0_1 + "/" + v1);
                    this.mInt1 = v8;
                }
            }
        }
    }

    @Nullable public static IconCompat createFromBundle(@NonNull Bundle arg3) {
        int v0 = arg3.getInt("type");
        IconCompat v1 = new IconCompat(v0);
        v1.mInt1 = arg3.getInt("int1");
        v1.mInt2 = arg3.getInt("int2");
        if(arg3.containsKey("tint_list")) {
            v1.mTintList = arg3.getParcelable("tint_list");
        }

        if(arg3.containsKey("tint_mode")) {
            v1.mTintMode = PorterDuff$Mode.valueOf(arg3.getString("tint_mode"));
        }

        if(v0 != -1) {
            switch(v0) {
                case 3: {
                    goto label_36;
                }
                case 2: 
                case 4: {
                    goto label_40;
                }
                case 1: 
                case 5: {
                    goto label_44;
                }
            }

            Log.w("IconCompat", "Unknown type " + v0);
            return null;
        label_36:
            v1.mObj1 = arg3.getByteArray("obj");
            return v1;
        label_40:
            v1.mObj1 = arg3.getString("obj");
        }
        else {
        label_44:
            v1.mObj1 = arg3.getParcelable("obj");
        }

        return v1;
    }

    @Nullable @RequiresApi(value=23) @RestrictTo(value={Scope.LIBRARY_GROUP}) public static IconCompat createFromIcon(@NonNull Icon arg2) {
        Preconditions.checkNotNull(arg2);
        int v0 = IconCompat.getType(arg2);
        if(v0 != 2) {
            if(v0 != 4) {
                IconCompat v0_1 = new IconCompat(-1);
                v0_1.mObj1 = arg2;
                return v0_1;
            }

            return IconCompat.createWithContentUri(IconCompat.getUri(arg2));
        }

        return IconCompat.createWithResource(null, IconCompat.getResPackage(arg2), IconCompat.getResId(arg2));
    }

    @Nullable @RequiresApi(value=23) public static IconCompat createFromIcon(@NonNull Context arg2, @NonNull Icon arg3) {
        Preconditions.checkNotNull(arg3);
        int v0 = IconCompat.getType(arg3);
        if(v0 != 2) {
            if(v0 != 4) {
                IconCompat v2 = new IconCompat(-1);
                v2.mObj1 = arg3;
                return v2;
            }

            return IconCompat.createWithContentUri(IconCompat.getUri(arg3));
        }

        String v0_1 = IconCompat.getResPackage(arg3);
        try {
            return IconCompat.createWithResource(IconCompat.getResources(arg2, v0_1), v0_1, IconCompat.getResId(arg3));
        }
        catch(Resources$NotFoundException ) {
            throw new IllegalArgumentException("Icon resource cannot be found");
        }
    }

    @VisibleForTesting static Bitmap createLegacyIconFromAdaptiveIcon(Bitmap arg9, boolean arg10) {
        int v0 = ((int)((((float)Math.min(arg9.getWidth(), arg9.getHeight()))) * 0.666667f));
        Bitmap v1 = Bitmap.createBitmap(v0, v0, Bitmap$Config.ARGB_8888);
        Canvas v2 = new Canvas(v1);
        Paint v3 = new Paint(3);
        float v4 = ((float)v0);
        float v5 = 0.5f * v4;
        float v6 = 0.916667f * v5;
        if(arg10) {
            float v10 = 0.010417f * v4;
            v3.setColor(0);
            v3.setShadowLayer(v10, 0f, v4 * 0.020833f, 0x3D000000);
            v2.drawCircle(v5, v5, v6, v3);
            v3.setShadowLayer(v10, 0f, 0f, 0x1E000000);
            v2.drawCircle(v5, v5, v6, v3);
            v3.clearShadowLayer();
        }

        v3.setColor(0xFF000000);
        BitmapShader v10_1 = new BitmapShader(arg9, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP);
        Matrix v4_1 = new Matrix();
        v4_1.setTranslate(((float)(-(arg9.getWidth() - v0) / 2)), ((float)(-(arg9.getHeight() - v0) / 2)));
        v10_1.setLocalMatrix(v4_1);
        v3.setShader(((Shader)v10_1));
        v2.drawCircle(v5, v5, v6, v3);
        v2.setBitmap(null);
        return v1;
    }

    public static IconCompat createWithAdaptiveBitmap(Bitmap arg2) {
        if(arg2 != null) {
            IconCompat v0 = new IconCompat(5);
            v0.mObj1 = arg2;
            return v0;
        }

        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    public static IconCompat createWithBitmap(Bitmap arg2) {
        if(arg2 != null) {
            IconCompat v0 = new IconCompat(1);
            v0.mObj1 = arg2;
            return v0;
        }

        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    public static IconCompat createWithContentUri(Uri arg1) {
        if(arg1 != null) {
            return IconCompat.createWithContentUri(arg1.toString());
        }

        throw new IllegalArgumentException("Uri must not be null.");
    }

    public static IconCompat createWithContentUri(String arg2) {
        if(arg2 != null) {
            IconCompat v0 = new IconCompat(4);
            v0.mObj1 = arg2;
            return v0;
        }

        throw new IllegalArgumentException("Uri must not be null.");
    }

    public static IconCompat createWithData(byte[] arg2, int arg3, int arg4) {
        if(arg2 != null) {
            IconCompat v0 = new IconCompat(3);
            v0.mObj1 = arg2;
            v0.mInt1 = arg3;
            v0.mInt2 = arg4;
            return v0;
        }

        throw new IllegalArgumentException("Data must not be null.");
    }

    @RestrictTo(value={Scope.LIBRARY}) public static IconCompat createWithResource(Resources arg2, String arg3, @DrawableRes int arg4) {
        if(arg3 != null) {
            if(arg4 != 0) {
                IconCompat v0 = new IconCompat(2);
                v0.mInt1 = arg4;
                if(arg2 != null) {
                    try {
                        v0.mObj1 = arg2.getResourceName(arg4);
                    }
                    catch(Resources$NotFoundException ) {
                        throw new IllegalArgumentException("Icon resource cannot be found");
                    }
                }
                else {
                    v0.mObj1 = arg3;
                }

                return v0;
            }

            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }

        throw new IllegalArgumentException("Package must not be null.");
    }

    public static IconCompat createWithResource(Context arg1, @DrawableRes int arg2) {
        if(arg1 != null) {
            return IconCompat.createWithResource(arg1.getResources(), arg1.getPackageName(), arg2);
        }

        throw new IllegalArgumentException("Context must not be null.");
    }

    @DrawableRes @IdRes @RequiresApi(value=23) private static int getResId(@NonNull Icon arg4) {
        if(Build$VERSION.SDK_INT >= 28) {
            return arg4.getResId();
        }

        try {
            return arg4.getClass().getMethod("getResId").invoke(arg4).intValue();
        }
        catch(NoSuchMethodException v4) {
            Log.e("IconCompat", "Unable to get icon resource", ((Throwable)v4));
            return 0;
        }
        catch(InvocationTargetException v4_1) {
            Log.e("IconCompat", "Unable to get icon resource", ((Throwable)v4_1));
            return 0;
        }
        catch(IllegalAccessException v4_2) {
            Log.e("IconCompat", "Unable to get icon resource", ((Throwable)v4_2));
            return 0;
        }
    }

    @IdRes public int getResId() {
        if(this.mType == -1 && Build$VERSION.SDK_INT >= 23) {
            return IconCompat.getResId(this.mObj1);
        }

        if(this.mType == 2) {
            return this.mInt1;
        }

        StringBuilder v1 = new StringBuilder();
        v1.append("called getResId() on ");
        v1.append(this);
        throw new IllegalStateException(v1.toString());
    }

    @Nullable @RequiresApi(value=23) private static String getResPackage(@NonNull Icon arg5) {
        if(Build$VERSION.SDK_INT >= 28) {
            return arg5.getResPackage();
        }

        String v0 = null;
        try {
            return arg5.getClass().getMethod("getResPackage").invoke(arg5);
        }
        catch(NoSuchMethodException v5) {
            Log.e("IconCompat", "Unable to get icon package", ((Throwable)v5));
            return v0;
        }
        catch(InvocationTargetException v5_1) {
            Log.e("IconCompat", "Unable to get icon package", ((Throwable)v5_1));
            return v0;
        }
        catch(IllegalAccessException v5_2) {
            Log.e("IconCompat", "Unable to get icon package", ((Throwable)v5_2));
            return v0;
        }
    }

    @NonNull public String getResPackage() {
        int v1 = -1;
        if(this.mType == v1 && Build$VERSION.SDK_INT >= 23) {
            return IconCompat.getResPackage(this.mObj1);
        }

        if(this.mType == 2) {
            return this.mObj1.split(":", v1)[0];
        }

        StringBuilder v1_1 = new StringBuilder();
        v1_1.append("called getResPackage() on ");
        v1_1.append(this);
        throw new IllegalStateException(v1_1.toString());
    }

    private static Resources getResources(Context arg5, String arg6) {
        if("android".equals(arg6)) {
            return Resources.getSystem();
        }

        PackageManager v5 = arg5.getPackageManager();
        int v0 = 0x2000;
        Resources v1 = null;
        try {
            ApplicationInfo v0_1 = v5.getApplicationInfo(arg6, v0);
            if(v0_1 == null) {
                return v1;
            }

            return v5.getResourcesForApplication(v0_1);
        }
        catch(PackageManager$NameNotFoundException v5_1) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", arg6), ((Throwable)v5_1));
            return v1;
        }

        return v1;
    }

    @RequiresApi(value=23) private static int getType(@NonNull Icon arg5) {
        if(Build$VERSION.SDK_INT >= 28) {
            return arg5.getType();
        }

        int v0 = -1;
        try {
            return arg5.getClass().getMethod("getType").invoke(arg5).intValue();
        }
        catch(NoSuchMethodException v1) {
            Log.e("IconCompat", "Unable to get icon type " + arg5, ((Throwable)v1));
            return v0;
        }
        catch(InvocationTargetException v1_1) {
            Log.e("IconCompat", "Unable to get icon type " + arg5, ((Throwable)v1_1));
            return v0;
        }
        catch(IllegalAccessException v1_2) {
            Log.e("IconCompat", "Unable to get icon type " + arg5, ((Throwable)v1_2));
            return v0;
        }
    }

    public int getType() {
        if(this.mType == -1 && Build$VERSION.SDK_INT >= 23) {
            return IconCompat.getType(this.mObj1);
        }

        return this.mType;
    }

    @Nullable @RequiresApi(value=23) private static Uri getUri(@NonNull Icon arg5) {
        if(Build$VERSION.SDK_INT >= 28) {
            return arg5.getUri();
        }

        Uri v0 = null;
        try {
            return arg5.getClass().getMethod("getUri").invoke(arg5);
        }
        catch(NoSuchMethodException v5) {
            Log.e("IconCompat", "Unable to get icon uri", ((Throwable)v5));
            return v0;
        }
        catch(InvocationTargetException v5_1) {
            Log.e("IconCompat", "Unable to get icon uri", ((Throwable)v5_1));
            return v0;
        }
        catch(IllegalAccessException v5_2) {
            Log.e("IconCompat", "Unable to get icon uri", ((Throwable)v5_2));
            return v0;
        }
    }

    @NonNull public Uri getUri() {
        if(this.mType == -1 && Build$VERSION.SDK_INT >= 23) {
            return IconCompat.getUri(this.mObj1);
        }

        return Uri.parse(this.mObj1);
    }

    public Drawable loadDrawable(Context arg3) {
        this.checkResource(arg3);
        if(Build$VERSION.SDK_INT >= 23) {
            return this.toIcon().loadDrawable(arg3);
        }

        Drawable v3 = this.loadDrawableInner(arg3);
        if(v3 != null && (this.mTintList != null || this.mTintMode != IconCompat.DEFAULT_TINT_MODE)) {
            v3.mutate();
            DrawableCompat.setTintList(v3, this.mTintList);
            DrawableCompat.setTintMode(v3, this.mTintMode);
        }

        return v3;
    }

    private Drawable loadDrawableInner(Context arg7) {
        InputStream v1_4;
        FileInputStream v1_2;
        Drawable v2 = null;
        switch(this.mType) {
            case 1: {
                goto label_87;
            }
            case 2: {
                goto label_64;
            }
            case 3: {
                goto label_56;
            }
            case 4: {
                goto label_11;
            }
            case 5: {
                goto label_5;
            }
        }

        return v2;
    label_5:
        return new BitmapDrawable(arg7.getResources(), IconCompat.createLegacyIconFromAdaptiveIcon(this.mObj1, false));
    label_87:
        return new BitmapDrawable(arg7.getResources(), this.mObj1);
    label_56:
        return new BitmapDrawable(arg7.getResources(), BitmapFactory.decodeByteArray(this.mObj1, this.mInt1, this.mInt2));
    label_11:
        Uri v0 = Uri.parse(this.mObj1);
        String v1 = v0.getScheme();
        if(!"content".equals(v1)) {
            if("file".equals(v1)) {
            }
            else {
                try {
                    v1_2 = new FileInputStream(new File(this.mObj1));
                    goto label_50;
                }
                catch(FileNotFoundException v1_1) {
                    Log.w("IconCompat", "Unable to load image from path: " + v0, ((Throwable)v1_1));
                    goto label_49;
                }
            }
        }

        try {
            v1_4 = arg7.getContentResolver().openInputStream(v0);
            goto label_50;
        }
        catch(Exception v1_3) {
            Log.w("IconCompat", "Unable to load image from URI: " + v0, ((Throwable)v1_3));
        }

    label_49:
        v1_2 = ((FileInputStream)v2);
    label_50:
        if((((FileInputStream)v1_4)) == null) {
            return v2;
        }

        return new BitmapDrawable(arg7.getResources(), BitmapFactory.decodeStream(v1_4));
    label_64:
        String v0_1 = this.getResPackage();
        if(TextUtils.isEmpty(((CharSequence)v0_1))) {
            v0_1 = arg7.getPackageName();
        }

        Resources v0_2 = IconCompat.getResources(arg7, v0_1);
        try {
            return ResourcesCompat.getDrawable(v0_2, this.mInt1, arg7.getTheme());
        }
        catch(RuntimeException v7) {
            Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.mInt1), this.mObj1), ((Throwable)v7));
        }

        return v2;
    }

    public void onPostParceling() {
        this.mTintMode = PorterDuff$Mode.valueOf(this.mTintModeStr);
        int v0 = this.mType;
        if(v0 != -1) {
            switch(v0) {
                case 3: {
                    goto label_8;
                }
                case 2: 
                case 4: {
                    goto label_11;
                }
                case 1: 
                case 5: {
                    goto label_18;
                }
            }

            return;
        label_18:
            if(this.mParcelable != null) {
                this.mObj1 = this.mParcelable;
            }
            else {
                this.mObj1 = this.mData;
                this.mType = 3;
                this.mInt1 = 0;
                this.mInt2 = this.mData.length;
                return;
            label_8:
                this.mObj1 = this.mData;
                return;
            label_11:
                this.mObj1 = new String(this.mData, Charset.forName("UTF-16"));
            }
        }
        else if(this.mParcelable != null) {
            this.mObj1 = this.mParcelable;
        }
        else {
            goto label_38;
        }

        return;
    label_38:
        throw new IllegalArgumentException("Invalid icon");
    }

    public void onPreParceling(boolean arg4) {
        this.mTintModeStr = this.mTintMode.name();
        int v0 = this.mType;
        if(v0 != -1) {
            switch(v0) {
                case 2: {
                    goto label_18;
                }
                case 3: {
                    goto label_15;
                }
                case 4: {
                    goto label_8;
                }
                case 1: 
                case 5: {
                    goto label_24;
                }
            }

            return;
        label_18:
            this.mData = this.mObj1.getBytes(Charset.forName("UTF-16"));
            return;
        label_24:
            if(arg4) {
                Object v4 = this.mObj1;
                ByteArrayOutputStream v0_1 = new ByteArrayOutputStream();
                ((Bitmap)v4).compress(Bitmap$CompressFormat.PNG, 90, ((OutputStream)v0_1));
                this.mData = v0_1.toByteArray();
            }
            else {
                this.mParcelable = this.mObj1;
                return;
            label_8:
                this.mData = this.mObj1.toString().getBytes(Charset.forName("UTF-16"));
                return;
            label_15:
                this.mData = this.mObj1;
            }
        }
        else if(!arg4) {
            this.mParcelable = this.mObj1;
        }
        else {
            goto label_41;
        }

        return;
    label_41:
        throw new IllegalArgumentException("Can\'t serialize Icon created with IconCompat#createFromIcon");
    }

    public IconCompat setTint(@ColorInt int arg1) {
        return this.setTintList(ColorStateList.valueOf(arg1));
    }

    public IconCompat setTintList(ColorStateList arg1) {
        this.mTintList = arg1;
        return this;
    }

    public IconCompat setTintMode(PorterDuff$Mode arg1) {
        this.mTintMode = arg1;
        return this;
    }

    public Bundle toBundle() {
        Bundle v0 = new Bundle();
        int v1 = this.mType;
        if(v1 != -1) {
            switch(v1) {
                case 3: {
                    goto label_10;
                }
                case 2: 
                case 4: {
                    goto label_14;
                }
                case 1: 
                case 5: {
                    goto label_18;
                }
            }

            throw new IllegalArgumentException("Invalid icon");
        label_18:
            v0.putParcelable("obj", this.mObj1);
            goto label_25;
        label_10:
            v0.putByteArray("obj", this.mObj1);
            goto label_25;
        label_14:
            v0.putString("obj", this.mObj1);
        }
        else {
            v0.putParcelable("obj", this.mObj1);
        }

    label_25:
        v0.putInt("type", this.mType);
        v0.putInt("int1", this.mInt1);
        v0.putInt("int2", this.mInt2);
        if(this.mTintList != null) {
            v0.putParcelable("tint_list", this.mTintList);
        }

        if(this.mTintMode != IconCompat.DEFAULT_TINT_MODE) {
            v0.putString("tint_mode", this.mTintMode.name());
        }

        return v0;
    }

    @RequiresApi(value=23) public Icon toIcon() {
        Icon v0_1;
        int v0 = this.mType;
        if(v0 != -1) {
            switch(v0) {
                case 1: {
                    v0_1 = Icon.createWithBitmap(this.mObj1);
                    break;
                }
                case 2: {
                    v0_1 = Icon.createWithResource(this.getResPackage(), this.mInt1);
                    break;
                }
                case 3: {
                    v0_1 = Icon.createWithData(this.mObj1, this.mInt1, this.mInt2);
                    break;
                }
                case 4: {
                    v0_1 = Icon.createWithContentUri(this.mObj1);
                    break;
                }
                case 5: {
                    if(Build$VERSION.SDK_INT >= 26) {
                        v0_1 = Icon.createWithAdaptiveBitmap(this.mObj1);
                        goto label_33;
                    }

                    v0_1 = Icon.createWithBitmap(IconCompat.createLegacyIconFromAdaptiveIcon(this.mObj1, false));
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unknown type");
                }
            }

        label_33:
            if(this.mTintList != null) {
                v0_1.setTintList(this.mTintList);
            }

            if(this.mTintMode != IconCompat.DEFAULT_TINT_MODE) {
                v0_1.setTintMode(this.mTintMode);
            }

            return v0_1;
        }

        return this.mObj1;
    }

    public String toString() {
        if(this.mType == -1) {
            return String.valueOf(this.mObj1);
        }

        StringBuilder v0 = new StringBuilder("Icon(typ=");
        v0.append(IconCompat.typeToString(this.mType));
        switch(this.mType) {
            case 2: {
                v0.append(" pkg=");
                v0.append(this.getResPackage());
                v0.append(" id=");
                v0.append(String.format("0x%08x", Integer.valueOf(this.getResId())));
                break;
            }
            case 3: {
                v0.append(" len=");
                v0.append(this.mInt1);
                if(this.mInt2 == 0) {
                    goto label_57;
                }

                v0.append(" off=");
                v0.append(this.mInt2);
                break;
            }
            case 4: {
                v0.append(" uri=");
                v0.append(this.mObj1);
                break;
            }
            case 1: 
            case 5: {
                v0.append(" size=");
                v0.append(this.mObj1.getWidth());
                v0.append("x");
                v0.append(this.mObj1.getHeight());
                break;
            }
            default: {
                break;
            }
        }

    label_57:
        if(this.mTintList != null) {
            v0.append(" tint=");
            v0.append(this.mTintList);
        }

        if(this.mTintMode != IconCompat.DEFAULT_TINT_MODE) {
            v0.append(" mode=");
            v0.append(this.mTintMode);
        }

        v0.append(")");
        return v0.toString();
    }

    private static String typeToString(int arg0) {
        switch(arg0) {
            case 1: {
                return "BITMAP";
            }
            case 2: {
                return "RESOURCE";
            }
            case 3: {
                return "DATA";
            }
            case 4: {
                return "URI";
            }
            case 5: {
                return "BITMAP_MASKABLE";
            }
        }

        return "UNKNOWN";
    }
}

