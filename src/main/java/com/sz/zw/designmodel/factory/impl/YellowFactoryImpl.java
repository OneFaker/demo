package com.sz.zw.designmodel.factory.impl;

import com.sz.zw.designmodel.factory.IPersonFactory;

/**
 * @Author:zhouwen 940668676@qq.com
 * project:webdemo
 * date:2018/11/14 20:01
 * DESC:第一个实例-黄种人
 */
public class YellowFactoryImpl implements IPersonFactory {
    @Override
    public void eat() {
        System.out.println("黄种人吃东西...");
    }

    @Override
    public void cry() {
        System.out.println("黄种人哭的哗啦哗啦'");
    }

    @Override
    public void talk() {
        System.out.println("黄种人谈话谈话...");
    }

    @Override
    public void gender() {
        System.out.println("黄种人工厂...");
    }

    @Override
    public void play() {
        System.out.println("行为...");
    }
}
