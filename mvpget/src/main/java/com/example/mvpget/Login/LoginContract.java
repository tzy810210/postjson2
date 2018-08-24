package com.example.mvpget.Login;

import com.example.mvpget.Base.BaseModel;
import com.example.mvpget.Base.BasePresenter;
import com.example.mvpget.Base.BaseView;
import com.example.mvpget.Bean.Bean;

import rx.Observable;
import rx.Observer;

/**
 * Created by lenovo on 2018/8/13.
 */

public class LoginContract {
//契约类 类名尾 必须是Contract
    public interface View extends BaseView {
            //自定义一个方法随便起名
        public void getGupeng(Bean bean);//参数 实体类
    }

    interface Model extends BaseModel {  //继承与BaseModel 被LoginModel继承
        //Rxjava+Retrofit 网络请求
        Observable<Bean> getDataPeng(String url);//参数 String
    }

    abstract static class Presenter extends BasePresenter<Model, View> {       //继承与BasePresenter 被LoginPresenter继承
          //抽象类
        //契约类所有方法名都自定义的
        public abstract void getUrl(String url);
        
    }
}