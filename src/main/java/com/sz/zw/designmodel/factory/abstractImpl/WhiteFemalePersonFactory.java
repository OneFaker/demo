package com.sz.zw.designmodel.factory.abstractImpl;

import com.sz.zw.designmodel.factory.IPersonFactory;
import com.sz.zw.designmodel.factory.abstractfactory.female.FemaleAbstractPersonFactory;

import java.io.Serializable;

/**
 * @Author:zhouwen 940668676@qq.com
 * project:webdemo
 * date:2018/11/22 14:15
 * DESC:
 */
public class WhiteFemalePersonFactory extends FemaleAbstractPersonFactory implements IPersonFactory,Serializable {
    @Override
    public void eat() {
        System.out.println("女性白人吃..");
    }

    @Override
    public void cry() {
        System.out.println("女性白人哭...");
    }

    @Override
    public void talk() {
        System.out.println("女性白人说...");
    }

    @Override
    public void play() {
        System.out.println("女性行为...");
    }
}
