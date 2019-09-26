package com.google.kghy1234.baseproject.activities;

import com.google.kghy1234.baseproject.R;
import com.google.kghy1234.baseproject.base.BaseActivity;

public class MainActivity extends BaseActivity {


    @Override
    protected int getLayoutResource() {
        return R.layout.activity_main;
    }

    @Override
    protected boolean getFullScreen() {
        return false;
    }
}
