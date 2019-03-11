package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by 谭志为 on 2019/2/16.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com"})
@ComponentScan("com")
public class Application_feign {

    public static void main(String[] args) {
        SpringApplication.run(Application_feign.class,args);
    }
}
