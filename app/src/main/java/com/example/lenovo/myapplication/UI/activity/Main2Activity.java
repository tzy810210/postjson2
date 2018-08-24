package com.example.lenovo.myapplication.UI.activity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.lenovo.myapplication.Base.BaseActivity;
import com.example.lenovo.myapplication.R;

public class Main2Activity extends BaseActivity {


    private WebView web;

    @Override
    protected void initView() {
          web=findViewById(R.id.web);
          web.setWebViewClient(new WebViewClient());
          web.getSettings().setJavaScriptEnabled(true);
          web.loadUrl("https://hao.qq.com");
    }

    @Override
        protected void initData() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main2;
    }


}
