package com.kuan.sentinel.config;

import com.alibaba.cloud.sentinel.annotation.SentinelRestTemplate;
import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import com.kuan.sentinel.exception.ExceptionUtils;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SentinelConfig {

    /**
     * 支持@SentinelResource配置
     * @return
     */
    @Bean
    public SentinelResourceAspect sentinelResourceAspect() {
        return new SentinelResourceAspect();
    }

    @Bean
    @LoadBalanced
    @SentinelRestTemplate(blockHandler = "blockHandler", blockHandlerClass = ExceptionUtils.class)
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
