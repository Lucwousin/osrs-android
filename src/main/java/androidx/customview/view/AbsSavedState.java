package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class AbsSavedState implements Parcelable {
    final class androidx.customview.view.AbsSavedState$1 extends AbsSavedState {
        androidx.customview.view.AbsSavedState$1() {
            super(null);
        }
    }

    final class androidx.customview.view.AbsSavedState$2 implements Parcelable$ClassLoaderCreator {
        androidx.customview.view.AbsSavedState$2() {
            super();
        }

        public AbsSavedState createFromParcel(Parcel arg2) {
            return this.createFromParcel(arg2, null);
        }

        public AbsSavedState createFromParcel(Parcel arg1, ClassLoader arg2) {
            if(arg1.readParcelable(arg2) == null) {
                return AbsSavedState.EMPTY_STATE;
            }

            throw new IllegalStateException("superState must be null");
        }

        public Object createFromParcel(Parcel arg1) {
            return this.createFromParcel(arg1);
        }

        public Object createFromParcel(Parcel arg1, ClassLoader arg2) {
            return this.createFromParcel(arg1, arg2);
        }

        public AbsSavedState[] newArray(int arg1) {
            return new AbsSavedState[arg1];
        }

        public Object[] newArray(int arg1) {
            return this.newArray(arg1);
        }
    }

    public static final Parcelable$Creator CREATOR;
    public static final AbsSavedState EMPTY_STATE;
    private final Parcelable mSuperState;

    static {
        AbsSavedState.EMPTY_STATE = new androidx.customview.view.AbsSavedState$1();
        AbsSavedState.CREATOR = new androidx.customview.view.AbsSavedState$2();
    }

    protected AbsSavedState(@NonNull Parcel arg1, @Nullable ClassLoader arg2) {
        super();
        Parcelable v1 = arg1.readParcelable(arg2);
        if(v1 != null) {
        }
        else {
            AbsSavedState v1_1 = AbsSavedState.EMPTY_STATE;
        }

        this.mSuperState = v1;
    }

    protected AbsSavedState(@NonNull Parcelable arg2) {
        super();
        if(arg2 != null) {
            if(arg2 != AbsSavedState.EMPTY_STATE) {
            }
            else {
                arg2 = null;
            }

            this.mSuperState = arg2;
            return;
        }

        throw new IllegalArgumentException("superState must not be null");
    }

    private AbsSavedState() {
        super();
        this.mSuperState = null;
    }

    protected AbsSavedState(@NonNull Parcel arg2) {
        this(arg2, null);
    }

    AbsSavedState(androidx.customview.view.AbsSavedState$1 arg1) {
        this();
    }

    public int describeContents() {
        return 0;
    }

    @Nullable public final Parcelable getSuperState() {
        return this.mSuperState;
    }

    public void writeToParcel(Parcel arg2, int arg3) {
        arg2.writeParcelable(this.mSuperState, arg3);
    }
}

