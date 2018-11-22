package com.sz.zw.designmodel.strategy;

import com.sz.zw.designmodel.strategy.carrier.StrategyCarrier;
import com.sz.zw.designmodel.strategy.impl.HumanStrategyImpl;
import com.sz.zw.designmodel.strategy.impl.ManStrategyImpl;

/**
 * @Author:zhouwen 940668676@qq.com
 * project:webdemo
 * date:2018/11/14 19:31
 * DESC:
 */
public class StrategyTest {
    public static void main(String[] args) {
        //女人的行为策略
        StrategyCarrier humanStrategyCarrier=new StrategyCarrier(new HumanStrategyImpl());
        humanStrategyCarrier.method();
        //男人行为策略
        StrategyCarrier manStrategyCarrier=new StrategyCarrier(new ManStrategyImpl());
        manStrategyCarrier.method();
    }
}
