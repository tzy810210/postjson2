package com.example.myapplication;

import android.util.Log;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
* Created by TMVPHelper on 2018/08/13
*/
public class LoginPresenter extends LoginContract.Presenter{

    @Override
    void getDatas(String keyword, String cursor) {
         model.getData(keyword, cursor)
                 .subscribeOn(Schedulers.io())
                 .observeOn(AndroidSchedulers.mainThread())
                 .subscribe(new Subscriber<Bean>() {
                     @Override
                     public void onCompleted() {
                              Log.e("========onCompleted","onCompleted()")  ;
                     }

                     @Override
                     public void onError(Throwable e) {
                                Log.e("========onError" ,e.getMessage());
                     }

                     @Override
                     public void onNext(Bean bean) {
                           view.showRes(bean);
                         Log.e("========onNext" ,bean.getData().getNewList().toString());
                     }
                 });
    }
}