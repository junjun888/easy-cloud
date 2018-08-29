# easy-cloud
关于 spring-cloud 的一个简单脚手架

[TOC]

## 版本 和 要求

- easy-cloud , 及子工程依赖于的 spring-cloud 版本为 Finchley.RELEASE
- 需要安装 zipkin 服务, boot2.0 以后建议使用 jar 包的形式启动 zipkin.
- 需要安装 rabbitmq 服务, springcloud-bus 中使用 rabbitmq 作为消息中间件

## 已实现
----

- 动态路由, 实现技术 eueka server & client + config server & client + rabbitmq + zuul

- 链路追踪, 实现技术 feign + zipkin
> 参考链接： https://windmt.com/2018/04/24/spring-cloud-12-sleuth-zipkin/

- 服务监控, 实现技术 springboot admin 2.0
> 参考链接： https://windmt.com/2018/05/22/spring-boot-admin-guide/



----

## TODO

----

- 接口监控, Hystrix Dashboard来实时查看接口的运行状态和调用频率等。

- 认证授权服务 (用户调用鉴权（网关实现） + 服务间调用鉴权（自定义 starter 去实现, 优先）)
> 参考链接：https://blog.csdn.net/u011282930/article/details/80131534

- boot 脚手架平台

----

