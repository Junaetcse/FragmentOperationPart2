package com.bangladesh.user.fragmentoperationpart2.viewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bangladesh.user.fragmentoperationpart2.R;

public class ViewPagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        ViewPageCustomAdapter adapter = new ViewPageCustomAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);
    }
}
