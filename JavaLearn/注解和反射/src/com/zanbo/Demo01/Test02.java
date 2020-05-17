package com.zanbo.Demo01;

import java.lang.annotation.*;

@MyAnnotation
public class Test02 {

    @MyAnnotation
    public void test(){

    }

}

//定义一个注解
@Target(value = {ElementType.METHOD,ElementType.TYPE})     //元注解表示此注解可以用在哪些地方
@Retention(value = RetentionPolicy.RUNTIME)                //定义何时有效     RUNTIME>CLASS>SOURCES
@Documented         //是否将注解生成到JAVAdoc中
@Inherited          //子类可以继承父类的注解
@interface MyAnnotation {

}