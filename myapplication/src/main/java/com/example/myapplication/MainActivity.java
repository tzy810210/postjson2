package com.example.myapplication;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.animation.BaseAnimation;
import com.github.library.BaseRecyclerAdapter;
import com.github.library.listener.OnRecyclerItemClickListener;
import com.github.library.listener.OnRecyclerItemLongClickListener;
import com.squareup.picasso.Picasso;

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
        mPresenter.getDatas("无人机","0");
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void showRes(Bean bean) {
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
