package com.zanbo.Demo01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Test03 {

    @MyAnnotation2(name = "zanbo")
    public void test02(){}


    @MyAnnotation3("zanbo")
    public void test03(){}



}


@Target(value = {ElementType.TYPE,ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation2{


    //注解的参数：参数类型 + 参数名();
    String name() default "";
    int age() default 0;
    int id() default -1;

    String[] school() default {""};
}

@Target(value = {ElementType.TYPE,ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation3{

    //在使用时可以直接赋值
    String value();


}