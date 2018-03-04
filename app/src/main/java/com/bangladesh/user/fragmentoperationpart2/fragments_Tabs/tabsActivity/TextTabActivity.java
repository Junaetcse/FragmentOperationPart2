package com.bangladesh.user.fragmentoperationpart2.fragments_Tabs.tabsActivity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.bangladesh.user.fragmentoperationpart2.R;
import com.bangladesh.user.fragmentoperationpart2.fragments_Tabs.tabsCustomAdapter.TextTabsAdapter;
import com.bangladesh.user.fragmentoperationpart2.viewpager.FragmentOne;
import com.bangladesh.user.fragmentoperationpart2.viewpager.FragmentThree;
import com.bangladesh.user.fragmentoperationpart2.viewpager.FragmentTwo;

import java.util.ArrayList;
import java.util.List;

public class TextTabActivity extends AppCompatActivity {
    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> titleList = new ArrayList<>();
    private ViewPager viewPager;
    private TextTabsAdapter adapter;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_tab);
        initialise();

        prepareDataResource();

        adapter = new TextTabsAdapter(getSupportFragmentManager(), fragmentList, titleList);

// Bind Adapter to ViewPager.
        viewPager.setAdapter(adapter);

        // Link ViewPager and TabLayout
        tabLayout.setupWithViewPager(viewPager);

    }

    // Initialise Activity Data.
    private void initialise() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Simple Tabs Example");

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
    }

    private void addData(Fragment fragment, String title) {
        fragmentList.add(fragment);
        titleList.add(title);
    }

    // Let's prepare Data for our Tabs - Fragments and Title List
    private void prepareDataResource() {

        addData(new FragmentOne(), "ONE");
        addData(new FragmentTwo(), "TWO");
        addData(new FragmentThree(), "THREE");
    }
}
