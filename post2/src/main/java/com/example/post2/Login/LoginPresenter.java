package com.example.post2.Login;

import android.util.Log;

import com.example.post2.Bean.Bean;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
* Created by TMVPHelper on 2018/08/13
*/
public class LoginPresenter extends LoginContract.Presenter{

    @Override
    public void getUrl(String keyword, String cursor) {
        mModel.getdata(keyword,cursor)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Bean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                    
                    }

                    @Override
                    public void onNext(Bean bean) {
                         mView.getData(bean);
                    }
                });
    }
}