package com.dvomu.springcloud.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: dvomu
 * @create: 2022-04-07
 */
@SpringBootApplication
public class FeignProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignProviderApplication.class);
    }
}
