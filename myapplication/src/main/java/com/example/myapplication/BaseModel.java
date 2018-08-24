package com.example.myapplication;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lenovo on 2018/8/13.
 */

public interface BaseModel {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://39.107.224.233/firstga/app/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .build();
}
