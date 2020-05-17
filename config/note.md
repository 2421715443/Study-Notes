## 常用注解
- @Autowired  
自动装配通过先类型，后名字（ByName）
- @Resource  
自动装配通过先名字，后类型
- @Nullable  
允许标记参数为空
- @Component
组件：注解在类上，声明这个类被spring管理了此注解需配合配置文件中扫描器使用



```properties
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=******
spring.datasource.password=******
spring.datasource.url=jdbc:mysql://localhost:3306/******?useSSL=false&serverTimezone=UTC
server.port=8080
```