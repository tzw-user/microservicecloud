package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by 谭志为 on 2019/2/16.
 */
@SpringBootApplication
@EnableEurekaClient   //本服务启动后会自动注册进eureka服务中
@EnableCircuitBreaker //对hystrixR熔断机制的支持
public class Application_Hystrix_8001 {

    public static void main(String[] args) {

        SpringApplication.run(Application_Hystrix_8001.class,args);
    }
}
