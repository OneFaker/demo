package com.sz.zw.designmodel.single.hungrysingle;

/**
 * @Author:zhouwen 940668676@qq.com
 * project:webdemo
 * date:2018/11/14 19:35
 * DESC:饿汉式单例-饿汉式单例是线程安全的，因为jvm在加载这个类的时候，由于实例是静态的，所以会加载类的时候也会将这个初始化的实例放进某个区域，而其他线程使用的时候，都会
 * 使用的这个实例。
 */
public class HungrySinleton {
    //静态实例化自己的属性
    private  static  HungrySinleton hungrySinleton=new HungrySinleton();
    //不让别人自己创对象，要用只能用我产生的。
    private HungrySinleton(){}
    //提供给外部一个获取实例的方法。
    public  static  HungrySinleton getInstance(){
        return  hungrySinleton;
    }
}
