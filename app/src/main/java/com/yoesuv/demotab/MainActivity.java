package com.yoesuv.demotab;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItem;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;
import com.yoesuv.demotab.tab.MainAbout;
import com.yoesuv.demotab.tab.MainChangelog;
import com.yoesuv.demotab.tab.MainLibraries;
import com.yoesuv.demotab.tab.MainThanks;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SmartTabLayout sTabLayout = (SmartTabLayout) findViewById(R.id.viewPagerTab);
        ViewPager vPager = (ViewPager) findViewById(R.id.viewPager);

        FragmentPagerItems pages = new FragmentPagerItems(this);
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.about), MainAbout.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.changelog), MainChangelog.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.thanks), MainThanks.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.libraries), MainLibraries.class));

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(getSupportFragmentManager(), pages);
        vPager.setAdapter(adapter);
        sTabLayout.setViewPager(vPager);
    }
}
