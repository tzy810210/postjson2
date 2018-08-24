package com.example.lenovo.myapplication.Base;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lenovo on 2018/8/9.
 */

public interface BaseModel {

    Retrofit re=new Retrofit.Builder()
            .baseUrl("http://39.107.224.233/firstga/app/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .build();
}
