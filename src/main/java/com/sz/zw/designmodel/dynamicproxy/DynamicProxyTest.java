package com.sz.zw.designmodel.dynamicproxy;

import com.sz.zw.designmodel.dynamicproxy.dynamic.DynamicProxy;
import com.sz.zw.designmodel.dynamicproxy.impl.SubjectProxyImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author:zhouwen 940668676@qq.com
 * project:webdemo
 * date:2018/11/22 15:50
 * DESC:
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        ISubjectProxy subjectProxy=new SubjectProxyImpl();
        //创建代理的关联对象
        InvocationHandler handler=new DynamicProxy(subjectProxy);
        //创建真正的代理对象，实现代理
        ISubjectProxy proxy =(ISubjectProxy) Proxy.newProxyInstance(handler.getClass().getClassLoader(), subjectProxy.getClass().getInterfaces(), handler);
        proxy.hello("world",0);
    }
}
