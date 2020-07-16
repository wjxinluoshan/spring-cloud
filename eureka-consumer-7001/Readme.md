- 修改负载均衡算法：
```java
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

//这个Bean是关键
    @Bean
    public IRule iRule(){
        return new RandomRule();
    }
    
```  
