- 配置在客户端
# hystrix  
- 对特定服务的调用的不可用达到一个阈值就启动断路器  
![断路器](https://www.fangzhipeng.com/img/jianshu/2279594-8dcb1f208d62046f.png)  


- feign自带熔断器  
```java
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-openfeign</artifactId>
        </dependency>
```  
简单的使用方法
```java
	@FeignClient
    /**
	 * Fallback class for the specified Feign client interface. The fallback class must
	 * implement the interface annotated by this annotation and be a valid spring bean.
	 * @return fallback class for the specified Feign client interface
	 */
	Class<?> fallback() default void.class;
```