package com.jacob.www.mvvmmanager;

import android.arch.lifecycle.Observer;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.jacob.www.mvvmmanager.databinding.ActivityMainBinding;
import com.jacob.www.mvvmmanager.demo.DemoBean;
import com.jacob.www.mvvmmanager.viewmodel.DemoViewModel;

public class MainActivity extends AppCompatActivity {

    public DemoViewModel mDemoViewModel;
    public static final String BUTTON_STR = "获取数据";
    public static final int BUTTON_BG = R.color.colorPrimaryDark;
    public ActivityMainBinding mDataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mDemoViewModel = new DemoViewModel(getApplication());
        mDemoViewModel.getLiveData().observe(this, new Observer<DemoBean>() {
            @Override
            public void onChanged(@Nullable DemoBean bean) {
                mDataBinding.setLiveData(bean);
            }
        });
        mDataBinding.setViewModel(mDemoViewModel);
    }
}
