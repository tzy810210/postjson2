package com.example.post2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.post2.Base.BaseActivity;
import com.example.post2.Bean.Bean;
import com.example.post2.Login.LoginContract;
import com.example.post2.Login.LoginModel;
import com.example.post2.Login.LoginPresenter;
import com.example.post2.ui.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity<LoginModel,LoginPresenter> implements LoginContract.View {

    private List<Bean.DataBean.NewListBean> itemDatas = new ArrayList<>();
    private RecyclerView recycler;
    private MyAdapter myAdapter;

    @Override
    protected void initView() {
        recycler = (RecyclerView)findViewById(R.id.recycler);
    }

    @Override
    protected void initData() {
         pp.getUrl("无人机","0");
    }

    @Override
    protected int getLayoutId() {
        return  R.layout.activity_main;
    }

    @Override
    public void getData(Bean bean) {
        Log.e("-=-=asdd",bean.getMessage());
        if (bean != null && bean.getData().getNewList() != null && bean.getData().getNewList().size() != 0){
            itemDatas .addAll(bean.getData().getNewList());
            myAdapter = new MyAdapter(itemDatas, MainActivity.this);
            recycler.setAdapter(myAdapter);
            recycler.setLayoutManager(new LinearLayoutManager(this));
        }
        else{
            Toast.makeText(this, "没有数据", Toast.LENGTH_SHORT).show();
        }
    }
}
