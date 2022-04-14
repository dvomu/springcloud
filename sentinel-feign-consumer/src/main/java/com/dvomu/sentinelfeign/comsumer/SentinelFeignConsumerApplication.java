package com.dvomu.sentinelfeign.comsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: dvomu
 * @create: 2022-04-13
 */
@SpringBootApplication
@EnableFeignClients
public class SentinelFeignConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SentinelFeignConsumerApplication.class);
    }
}
