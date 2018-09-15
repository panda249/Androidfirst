package com.example.panda.helloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class HelloWordActivity extends AppCompatActivity {
    private static final String TAG="HelloWordActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_word_layout);
        Log.d(TAG, "onCreate: execute");
    }
}
