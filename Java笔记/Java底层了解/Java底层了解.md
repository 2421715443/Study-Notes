# Java底层了解

## 1.Java虚拟机（JVM）

---

###1.1 Java虚拟机的组成

----

JVM由三部分组成

> 类装载子系统
>
> 字节码执行引擎
>
> 运行时数据区（数据模型）包括
>
> 1. 堆
> 2. 栈（线程）
> 3. 本地方法区
> 4. 方法区（元空间）
> 5. 程序计数器

![JVM](./assets/SharedScreenshot.jpg)



### 栈

---

栈区域也可以称作线程区域，栈会为线程内的方法创建栈帧，栈FILO(first in last out)先进后出

> 局部变量表
>
> 操作数栈
>
> 动态链接‘
>
> 方法出口

JVM指令

[JVM指令](https://www.cnblogs.com/lsy131479/p/11201241.html)