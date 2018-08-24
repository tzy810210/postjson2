package com.example.post2.Login;

import com.example.post2.Bean.Bean;
import com.example.post2.Bean.Info;
import com.example.post2.Http.ApiService;
import com.google.gson.Gson;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import rx.Observable;

/**
* Created by TMVPHelper on 2018/08/13
*/
public class LoginModel implements LoginContract.Model{

    @Override
    public Observable<Bean> getdata(String keyword, String cursor) {
        Info info = new Info(keyword, cursor);
        Gson gson = new Gson();
        String s = gson.toJson(info);
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json; charset=UTF-8"), s);

        return re.create(ApiService.class).getDatas(requestBody);
        }
}