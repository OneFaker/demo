package com.sz.zw.designmodel.factory.abstractImpl;

import com.sz.zw.designmodel.factory.IPersonFactory;
import com.sz.zw.designmodel.factory.abstractfactory.female.FemaleAbstractPersonFactory;

/**
 * @Author:zhouwen 940668676@qq.com
 * project:webdemo
 * date:2018/11/22 15:09
 * DESC:
 */
public class YellowFemalePersonFactory extends FemaleAbstractPersonFactory implements IPersonFactory {
    @Override
    public void eat() {
        System.out.println("女性黄种人的吃");
    }

    @Override
    public void cry() {
        System.out.println("女性黄种人的哭。。");
    }

    @Override
    public void talk() {
        System.out.println("女性黄种人的说...");
    }

    @Override
    public void play() {
        System.out.println("女性黄种人的行为...");
    }
}
