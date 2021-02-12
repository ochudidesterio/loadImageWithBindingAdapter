package com.example.databindingonfragmentandrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
private TabLayout mTabLayout;
private ViewPager mViewPager;
private ViewPagerAdapter mViewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabLayout = (TabLayout)findViewById(R.id.tablayout);
        mViewPager = (ViewPager)findViewById(R.id.viewpager);
        mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        //add fragments
        mViewPagerAdapter.addFragment(new CallFragment(),"Call");
        mViewPagerAdapter.addFragment(new ContactFragment(),"Contact");
        mViewPagerAdapter.addFragment(new FavFragment(),"Favourite");


        mViewPager.setAdapter(mViewPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);

        mTabLayout.getTabAt(0).setIcon(R.drawable.ic_call);
        mTabLayout.getTabAt(1).setIcon(R.drawable.ic_group);
        mTabLayout.getTabAt(2).setIcon(R.drawable.ic_star);
    }
}