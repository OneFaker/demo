package com.sz.zw.designmodel.factory;

import com.sz.zw.designmodel.factory.abstractfactory.male.MaleAbstractPersonFactory;
import com.sz.zw.designmodel.factory.factoryobj.FactoryObject;

/**
 * @Author:zhouwen 940668676@qq.com
 * project:webdemo
 * date:2018/11/22 9:02
 * DESC:
 */
public class FactoryTest {
    public static void main(String[] args) {
        //使用创建的工厂类产生实例咯
      /*  IPersonFactory factory = FactoryObject.getInstance(BlackeFactoryImpl.class);
        //查看具体是产生的那个实例
       factory.cry();
       factory.eat();
       factory.talk();
        IPersonFactory instance = FactoryObject.getInstance(WhiteFactoryImpl.class);
        instance.eat();
        instance.talk();
        instance.cry();*/
        //判断是否为抽象类
       // System.out.println(IPersonFactory.class.isInterface());
        //不指定类型随机产生实例
       IPersonFactory personFactory= FactoryObject.getInstance(MaleAbstractPersonFactory.class);
      //  System.out.println(Modifier.isAbstract(MaleAbstractPersonFactory.class.getModifiers()));
     /*   //获取父类
        Class<? super WhiteFemalePersonFactory> superclass = WhiteFemalePersonFactory.class.getSuperclass();
        System.out.println(superclass);
        //获取父亲的接口
        Class<?>[] interfaces = WhiteFemalePersonFactory.class.getInterfaces();
        System.out.println(interfaces.length);*/
    }
}
