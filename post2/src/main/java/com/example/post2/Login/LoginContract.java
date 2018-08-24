package com.example.post2.Login;

import com.example.post2.Base.BaseModel;
import com.example.post2.Base.BasePresenter;
import com.example.post2.Base.BaseView;
import com.example.post2.Bean.Bean;

import rx.Observable;

/**
 * Created by lenovo on 2018/8/13.
 */

public class LoginContract {

    public interface View extends BaseView {
      public void getData(Bean bean);
    }

    interface Model extends BaseModel {

        Observable<Bean> getdata(String keyword,String cursor);
    }

    abstract static class Presenter extends BasePresenter<Model, View> {

         public abstract void  getUrl(String keyword,String cursor);
        
    }
}