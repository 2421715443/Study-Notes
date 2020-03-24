# Java笔记

## 1.Java基础

---

### 1.1 学习javadoc

---

未开始



### 1.2 编码风格

---

类名每个单词的首字母都要大写，这种风格别称作“驼峰风格”,而其他内容如——字段、方法、对象引用等，只是把第一个字母小写。例如：

```java
public class OneName{
    private int twoName
    public void threeName(int name){
       //实现 
    }
}
```



### 1.3 构造器

---

如果你没有创建构造器，编译器会为你自动创建一个默认构造器（无参构造器），如果你创建了，就不会生成。

与类名相同，可以用参数列表区分进行重载，构造器的调用可以出现在另一个构造器中，但只能出现一个，不允许出现第二个，同样也不允许在类中调用。

```java
public class Test{
    private int a;
    Test(int value){
        a=value;
    }
}
```



### 1.4 this关键字

---

可以把自身对象传入方法中



### 1.5 垃圾回收

---

finalize()方法可以在垃圾回收的时刻做一些事（一些重要的清理工作），finalize()可以释放在调用“本地方法”时创建的内存空间如malloc()，可以在finalize()中调用free()方法来释放它。

垃圾回收方式有

minor gc，major gc，full gc（以下方法应该是协同配合：）

> 标记——清扫
>
> 停止——复制

Java中

> 1. 对象可能不会被垃圾回收
> 2. 垃圾回收并不等于析构
> 3. 垃圾回收只与内存有关（应该是内存不足时）



### 1.6 抽象类

---

抽象类用abstract修饰

```java
abstract class xxx{
    //抽象类
}
```

抽象类不需要所有的类都是抽象的可以包含方法的实现，其不允许不完整的抽象类生成对象，如果想产生对象就要为其创建导出类，其到处类要实现抽象基类中所有的抽象方法，其导出类也可作为基类继承。



### 1.7 接口

---

接口用interface代替class，接口实现类要用implements修饰

```java
interface xxx{
    //接口描述
}

class xxx implements xxx{
    //接口实现类
}
```

其允许所有的方法都为抽象的，其只是一种描述“说明了所有实现类此接口的类看起来都像这个接口这样”，接口中之需要确定方法名、参数列表和返回值类型，剩下的是都交给实现它的类补充，其实现类就和普通的类一样可以被继承可以生成对象等。

接口之间可以通过继承来拓展接口

```java
interface aaa{
    void a();
}
interface bbb extends aaa{
    void b();
}
class ab implements bbb{
    public void a() {}
    public void b() {}
}

```



### 1.8 完全解耦

---

没学明白？？？？？？？？？？？？？？？？？？cao



### 1.9 Java多重继承

---

```java
interface aaa{
    void aaa();
    //此接口与class d中存在的方法签名相同
    void d();
}
interface bbb{
    void bbb();
}
interface ccc{
    void ccc();
}
class ddd{
    public void d() {}
}
class OneC extends ddd
    implements aaa,bbb,ccc{
    public aaa() {}
    public bbb() {}
    public ccc() {}
    //这里不实现void d()接口
}
public class C{
    //在生成对象时尽管void d()接口没有在实现类中实现，但却在实现类的基类中找到了该方法的实现
    OneC O = new OneC();
}
```



### 1.10 访问权限控制

---





