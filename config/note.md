## 常用注解
- @Autowired  
自动装配通过先类型，后名字（ByName）

- @Resource  
自动装配通过先名字，后类型

- @Nullable  
允许标记参数为空

- @Component(@Repository,@Service,@Controller)
组件：注解在类上，声明这个类被spring管理了此注解需配合配置文件中扫描器使用


## 常用配置文件
```properties
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=******
spring.datasource.password=******
spring.datasource.url=jdbc:mysql://localhost:3306/******?useSSL=true&serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=UTF-8
server.port=8080
```

## maven静态资源导出
```xml
<build>
    <resources>
        <resource>
            <directory>src/main/resources</directory>
            <includes>
                <include>**/*.properties</include>
                <include>**/*.xml</include>
            </includes>
            <filtering>true</filtering>
        </resource>
        <resource>
            <directory>src/main/java</directory>
            <includes>
                <include>**/*.properties</include>
                <include>**/*.xml</include>
            </includes>
            <filtering>true</filtering>
        </resource>
    </resources>
</build>
```


## mybatis
configuration核心配置文件
```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">
<!--configuration核心配置文件-->
<configuration>
    <environments default="development">
        <environment id="development">
            <transactionManager type="JDBC"/>
            <dataSource type="POOLED">
                <property name="driver" value="com.mysql.cj.jdbc.Driver"/>
                <property name="url" value="jdbc:mysql://localhost:3306/mybatis?serverTimezone=GMT%2B8&amp;useSSL=true&amp;useUnicode=true&amp;characterEncoding=UTF-8"/>
                <property name="username" value="root"/>
                <property name="password" value="021403"/>
            </dataSource>
        </environment>
    </environments>

    <mappers>
        <mapper resource="com/zanbo/dao/mapper/UserMapper.xml"/>
    </mappers>
</configuration>
```
Mapper替代接口实现类
```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="">

</mapper>
```

## Log4j配置文件
```properties
#将等级为DEBUG的日志信息输出到console和file中
log4j.rootLogger=DEBUG,console,file
#控制台输出的相关设置
log4j.appender.console=org.apache.log4j.ConsoleAppender
log4j.appender.console.Target=System.out
log4j.appender.console.Threshold=DEBUG
log4j.appender.console.layout=org.apache.log4j.PatternLayout
log4j.appender.console.layout.ConversionPattern=[%c]-%m%n
#文件输出的相关设置
log4j.appender.file=org.apache.log4j.RollingFileAppender
log4j.appender.file.File=./log/zanbo.log
log4j.appender.file.MMaxFileSize=10mb
log4j.appender.file.Threshold=DEBUG
log4j.appender.file.layout=org.apache.log4j.PatternLayout
log4j.appender.file.layout.ConversionPattern=[%p][%d{yy-MM-dd}][%c]%m%n
#日志输出级别
log4j.logger.org.mybatis=DEBUG
log4j.logger.java.sql=DEBUG
log4j.logger.java.sql.Statement=DEBUG
log4j.logger.java.sql.ResultSet=DEBUG
log4j.logger.java.sql.PreparedStatement=DEBUG
```

```properties
log4j.rootLogger=DEBUG,console,logfile
log4j.addivity.org.apache=true
#ConsoleAppender，控制台输出
#FileAppender，文件日志输出
#SMTPAppender，发邮件输出日志
#SocketAppender，Socket 日志
#NTEventLogAppender，Window NT 日志
#SyslogAppender，
#JMSAppender，
#AsyncAppender，
#NullAppender
#文件输出：RollingFileAppender
#log4j.rootLogger = DEBUG,logfile
log4j.appender.logfile = org.apache.log4j.RollingFileAppender
log4j.appender.logfile.Threshold = DEBUG
# 输出以上的 INFO 信息
log4j.appender.logfile.File = INFO_log.html
#保存 log 文件路径

log4j.appender.logfile.Append = true
# 默认为 true，添加到末尾，false 在每次启动时进行覆盖
log4j.appender.logfile.MaxFileSize = 1MB
# 一个 log 文件的大小，超过这个大小就又会生成 1 个日志 # KB ，MB，GB
log4j.appender.logfile.MaxBackupIndex = 3
# 最多保存 3 个文件备份
log4j.appender.logfile.layout = org.apache.log4j.HTMLLayout
# 输出文件的格式
log4j.appender.logfile.layout.LocationInfo = true
#是否显示类名和行数

```