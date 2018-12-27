package com.jacob.www.mvvmmanager.demo;

import android.databinding.BindingAdapter;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.widget.Button;

/**
 * Description: ${DemoAdapter}
 * Created by JacobYu，2018/12/26
 */
public class DemoAdapter {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @BindingAdapter("setBackground")
    public static  void setBackground(Button button,int color){
        button.setBackgroundColor(button.getContext().getColor(color));
    }
}
