package com.example.lenovo.myapplication.Lo;

import com.example.lenovo.myapplication.Bean.Bean;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
* Created by TMVPHelper on 2018/08/09
*/
public class LoPresenter extends LoContract.Presenter{

    @Override
    public void getUrl(String userId, String channelId, String cursor) {

        mModel.getData(userId,channelId,cursor)
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
                          mView.getDatas(bean);
                    }
                });
    }
}