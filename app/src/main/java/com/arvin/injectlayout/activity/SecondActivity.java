package com.arvin.injectlayout.activity;

import android.os.Bundle;
import android.view.View;

import com.arvin.injectlayout.BaseActivity;
import com.arvin.injectlayout.R;
import com.arvin.injectlayout.anno.LayoutInject;

import butterknife.OnClick;

@LayoutInject(R.layout.activity_second)
public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @OnClick(R.id.to_main)
    void goToMain(View v) {
        this.finish();
    }
}
