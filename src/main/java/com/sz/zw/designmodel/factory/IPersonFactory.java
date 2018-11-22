package com.sz.zw.designmodel.factory;

/**
 * @Author:zhouwen 940668676@qq.com
 * project:webdemo
 * date:2018/11/14 19:49
 * DESC:人类的工厂接口
 */
public interface IPersonFactory {
    /**
     * 吃
     */
    void eat();

    /**
     * 哭
     */
    void cry();

    /**
     * 说
     */
    void talk();

    void gender();
    void play();
}
