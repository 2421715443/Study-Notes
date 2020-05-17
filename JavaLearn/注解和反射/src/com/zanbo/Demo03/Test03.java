package com.zanbo.Demo03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test03 {

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {

        String s = new String();
        Class c1 = s.getClass();

        //获得类的名字
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());
        System.out.println("===============================");

        //获得类的属性
//        Field[] fields1 = c1.getFields();     //只能打印public属性

        Field[] fields = c1.getDeclaredFields();    //找到全部属性
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("===============================");

        //指定属性
        Field value = c1.getDeclaredField("value");
        System.out.println(value);
        System.out.println("===============================");


        //获得类的方法
        Method[] methods = c1.getMethods();     //获得本类和父类的全部方法
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("===============================");


        Method[] declaredMethods = c1.getDeclaredMethods();     //只有本类的方法
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        System.out.println("===============================");

        //指定方法
        Method equals = c1.getMethod("equals", Object.class);
        Field value1 = c1.getDeclaredField("value");
        System.out.println(equals);
        System.out.println(value1);

        System.out.println("===============================");


        //获得构造器
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("===============================");

        //获得指定构造器
        Constructor declaredConstructor = c1.getDeclaredConstructor(char[].class);
        System.out.println(declaredConstructor);


        String[] A = new String[5];
        String B = new String();
        System.out.println(A.getClass());
        System.out.println(B.getClass());

    }

}
