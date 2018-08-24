package com.example.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by lenovo on 2018/8/13.
 */

public abstract class BaseActivity <M extends BaseModel,P extends BasePresenter> extends AppCompatActivity {
    public M mModel;
    public P mPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mModel = TUtils.getT(this,0);
        mPresenter = TUtils.getT(this,1);
        if (this instanceof BaseView ) {
            mPresenter.setMV(mModel,this);
        }
        setContentView(getLayoutId());
        initView();
        initData();
    }

    protected abstract void initView();

    protected abstract void initData();

    public abstract int getLayoutId();
}
