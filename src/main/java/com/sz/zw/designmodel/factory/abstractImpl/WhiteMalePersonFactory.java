package com.sz.zw.designmodel.factory.abstractImpl;

import com.sz.zw.designmodel.factory.abstractfactory.male.MaleAbstractPersonFactory;

/**
 * @Author:zhouwen 940668676@qq.com
 * project:webdemo
 * date:2018/11/22 14:16
 * DESC:
 */
public class WhiteMalePersonFactory extends MaleAbstractPersonFactory {
    @Override
    public void eat() {
        System.out.println("男性白人吃。。。");
    }

    @Override
    public void cry() {
        System.out.println("男性白人哭...");
    }

    @Override
    public void talk() {
        System.out.println("男性白人说...");
    }

    @Override
    public void play() {
        System.out.println("男性行为。。。");
    }
}
