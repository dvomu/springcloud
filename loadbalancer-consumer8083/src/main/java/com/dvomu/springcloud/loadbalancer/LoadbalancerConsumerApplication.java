package com.dvomu.springcloud.loadbalancer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author: dvomu
 * @create: 2022-04-07
 */
@SpringBootApplication
@EnableDiscoveryClient
//@RibbonClients(value={
//     @RibbonClient(name = "ribbon-producer",configuration = RibbonRandomRuleConfig.class)
//})
public class LoadbalancerConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(LoadbalancerConsumerApplication.class);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
