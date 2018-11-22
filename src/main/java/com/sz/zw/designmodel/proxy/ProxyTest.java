package com.sz.zw.designmodel.proxy;

import com.sz.zw.designmodel.proxy.resourceproxy.ResourceProxyImpl;

import java.math.BigDecimal;

/**
 * @Author:zhouwen 940668676@qq.com
 * project:webdemo
 * date:2018/11/22 15:37
 * DESC:
 */
public class ProxyTest {
    public static void main(String[] args) {
        IResouceProxy proxy=new ResourceProxyImpl(new TargetProxy());
        proxy.buyShop(new BigDecimal(140));
    }
}
