package com.sz.zw.designmodel.util;

import com.sz.zw.designmodel.factory.IPersonFactory;
import com.sz.zw.designmodel.factory.impl.BlackeFactoryImpl;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @Author:zhouwen 940668676@qq.com
 * project:webdemo
 * date:2018/11/22 9:58
 * DESC:
 */
public class InstanceUtils {
    public  static IPersonFactory  getInstance(Class c) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException {
        IPersonFactory factory=null;
        //判断是接口
        if (c.isInterface()){
            String packageName=c.getPackage().getName();
            System.out.println("当前包的包路径为:"+packageName);
            List<Class> classes=getAllClass(packageName);
            //返回flase的时候过滤
            List<Class> collect = classes.stream().filter(cls -> (c.isAssignableFrom(cls)&&!Modifier.isAbstract(cls.getModifiers()))).collect(Collectors.toList());
            factory=getInstance(collect,c);

        }else if (Modifier.isAbstract(c.getModifiers())){
            String packagePath=c.getPackage().getName();
            //抽象类,先获取抽象类的父类的接口
                Class[] interfaces = c.getInterfaces();
                Class<?> clazz=null;
                for (Class anInterface : interfaces) {
                    //如果是需要的目标的生产实例的包路径，就拿这个包去查他下面所有的普通类
                    if (packagePath.contains(anInterface.getPackage().getName())){
                        clazz=anInterface;
                    }
                }
                if (clazz!=null){
                    packagePath=clazz.getPackage().getName();
                }
            System.out.println("需要查找的路径为:"+packagePath);
            List<Class> classes=getAllClass(packagePath);
            List<Class> collect = classes.stream().filter(cls -> c.isAssignableFrom(cls)).collect(Collectors.toList());
            factory=getInstance(collect,c);
        }else {
            //普通类
            IPersonFactory  personFactory= (IPersonFactory) Class.forName(c.getName()).newInstance();
        }
        return factory;
    }
    public static IPersonFactory  getInstance(List<Class> collect,Class c) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        IPersonFactory factory=null;
        int i=1;
        while (i>=1){
            int random=new Random().nextInt(collect.size());
            System.out.println("随机的类为:"+collect.get(random).getName());
            //如果是本身自己本能产生的实例clazz，也就是说接口和抽象类，就需要重新随机一份
            if ( collect.get(random).equals(c)){
                i++;
            }else {
                factory = (IPersonFactory) Class.forName(collect.get(random).getName()).newInstance();
                i=0;
            }
        }
        return  factory;
    }


    public  static  List<Class> getAllClass(String packageName) throws IOException, ClassNotFoundException {
        List<Class> classes=new ArrayList<>();
        //获取当前加载器
        ClassLoader classLoader=Thread.currentThread().getContextClassLoader();
        //把包名的.换成/
        String path=packageName.replace(".","/");
        System.out.println("转换后的新的包路径为:"+path);
        //获取当前包下的所有类路径
        Enumeration<URL> resources = classLoader.getResources(path);
        //创建一个装在匹配类路径的文件的集合
        List<File> files=new ArrayList<>();
        while (resources.hasMoreElements()){
            URL url=resources.nextElement();
            files.add(new File(url.getFile()));
        }
        for (File file : files) {
            classes.addAll(findClass(file,packageName));
        }

        return  classes;
    }



    public  static  List<Class> findClass(File dir ,String packageName) throws ClassNotFoundException {
            List<Class> classes=new ArrayList<>();
            //如果文件不存在
            if (!dir.exists()){
                return  classes;
            }
            //获取当前包路径下的所有子文件
        File[] files = dir.listFiles();
        for (File file : files) {
            //判断当前的文件是否是文件夹
            if (file.isDirectory()){
                assert  !file.getName().contains(".");
                //如果是文件夹，就递归下去
                classes.addAll(findClass(file,packageName+"."+file.getName()));
            }else {
                System.out.println(file.getName());
                //如果是类文件
                Class<?> aClass=null;
                if (file.getName().endsWith(".class")){
                    //如果文件以.class结尾，则需要删除这个，因为不需要
                    aClass= Class.forName(packageName + "." + file.getName().substring(0, file.getName().length() - 6));
                }else {
                    aClass = Class.forName(packageName + "." + file.getName());
                }
                classes.add(aClass);
            }
        }
            return  classes;
    }

}
