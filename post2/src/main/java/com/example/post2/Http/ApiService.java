package com.example.post2.Http;

import com.example.post2.Bean.Bean;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by lenovo on 2018/8/13.
 */

public  interface ApiService {

    @Headers("Content-Type:application/json")
    @POST("app/news/search")
     Observable<Bean> getDatas(@Body RequestBody Info);

}
