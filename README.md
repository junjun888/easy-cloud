# easy-cloud
关于 spring-cloud 的一个简单脚手架

[TOC]

## 版本 和 要求

- easy-cloud , 及子工程依赖于 Finchley.RELEASE
- 需要安装 zipkin 服务, boot2.0 以后建议使用 自建 zipkin 服务.
- 需要安装 rabbitmq 服务, springcloud-bus 中使用 rabbitmq 作为消息中间件

## 已实现
----

- 动态路由, 实现技术 eueka server & client + config server & client + rabbitmq + zuul

- 链路追踪， 实现技术 feign + zipkin

----

## TODO

----

- 服务监控
- 认证授权服务
- sql 监控
- boot 脚手架平台
----

