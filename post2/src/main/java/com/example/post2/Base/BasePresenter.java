package com.example.post2.Base;

/**
 * Created by lenovo on 2018/8/13.
 */

public class BasePresenter<M, V> {
    public M mModel;
    public V mView;

    public void setMV(M m,V v){
        this.mModel=m;
        this.mView=v;
    }
}
