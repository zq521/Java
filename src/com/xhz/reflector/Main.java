package com.xhz.reflector;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by zhaoqiang on 2017/5/12.
 * Java 反射
 */
public class Main {

    public static void main(String[] args) {

        Class[] importedClasses = new Class[]{
                Hello.class
        };

//        try {
//            DataType h=DataType.class.newInstance();
//            h.sayHello();
//
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }

        try {
            //访问类的定义
            Class<?> helloClass = Class.forName("com.xhz.reflector.Hello");
            //创建实例
            Object hello = helloClass.newInstance();
            //通过类获取指定方法
            Method sayHelloMethod = helloClass.getMethod("sayHello", String.class);
            //调用invoke
            sayHelloMethod.invoke(hello, "zhangsan");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {//目标错误
            e.printStackTrace();
        }

    }
}
