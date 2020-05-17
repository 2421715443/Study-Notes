package com.zanbo.Demo03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test04 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException {
        Class c1 = Class.forName("com.zanbo.Demo03.User");


        //newInstance的使用必须有无参构造器，并且有访问权限
        User user = (User) c1.newInstance();    //本质调用无参构造器
        System.out.println(user);


        //通过构造器创建对象
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User zanbo = (User) declaredConstructor.newInstance("zanbo", 10, 10);
        System.out.println(zanbo);

        //通过反射获取方法
        Method setName = c1.getDeclaredMethod("setName", String.class);
        setName.invoke(zanbo,"zanbo");
        System.out.println(zanbo.getName());

        //通过反射操作属性
        Field name = c1.getDeclaredField("name");
        //不能直接操作私有属性，需关闭安全检测
        name.setAccessible(true);
        name.set(zanbo,"zanbotoo");
        System.out.println(zanbo.getName());


    }
}


class User {

    private String name;
    private int id;
    private int age;

    public User() {
    }

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}