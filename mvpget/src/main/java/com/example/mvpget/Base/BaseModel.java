package com.example.mvpget.Base;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lenovo on 2018/8/13.
 */

public interface BaseModel {
    //M 层用来请求参数           //http://c.m.163.com/nc/article/list/T1348648517839/0-20.html
    //先写 M层  Retrofit 请求
    Retrofit re=new Retrofit.Builder()
            .baseUrl("http://c.m.163.com/")      //前半段 接口拼接
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .build();


    //如果有不同的第二个接口 在加一个就可以
//    Retrofit re=new Retrofit.Builder()
//            .baseUrl("http://c.m.163.com/")      //前半段 接口拼接
//            .addConverterFactory(GsonConverterFactory.create())
//            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//            .build();
}
