# springcloud-health
实战spring cloud   . 拉勾教育中的微服务实战篇


# 结构目录说明
- config-server 配置中心
- device-service设备管理服务
- eureka-server
- nacos-server(未实现)注册中心
- zuul-server
- gateway-server(当前使用)网关中心
- intervention-service健康干预服务
- user-service用户服务

# 问题

- 在服务启动网关的时候, 由于gateway版本的问题, 启动一直报错, 现在直接把版本提升到2.3.0 Springboot和
Springcloud Hoxton.SR9 .具体的错误是本地一直找不到webflux