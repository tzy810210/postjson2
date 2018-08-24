package com.example.lenovo.myapplication.Base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.lenovo.myapplication.Tutils.TUtils;

/**
 * Created by lenovo on 2018/8/9.
 */

public abstract class BaseActivity<M extends BaseModel,P extends BasePresenter> extends AppCompatActivity {
    public M mm;
    public P pp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mm= TUtils.getT(this,0);
        pp=TUtils.getT(this,1);

        if (this instanceof BaseView)
        {
            pp.setMV(mm,this);
        }

        setContentView(getLayoutId());

        initView();
        initData();
    }

    protected abstract void initView();


    protected abstract void initData();

    protected abstract int getLayoutId();
}
