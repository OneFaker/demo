package com.sz.zw.designmodel.factory.impl;

import com.sz.zw.designmodel.factory.IPersonFactory;

/**
 * @Author:zhouwen 940668676@qq.com
 * project:webdemo
 * date:2018/11/14 20:03
 * DESC:第二个-白种人
 */
public class WhiteFactoryImpl implements IPersonFactory {
    @Override
    public void eat() {
        System.out.println("白人吃...");
    }

    @Override
    public void cry() {
        System.out.println("白人哭...");
    }

    @Override
    public void talk() {
        System.out.println("白人谈话");
    }

    @Override
    public void gender() {
        System.out.println("白人工厂...");
    }

    @Override
    public void play() {
        System.out.println("行为...");
    }
}
