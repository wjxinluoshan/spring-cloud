# Config  
[click the link](https://www.fangzhipeng.com/springcloud/2018/08/06/sc-f6-config.html)  

> 使用配置服务来保存各个服务的配置文件  

# 分布式配置中心组件：spring cloud config  

 ## 存放位置
 - 本地  
 - 远程Git仓库  
 
 - 配置服务
 ```
spring.application.name=config-server
server.port=8888
# 这个uri就是git仓库的根uri
spring.cloud.config.server.git.uri=https://github.com/***/***/
# 根uri下的某一文件路径
spring.cloud.config.server.git.searchPaths=respo
spring.cloud.config.label=master  # 仓库分支
spring.cloud.config.server.git.username=  # 仓库用户名
spring.cloud.config.server.git.password= # 仓库用户密码
```  
![image.png](https://upload-images.jianshu.io/upload_images/18756962-6287abbf3b2fab99.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)  

- 配置客户端  
    - 客户端的resource文件为 bootstrap.yml  ，
    因为在一些配置加载的优先级别比较高。
    
    - 客户端使用 bootstrap.yml加载完成数据后，即可在application.yml中使用el表达式，
    来引用变量  
    
 # 高可用的分布式配置中心
 ![](https://www.fangzhipeng.com/img/jianshu/2279594-babe706075d72c58.png)  
 
 - 将config server注册进eureka服务注册中心  
 - 将config client注册金eureka服务注册中心  
  