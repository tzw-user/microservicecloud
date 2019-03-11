package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by 谭志为 on 2019/2/16.
 */
@SpringBootApplication
@EnableEurekaClient   //本服务启动后会自动注册进eureka服务中
public class Application_8002 {

    public static void main(String[] args) {

        SpringApplication.run(Application_8002.class,args);
    }
}
