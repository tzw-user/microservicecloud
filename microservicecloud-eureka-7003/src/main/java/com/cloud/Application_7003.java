package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by 谭志为 on 2019/2/16.
 */
@SpringBootApplication
@EnableEurekaServer     //EurekaServer服务器端启动类,接受其它微服务注册进来
public class Application_7003 {
    public static void main(String[] args) {
        SpringApplication.run(Application_7003.class,args);
    }
}
