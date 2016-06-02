package com.example.administrator.baseadapter;

import android.content.Context;

import com.example.administrator.baseadapter.com.baseAdapter.bean.Bean;

import java.util.List;

/**
 * Created by Administrator on 2016/6/2 0002.
 */
public class MyAdapterWithCommon extends CommonAdapter<Bean> {
//    当继承 CommonAdapter<Bean>时,不在使用这些
//    private LayoutInflater inflater;//加载布局文件
//    private List<Bean>     mData;
//    private Context        mContext;

    //    创建一个构造方法
    public MyAdapterWithCommon(Context context, List<Bean> data) {
        super(context, data);
//        mContext = context;
//        inflater = LayoutInflater.from(context);
//        mData = data;
    }

//    @Override
//    public int getCount() {
//        return mData.size();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return mData.get(position);
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return position;
//    }

//    这个方法在继承CommonAdapter后不需要了
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
////        ViewHolder viewHolder = null;
////        if (convertView == null) {
////            convertView = inflater.inflate(R.layout.item_list, parent, false);
////            viewHolder = new ViewHolder();
////
////            viewHolder.mTitle = (TextView) convertView.findViewById(R.id.tv_title);
////            viewHolder.mTime = (TextView) convertView.findViewById(R.id.tv_time);
////            viewHolder.mDesc = (TextView) convertView.findViewById(R.id.tv_content);
////            convertView.setTag(viewHolder);
////        } else {
////            viewHolder = (ViewHolder) convertView.getTag();
////        }
//
//
////        ViewHolder的入口
////        把上面的代码浓缩成一行
//        ViewHolder viewHolder = ViewHolder.get(mContext, convertView, parent, R.layout.item_list, position);
//
//        Bean bean = mData.get(position);
//
//        ((TextView) viewHolder.getView(R.id.tv_title)).setText(bean.getTitle());
//        ((TextView) viewHolder.getView(R.id.tv_content)).setText(bean.getTitle());
//        ((TextView) viewHolder.getView(R.id.tv_time)).setText(bean.getTitle());
////        viewHolder.mTitle.setText(bean.getTitle());
////        viewHolder.mDesc.setText(bean.getDesc());
////        viewHolder.mTime.setText(bean.getTime());
////        return convertView;
//        return viewHolder.getConvertView();//这点很重要
//    }

    @Override
    public void convert(ViewHolder viewHolder, Bean bean) {
//        ((TextView) viewHolder.getView(R.id.tv_title)).setText(bean.getTitle());
        viewHolder.setText(R.id.tv_title,bean.getTitle())
                .setText(R.id.tv_content,bean.getDesc())
                .setText(R.id.tv_time,bean.getTime());


//              使用viewHolder.setText()方法后,直接设置setText不需要以下代码
//        ((TextView) viewHolder.getView(R.id.tv_content)).setText(bean.getTitle());
//        ((TextView) viewHolder.getView(R.id.tv_time)).setText(bean.getTitle());
    }

//    private class ViewHolder {
//        TextView mTitle;
//        TextView mDesc;
//        TextView mTime;
//    }


}
