package com.takuchan.timer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class SettingAlerm extends AppCompatActivity {
    public ViewPager viewPager;

    int pagerposition = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_alerm);

        SettingPagerAdapter adapter = new SettingPagerAdapter(getSupportFragmentManager());
         viewPager = findViewById(R.id.pager);
        viewPager.setOffscreenPageLimit(3);
        viewPager.setAdapter(adapter);




        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);


        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                SharedPreferences pref = getSharedPreferences("AlermSetting", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();


                if(position == 0){
                    SharedPreferences sp = getPreferences(MODE_PRIVATE);

                    editor.putInt("position", 0);
                    editor.commit();
                    Log.d("re",String.valueOf(position));
                    pagerposition = 0;
                }else if(position == 1){



                    editor.putInt("position", 1);
                    editor.commit();
                    Log.d("re",String.valueOf(position));
                    pagerposition = 1;
                }else if(position == 2){

                    editor.putInt("position", 2);
                    editor.commit();
                    Log.d("re",String.valueOf(position));
                    pagerposition = 2;

                }else{

                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }



}