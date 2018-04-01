package com.kkrs.androidactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by zd on 2018/4/1.
 */

public class OtherActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        Log.e("second","onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("second","onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("second","onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("second","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("second","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("second","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("second","onDestroy");
    }
}
