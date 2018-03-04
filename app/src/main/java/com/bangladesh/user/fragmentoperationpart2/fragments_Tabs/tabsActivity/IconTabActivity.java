package com.bangladesh.user.fragmentoperationpart2.fragments_Tabs.tabsActivity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.bangladesh.user.fragmentoperationpart2.R;
import com.bangladesh.user.fragmentoperationpart2.fragments_Tabs.tabsCustomAdapter.IconTabsAdapter;
import com.bangladesh.user.fragmentoperationpart2.viewpager.FragmentFive;
import com.bangladesh.user.fragmentoperationpart2.viewpager.FragmentFour;
import com.bangladesh.user.fragmentoperationpart2.viewpager.FragmentOne;
import com.bangladesh.user.fragmentoperationpart2.viewpager.FragmentSix;
import com.bangladesh.user.fragmentoperationpart2.viewpager.FragmentThree;
import com.bangladesh.user.fragmentoperationpart2.viewpager.FragmentTwo;

import java.util.ArrayList;
import java.util.List;

public class IconTabActivity extends AppCompatActivity {
    private List<Fragment> fragmentList = new ArrayList<>();

    private ViewPager viewPager;
    private IconTabsAdapter adapter;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon_tab);
         initialise();
        prepareDataResource();
        adapter = new IconTabsAdapter(getSupportFragmentManager(), fragmentList);
        // Bind the Adapter to the ViewPager
        viewPager.setAdapter(adapter);
        // Link ViewPager and TabLayout
        tabLayout.setupWithViewPager(viewPager);
        setTabIcons();

    }



    // Initialise Activity Data
    private void initialise() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Simple Icon Tabs");

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
    }




    // Prepare the Fragments List
    private void prepareDataResource() {

        fragmentList.add(new FragmentOne());
        fragmentList.add(new FragmentTwo());
        fragmentList.add(new FragmentThree());
        fragmentList.add(new FragmentFour());
        fragmentList.add(new FragmentFive());
        fragmentList.add(new FragmentSix());
    }



    // Set the Icons of the Tabs
    private void setTabIcons() {

       /* tabLayout.getTabAt(0).setIcon(R.drawable.aaa);
        tabLayout.getTabAt(1).setIcon(R.drawable.bbb);
        tabLayout.getTabAt(2).setIcon(R.drawable.ccc);
        tabLayout.getTabAt(3).setIcon(R.drawable.ddd);
        tabLayout.getTabAt(4).setIcon(R.drawable.eee);
        tabLayout.getTabAt(5).setIcon(R.drawable.fff);*/
       tabLayout.getTabAt(0).setIcon(R.drawable.aaa);
        tabLayout.getTabAt(1).setIcon(R.drawable.bbb);
        tabLayout.getTabAt(2).setIcon(R.drawable.ccc);
        tabLayout.getTabAt(3).setIcon(R.drawable.ddd);
        tabLayout.getTabAt(4).setIcon(R.drawable.eee);
        tabLayout.getTabAt(5).setIcon(R.drawable.fff);
    }
}















