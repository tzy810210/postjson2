package com.example.myapplication;

/**
 * Created by lenovo on 2018/8/13.
 */

public class BasePresenter<M, V> {
    public M model;
    public V view;
    public void setMV(M m,V v){
        this.model = m;
        this.view = v;
    }
}
