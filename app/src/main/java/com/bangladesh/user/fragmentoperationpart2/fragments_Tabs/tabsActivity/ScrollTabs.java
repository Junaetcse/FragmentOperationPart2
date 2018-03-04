package com.bangladesh.user.fragmentoperationpart2.fragments_Tabs.tabsActivity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.bangladesh.user.fragmentoperationpart2.R;
import com.bangladesh.user.fragmentoperationpart2.fragments_Tabs.tabsCustomAdapter.ScrollTabsAdapter;
import com.bangladesh.user.fragmentoperationpart2.viewpager.FragmentFive;
import com.bangladesh.user.fragmentoperationpart2.viewpager.FragmentFour;
import com.bangladesh.user.fragmentoperationpart2.viewpager.FragmentOne;
import com.bangladesh.user.fragmentoperationpart2.viewpager.FragmentSix;
import com.bangladesh.user.fragmentoperationpart2.viewpager.FragmentThree;
import com.bangladesh.user.fragmentoperationpart2.viewpager.FragmentTwo;

import java.util.ArrayList;
import java.util.List;

public class ScrollTabs extends AppCompatActivity {
    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> titleList = new ArrayList<>();

    private ViewPager viewPager;
    private ScrollTabsAdapter adapter;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_tabs);
        initialise();

        prepareDataResource();

        adapter = new ScrollTabsAdapter(getSupportFragmentManager(), fragmentList, titleList);

        // Bind Adapter to ViewPager.
        viewPager.setAdapter(adapter);

        // Link ViewPager and TabLayout
        tabLayout.setupWithViewPager(viewPager);
    }


    // Initialise Activity Data.
    private void initialise() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Scroll Tabs Example");

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
    }



    // Let's prepare Data for our Tabs - Fragments and Title List
    private void prepareDataResource() {

        addData(new FragmentOne(), "ONE");
        addData(new FragmentTwo(), "TWO");
        addData(new FragmentThree(), "THREE");
        addData(new FragmentFour(), "FOUR");
        addData(new FragmentFive(), "FIVE");
        addData(new FragmentSix(), "SIX");

        addData(new FragmentOne(), "ONE");
        addData(new FragmentTwo(), "TWO");
        addData(new FragmentThree(), "THREE");
        addData(new FragmentFour(), "FOUR");
        addData(new FragmentFive(), "FIVE");
        addData(new FragmentSix(), "SIX");
    }

    private void addData(Fragment fragment, String title) {
        fragmentList.add(fragment);
        titleList.add(title);
    }
}
