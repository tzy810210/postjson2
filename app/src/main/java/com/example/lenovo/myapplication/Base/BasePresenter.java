package com.example.lenovo.myapplication.Base;

/**
 * Created by lenovo on 2018/8/9.
 */

public class BasePresenter<M, V> {
    public M mModel;
    public V mView;

    public void setMV(M m,V v){
        this.mView=v;
        this.mModel=m;
    }
}
