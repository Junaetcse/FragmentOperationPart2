package com.bangladesh.user.fragmentoperationpart2.app;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.bangladesh.user.fragmentoperationpart2.R;
import com.bangladesh.user.fragmentoperationpart2.fragments_Tabs.tabsActivity.CustomViewTab;
import com.bangladesh.user.fragmentoperationpart2.fragments_Tabs.tabsActivity.IconTabActivity;
import com.bangladesh.user.fragmentoperationpart2.fragments_Tabs.tabsActivity.ScrollTabs;
import com.bangladesh.user.fragmentoperationpart2.fragments_Tabs.tabsActivity.TextTabActivity;
import com.bangladesh.user.fragmentoperationpart2.viewpager.ViewPageCustomAdapter;
import com.bangladesh.user.fragmentoperationpart2.viewpager.ViewPagerActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // textTab=findViewById(R.id.te)
        inatialization();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Fragment Operation part 2");


    }
    public void inatialization(){
        viewPager=findViewById(R.id.viewPager);
        viewPager.setOnClickListener(this);
 }

public void textTab(View view){
    Intent intent=new Intent(MainActivity.this, TextTabActivity.class);
    startActivity(intent);
}

    public void iconTab(View view){
        Intent intent=new Intent(MainActivity.this, IconTabActivity.class);
        startActivity(intent);
    }

    public void scrollTab(View view){
        Intent intent=new Intent(MainActivity.this, ScrollTabs.class);
        startActivity(intent);
    }
    public void customTab(View view){
        Intent intent=new Intent(MainActivity.this, CustomViewTab.class);
        startActivity(intent);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.viewPager:
                Intent intent=new Intent(MainActivity.this, ViewPagerActivity.class);
                startActivity(intent);
                break;
        }
    }
}
