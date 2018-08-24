package com.example.lenovo.myapplication.Lo;

import com.example.lenovo.myapplication.Base.BaseModel;
import com.example.lenovo.myapplication.Base.BasePresenter;
import com.example.lenovo.myapplication.Base.BaseView;
import com.example.lenovo.myapplication.Bean.Bean;

import rx.Observable;

/**
 * Created by lenovo on 2018/8/9.
 */

public class LoContract {

    public interface View extends BaseView {
          void getDatas(Bean bean);
    }

    interface Model extends BaseModel {

        Observable<Bean> getData(String  userId,String channelId,String cursor);
    }

    abstract static class Presenter extends BasePresenter<Model, View> {

        abstract void getUrl(String userId,String channelId,String cursor);
    }
}