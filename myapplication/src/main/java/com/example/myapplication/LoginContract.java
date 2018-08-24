package com.example.myapplication;

/**
 * Created by lenovo on 2018/8/13.
 */

public class LoginContract {

    interface View extends BaseView {
             void showRes(Bean bean);
    }

    interface Model extends BaseModel {
               rx.Observable<Bean> getData(String keyword,String cursor);
    }

    abstract static class Presenter extends BasePresenter<Model, View> {
              abstract void getDatas(String keyword,String cursor);
    }
}