# 1. Spring 介绍

## 1.1 简介

- Spring:
- 大杂烩开始了
- 2002年首次推出了Spring的雏形：interface21框架！
-  2004年3月24日发布了正式版1.0
- SSH：Struct2+Spring+Hibernate(全自动持久性框架)
- SSM：SpringMVC+Spring+Mybatis(半自动持久性框架)

Spring：https://spring.io/projects/spring-framework

Spring下载：https://repo.spring.io/release/org/springframework/spring/

GitHub：https://github.com/spring-projects/spring-framework

```maven
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>5.2.4.RELEASE</version>
</dependency>
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-jdbc</artifactId>
    <version>5.2.2.RELEASE</version>
</dependency>
```



## 1.2 优点

- Spring是一个开源免费的框架（容器）
- Spring是一个轻量级的、非入侵式的框架
- 控制反转（IOC），面向切面编程（AOP）
- 支持事务的处理，对框架整合的支持



## 1.3 组成

![tup](.\assets\1219227-20170930225010356-45057485.gif) 

## 1.4 扩展

- Spring：
- 现代化开发，快速开发

- SpringBoot：
    - 一个快速开发脚手架
    - 可以快速开发单个微服务
    - 约定大于配置
- SpringCloud
    - SpringCloud是基于SpringBoot开发的

# 2. Spring容器（IOC）简介

## 2.1 简单控制反转

用set接口实现控制反转，降低耦合性

```java
private UserDao userDao;

public void setUserDao(UserDao userDao) {
    this.userDao = userDao;
}
public void getUser() {
    userDao.getUser();
}
```

用配置文件完成控制反转

```xml
<bean id="UserMySqlImpl" class="com.zanbo.dao.Impl.UserMySqlImpl"/>
<bean id="UserDaoImpl" class="com.zanbo.dao.Impl.UserDaoImpl"/>
<bean id="UserServiceImpl" class="com.zanbo.service.Impl.UserServiceImpl">
    <property name="userDao" ref="UserMySqlImpl"/>
</bean>
```

## 2.2 IOC创建对象

下标赋值

```xml
<bean id="user" class="com.zanbo.pojo.User">
    <constructor-arg index="0" value="zanbo"/>
</bean>
```

类型赋值

```xml
<bean id="user" class="com.zanbo.pojo.User">
    <constructor-arg type="java.lang.String" value="zanbo"/>
</bean>
```

参数名赋值

```xml
<bean id="user" class="com.zanbo.pojo.User">
    <constructor-arg name="name" value="zanbo"/>
</bean>
```

```xml
<!--类在在配置文件加载的时候就已经被实例化了-->
```

## 2.3 Spring配置

### 2.3.1 别名

```xml
<!--
别名
alias:
name：bean属性
name可取多个别名
-->
<alias name="user" alias="u1s1"/>
```

### 2.3.2 描述

```xml
<description></description>
```

### 2.3.3 导入

合并xml配置文件

```xml
<import resource="beans.xml"/>
```

## 2.4 依赖注入

### 2.4.1 构造器注入

```java
<bean id="user" class="com.zanbo.pojo.User">
    <constructor-arg name="name" value="zanbo"/>
</bean>
```

### 2.4.2 Set注入

bean对对象的初始化本质上是默认调用类的无参构造器，而值的注入则是调用类的属性的set方法

- 依赖注入
    - 依赖：bean对象的创建依赖于容器
    - 注入：bean对象中的所有属性由容器注入



### 2.4.6 扩展方式注入

复杂类型

```java
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
```

真实对象

```java
public class Student {
    private String name;
    private Address address;
    private String[] book;
    private List<String> hobbys;
    private Map<String,String> card;
    private Set<String> game;
    private String nul;
    private Properties info;
}
```

beans.xml

```xml
<bean id="address" class="com.zanbo.pojo.Address">
    <property name="address" value="127.0.0.1"/>
</bean>

<bean id="student" class="com.zanbo.pojo.Student">
    <property name="name" value="zanbo"/>
    <property name="address" ref="address"/>
</bean>

<!--数组-->
<property name="book">
    <array>
        <value></value>
    </array>
</property>

<!--list-->
<property name="hobbies">
    <list>
        <value></value>
    </list>
</property>

<!--Map-->
<property name="card">
    <map>
        <entry key="ID" value="20200512"/>
        <entry key="UID" value="U20200512"/>
    </map>
</property>

<!--Set-->
<property name="game">
    <set>
        <value>B1</value>
    </set>
</property>

<!--null-->
<property name="nul">
    <null/>
</property>

<!--Properties-->
<property name="info">
    <props>
        <prop key="ID">202000512</prop>
        <prop key="UID">U202000512</prop>
    </props>
</property>
```

测试类

```java
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getName());
        System.out.println(student.getAddress());
    }
}
```

p,c空间注入

```xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       //
       xmlns:p="http://www.springframework.org/schema/p"
       //
       xmlns:c="http://www.springframework.org/schema/c"
       
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">

    <!--p空间注入-->
    <bean id="user" class="com.zanbo.pojo.User" p:name="zanbo" p:age="20"/>

    <!--c空间注入-->
    <bean id="user0" class="com.zanbo.pojo.User" c:name="zanbo" c:age="20"/>

</beans>
```

## 2.5Bean作用域

![image-20200514161617325](E:\学习轨迹\Study-Notes\Spring\assets\image-20200514161617325.png)

1.单例模式（singleton模式）spring默认

```xml
<!--p空间注入-->
<!--原型模式（默认为单例模式）-->
<bean id="user" class="com.zanbo.pojo.User" p:name="zanbo" p:age="20" scope="singleton"/>
```

2.原型模式（每次从容器中get都会产生新的对象）

```xml
<!--p空间注入-->
<!--原型模式（默认为单例模式）-->
<bean id="user" class="com.zanbo.pojo.User" p:name="zanbo" p:age="20" scope="prototype"/>
```

3.其余的request、session、application，这些只在web开发中用到

# 3. Bean的自动装配

- 自动装配式spring满足bean依赖的一种方式！
- spring会自动寻找上下文中的bean自动装配属性

spring中有三种装配方式

1. 在xml中显示配置
2. 在java中显示配置
3. 隐式自动装配

## 3.1 测试自动装配

### 3.1.1 ByName，ByType自动装配

```xml
<bean id="cat" class="com.zanbo.pojo.Cat"/>
<bean id="dog" class="com.zanbo.pojo.Dog"/>
<bean id="people" class="com.zanbo.pojo.People" autowire="byName">
    <!--自动装配dog，cat-->
    <!--ByName会自动寻找上下文中的bean自动装配属性，查找与set方法的名相匹配的bean-->
    <!--保证id唯一-->
    <!--ByType会自动寻找上下文中的bean自动装配属性，查找与自己对象属性类型相匹配的bean-->
    <!--保证类型唯一-->
    <property name="name" value="zanbo"/>
</bean>
```

## 3.2 注解自动装配

spring2.5支持注解

1. 导入约束(context：约束)
2. 配置注解的支持（<context:annotation-config/>）

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">
    <context:annotation-config/>

    <bean id="cat" class="com.zanbo.pojo.Cat"/>
    <bean id="dog" class="com.zanbo.pojo.Dog"/>
    <bean id="people" class="com.zanbo.pojo.People"/>

</beans>
```

@Autowired与java中的@Resource大致相等

- 都是用来自动装配的

直接在属性上注解，可以省略set方法来注入，前提是此属性在IOC中存在，且符合ByName规则

允许空的注释

@Autowired注解

```java
@Autowired(required = false)	//标记的属性可以为空

@Nullable	//可以标记参数，允许为空
```

@Qualifier可以指定bean进行装配

```java
public class People {
    @Autowired(required = false)
    private Dog dog;
    @Autowired
    @Qualifier(value = "xxx")
    private Cat cat;
    private String name;
}
```

@Resource注解

```java
public class People {
    @Resource(name = "xxx")
    private Dog dog;
    @Resource
    private Cat cat;
    private String name;
}
```



## 3.3 使用注解开发

在spring4之后要使用注解要依赖aop包并且配置注解的支持（<context:annotation-config/>）

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">
    <!--指定要扫描的包，里的注解-->
    <context:component-scan base-package="com.zanbo.pojo"/>
    <context:annotation-config/>
</beans>
```

1.bean 

- @Component注解装配到容器中

```java
@Component
public class User {
	
}
```

2.属性注入（可直接属性注入也可注解到set方法上）

```java
@Component
public class User {

    //@Value("zzzz")
    private String name;

    public String getName() {
        return name;
    }

    @Value("zzzz")
    public void setName(String name) {
        this.name = name;
    }
}
```

3.衍生注解

> @component有几个衍生注解，我们在web开发中，会按照mvc三层架构分层！
>
> > dao 【@Repository】
> >
> > service 【@Service】
> >
> > controller 【@Controller】
>
> 这四个注解功能相同，都是将注解类装配到容器中

4.自动装配

```markdown
- @Autowired  
自动装配通过先类型，后名字（ByName）

- @Resource  
自动装配通过先名字，后类型

- @Nullable  
允许标记参数为空
```

5.作用域  @Scope("singleton")

```java
@Component
@Scope("singleton")
public class User {
}
```

6.小结

- xml更加万能
- 注解只能在自己的类中注解，维护较麻烦

最佳实践：

- xml负责bean的装配

- 注解只负责属性注入

- 使用注解要开启注解的支持，并且指定扫描的包

- ```xml
    <!--指定要扫描的包，里的注解-->
    <context:component-scan base-package="com.zanbo"/>
    <context:annotation-config/>
    ```

# 4. 使用java的方式配置spring

我们现在不需要使用xml配置了，都交给java来配置spring！

JavaConfig是Spring的一个子项目，在spring4之后他成为了一个核心功能

```java
@Configuration
@ComponentScan("com.zanbo.pojo")
@Import(ZaConfig2.class)
public class ZaConfig {

    @Bean
    public User getUser() {
        return new User();
    }
}
```



# 5. 代理模式

他就是SpringAOP的底层

代理模式分为：

> 静态代理
>
> 动态代理



## 5.1 静态代理

角色分析：

- 抽象角色：一般使用接口和抽象类
- 真实角色：被代理的角色
- 代理角色：代理真实角色，代理真实角色后，我们一般会做一些附属操作
- 客户：访问代理对象的人

实现步骤：

- 接口（真实角色和代理角色要实现同一个接口）

```java
public interface Rent {
    public void rent();
}
```

- 真实角色

```java
public class Host implements Rent {
    public void rent() {
        System.out.println("房东要租房");
    }
}
```

- 代理角色

```java
public class Proxy implements Rent {

    private Host host;

    public void setHost(Host host) {
        this.host = host;
    }

    public void rent() {
        host.rent();
    }

    public void seeHome(){
        System.out.println("看房");
    }
}
```

- 访问代理角色的事件

```java
public class Me {
    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy();
        proxy.setHost(host);
        proxy.rent();
        proxy.seeHome();
    }
}
```

代理模式的好处：

- 使真实角色的操作更加纯粹！不用关注一些公共的业务
- 公共业务交给代理角色！实现业务分工
- 公共业务发生拓展时，方便集中管理

缺点：

- 一个真实角色就会在、产生一个代理角色，代码量上升

## 5.2 静态代理理解

```java
public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("增加了");
    }

    public void delete() {
        System.out.println("删除了");
    }

    public void update() {
        System.out.println("修改了");
    }

    public void query() {
        System.out.println("查询了");
    }
}
```

实现业务分工，方便集中管理

```java
public class UserServiceProxy implements UserService {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    public void log(String msg) {
        System.out.println("使用了" + msg + "方法");
    }
}
```



## 5.3 动态代理

- 动态代理和静态代理角色一样
- 动态代理和代理类是自动生成的，不是自己写的
- 动态代理分为两大类：基于接口的，基于类的
    - 基于接口---JDK动态代理
    - 基于类：cglib
    - java字节码实现：javasist

需要了解两个类：Proxy：代理，InvocationHandler：调用处理程序

### 5.3.1 InvocationHandler

```java
//用这个类生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object object;

    //生成得到代理类
    public Object getProxy(Object object) {
        this.object = object;
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), 	object.getClass().getInterfaces(), this);
    }

    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object invoke = method.invoke(object, args);
        return invoke;
    }

    public void log(String msg) {
        System.out.println("使用了" + msg + "方法");
    }
}
```

动态代理的好处：

- 使真实角色的操作更加纯粹！不用关注一些公共的业务
- 公共业务交给代理角色！实现业务分工
- 公共业务发生拓展时，方便集中管理
- 一个动态类代理一个接口，一般对应一类业务
- 一个动态代理类可以代理多个类，只要是实现了同一个接口



# 6. AOP

## 6.1什么是AOP

面向切面编程



## 6.2 使用Spring实现Aop

导入依赖

```xml
<dependency>
    <groupId>org.aspectj</groupId>
    <artifactId>aspectjweaver</artifactId>
    <version>1.9.4</version>
</dependency>
```



方式一：使用Spring的API

```xml
    <!--注册bean-->
    <bean class="com.zanbo.service.UserServiceImpl" id="userService"/>
    <bean class="com.zanbo.log.BeforeLog" id="beforeLog"/>
    <bean class="com.zanbo.log.AfterLog" id="afterLog"/>
<!--方式一：使用Spring的API-->
<!--配置aop:需要导入aop的约束-->
<aop:config>
    <!--切入点:expression:表达式,execution(要执行的位置！)-->
    <aop:pointcut id="pointcut" expression="execution(* com.zanbo.service.UserServiceImpl.*(..))"/>
    <!--执行环绕增强-->
    <aop:advisor advice-ref="beforeLog" pointcut-ref="pointcut"/>
    <aop:advisor advice-ref="afterLog" pointcut-ref="pointcut"/>
</aop:config>
```

方法二：使用自定义类实现AOP

自定义切面：由横切关注点被模块化而成的特殊对象，即，它是一个类

```xml
<!--方法二：使用自定义类实现AOP-->
<bean class="com.zanbo.diy.DiyPoint" id="diyPoint"/>
<aop:config>
    <!--自定义切面-->
    <aop:aspect ref="diyPoint">
        <aop:pointcut id="pointcut" expression="execution(* com.zanbo.service.UserServiceImpl.*(..))"/>
        <aop:before method="before" pointcut-ref="pointcut"/>
        <aop:after method="after" pointcut-ref="pointcut"/>
    </aop:aspect>
</aop:config>
```

方法三：使用注解方式实现AOP

# 7. 整合Mybatis

