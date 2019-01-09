package com.noobcoded.uas.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.noobcoded.uas.fragment.FavoriteFragment;
import com.noobcoded.uas.fragment.NowPlayingFragment;
import com.noobcoded.uas.fragment.UpcomingFragment;

/**
 * Created by noobcoded on 1/7/2019.
 */

public class TabAdapter extends FragmentPagerAdapter {

    private static final int NUM_ITEMS = 3;

    public TabAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new NowPlayingFragment();

            case 1:
                return new UpcomingFragment();

            case 2:
                return new FavoriteFragment();

            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return NUM_ITEMS;
    }
}
