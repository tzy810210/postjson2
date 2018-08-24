package com.example.mvpget.Http;

import com.example.mvpget.Bean.Bean;

import retrofit2.http.GET;
import retrofit2.http.Url;
import rx.Observable;
import rx.Observer;

/**
 * Created by lenovo on 2018/8/13.
 */

public interface ApiService {
    @GET()
    Observable<Bean> getDa(@Url String url);
}
