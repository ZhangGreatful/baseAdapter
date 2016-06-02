package com.example.administrator.baseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.administrator.baseadapter.com.baseAdapter.bean.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 关于checkBox抢占焦点解决方案 xz
 * 第一种方案,将checkBox的聚焦设置为false
 * 第二种方案,在布局文件里加入descendantFocusability属性为blocksDescendants
 */
public class MainActivity extends AppCompatActivity {
    private ListView   mListView;
    private List<Bean> mData;
    private Bean       bean;
//    private MyAdapter mAdapter;
    private MyAdapterWithCommon mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();

        initView();
    }

//    初始化布局
    private void initView() {
        mListView = (ListView) findViewById(R.id.id_listview);
//        mListView.setAdapter(mAdapter);
        mListView.setAdapter(new CommonAdapter<Bean>(MainActivity.this,mData) {
            @Override
            public void convert(ViewHolder viewHolder, Bean bean) {
                viewHolder.setText(R.id.tv_title,bean.getTitle())
                        .setText(R.id.tv_content,bean.getDesc())
                        .setText(R.id.tv_time,bean.getTime());
            }
        });
    }

//    初始化数据
    private void initData() {
        mData = new ArrayList<Bean>();
        bean = new Bean( "万能适配器1", "打造万能的安卓适配器", "2011-2-3");
        mData.add(bean);
        bean = new Bean( "万能适配器2", "打造万能的安卓适配器", "2011-2-3");
        mData.add(bean);
        bean = new Bean( "万能适配器3", "打造万能的安卓适配器", "2011-2-3");
        mData.add(bean);
        bean = new Bean( "万能适配器4", "打造万能的安卓适配器", "2011-2-3");
        mData.add(bean);
        bean = new Bean( "万能适配器5", "打造万能的安卓适配器", "2011-2-3");
        mData.add(bean);
        bean = new Bean( "万能适配器6", "打造万能的安卓适配器", "2011-2-3");
        mData.add(bean);
        bean = new Bean( "万能适配器7", "打造万能的安卓适配器", "2011-2-3");
        mData.add(bean);
        bean = new Bean( "万能适配器8", "打造万能的安卓适配器", "2011-2-3");
        mData.add(bean);
        bean = new Bean( "万能适配器9", "打造万能的安卓适配器", "2011-2-3");
        mData.add(bean);
//        mAdapter=new MyAdapter(this,mData);
        mAdapter=new MyAdapterWithCommon(this,mData);
    }
}
