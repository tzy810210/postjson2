package com.example.lenovo.myapplication.UI.adapter;

import android.net.Uri;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.lenovo.myapplication.Bean.Bean;
import com.example.lenovo.myapplication.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by lenovo on 2018/8/9.
 */

public class MyAdapter extends BaseQuickAdapter<Bean.DataBean.NewListBean,BaseViewHolder> {
    public MyAdapter(int layoutResId, @Nullable List<Bean.DataBean.NewListBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Bean.DataBean.NewListBean bean) {
        helper.setText(R.id.title,bean.getTitle())
                .setText(R.id.publishTime,bean.getPublishTime());
    }
}

