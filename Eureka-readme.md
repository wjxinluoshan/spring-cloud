- [eureka常用配置](https://www.bbsmax.com/A/QV5ZLMRVzy/)  

- eureka server 集群后，一客户端注册，则这个注册信息会在集群中
进行传播。

# server的自我保护  
- client间接性的向server发送心跳  
- server设置client向其和上次发送心跳间的时间间隔  
- server是否启动自我保护，倘若启动了自我保护，则关闭过期来避免危险（leaseExpirationDurationInSeconds）  




# 服务治理组件  
1. 服务注册与发现  
2. 服务消费  
    - RestTemplate  
    - Feign
3. 负载均衡  
    - ribbon
4. 熔断器  
    - Hystrix
5. 智能路由  

6. 配置管理  




- register: 客户端向服务端注册数据，并提供元数据信息  
- renew： 客户端向服务端续约  
- fetch registries: 



