package com.takuchan.timer;

import android.os.CountDownTimer;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class CountDown extends CountDownTimer {
    MainActivity mainActivity = new MainActivity();


    public CountDown(long millisInFuture, long countDownInterval) {
        super(millisInFuture, countDownInterval);
    }

    private SimpleDateFormat dataFormat =
            new SimpleDateFormat("mm:ss.SSS", Locale.US);
    @Override
    public void onTick(long l) {
        mainActivity.countertext.setText(dataFormat.format(l));

    }

    @Override
    public void onFinish() {

        mainActivity.countertext.setText(dataFormat.format(0));

    }
}
