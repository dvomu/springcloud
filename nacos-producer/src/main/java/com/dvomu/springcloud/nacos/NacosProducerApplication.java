package com.dvomu.springcloud.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author: dvomu
 * @create: 2022-04-07
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosProducerApplication.class);
    }
}
