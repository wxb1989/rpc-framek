package com.wx.rpc.core;

/**
 * Created by Administrator on 2016/11/5.
 */
public class BaseModule {
    private int name;
    private int tel;

    private int test1(){

        return 1;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
}
