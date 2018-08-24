package com.example.lenovo.myapplication.UI.activity;

import android.Manifest;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.lenovo.myapplication.Base.BaseActivity;
import com.example.lenovo.myapplication.Bean.Bean;
import com.example.lenovo.myapplication.Lo.LoContract;
import com.example.lenovo.myapplication.Lo.LoModel;
import com.example.lenovo.myapplication.Lo.LoPresenter;
import com.example.lenovo.myapplication.R;
import com.example.lenovo.myapplication.UI.adapter.MyAdapter;
import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.editorpage.ShareActivity;
import com.umeng.socialize.media.UMImage;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity<LoModel,LoPresenter> implements LoContract.View {


    private ArrayList<Bean.DataBean.NewListBean> list=new ArrayList<>();
    private RecyclerView rv;
    private MyAdapter myAdapter;
    private UMShareListener shareListener = new UMShareListener() {
        /**
         * @descrption 分享开始的回调
         * @param platform 平台类型
         */
        @Override
        public void onStart(SHARE_MEDIA platform) {

        }

        /**
         * @descrption 分享成功的回调
         * @param platform 平台类型
         */
        @Override
        public void onResult(SHARE_MEDIA platform) {
            Toast.makeText(MainActivity.this,"成功                                        了",Toast.LENGTH_LONG).show();
        }

        /**
         * @descrption 分享失败的回调
         * @param platform 平台类型
         * @param t 错误原因
         */
        @Override
        public void onError(SHARE_MEDIA platform, Throwable t) {
            Toast.makeText(MainActivity.this,"失                                            败"+t.getMessage(),Toast.LENGTH_LONG).show();
        }

        /**
         * @descrption 分享取消的回调
         * @param platform 平台类型
         */
        @Override
        public void onCancel(SHARE_MEDIA platform) {
            Toast.makeText(MainActivity.this,"取消                                          了",Toast.LENGTH_LONG).show();

        }
    };

    @Override
    protected void initView() {
         rv=findViewById(R.id.rv);

        myAdapter = new MyAdapter(R.layout.layout, list);

        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(myAdapter);

        myAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {

                UMImage image = new UMImage(MainActivity.this,R.drawable.umeng_socialize_qq);//网络图片
                new ShareAction(MainActivity.this).withText("hello")
                        .withMedia(image)
                        .setDisplayList(SHARE_MEDIA.SINA,SHARE_MEDIA.QQ,SHARE_MEDIA.WEIXIN)
                        .setCallback(shareListener).open();
            }
        });
        if(Build.VERSION.SDK_INT>=23){
            String[] mPermissionList = new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.CALL_PHONE,Manifest.permission.READ_LOGS,Manifest.permission.READ_PHONE_STATE, Manifest.permission.READ_EXTERNAL_STORAGE,Manifest.permission.SET_DEBUG_APP,Manifest.permission.SYSTEM_ALERT_WINDOW,Manifest.permission.GET_ACCOUNTS,Manifest.permission.WRITE_APN_SETTINGS};
            ActivityCompat.requestPermissions(MainActivity.this,mPermissionList,123);
        }
        myAdapter.setOnItemLongClickListener(new BaseQuickAdapter.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
               
                startActivity(intent);

                return true;
            }
        });

    }
    @Override
    public void onRequestPermissionsResult(int requestCode,
               String permissions[], int[] grantResults) {

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        UMShareAPI.get(this).onActivityResult(requestCode, resultCode, data);
        
    }
    @Override
    protected void initData() {
          pp.getUrl("aadc2d9fe76f4b89bf37ca738e23eafe","b9240eee3b0211e8b64c00163e30445d","0");
    }                                                                                   

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void getDatas(Bean bean) {
        Log.e("-=-a=s-d=",bean.getMessage());
        List<Bean.DataBean.NewListBean> newList = bean.getData().getNewList();
        list.addAll(newList);

        myAdapter.notifyDataSetChanged();
    }
}
