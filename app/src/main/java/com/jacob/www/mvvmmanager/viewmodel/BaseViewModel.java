package com.jacob.www.mvvmmanager.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

import java.lang.reflect.ParameterizedType;

/**
 * Description: ${BaseViewModel}
 * Created by JacobYu，2018/12/26
 */
public class BaseViewModel<T> extends AndroidViewModel {

    protected MutableLiveData<T> liveData = new MutableLiveData<>();

    public BaseViewModel(@NonNull Application application) {
        super(application);
    }

    /**
     * 设置数据
     *
     * @param data
     * @author: JacobYu,on 2018/12/26
     */
    public void setLiveData(T data){
        liveData.setValue(data);
    }

    /**
     * 获取数据
     *
     * @author: JacobYu,on 2018/12/26
     */
    public MutableLiveData<T> getLiveData(){
       return liveData;
    }

    /**
     * 获取数据泛型
     *
     * @return class
     * @author: JacobYu,on 2018/12/26
     */
    public Class<T> getTClass() {
        Class<T> tClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return tClass;
    }
}
