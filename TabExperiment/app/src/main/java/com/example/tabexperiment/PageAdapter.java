package com.example.tabexperiment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PageAdapter extends FragmentStatePagerAdapter {
    private int numOfTabs;
    public PageAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.numOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0: return new TagFragment1();
            case 1: return new TagFragment2();
            case 2: return new TagFragment3();
            default: return null;

        }
        //return null;
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
