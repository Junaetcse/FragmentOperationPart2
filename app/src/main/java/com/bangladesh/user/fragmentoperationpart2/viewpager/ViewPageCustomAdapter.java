package com.bangladesh.user.fragmentoperationpart2.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.bangladesh.user.fragmentoperationpart2.viewpager.FragmentFive;
import com.bangladesh.user.fragmentoperationpart2.viewpager.FragmentFour;
import com.bangladesh.user.fragmentoperationpart2.viewpager.FragmentOne;
import com.bangladesh.user.fragmentoperationpart2.viewpager.FragmentSix;
import com.bangladesh.user.fragmentoperationpart2.viewpager.FragmentThree;
import com.bangladesh.user.fragmentoperationpart2.viewpager.FragmentTwo;


public class ViewPageCustomAdapter extends FragmentStatePagerAdapter { // Replace and use FragmentPagerAdapter as per your requirement

    private final int ITEMS = 6;

    public ViewPageCustomAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return ITEMS;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new FragmentOne();
            case 1:
                return new FragmentTwo();
            case 2:
                return new FragmentThree();
            case 3:
                return new FragmentFour();
            case 4:
                return new FragmentFive();
            case 5:
                return new FragmentSix();

            default:
                return new FragmentOne();
        }
    }
}
