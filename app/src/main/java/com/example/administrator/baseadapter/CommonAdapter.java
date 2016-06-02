package com.example.administrator.baseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * 第二步,封装Adapter
 * 实现相同的方法
 * 把所有的private改为protected,因为子类要去访问
 * Created by Administrator on 2016/6/2 0002.
 */
public abstract class CommonAdapter<T> extends BaseAdapter {
    protected Context        mContext;
    protected List<T>        mData;
    protected LayoutInflater inflater;

    public CommonAdapter(Context context, List<T> datas) {
        this.mContext = context;
        this.mData = datas;
        inflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public T getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    //
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = ViewHolder.get(mContext, convertView, parent, R.layout.item_list, position);

//        Bean bean = (Bean) mData.get(position);
//
//        ((TextView) viewHolder.getView(R.id.tv_title)).setText(bean.getTitle());
//        ((TextView) viewHolder.getView(R.id.tv_content)).setText(bean.getTitle());
//        ((TextView) viewHolder.getView(R.id.tv_time)).setText(bean.getTitle());
        convert(viewHolder, getItem(position));
        return viewHolder.getConvertView();
    }

    public abstract void convert(ViewHolder viewHolder, T t);
}
