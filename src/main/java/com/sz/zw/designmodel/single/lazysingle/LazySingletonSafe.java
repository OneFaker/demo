package com.sz.zw.designmodel.single.lazysingle;

/**
 * @Author:zhouwen 940668676@qq.com
 * project:webdemo
 * date:2018/11/14 19:39
 * DESC:懒汉式单例-非线程安全 多线程下一样产生多个实例对象
 */
public class LazySingletonSafe {
    //私有申明自己的实例变量，但是不直接初始化
    private  static LazySingletonSafe lazySingleTon=null;
    //一样私有化自己的构造方法，不让别人产生对象
    private LazySingletonSafe(){}
    //提供给外部获取实例方法
    private static LazySingletonSafe getLazySingleTon(){
        //CAS双重检测机制
        if (lazySingleTon==null) {
            synchronized (LazySingletonSafe.class) {
                if (lazySingleTon == null) {
                    return new LazySingletonSafe();
                }
            }
        }
        return  lazySingleTon;
    }
}
