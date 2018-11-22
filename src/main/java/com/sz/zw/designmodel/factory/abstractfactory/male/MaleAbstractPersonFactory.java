package com.sz.zw.designmodel.factory.abstractfactory.male;

import com.sz.zw.designmodel.factory.IPersonFactory;

/**
 * @Author:zhouwen 940668676@qq.com
 * project:webdemo
 * date:2018/11/22 14:02
 * DESC:
 */
public abstract class MaleAbstractPersonFactory implements IPersonFactory {
    @Override
    public  void  gender(){
        System.out.println("这是用于建造男人所使用的工厂....");
    }

}
