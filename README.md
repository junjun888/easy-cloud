# easy-cloud
关于 spring-cloud 的一个简单脚手架

[TOC]

## 缘起

> 一直想学习 微服务 分布式 的相关知识，然后发现 springcloud 的全家桶, 也看了很多开源 脚手架但是看上去都很复杂， 于是自己就写一个 加深理解，不断迭代

## 版本 和 要求

- easy-cloud , 及子工程依赖于的 spring-cloud 版本为 Finchley.RELEASE
- 需要安装 zipkin 服务, boot2.0 以后建议使用 jar 包的形式启动 zipkin.
- 需要安装 rabbitmq 服务, springcloud-bus 中使用 rabbitmq 作为消息中间件

## 已实现
----

- maven 多模块项目

- 动态路由, 实现技术 eueka server & client + config server & client + rabbitmq + zuul + git

- 链路追踪, 实现技术 feign + zipkin
> 参考链接： https://windmt.com/2018/04/24/spring-cloud-12-sleuth-zipkin/

- 服务监控, 实现技术 springboot admin 2.0
> 参考链接： https://windmt.com/2018/05/22/spring-boot-admin-guide/

- 接口监控, Hystrix Dashboard来实时查看接口的运行状态和调用频率等。

----

## TODO

----

- 认证授权服务 (用户调用鉴权（网关实现） + 服务间调用鉴权（自定义 starter 去实现, 优先）)
> 参考链接：https://blog.csdn.net/u011282930/article/details/80131534

- boot 脚手架平台

----

## 项目地址

> https://github.com/junjun888/easy-cloud