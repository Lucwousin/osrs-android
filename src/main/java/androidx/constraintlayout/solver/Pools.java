package androidx.constraintlayout.solver;

final class Pools {
    interface Pool {
        Object acquire();

        boolean release(Object arg1);

        void releaseAll(Object[] arg1, int arg2);
    }

    class SimplePool implements Pool {
        private final Object[] mPool;
        private int mPoolSize;

        SimplePool(int arg2) {
            super();
            if(arg2 > 0) {
                this.mPool = new Object[arg2];
                return;
            }

            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        public Object acquire() {
            Object v1 = null;
            if(this.mPoolSize > 0) {
                int v0 = this.mPoolSize - 1;
                Object v2 = this.mPool[v0];
                this.mPool[v0] = v1;
                --this.mPoolSize;
                return v2;
            }

            return v1;
        }

        private boolean isInPool(Object arg4) {
            int v1;
            for(v1 = 0; v1 < this.mPoolSize; ++v1) {
                if(this.mPool[v1] == arg4) {
                    return 1;
                }
            }

            return 0;
        }

        public boolean release(Object arg3) {
            if(this.mPoolSize < this.mPool.length) {
                this.mPool[this.mPoolSize] = arg3;
                ++this.mPoolSize;
                return 1;
            }

            return 0;
        }

        public void releaseAll(Object[] arg5, int arg6) {
            if(arg6 > arg5.length) {
                arg6 = arg5.length;
            }

            int v0;
            for(v0 = 0; v0 < arg6; ++v0) {
                Object v1 = arg5[v0];
                if(this.mPoolSize < this.mPool.length) {
                    this.mPool[this.mPoolSize] = v1;
                    ++this.mPoolSize;
                }
            }
        }
    }

    private static final boolean DEBUG = false;

    private Pools() {
        super();
    }
}

