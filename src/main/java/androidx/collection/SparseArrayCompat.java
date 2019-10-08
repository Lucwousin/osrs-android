package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SparseArrayCompat implements Cloneable {
    private static final Object DELETED;
    private boolean mGarbage;
    private int[] mKeys;
    private int mSize;
    private Object[] mValues;

    static {
        SparseArrayCompat.DELETED = new Object();
    }

    public SparseArrayCompat() {
        this(10);
    }

    public SparseArrayCompat(int arg3) {
        super();
        this.mGarbage = false;
        if(arg3 == 0) {
            this.mKeys = ContainerHelpers.EMPTY_INTS;
            this.mValues = ContainerHelpers.EMPTY_OBJECTS;
        }
        else {
            arg3 = ContainerHelpers.idealIntArraySize(arg3);
            this.mKeys = new int[arg3];
            this.mValues = new Object[arg3];
        }

        this.mSize = 0;
    }

    public void append(int arg7, Object arg8) {
        if(this.mSize != 0 && arg7 <= this.mKeys[this.mSize - 1]) {
            this.put(arg7, arg8);
            return;
        }

        if((this.mGarbage) && this.mSize >= this.mKeys.length) {
            this.gc();
        }

        int v0 = this.mSize;
        if(v0 >= this.mKeys.length) {
            int v1 = ContainerHelpers.idealIntArraySize(v0 + 1);
            int[] v2 = new int[v1];
            Object[] v1_1 = new Object[v1];
            System.arraycopy(this.mKeys, 0, v2, 0, this.mKeys.length);
            System.arraycopy(this.mValues, 0, v1_1, 0, this.mValues.length);
            this.mKeys = v2;
            this.mValues = v1_1;
        }

        this.mKeys[v0] = arg7;
        this.mValues[v0] = arg8;
        this.mSize = v0 + 1;
    }

    public void clear() {
        int v0 = this.mSize;
        Object[] v1 = this.mValues;
        int v3;
        for(v3 = 0; v3 < v0; ++v3) {
            v1[v3] = null;
        }

        this.mSize = 0;
        this.mGarbage = false;
    }

    public SparseArrayCompat clone() {
        try {
            Object v0_1 = super.clone();
            ((SparseArrayCompat)v0_1).mKeys = this.mKeys.clone();
            ((SparseArrayCompat)v0_1).mValues = this.mValues.clone();
            return ((SparseArrayCompat)v0_1);
        }
        catch(CloneNotSupportedException v0) {
            throw new AssertionError(v0);
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return this.clone();
    }

    public boolean containsKey(int arg1) {
        boolean v1 = this.indexOfKey(arg1) >= 0 ? true : false;
        return v1;
    }

    public boolean containsValue(Object arg1) {
        boolean v1 = this.indexOfValue(arg1) >= 0 ? true : false;
        return v1;
    }

    public void delete(int arg3) {
        arg3 = ContainerHelpers.binarySearch(this.mKeys, this.mSize, arg3);
        if(arg3 >= 0 && this.mValues[arg3] != SparseArrayCompat.DELETED) {
            this.mValues[arg3] = SparseArrayCompat.DELETED;
            this.mGarbage = true;
        }
    }

    private void gc() {
        int v0 = this.mSize;
        int[] v1 = this.mKeys;
        Object[] v2 = this.mValues;
        int v4 = 0;
        int v5 = 0;
        while(v4 < v0) {
            Object v6 = v2[v4];
            if(v6 != SparseArrayCompat.DELETED) {
                if(v4 != v5) {
                    v1[v5] = v1[v4];
                    v2[v5] = v6;
                    v2[v4] = null;
                }

                ++v5;
            }

            ++v4;
        }

        this.mGarbage = false;
        this.mSize = v5;
    }

    @Nullable public Object get(int arg2) {
        return this.get(arg2, null);
    }

    public Object get(int arg3, Object arg4) {
        arg3 = ContainerHelpers.binarySearch(this.mKeys, this.mSize, arg3);
        if(arg3 >= 0) {
            if(this.mValues[arg3] == SparseArrayCompat.DELETED) {
            }
            else {
                return this.mValues[arg3];
            }
        }

        return arg4;
    }

    public int indexOfKey(int arg3) {
        if(this.mGarbage) {
            this.gc();
        }

        return ContainerHelpers.binarySearch(this.mKeys, this.mSize, arg3);
    }

    public int indexOfValue(Object arg3) {
        if(this.mGarbage) {
            this.gc();
        }

        int v0;
        for(v0 = 0; v0 < this.mSize; ++v0) {
            if(this.mValues[v0] == arg3) {
                return v0;
            }
        }

        return -1;
    }

    public boolean isEmpty() {
        boolean v0 = this.size() == 0 ? true : false;
        return v0;
    }

    public int keyAt(int arg2) {
        if(this.mGarbage) {
            this.gc();
        }

        return this.mKeys[arg2];
    }

    public void put(int arg7, Object arg8) {
        int v0 = ContainerHelpers.binarySearch(this.mKeys, this.mSize, arg7);
        if(v0 >= 0) {
            this.mValues[v0] = arg8;
        }
        else {
            v0 = ~v0;
            if(v0 < this.mSize && this.mValues[v0] == SparseArrayCompat.DELETED) {
                this.mKeys[v0] = arg7;
                this.mValues[v0] = arg8;
                return;
            }

            if((this.mGarbage) && this.mSize >= this.mKeys.length) {
                this.gc();
                v0 = ~ContainerHelpers.binarySearch(this.mKeys, this.mSize, arg7);
            }

            if(this.mSize >= this.mKeys.length) {
                int v1 = ContainerHelpers.idealIntArraySize(this.mSize + 1);
                int[] v2 = new int[v1];
                Object[] v1_1 = new Object[v1];
                System.arraycopy(this.mKeys, 0, v2, 0, this.mKeys.length);
                System.arraycopy(this.mValues, 0, v1_1, 0, this.mValues.length);
                this.mKeys = v2;
                this.mValues = v1_1;
            }

            if(this.mSize - v0 != 0) {
                int v3 = v0 + 1;
                System.arraycopy(this.mKeys, v0, this.mKeys, v3, this.mSize - v0);
                System.arraycopy(this.mValues, v0, this.mValues, v3, this.mSize - v0);
            }

            this.mKeys[v0] = arg7;
            this.mValues[v0] = arg8;
            ++this.mSize;
        }
    }

    public void putAll(@NonNull SparseArrayCompat arg5) {
        int v0 = arg5.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            this.put(arg5.keyAt(v1), arg5.valueAt(v1));
        }
    }

    public void remove(int arg1) {
        this.delete(arg1);
    }

    public void removeAt(int arg3) {
        if(this.mValues[arg3] != SparseArrayCompat.DELETED) {
            this.mValues[arg3] = SparseArrayCompat.DELETED;
            this.mGarbage = true;
        }
    }

    public void removeAtRange(int arg2, int arg3) {
        arg3 = Math.min(this.mSize, arg3 + arg2);
        while(arg2 < arg3) {
            this.removeAt(arg2);
            ++arg2;
        }
    }

    public void setValueAt(int arg2, Object arg3) {
        if(this.mGarbage) {
            this.gc();
        }

        this.mValues[arg2] = arg3;
    }

    public int size() {
        if(this.mGarbage) {
            this.gc();
        }

        return this.mSize;
    }

    public String toString() {
        if(this.size() <= 0) {
            return "{}";
        }

        StringBuilder v0 = new StringBuilder(this.mSize * 28);
        v0.append('{');
        int v1;
        for(v1 = 0; v1 < this.mSize; ++v1) {
            if(v1 > 0) {
                v0.append(", ");
            }

            v0.append(this.keyAt(v1));
            v0.append('=');
            Object v2 = this.valueAt(v1);
            if((((SparseArrayCompat)v2)) != this) {
                v0.append(v2);
            }
            else {
                v0.append("(this Map)");
            }
        }

        v0.append('}');
        return v0.toString();
    }

    public Object valueAt(int arg2) {
        if(this.mGarbage) {
            this.gc();
        }

        return this.mValues[arg2];
    }
}

