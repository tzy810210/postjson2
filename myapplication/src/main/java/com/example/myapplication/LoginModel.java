package com.example.myapplication;

import com.google.gson.Gson;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import rx.Observable;

/**
* Created by TMVPHelper on 2018/08/13
*/
public class LoginModel implements LoginContract.Model{

    @Override
    public Observable<Bean> getData(String keyword, String cursor) {
        Info info = new Info(keyword, cursor);
        Gson gson = new Gson();
        String s = gson.toJson(info);
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), s);
        ApiService apiService = retrofit.create(ApiService.class);
        return apiService.getRelut(requestBody);
    }
}