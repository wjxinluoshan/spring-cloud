- [eureka常用配置](https://www.bbsmax.com/A/QV5ZLMRVzy/)  
# server的自我保护  
- client间接性的向server发送心跳  
- server设置client向其和上次发送心跳间的时间间隔  
- server是否启动自我保护，倘若启动了自我保护，则关闭过期来避免危险（leaseExpirationDurationInSeconds）  
