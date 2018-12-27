package com.jacob.www.mvvmmanager.viewmodel;

import android.app.Application;
import android.support.annotation.NonNull;

import com.jacob.www.mvvmmanager.demo.DemoBean;

import java.util.Random;

/**
 * Description: ${DemoViewModel}
 * Created by JacobYu，2018/12/26
 */
public class DemoViewModel extends BaseViewModel {

    public DemoViewModel(@NonNull Application application) {
        super(application);
    }

    public void getData() {
        Random random = new Random();
        int i = random.nextInt(100);
        DemoBean demoBean = new DemoBean();
        demoBean.text = i + "";
        liveData.postValue(demoBean);
    }
}
