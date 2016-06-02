package com.example.administrator.baseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.administrator.baseadapter.com.baseAdapter.bean.Bean;

import java.util.List;

/**
 * 普通ListView的使用
 * Created by Administrator on 2016/6/2 0002.
 */
public class MyAdapter extends BaseAdapter {
    private LayoutInflater inflater;//加载布局文件
    private List<Bean>     mData;
    private Context        mContext;

    //    创建一个构造方法
    public MyAdapter(Context context, List<Bean> data) {
        mContext = context;
        inflater = LayoutInflater.from(context);
        mData = data;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_list, parent, false);
            viewHolder = new ViewHolder();

            viewHolder.mTitle = (TextView) convertView.findViewById(R.id.tv_title);
            viewHolder.mTime = (TextView) convertView.findViewById(R.id.tv_time);
            viewHolder.mDesc = (TextView) convertView.findViewById(R.id.tv_content);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Bean bean = mData.get(position);
        viewHolder.mTitle.setText(bean.getTitle());
        viewHolder.mDesc.setText(bean.getDesc());
        viewHolder.mTime.setText(bean.getTime());
        return convertView;
    }

    private class ViewHolder {
        TextView mTitle;
        TextView mDesc;
        TextView mTime;
    }


}
