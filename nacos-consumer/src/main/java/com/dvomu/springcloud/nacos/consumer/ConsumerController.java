package com.dvomu.springcloud.nacos.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: dvomu
 * @create: 2022-04-07
 */
@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String test(){
        System.out.println("=====Consumer=====");
        return restTemplate.getForObject("http://nacos-producer:8081/hello",String.class);
    }
}
