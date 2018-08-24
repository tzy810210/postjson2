package com.example.myapplication;

import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by lenovo on 2018/8/13.
 */

public interface ApiService {
    @Headers("Content-Type:application/json")
    @POST("news/search")
    rx.Observable<Bean> getRelut(@Body RequestBody info);
}
