package com.takuchan.timer;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.Context.MODE_PRIVATE;

public class SettingTimerFragment extends Fragment {

    Button savebutton;







    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.activity_setting_timer, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        savebutton = (Button)view.findViewById(R.id.button6);

        savebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sp = getActivity().getSharedPreferences("AlermSetting",MODE_PRIVATE);
               	//	キー、デフォールト値
              Log.d("ler", String.valueOf(sp.getInt("position",0)));

              int pagerPosition = sp.getInt("position",0);
              if(pagerPosition == 0){


              }else if(pagerPosition == 1){

              }else if(pagerPosition == 2){

              }
            }
        });
    }



}