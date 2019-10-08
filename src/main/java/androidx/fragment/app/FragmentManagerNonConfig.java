package androidx.fragment.app;

import java.util.List;

public class FragmentManagerNonConfig {
    private final List mChildNonConfigs;
    private final List mFragments;
    private final List mViewModelStores;

    FragmentManagerNonConfig(List arg1, List arg2, List arg3) {
        super();
        this.mFragments = arg1;
        this.mChildNonConfigs = arg2;
        this.mViewModelStores = arg3;
    }

    List getChildNonConfigs() {
        return this.mChildNonConfigs;
    }

    List getFragments() {
        return this.mFragments;
    }

    List getViewModelStores() {
        return this.mViewModelStores;
    }
}

