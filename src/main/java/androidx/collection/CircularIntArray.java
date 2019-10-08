package androidx.collection;

public final class CircularIntArray {
    private int mCapacityBitmask;
    private int[] mElements;
    private int mHead;
    private int mTail;

    public CircularIntArray() {
        this(8);
    }

    public CircularIntArray(int arg3) {
        super();
        if(arg3 >= 1) {
            if(arg3 <= 0x40000000) {
                if(Integer.bitCount(arg3) != 1) {
                    arg3 = Integer.highestOneBit(arg3 - 1) << 1;
                }

                this.mCapacityBitmask = arg3 - 1;
                this.mElements = new int[arg3];
                return;
            }

            throw new IllegalArgumentException("capacity must be <= 2^30");
        }

        throw new IllegalArgumentException("capacity must be >= 1");
    }

    public void addFirst(int arg3) {
        this.mHead = this.mHead - 1 & this.mCapacityBitmask;
        this.mElements[this.mHead] = arg3;
        if(this.mHead == this.mTail) {
            this.doubleCapacity();
        }
    }

    public void addLast(int arg3) {
        this.mElements[this.mTail] = arg3;
        this.mTail = this.mTail + 1 & this.mCapacityBitmask;
        if(this.mTail == this.mHead) {
            this.doubleCapacity();
        }
    }

    public void clear() {
        this.mTail = this.mHead;
    }

    private void doubleCapacity() {
        int v0 = this.mElements.length;
        int v1 = v0 - this.mHead;
        int v2 = v0 << 1;
        if(v2 >= 0) {
            int[] v3 = new int[v2];
            System.arraycopy(this.mElements, this.mHead, v3, 0, v1);
            System.arraycopy(this.mElements, 0, v3, v1, this.mHead);
            this.mElements = v3;
            this.mHead = 0;
            this.mTail = v0;
            this.mCapacityBitmask = v2 - 1;
            return;
        }

        throw new RuntimeException("Max array capacity exceeded");
    }

    public int get(int arg3) {
        if(arg3 >= 0 && arg3 < this.size()) {
            return this.mElements[this.mCapacityBitmask & this.mHead + arg3];
        }

        throw new ArrayIndexOutOfBoundsException();
    }

    public int getFirst() {
        if(this.mHead != this.mTail) {
            return this.mElements[this.mHead];
        }

        throw new ArrayIndexOutOfBoundsException();
    }

    public int getLast() {
        if(this.mHead != this.mTail) {
            return this.mElements[this.mTail - 1 & this.mCapacityBitmask];
        }

        throw new ArrayIndexOutOfBoundsException();
    }

    public boolean isEmpty() {
        boolean v0 = this.mHead == this.mTail ? true : false;
        return v0;
    }

    public int popFirst() {
        if(this.mHead != this.mTail) {
            int v0 = this.mElements[this.mHead];
            this.mHead = this.mHead + 1 & this.mCapacityBitmask;
            return v0;
        }

        throw new ArrayIndexOutOfBoundsException();
    }

    public int popLast() {
        if(this.mHead != this.mTail) {
            int v0 = this.mTail - 1 & this.mCapacityBitmask;
            int v1 = this.mElements[v0];
            this.mTail = v0;
            return v1;
        }

        throw new ArrayIndexOutOfBoundsException();
    }

    public void removeFromEnd(int arg2) {
        if(arg2 <= 0) {
            return;
        }

        if(arg2 <= this.size()) {
            this.mTail = this.mCapacityBitmask & this.mTail - arg2;
            return;
        }

        throw new ArrayIndexOutOfBoundsException();
    }

    public void removeFromStart(int arg2) {
        if(arg2 <= 0) {
            return;
        }

        if(arg2 <= this.size()) {
            this.mHead = this.mCapacityBitmask & this.mHead + arg2;
            return;
        }

        throw new ArrayIndexOutOfBoundsException();
    }

    public int size() {
        return this.mTail - this.mHead & this.mCapacityBitmask;
    }
}

