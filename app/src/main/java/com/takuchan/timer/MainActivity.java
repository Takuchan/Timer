package com.takuchan.timer;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    static TextView countertext;

    Button startbutton, stopbutton;


    private SimpleDateFormat dataFormat =
            new SimpleDateFormat("mm:ss.SSS", Locale.US);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// 3分= 3x60x1000 = 180000 msec
        long countNumber = 180000;
        long interval = 10;

        startbutton = (Button) findViewById(R.id.button);
        stopbutton = (Button) findViewById(R.id.button2);

        countertext = (TextView) findViewById(R.id.textView);
        countertext.setText(dataFormat.format(0));


        setTitle("停止中");
        final CountDown countDown = new CountDown(countNumber, interval);

        startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 開始
                countDown.start();
                setTitle("⏳計測中");
            }
        });

        stopbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 中止
                countDown.cancel();

                setTitle("✋一時停止");
            }
        });
        stopbutton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                new AlertDialog.Builder(MainActivity.this)
                        .setIcon(R.drawable.ic_baseline_access_time_24)
                        .setTitle("完全に停止しますか")
                        .setMessage("停止するとカウントが０になります")
                        .setPositiveButton("停止", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // OK button pressed
                                countDown.cancel();
                                countertext.setText(dataFormat.format(0));
                            }
                        })
                        .setNegativeButton("キャンセル", null)
                        .show();
                return false;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int itemId = item.getItemId();
        switch (itemId) {
            case R.id.settimer:

                Intent intent = new Intent(MainActivity.this,SettingTimer.class);
                startActivity(intent);
                //処理１
                break;

        }
        return false;
    }
}