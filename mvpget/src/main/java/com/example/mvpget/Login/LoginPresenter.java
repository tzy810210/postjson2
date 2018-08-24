package com.example.mvpget.Login;

import com.example.mvpget.Bean.Bean;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
* Created by TMVPHelper on 2018/08/13
*/
public class LoginPresenter extends LoginContract.Presenter {


    @Override
    public void getUrl(String url) {
//        mModel.getDataPeng(url)
        mModel.getDataPeng(url)
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
                        mView.getGupeng(bean);
                    }
                });
    }
}