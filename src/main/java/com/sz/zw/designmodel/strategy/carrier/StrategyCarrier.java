package com.sz.zw.designmodel.strategy.carrier;

import com.sz.zw.designmodel.strategy.IPersonStrategy;

/**
 * @Author:zhouwen 940668676@qq.com
 * project:webdemo
 * date:2018/11/14 19:29
 * DESC:策略的载体
 */
public class StrategyCarrier{
    private IPersonStrategy personStrategy;
    public StrategyCarrier(){}
    public StrategyCarrier(IPersonStrategy personStrategy){
        this.personStrategy=personStrategy;
    }


    public void method() {
        this.personStrategy.method();
    }
}
