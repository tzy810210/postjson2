package com.example.mvpget.Login;

import com.example.mvpget.Bean.Bean;
import com.example.mvpget.Http.ApiService;

import rx.Observer;

/**
* Created by TMVPHelper on 2018/08/13
*/
public class LoginModel implements LoginContract.Model{
    //继承契约类的M层方法
    @Override
    public Observer<Bean> getDataPeng(String url) {

        return re.create(ApiService.class).getDa(url);
    }
    //同样再写契约类的M层
}