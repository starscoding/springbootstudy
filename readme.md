# 关于dev-tools

关闭状态报告
spring.devtools.restart.log-condition-evaluation-delta=false

指定文件或目录改变不触发重启
spring.devtools.restart.exclude=static/**,public/**

关闭重启
spring.devtools.restart.enabled

配置特定的文件来触发
spring.devtools.restart.trigger-file=.reloadtrigger

Customizing the Restart Classloader
restart.exclude.companycommonlibs=/mycorp-common-[\\w-]+\.jar
restart.include.projectcommon=/mycorp-myproj-[\\w-]+\.jar

LiveReload
spring.devtools.livereload.enabled


# 关于Log Levels
-- TRACE, DEBUG, INFO, WARN, ERROR, FATAL, or OFF
logging.level.root=WARN
logging.level.org.springframework.web=DEBUG
logging.level.org.hibernate=ERROR

Logging System	Customization
Logback

logback-spring.xml, logback-spring.groovy, logback.xml, or logback.groovy

Log4j2

log4j2-spring.xml or log4j2.xml

JDK (Java Util Logging)

logging.properties

# spring mvc 配置
spring.mvc.static-path-pattern=/resources/**