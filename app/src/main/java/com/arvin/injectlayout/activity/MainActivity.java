package com.arvin.injectlayout.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.arvin.injectlayout.BaseActivity;
import com.arvin.injectlayout.R;
import com.arvin.injectlayout.anno.LayoutInject;

import butterknife.OnClick;

@LayoutInject(R.layout.activity_main)
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @OnClick(R.id.to_second)
    void goToSecond(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}