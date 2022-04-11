package com.dvomu.springcloud.feign.config;

import feign.Logger;
import feign.Request;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: dvomu
 * @create: 2022-04-09
 * Feign日志全局配置
 */
// @Configuration为全局配置,
// 如果想局部配置需要把@Configuration注释掉
@Configuration
public class FeignConfig {
//    @Bean
//    public FeignAutoConfiguration feignAutoConfiguration(){
//        return new FeignAutoConfiguration();
//    }

//    @Bean
//    public Request.Options options(){
//        return new Request.Options(5000,10000);
//    }
    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
