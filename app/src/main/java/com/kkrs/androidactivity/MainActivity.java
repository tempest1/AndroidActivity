package com.kkrs.androidactivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button btn;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("frist","onCreate");
        context =this;

        btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(context,OtherActivity.class);
                startActivity(intent);
            }
        });
        //测试程序崩溃
//        Log.e("frist",null);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("frist","onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("frist","onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("frist","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("frist","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("frist","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("frist","onDestroy");
    }
}
