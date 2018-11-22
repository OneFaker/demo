package com.sz.zw.designmodel.proxy;

import java.math.BigDecimal;

/**
 * @Author:zhouwen 940668676@qq.com
 * project:webdemo
 * date:2018/11/22 15:36
 * DESC:
 */
public class TargetProxy implements  IResouceProxy {
    @Override
    public void buyShop(BigDecimal money) {
        System.out.println("在此购买了"+money+"的东西");
    }
}
