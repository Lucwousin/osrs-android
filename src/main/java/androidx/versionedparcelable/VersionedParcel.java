package androidx.versionedparcelable;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.ArraySet;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public abstract class VersionedParcel {
    public class ParcelException extends RuntimeException {
        public ParcelException(Throwable arg1) {
            super(arg1);
        }
    }

    private static final int EX_BAD_PARCELABLE = -2;
    private static final int EX_ILLEGAL_ARGUMENT = -3;
    private static final int EX_ILLEGAL_STATE = -5;
    private static final int EX_NETWORK_MAIN_THREAD = -6;
    private static final int EX_NULL_POINTER = -4;
    private static final int EX_PARCELABLE = -9;
    private static final int EX_SECURITY = -1;
    private static final int EX_UNSUPPORTED_OPERATION = -7;
    private static final String TAG = "VersionedParcel";
    private static final int TYPE_BINDER = 5;
    private static final int TYPE_PARCELABLE = 2;
    private static final int TYPE_SERIALIZABLE = 3;
    private static final int TYPE_STRING = 4;
    private static final int TYPE_VERSIONED_PARCELABLE = 1;

    public VersionedParcel() {
        super();
    }

    protected abstract void closeField();

    private Exception createException(int arg4, String arg5) {
        switch(arg4) {
            case -9: {
                goto label_34;
            }
            case -7: {
                goto label_31;
            }
            case -6: {
                goto label_28;
            }
            case -5: {
                goto label_25;
            }
            case -4: {
                goto label_22;
            }
            case -3: {
                goto label_19;
            }
            case -2: {
                goto label_16;
            }
            case -1: {
                goto label_13;
            }
        }

        StringBuilder v1 = new StringBuilder();
        v1.append("Unknown exception code: ");
        v1.append(arg4);
        v1.append(" msg ");
        v1.append(arg5);
        return new RuntimeException(v1.toString());
    label_34:
        return this.readParcelable();
    label_19:
        return new IllegalArgumentException(arg5);
    label_22:
        return new NullPointerException(arg5);
    label_25:
        return new IllegalStateException(arg5);
    label_28:
        return new NetworkOnMainThreadException();
    label_13:
        return new SecurityException(arg5);
    label_31:
        return new UnsupportedOperationException(arg5);
    label_16:
        return new BadParcelableException(arg5);
    }

    protected abstract VersionedParcel createSubParcel();

    private static Class findParcelClass(VersionedParcelable arg0) throws ClassNotFoundException {
        return VersionedParcel.findParcelClass(arg0.getClass());
    }

    private static Class findParcelClass(Class arg5) throws ClassNotFoundException {
        return Class.forName(String.format("%s.%sParcelizer", arg5.getPackage().getName(), arg5.getSimpleName()), false, arg5.getClassLoader());
    }

    @NonNull protected static Throwable getRootCause(@NonNull Throwable arg1) {
        while(arg1.getCause() != null) {
            arg1 = arg1.getCause();
        }

        return arg1;
    }

    private int getType(Object arg3) {
        if((arg3 instanceof String)) {
            return 4;
        }

        if((arg3 instanceof Parcelable)) {
            return 2;
        }

        if((arg3 instanceof VersionedParcelable)) {
            return 1;
        }

        if((arg3 instanceof Serializable)) {
            return 3;
        }

        if((arg3 instanceof IBinder)) {
            return 5;
        }

        StringBuilder v1 = new StringBuilder();
        v1.append(arg3.getClass().getName());
        v1.append(" cannot be VersionedParcelled");
        throw new IllegalArgumentException(v1.toString());
    }

    public boolean isStream() {
        return 0;
    }

    protected Object[] readArray(Object[] arg5) {
        int v0 = this.readInt();
        Object[] v1 = null;
        if(v0 < 0) {
            return v1;
        }

        ArrayList v2 = new ArrayList(v0);
        if(v0 != 0) {
            int v3 = this.readInt();
            if(v0 < 0) {
                return v1;
            }
            else {
                switch(v3) {
                    case 1: {
                        goto label_32;
                    }
                    case 2: {
                        goto label_27;
                    }
                    case 3: {
                        goto label_22;
                    }
                    case 4: {
                        goto label_17;
                    }
                    case 5: {
                        goto label_12;
                    }
                }

                goto label_37;
                while(true) {
                label_17:
                    if(v0 > 0) {
                        v2.add(this.readString());
                        --v0;
                        continue;
                    }

                    goto label_37;
                }

                while(true) {
                label_22:
                    if(v0 > 0) {
                        v2.add(this.readSerializable());
                        --v0;
                        continue;
                    }

                    goto label_37;
                }

                while(true) {
                label_27:
                    if(v0 > 0) {
                        v2.add(this.readParcelable());
                        --v0;
                        continue;
                    }

                    goto label_37;
                }

                while(true) {
                label_12:
                    if(v0 > 0) {
                        v2.add(this.readStrongBinder());
                        --v0;
                        continue;
                    }

                    goto label_37;
                }

            label_32:
                while(v0 > 0) {
                    v2.add(this.readVersionedParcelable());
                    --v0;
                }
            }
        }

    label_37:
        return v2.toArray(arg5);
    }

    public Object[] readArray(Object[] arg1, int arg2) {
        if(!this.readField(arg2)) {
            return arg1;
        }

        return this.readArray(arg1);
    }

    protected abstract boolean readBoolean();

    public boolean readBoolean(boolean arg1, int arg2) {
        if(!this.readField(arg2)) {
            return arg1;
        }

        return this.readBoolean();
    }

    protected boolean[] readBooleanArray() {
        int v0 = this.readInt();
        if(v0 < 0) {
            return null;
        }

        boolean[] v1 = new boolean[v0];
        int v3;
        for(v3 = 0; v3 < v0; ++v3) {
            boolean v4 = this.readInt() != 0 ? true : false;
            v1[v3] = v4;
        }

        return v1;
    }

    public boolean[] readBooleanArray(boolean[] arg1, int arg2) {
        if(!this.readField(arg2)) {
            return arg1;
        }

        return this.readBooleanArray();
    }

    protected abstract Bundle readBundle();

    public Bundle readBundle(Bundle arg1, int arg2) {
        if(!this.readField(arg2)) {
            return arg1;
        }

        return this.readBundle();
    }

    public byte readByte(byte arg1, int arg2) {
        if(!this.readField(arg2)) {
            return arg1;
        }

        return ((byte)(this.readInt() & 0xFF));
    }

    public byte[] readByteArray(byte[] arg1, int arg2) {
        if(!this.readField(arg2)) {
            return arg1;
        }

        return this.readByteArray();
    }

    protected abstract byte[] readByteArray();

    public char[] readCharArray(char[] arg3, int arg4) {
        if(!this.readField(arg4)) {
            return arg3;
        }

        int v3 = this.readInt();
        if(v3 < 0) {
            return null;
        }

        char[] v4 = new char[v3];
        int v0;
        for(v0 = 0; v0 < v3; ++v0) {
            v4[v0] = ((char)this.readInt());
        }

        return v4;
    }

    private Collection readCollection(int arg3, Collection arg4) {
        arg3 = this.readInt();
        Collection v0 = null;
        if(arg3 < 0) {
            return v0;
        }

        if(arg3 != 0) {
            int v1 = this.readInt();
            if(arg3 < 0) {
                return v0;
            }
            else {
                switch(v1) {
                    case 1: {
                        goto label_30;
                    }
                    case 2: {
                        goto label_25;
                    }
                    case 3: {
                        goto label_20;
                    }
                    case 4: {
                        goto label_15;
                    }
                    case 5: {
                        goto label_10;
                    }
                }

                return arg4;
                while(true) {
                label_20:
                    if(arg3 > 0) {
                        arg4.add(this.readSerializable());
                        --arg3;
                        continue;
                    }

                    return arg4;
                }

                while(true) {
                label_25:
                    if(arg3 > 0) {
                        arg4.add(this.readParcelable());
                        --arg3;
                        continue;
                    }

                    return arg4;
                }

                while(true) {
                label_10:
                    if(arg3 > 0) {
                        arg4.add(this.readStrongBinder());
                        --arg3;
                        continue;
                    }

                    return arg4;
                }

                while(true) {
                label_30:
                    if(arg3 > 0) {
                        arg4.add(this.readVersionedParcelable());
                        --arg3;
                        continue;
                    }

                    return arg4;
                }

            label_15:
                while(arg3 > 0) {
                    arg4.add(this.readString());
                    --arg3;
                }
            }
        }

        return arg4;
    }

    protected abstract double readDouble();

    public double readDouble(double arg1, int arg3) {
        if(!this.readField(arg3)) {
            return arg1;
        }

        return this.readDouble();
    }

    protected double[] readDoubleArray() {
        int v0 = this.readInt();
        if(v0 < 0) {
            return null;
        }

        double[] v1 = new double[v0];
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            v1[v2] = this.readDouble();
        }

        return v1;
    }

    public double[] readDoubleArray(double[] arg1, int arg2) {
        if(!this.readField(arg2)) {
            return arg1;
        }

        return this.readDoubleArray();
    }

    private Exception readException(int arg1, String arg2) {
        return this.createException(arg1, arg2);
    }

    public Exception readException(Exception arg1, int arg2) {
        if(!this.readField(arg2)) {
            return arg1;
        }

        arg2 = this.readExceptionCode();
        if(arg2 != 0) {
            return this.readException(arg2, this.readString());
        }

        return arg1;
    }

    private int readExceptionCode() {
        return this.readInt();
    }

    protected abstract boolean readField(int arg1);

    protected abstract float readFloat();

    public float readFloat(float arg1, int arg2) {
        if(!this.readField(arg2)) {
            return arg1;
        }

        return this.readFloat();
    }

    protected float[] readFloatArray() {
        int v0 = this.readInt();
        if(v0 < 0) {
            return null;
        }

        float[] v1 = new float[v0];
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            v1[v2] = this.readFloat();
        }

        return v1;
    }

    public float[] readFloatArray(float[] arg1, int arg2) {
        if(!this.readField(arg2)) {
            return arg1;
        }

        return this.readFloatArray();
    }

    protected static VersionedParcelable readFromParcel(String arg5, VersionedParcel arg6) {
        try {
            return Class.forName(arg5, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class).invoke(null, arg6);
        }
        catch(ClassNotFoundException v5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", ((Throwable)v5));
        }
        catch(NoSuchMethodException v5_1) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", ((Throwable)v5_1));
        }
        catch(InvocationTargetException v5_2) {
            if((v5_2.getCause() instanceof RuntimeException)) {
                throw v5_2.getCause();
            }

            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", ((Throwable)v5_2));
        }
        catch(IllegalAccessException v5_3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", ((Throwable)v5_3));
        }
    }

    public int readInt(int arg1, int arg2) {
        if(!this.readField(arg2)) {
            return arg1;
        }

        return this.readInt();
    }

    protected abstract int readInt();

    protected int[] readIntArray() {
        int v0 = this.readInt();
        if(v0 < 0) {
            return null;
        }

        int[] v1 = new int[v0];
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            v1[v2] = this.readInt();
        }

        return v1;
    }

    public int[] readIntArray(int[] arg1, int arg2) {
        if(!this.readField(arg2)) {
            return arg1;
        }

        return this.readIntArray();
    }

    public List readList(List arg2, int arg3) {
        if(!this.readField(arg3)) {
            return arg2;
        }

        return this.readCollection(arg3, new ArrayList());
    }

    protected abstract long readLong();

    public long readLong(long arg1, int arg3) {
        if(!this.readField(arg3)) {
            return arg1;
        }

        return this.readLong();
    }

    protected long[] readLongArray() {
        int v0 = this.readInt();
        if(v0 < 0) {
            return null;
        }

        long[] v1 = new long[v0];
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            v1[v2] = this.readLong();
        }

        return v1;
    }

    public long[] readLongArray(long[] arg1, int arg2) {
        if(!this.readField(arg2)) {
            return arg1;
        }

        return this.readLongArray();
    }

    public Parcelable readParcelable(Parcelable arg1, int arg2) {
        if(!this.readField(arg2)) {
            return arg1;
        }

        return this.readParcelable();
    }

    protected abstract Parcelable readParcelable();

    protected Serializable readSerializable() {
        StringBuilder v3;
        String v0 = this.readString();
        if(v0 == null) {
            return null;
        }

        ByteArrayInputStream v2 = new ByteArrayInputStream(this.readByteArray());
        try {
            return new ObjectInputStream(((InputStream)v2)) {
                protected Class resolveClass(ObjectStreamClass arg4) throws IOException, ClassNotFoundException {
                    Class v0 = Class.forName(arg4.getName(), false, this.getClass().getClassLoader());
                    if(v0 != null) {
                        return v0;
                    }

                    return super.resolveClass(arg4);
                }
            }.readObject();
        }
        catch(ClassNotFoundException v1) {
            v3 = new StringBuilder();
            v3.append("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = ");
            v3.append(v0);
            v3.append(")");
            throw new RuntimeException(v3.toString(), ((Throwable)v1));
        }
        catch(IOException v1_1) {
            v3 = new StringBuilder();
            v3.append("VersionedParcelable encountered IOException reading a Serializable object (name = ");
            v3.append(v0);
            v3.append(")");
            throw new RuntimeException(v3.toString(), ((Throwable)v1_1));
        }
    }

    public Set readSet(Set arg2, int arg3) {
        if(!this.readField(arg3)) {
            return arg2;
        }

        return this.readCollection(arg3, new ArraySet());
    }

    @RequiresApi(api=21) public Size readSize(Size arg2, int arg3) {
        if(!this.readField(arg3)) {
            return arg2;
        }

        if(this.readBoolean()) {
            return new Size(this.readInt(), this.readInt());
        }

        return null;
    }

    @RequiresApi(api=21) public SizeF readSizeF(SizeF arg2, int arg3) {
        if(!this.readField(arg3)) {
            return arg2;
        }

        if(this.readBoolean()) {
            return new SizeF(this.readFloat(), this.readFloat());
        }

        return null;
    }

    public SparseBooleanArray readSparseBooleanArray(SparseBooleanArray arg4, int arg5) {
        if(!this.readField(arg5)) {
            return arg4;
        }

        int v4 = this.readInt();
        if(v4 < 0) {
            return null;
        }

        SparseBooleanArray v5 = new SparseBooleanArray(v4);
        int v0;
        for(v0 = 0; v0 < v4; ++v0) {
            v5.put(this.readInt(), this.readBoolean());
        }

        return v5;
    }

    public String readString(String arg1, int arg2) {
        if(!this.readField(arg2)) {
            return arg1;
        }

        return this.readString();
    }

    protected abstract String readString();

    protected abstract IBinder readStrongBinder();

    public IBinder readStrongBinder(IBinder arg1, int arg2) {
        if(!this.readField(arg2)) {
            return arg1;
        }

        return this.readStrongBinder();
    }

    public VersionedParcelable readVersionedParcelable(VersionedParcelable arg1, int arg2) {
        if(!this.readField(arg2)) {
            return arg1;
        }

        return this.readVersionedParcelable();
    }

    protected VersionedParcelable readVersionedParcelable() {
        String v0 = this.readString();
        if(v0 == null) {
            return null;
        }

        return VersionedParcel.readFromParcel(v0, this.createSubParcel());
    }

    protected abstract void setOutputField(int arg1);

    public void setSerializationFlags(boolean arg1, boolean arg2) {
    }

    protected void writeArray(Object[] arg4) {
        if(arg4 == null) {
            this.writeInt(-1);
            return;
        }

        int v0 = arg4.length;
        this.writeInt(v0);
        if(v0 > 0) {
            int v1 = 0;
            int v2 = this.getType(arg4[0]);
            this.writeInt(v2);
            switch(v2) {
                case 1: {
                    goto label_33;
                }
                case 2: {
                    goto label_28;
                }
                case 3: {
                    goto label_23;
                }
                case 4: {
                    goto label_18;
                }
                case 5: {
                    goto label_13;
                }
            }

            return;
            while(true) {
            label_33:
                if(v1 < v0) {
                    this.writeVersionedParcelable(arg4[v1]);
                    ++v1;
                    continue;
                }

                return;
            }

            while(true) {
            label_18:
                if(v1 < v0) {
                    this.writeString(arg4[v1]);
                    ++v1;
                    continue;
                }

                return;
            }

            while(true) {
            label_23:
                if(v1 < v0) {
                    this.writeSerializable(arg4[v1]);
                    ++v1;
                    continue;
                }

                return;
            }

            while(true) {
            label_28:
                if(v1 < v0) {
                    this.writeParcelable(arg4[v1]);
                    ++v1;
                    continue;
                }

                return;
            }

        label_13:
            while(v1 < v0) {
                this.writeStrongBinder(arg4[v1]);
                ++v1;
            }
        }
    }

    public void writeArray(Object[] arg1, int arg2) {
        this.setOutputField(arg2);
        this.writeArray(arg1);
    }

    protected abstract void writeBoolean(boolean arg1);

    public void writeBoolean(boolean arg1, int arg2) {
        this.setOutputField(arg2);
        this.writeBoolean(arg1);
    }

    protected void writeBooleanArray(boolean[] arg4) {
        if(arg4 != null) {
            int v0 = arg4.length;
            this.writeInt(v0);
            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                this.writeInt(arg4[v1]);
            }
        }
        else {
            this.writeInt(-1);
        }
    }

    public void writeBooleanArray(boolean[] arg1, int arg2) {
        this.setOutputField(arg2);
        this.writeBooleanArray(arg1);
    }

    protected abstract void writeBundle(Bundle arg1);

    public void writeBundle(Bundle arg1, int arg2) {
        this.setOutputField(arg2);
        this.writeBundle(arg1);
    }

    public void writeByte(byte arg1, int arg2) {
        this.setOutputField(arg2);
        this.writeInt(arg1);
    }

    public void writeByteArray(byte[] arg1, int arg2) {
        this.setOutputField(arg2);
        this.writeByteArray(arg1);
    }

    protected abstract void writeByteArray(byte[] arg1);

    protected abstract void writeByteArray(byte[] arg1, int arg2, int arg3);

    public void writeByteArray(byte[] arg1, int arg2, int arg3, int arg4) {
        this.setOutputField(arg4);
        this.writeByteArray(arg1, arg2, arg3);
    }

    public void writeCharArray(char[] arg3, int arg4) {
        this.setOutputField(arg4);
        if(arg3 != null) {
            arg4 = arg3.length;
            this.writeInt(arg4);
            int v0;
            for(v0 = 0; v0 < arg4; ++v0) {
                this.writeInt(arg3[v0]);
            }
        }
        else {
            this.writeInt(-1);
        }
    }

    private void writeCollection(Collection arg1, int arg2) {
        this.setOutputField(arg2);
        if(arg1 == null) {
            this.writeInt(-1);
            return;
        }

        arg2 = arg1.size();
        this.writeInt(arg2);
        if(arg2 > 0) {
            arg2 = this.getType(arg1.iterator().next());
            this.writeInt(arg2);
            switch(arg2) {
                case 1: {
                    goto label_38;
                }
                case 2: {
                    goto label_32;
                }
                case 3: {
                    goto label_26;
                }
                case 4: {
                    goto label_20;
                }
                case 5: {
                    goto label_14;
                }
            }

            return;
        label_20:
            Iterator v1 = arg1.iterator();
            while(true) {
                if(v1.hasNext()) {
                    this.writeString(v1.next());
                    continue;
                }

                return;
            }

        label_38:
            v1 = arg1.iterator();
            while(true) {
                if(v1.hasNext()) {
                    this.writeVersionedParcelable(v1.next());
                    continue;
                }

                return;
            }

        label_26:
            v1 = arg1.iterator();
            while(true) {
                if(v1.hasNext()) {
                    this.writeSerializable(v1.next());
                    continue;
                }

                return;
            }

        label_14:
            v1 = arg1.iterator();
            while(true) {
                if(v1.hasNext()) {
                    this.writeStrongBinder(v1.next());
                    continue;
                }

                return;
            }

        label_32:
            v1 = arg1.iterator();
            while(v1.hasNext()) {
                this.writeParcelable(v1.next());
            }
        }
    }

    protected abstract void writeDouble(double arg1);

    public void writeDouble(double arg1, int arg3) {
        this.setOutputField(arg3);
        this.writeDouble(arg1);
    }

    protected void writeDoubleArray(double[] arg5) {
        if(arg5 != null) {
            int v0 = arg5.length;
            this.writeInt(v0);
            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                this.writeDouble(arg5[v1]);
            }
        }
        else {
            this.writeInt(-1);
        }
    }

    public void writeDoubleArray(double[] arg1, int arg2) {
        this.setOutputField(arg2);
        this.writeDoubleArray(arg1);
    }

    public void writeException(Exception arg4, int arg5) {
        this.setOutputField(arg5);
        if(arg4 == null) {
            this.writeNoException();
            return;
        }

        arg5 = 0;
        int v1 = -9;
        if(((arg4 instanceof Parcelable)) && arg4.getClass().getClassLoader() == Parcelable.class.getClassLoader()) {
            arg5 = -9;
        }
        else if((arg4 instanceof SecurityException)) {
            arg5 = -1;
        }
        else if((arg4 instanceof BadParcelableException)) {
            arg5 = -2;
        }
        else if((arg4 instanceof IllegalArgumentException)) {
            arg5 = -3;
        }
        else if((arg4 instanceof NullPointerException)) {
            arg5 = -4;
        }
        else if((arg4 instanceof IllegalStateException)) {
            arg5 = -5;
        }
        else if((arg4 instanceof NetworkOnMainThreadException)) {
            arg5 = -6;
        }
        else if((arg4 instanceof UnsupportedOperationException)) {
            arg5 = -7;
        }

        this.writeInt(arg5);
        if(arg5 == 0) {
            if((arg4 instanceof RuntimeException)) {
                throw arg4;
            }

            throw new RuntimeException(((Throwable)arg4));
        }

        this.writeString(arg4.getMessage());
        if(arg5 != v1) {
        }
        else {
            this.writeParcelable(((Parcelable)arg4));
        }
    }

    protected abstract void writeFloat(float arg1);

    public void writeFloat(float arg1, int arg2) {
        this.setOutputField(arg2);
        this.writeFloat(arg1);
    }

    protected void writeFloatArray(float[] arg4) {
        if(arg4 != null) {
            int v0 = arg4.length;
            this.writeInt(v0);
            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                this.writeFloat(arg4[v1]);
            }
        }
        else {
            this.writeInt(-1);
        }
    }

    public void writeFloatArray(float[] arg1, int arg2) {
        this.setOutputField(arg2);
        this.writeFloatArray(arg1);
    }

    public void writeInt(int arg1, int arg2) {
        this.setOutputField(arg2);
        this.writeInt(arg1);
    }

    protected abstract void writeInt(int arg1);

    protected void writeIntArray(int[] arg4) {
        if(arg4 != null) {
            int v0 = arg4.length;
            this.writeInt(v0);
            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                this.writeInt(arg4[v1]);
            }
        }
        else {
            this.writeInt(-1);
        }
    }

    public void writeIntArray(int[] arg1, int arg2) {
        this.setOutputField(arg2);
        this.writeIntArray(arg1);
    }

    public void writeList(List arg1, int arg2) {
        this.writeCollection(((Collection)arg1), arg2);
    }

    protected abstract void writeLong(long arg1);

    public void writeLong(long arg1, int arg3) {
        this.setOutputField(arg3);
        this.writeLong(arg1);
    }

    protected void writeLongArray(long[] arg5) {
        if(arg5 != null) {
            int v0 = arg5.length;
            this.writeInt(v0);
            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                this.writeLong(arg5[v1]);
            }
        }
        else {
            this.writeInt(-1);
        }
    }

    public void writeLongArray(long[] arg1, int arg2) {
        this.setOutputField(arg2);
        this.writeLongArray(arg1);
    }

    protected void writeNoException() {
        this.writeInt(0);
    }

    public void writeParcelable(Parcelable arg1, int arg2) {
        this.setOutputField(arg2);
        this.writeParcelable(arg1);
    }

    protected abstract void writeParcelable(Parcelable arg1);

    private void writeSerializable(Serializable arg5) {
        if(arg5 == null) {
            this.writeString(null);
            return;
        }

        String v0 = arg5.getClass().getName();
        this.writeString(v0);
        ByteArrayOutputStream v1 = new ByteArrayOutputStream();
        try {
            ObjectOutputStream v2 = new ObjectOutputStream(((OutputStream)v1));
            v2.writeObject(arg5);
            v2.close();
            this.writeByteArray(v1.toByteArray());
            return;
        }
        catch(IOException v5) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("VersionedParcelable encountered IOException writing serializable object (name = ");
            v2_1.append(v0);
            v2_1.append(")");
            throw new RuntimeException(v2_1.toString(), ((Throwable)v5));
        }
    }

    public void writeSerializable(Serializable arg1, int arg2) {
        this.setOutputField(arg2);
        this.writeSerializable(arg1);
    }

    public void writeSet(Set arg1, int arg2) {
        this.writeCollection(((Collection)arg1), arg2);
    }

    @RequiresApi(api=21) public void writeSize(Size arg1, int arg2) {
        this.setOutputField(arg2);
        boolean v2 = arg1 != null ? true : false;
        this.writeBoolean(v2);
        if(arg1 != null) {
            this.writeInt(arg1.getWidth());
            this.writeInt(arg1.getHeight());
        }
    }

    @RequiresApi(api=21) public void writeSizeF(SizeF arg1, int arg2) {
        this.setOutputField(arg2);
        boolean v2 = arg1 != null ? true : false;
        this.writeBoolean(v2);
        if(arg1 != null) {
            this.writeFloat(arg1.getWidth());
            this.writeFloat(arg1.getHeight());
        }
    }

    public void writeSparseBooleanArray(SparseBooleanArray arg3, int arg4) {
        this.setOutputField(arg4);
        if(arg3 == null) {
            this.writeInt(-1);
            return;
        }

        arg4 = arg3.size();
        this.writeInt(arg4);
        int v0;
        for(v0 = 0; v0 < arg4; ++v0) {
            this.writeInt(arg3.keyAt(v0));
            this.writeBoolean(arg3.valueAt(v0));
        }
    }

    public void writeString(String arg1, int arg2) {
        this.setOutputField(arg2);
        this.writeString(arg1);
    }

    protected abstract void writeString(String arg1);

    protected abstract void writeStrongBinder(IBinder arg1);

    public void writeStrongBinder(IBinder arg1, int arg2) {
        this.setOutputField(arg2);
        this.writeStrongBinder(arg1);
    }

    protected abstract void writeStrongInterface(IInterface arg1);

    public void writeStrongInterface(IInterface arg1, int arg2) {
        this.setOutputField(arg2);
        this.writeStrongInterface(arg1);
    }

    protected static void writeToParcel(VersionedParcelable arg7, VersionedParcel arg8) {
        try {
            VersionedParcel.findParcelClass(arg7).getDeclaredMethod("write", arg7.getClass(), VersionedParcel.class).invoke(null, arg7, arg8);
            return;
        }
        catch(ClassNotFoundException v7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", ((Throwable)v7));
        }
        catch(NoSuchMethodException v7_1) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", ((Throwable)v7_1));
        }
        catch(InvocationTargetException v7_2) {
            if((v7_2.getCause() instanceof RuntimeException)) {
                throw v7_2.getCause();
            }

            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", ((Throwable)v7_2));
        }
        catch(IllegalAccessException v7_3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", ((Throwable)v7_3));
        }
    }

    public void writeVersionedParcelable(VersionedParcelable arg1, int arg2) {
        this.setOutputField(arg2);
        this.writeVersionedParcelable(arg1);
    }

    protected void writeVersionedParcelable(VersionedParcelable arg2) {
        if(arg2 == null) {
            this.writeString(null);
            return;
        }

        this.writeVersionedParcelableCreator(arg2);
        VersionedParcel v0 = this.createSubParcel();
        VersionedParcel.writeToParcel(arg2, v0);
        v0.closeField();
    }

    private void writeVersionedParcelableCreator(VersionedParcelable arg4) {
        Class v0_1;
        try {
            v0_1 = VersionedParcel.findParcelClass(arg4.getClass());
        }
        catch(ClassNotFoundException v0) {
            StringBuilder v2 = new StringBuilder();
            v2.append(arg4.getClass().getSimpleName());
            v2.append(" does not have a Parcelizer");
            throw new RuntimeException(v2.toString(), ((Throwable)v0));
        }

        this.writeString(v0_1.getName());
    }
}

