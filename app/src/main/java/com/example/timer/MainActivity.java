package com.example.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CountDownTimer countDownTimer = new CountDownTimer(5000 + 100, 1000) {
            @Override
            public void onTick(long millisUntilFinish) {
                Log.i(TAG, "onTick: " + millisUntilFinish);
                Log.i(TAG, "onTick: seconds until finish " + millisUntilFinish / 1000);
            }

            @Override
            public void onFinish() {
                Log.i(TAG, "onFinish: Timer is finished");
            }
        };

        countDownTimer.start();

    }
}
