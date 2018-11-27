package com.sz.zw.designmodel.dynamicproxy.dynamic;

import com.sz.zw.designmodel.dynamicproxy.ISubjectProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author:zhouwen 940668676@qq.com
 * project:webdemo
 * date:2018/11/22 15:48
 * DESC:
 */
public class DynamicProxy<T> implements InvocationHandler {

    private T subjectProxy;

    public  DynamicProxy(T subjectProxy){
        this.subjectProxy=subjectProxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //args代表的是代理方法的参数个数以及参数内容，我们可以对内容做替换，但是不能改变这个数组的长度。
       // proxy=subjectProxy;
        method.invoke(subjectProxy,args);
        return null;
    }
}
