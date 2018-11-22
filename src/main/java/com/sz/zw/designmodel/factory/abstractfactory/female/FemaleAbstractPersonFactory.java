package com.sz.zw.designmodel.factory.abstractfactory.female;

import com.sz.zw.designmodel.factory.IPersonFactory;

/**
 * @Author:zhouwen 940668676@qq.com
 * project:webdemo
 * date:2018/11/22 13:59
 * DESC:
 */
public abstract class FemaleAbstractPersonFactory implements IPersonFactory {
        @Override
       public  void gender(){
              System.out.println("这是用于建造女的的工厂方法...");
          }
}
