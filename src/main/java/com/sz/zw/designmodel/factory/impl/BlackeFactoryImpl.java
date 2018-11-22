package com.sz.zw.designmodel.factory.impl;

import com.sz.zw.designmodel.factory.IPersonFactory;

/**
 * @Author:zhouwen 940668676@qq.com
 * project:webdemo
 * date:2018/11/14 20:05
 * DESC:
 */
public class BlackeFactoryImpl  implements IPersonFactory {
    @Override
    public void eat() {
        System.out.println("黑人的吃...");
    }

    @Override
    public void cry() {
        System.out.println("黑人的哭");
    }

    @Override
    public void talk() {
        System.out.println("黑人的谈话");
    }

    @Override
    public void gender() {
        System.out.println("黑人工厂...");
    }

    @Override
    public void play() {
        System.out.println("行为");
    }
}
