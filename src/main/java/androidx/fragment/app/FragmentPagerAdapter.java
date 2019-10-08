package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public abstract class FragmentPagerAdapter extends PagerAdapter {
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentPagerAdapter";
    private FragmentTransaction mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private final FragmentManager mFragmentManager;

    public FragmentPagerAdapter(FragmentManager arg2) {
        super();
        this.mCurTransaction = null;
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = arg2;
    }

    public void destroyItem(@NonNull ViewGroup arg1, int arg2, @NonNull Object arg3) {
        if(this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.beginTransaction();
        }

        this.mCurTransaction.detach(((Fragment)arg3));
    }

    public void finishUpdate(@NonNull ViewGroup arg1) {
        if(this.mCurTransaction != null) {
            this.mCurTransaction.commitNowAllowingStateLoss();
            this.mCurTransaction = null;
        }
    }

    public abstract Fragment getItem(int arg1);

    public long getItemId(int arg3) {
        return ((long)arg3);
    }

    @NonNull public Object instantiateItem(@NonNull ViewGroup arg5, int arg6) {
        if(this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.beginTransaction();
        }

        long v0 = this.getItemId(arg6);
        Fragment v2 = this.mFragmentManager.findFragmentByTag(FragmentPagerAdapter.makeFragmentName(arg5.getId(), v0));
        if(v2 != null) {
            this.mCurTransaction.attach(v2);
        }
        else {
            v2 = this.getItem(arg6);
            this.mCurTransaction.add(arg5.getId(), v2, FragmentPagerAdapter.makeFragmentName(arg5.getId(), v0));
        }

        if(v2 != this.mCurrentPrimaryItem) {
            v2.setMenuVisibility(false);
            v2.setUserVisibleHint(false);
        }

        return v2;
    }

    public boolean isViewFromObject(@NonNull View arg1, @NonNull Object arg2) {
        boolean v1 = ((Fragment)arg2).getView() == arg1 ? true : false;
        return v1;
    }

    private static String makeFragmentName(int arg2, long arg3) {
        return "android:switcher:" + arg2 + ":" + arg3;
    }

    public void restoreState(Parcelable arg1, ClassLoader arg2) {
    }

    public Parcelable saveState() {
        return null;
    }

    public void setPrimaryItem(@NonNull ViewGroup arg1, int arg2, @NonNull Object arg3) {
        if(arg3 != this.mCurrentPrimaryItem) {
            if(this.mCurrentPrimaryItem != null) {
                this.mCurrentPrimaryItem.setMenuVisibility(false);
                this.mCurrentPrimaryItem.setUserVisibleHint(false);
            }

            ((Fragment)arg3).setMenuVisibility(true);
            ((Fragment)arg3).setUserVisibleHint(true);
            this.mCurrentPrimaryItem = ((Fragment)arg3);
        }
    }

    public void startUpdate(@NonNull ViewGroup arg3) {
        if(arg3.getId() != -1) {
            return;
        }

        StringBuilder v0 = new StringBuilder();
        v0.append("ViewPager with adapter ");
        v0.append(this);
        v0.append(" requires a view id");
        throw new IllegalStateException(v0.toString());
    }
}

