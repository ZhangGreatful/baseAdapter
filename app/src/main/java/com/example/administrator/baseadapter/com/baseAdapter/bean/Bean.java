package com.example.administrator.baseadapter.com.baseAdapter.bean;

/**
 * 对数据进行封装,三个数据title,desc,time
 * 包括两个构造方法,三个set,get方法
 * Created by Administrator on 2016/6/2 0002.
 */
public class Bean {

    public Bean( String title, String desc, String time) {
        this.title = title;
        this.desc = desc;
        this.time = time;
    }

    private String title;
    private String desc;
    private String time;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }



    public Bean() {

    }
}
