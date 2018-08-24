package com.example.mvpget.Base;

/**
 * Created by lenovo on 2018/8/13.
 */

public class BasePresenter<M, V> {
    //P层 所有的交互都在P层进行
    //第二个写
      public M mModel;
      public V mView;

      public void setMV(M m,V v){
          this.mModel=m;
          this.mView=v;
      }
      //写完了
}
