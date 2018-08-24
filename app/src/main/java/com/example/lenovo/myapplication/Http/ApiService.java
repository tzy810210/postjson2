package com.example.lenovo.myapplication.Http;

import com.example.lenovo.myapplication.Bean.Bean;

import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by lenovo on 2018/8/9.
 */

public interface ApiService {

    @Headers("Content-Type:application/json")
    @POST("news/downListNews")
    Observable<Bean> getBean(@Body RequestBody Info);
            
}
