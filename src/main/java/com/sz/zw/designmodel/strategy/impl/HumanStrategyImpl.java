package com.sz.zw.designmodel.strategy.impl;

import com.sz.zw.designmodel.strategy.IPersonStrategy;

/**
 * @Author:zhouwen 940668676@qq.com
 * project:webdemo
 * date:2018/11/14 19:24
 * DESC:女人的行为
 */
public class HumanStrategyImpl implements IPersonStrategy {

    @Override
    public void method() {
        System.out.println("尖叫呐喊....");
    }
}
