package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by 谭志为 on 2019/2/16.
 */
@SpringBootApplication
@EnableEurekaClient
public class Application_80 {

    public static void main(String[] args) {
        SpringApplication.run(Application_80.class,args);
    }
}
