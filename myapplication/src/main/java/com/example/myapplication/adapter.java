package com.example.myapplication;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by lenovo on 2018/8/16.
 */

public class adapter extends BaseQuickAdapter<Bean.DataBean.NewListBean,BaseViewHolder> {


    public adapter(int layoutResId, @Nullable List<Bean.DataBean.NewListBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Bean.DataBean.NewListBean bean) {
        
            helper.setText(R.id.text,bean.getTitle());

    }
}
