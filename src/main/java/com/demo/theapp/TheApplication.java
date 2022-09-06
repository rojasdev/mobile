package com.demo.theapp;

import android.app.Activity;
import android.os.Bundle;

public class TheApplication extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }
}
