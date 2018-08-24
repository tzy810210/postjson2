package com.example.lenovo.myapplication.Lo;

import com.example.lenovo.myapplication.Bean.Bean;
import com.example.lenovo.myapplication.Bean.Info;
import com.example.lenovo.myapplication.Http.ApiService;
import com.google.gson.Gson;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import rx.Observable;

/**
* Created by TMVPHelper on 2018/08/09
*/
public class LoModel implements LoContract.Model{

                                                 
    @Override
    public Observable<Bean> getData(String userId, String channelId, String cursor) {
        Info info = new Info(userId,channelId , cursor);
        Gson gson = new Gson();
        String s = gson.toJson(info);
        RequestBody body = RequestBody.create(MediaType.parse("application/json;charset=UTF-8"), s);

        return re.create(ApiService.class).getBean(body);
    }
}