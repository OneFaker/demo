package com.sz.zw.designmodel.dynamicproxy.impl;

import com.sz.zw.designmodel.dynamicproxy.ISubjectProxy;

/**
 * @Author:zhouwen 940668676@qq.com
 * project:webdemo
 * date:2018/11/22 15:46
 * DESC:
 */
public class SubjectProxyImpl implements ISubjectProxy {
    @Override
    public void hello(String str,int i) {
        System.out.println("hello,"+str+i);
    }
}
