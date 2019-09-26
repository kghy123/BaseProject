package com.google.kghy1234.baseproject.base;


import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public abstract class BaseFragmentAdapter extends FragmentPagerAdapter {

    private BaseFragment[] fragments;

    public BaseFragmentAdapter(FragmentManager fm) {
        super(fm);
        this.fragments = getFragments();
    }

    @Override
    public Fragment getItem(int i) {
        return fragments[i];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragments[position].getTitle();
    }

    protected abstract BaseFragment[] getFragments();


}
