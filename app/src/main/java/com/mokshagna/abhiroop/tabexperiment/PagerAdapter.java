package com.mokshagna.abhiroop.tabexperiment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int numOfTabs;
    public PagerAdapter(FragmentManager fm,int n) {
        super(fm);
        numOfTabs = n;
    }

    @Override
    public Fragment getItem(int i) {
        switch(i){
            case 0:
                return new TabFragment1();
            case 1:
                return new TabFragment2();
            case 2:
                return new TabFragment3();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
