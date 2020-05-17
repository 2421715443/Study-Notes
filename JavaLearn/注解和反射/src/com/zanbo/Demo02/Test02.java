package com.zanbo.Demo02;

public class Test02 {

    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();

        System.out.println("是：" + person.getClass());
        System.out.println("是：" + person.getName());

        Class c1 = person.getClass();
        System.out.println(c1);
        System.out.println(c1.hashCode());

        Class c2 = Class.forName("com.zanbo.Demo02.Student");
        System.out.println(c2);
        System.out.println(c2.hashCode());

        Class c3 = Student.class;
        System.out.println(c3.getSuperclass());
        System.out.println(c3.hashCode());

        //内置包装类
        Class c4 = Integer.TYPE;
        System.out.println(c4);
        System.out.println(c4.hashCode());


    }


}

class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class Student extends Person {
    public Student() {
        this.setName("学生");
    }
}

class Teacher extends Person {
    public Teacher() {
        this.setName("老师");
    }
}
