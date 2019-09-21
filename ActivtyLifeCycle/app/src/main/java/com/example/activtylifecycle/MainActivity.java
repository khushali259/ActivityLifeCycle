package com.example.activtylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String APP_TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(APP_TAG, " : Created");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(APP_TAG, " : Started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(APP_TAG, " : Stopped");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(APP_TAG, " : Paused");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(APP_TAG, " : Destroyed");

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i(APP_TAG, " : Resumed");

    }
}
