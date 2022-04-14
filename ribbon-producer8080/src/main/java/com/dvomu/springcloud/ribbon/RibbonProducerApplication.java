package com.dvomu.springcloud.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: dvomu
 * @create: 2022-04-07
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonProducerApplication.class);
    }


}
