package com.arvin.injectlayout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.arvin.injectlayout.anno.LayoutInject;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public class BaseActivity extends AppCompatActivity {
    private Unbinder mUnbind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        displayInjectLayout();
        mUnbind = ButterKnife.bind(this);
    }

    // 绑定layout
    private void displayInjectLayout() {
        Class<?> clazz = this.getClass();
        if (clazz.isAnnotationPresent(LayoutInject.class)) {
            LayoutInject inject = clazz.getAnnotation(LayoutInject.class);
            int layoutId = inject.value();
            setContentView(layoutId);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mUnbind.unbind();
        mUnbind = null;
    }
}
