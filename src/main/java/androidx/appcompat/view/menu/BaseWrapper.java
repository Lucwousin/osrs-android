package androidx.appcompat.view.menu;

class BaseWrapper {
    final Object mWrappedObject;

    BaseWrapper(Object arg2) {
        super();
        if(arg2 != null) {
            this.mWrappedObject = arg2;
            return;
        }

        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public Object getWrappedObject() {
        return this.mWrappedObject;
    }
}

