package com.takuchan.timer;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SettingPagerAdapter extends FragmentPagerAdapter {
    private CharSequence[] tabTitles = {"集中1", "集中2","集中3"};


    public SettingPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new SettingTimerFragment();
            case 1:
                return new SettingTimerFragment();
            case 2:
                return new SettingTimerFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabTitles.length;
    }
}
