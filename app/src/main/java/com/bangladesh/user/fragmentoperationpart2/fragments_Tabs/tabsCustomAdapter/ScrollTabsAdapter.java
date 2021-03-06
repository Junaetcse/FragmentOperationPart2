package com.bangladesh.user.fragmentoperationpart2.fragments_Tabs.tabsCustomAdapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class ScrollTabsAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragmentList;
    private List<String> titleList;

    public ScrollTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentList = fragmentList;
        this.titleList = titleList;
    }

    @Override // Returns the number of items to be displayed in ViewPager
    public int getCount() {
        return fragmentList.size();
    }

    @Override // Returns the Item at a particular position
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override // Returns the Title of the Tab
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }
}
