package com.sz.zw.designmodel.factory.factoryobj;

import com.sz.zw.designmodel.factory.IPersonFactory;
import com.sz.zw.designmodel.util.InstanceUtils;

import java.io.IOException;
import java.lang.reflect.Modifier;

/**
 * @Author:zhouwen 940668676@qq.com
 * project:webdemo
 * date:2018/11/14 20:08
 * DESC:工厂模式未完成
 */
public class FactoryObject {
    public  static IPersonFactory getInstance(Class c){
            IPersonFactory personFactory=null;
        try {

            personFactory= InstanceUtils.getInstance(c);
            return personFactory;
        } catch (InstantiationException e) {
            System.out.println("初始化实例失败...");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("非法访问!!!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("类型未找到!!!");
            e.printStackTrace();
        }catch (IOException ioe){
            System.out.println("创建文件出现异常...");
            ioe.printStackTrace();
        }
        return  personFactory;
    }

}
