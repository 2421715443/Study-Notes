package com.zanbo.Demo03;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test05 {

    public static void test01() {
        User user = new User();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000000; i++) {
            user.getName();
        }

        long end = System.currentTimeMillis();

        System.out.println("普通方法执行时间" + (end - start) + "ms");

    }

    public static void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        User user = new User();
        Class c1 = user.getClass();
        Method getName = c1.getDeclaredMethod("getName",null);

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user,null);
        }

        long end = System.currentTimeMillis();

        System.out.println("反射方法执行时间" + (end - start) + "ms");

    }

    public static void test03() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c1 = user.getClass();
        Method getName = c1.getDeclaredMethod("getName",null);

        getName.setAccessible(true);

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user,null);
        }

        long end = System.currentTimeMillis();

        System.out.println("反射方法关闭检测执行时间" + (end - start) + "ms");

    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        test01();
        test02();
        test03();
    }


}


