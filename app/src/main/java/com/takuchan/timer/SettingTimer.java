package com.takuchan.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SettingTimer extends AppCompatActivity {

    Button cMinus,cPlus,rMinus,rPlus,xMinus,xPlus;
    TextView cText,rText,xText;

    public  int concentrate1,concentrate2,rest1,rest2,cycle1,cycle2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_timer);
        setTitle("アラームの設定");
        getSupportActionBar().hide();
//        cMinus = (Button)findViewById(R.id.concenminus);
//        cPlus = (Button)findViewById(R.id.concenplus);
//        rMinus = (Button)findViewById(R.id.restminus);
//        rPlus = (Button)findViewById(R.id.restplus);
//        xMinus = (Button)findViewById(R.id.circleminus);
//        xPlus = (Button)findViewById(R.id.circleplus);
//
//        cText = (TextView)findViewById(R.id.concentext);
//        rText = (TextView)findViewById(R.id.resttext);
//        xText = (TextView)findViewById(R.id.circletext);
//
//        cPlus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(concentrate1 >  58){
//                    concentrate2 = concentrate2 + 1;
//                    concentrate1 = 0;
//                    cText.setText(concentrate2 + ":" + concentrate1);
//                }else {
//                    concentrate1 = concentrate1 + 1;
//                    cText.setText(concentrate2 + ":" + concentrate1);
//                }
//            }
//        });
//        cMinus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(concentrate2 < 1){
//                    if(concentrate1 == 0){
//
//                    }else{
//                        concentrate1 = concentrate1 - 1;
//                        cText.setText(concentrate2 + ":" + concentrate1);
//                    }
//                }else{
//                    concentrate2 = concentrate2 - 1;
//                    cText.setText(concentrate2 + ":" + concentrate1);
//                }
//            }
//        });

    }
}