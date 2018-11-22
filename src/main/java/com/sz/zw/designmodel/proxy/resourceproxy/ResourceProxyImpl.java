package com.sz.zw.designmodel.proxy.resourceproxy;

import com.sz.zw.designmodel.proxy.IResouceProxy;

import java.math.BigDecimal;

/**
 * @Author:zhouwen 940668676@qq.com
 * project:webdemo
 * date:2018/11/22 15:29
 * DESC:
 */
public class ResourceProxyImpl implements IResouceProxy {
    IResouceProxy resouceProxy=null;
    public ResourceProxyImpl(IResouceProxy resouceProxy){
       this.resouceProxy=resouceProxy;
    }
    @Override
    public void buyShop(BigDecimal money) {
        //金额不够，还买不了东西
        if (money.compareTo(new BigDecimal(100))<0){
            System.out.println("当前金额为:"+money+"钱不够，需要代理人自己添钱进去...");
            BigDecimal m=new BigDecimal(100);
           BigDecimal  money1 = money.add(m);
            System.out.println("代理人掏了:"+m+",这时的金额为:"+money1);
            //可以愉快的买东西啦
            resouceProxy.buyShop(money1);
        }
        if (money.compareTo(new BigDecimal(100))>0){
            System.out.println("发现钱有点多，于是偷偷的收了的手续费...");
           BigDecimal money2=  money.subtract(new BigDecimal(20));
            System.out.println("收了手续费之后的金额为:"+money2);
        }

    }
}
