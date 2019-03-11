package com.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 谭志为 on 2019/2/16.
 * 配置类
 */
@Configuration
public class ConfigBean {

    /**
     * httpclient的封装
     * @return
     */
    @Bean
    @LoadBalanced //默认使用轮询算法
    public RestTemplate getRestTemplate(){

        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){

        return new RandomRule();//用于指定其他其中轮询算法,ribbon有7种默认负载算法
    }

}
