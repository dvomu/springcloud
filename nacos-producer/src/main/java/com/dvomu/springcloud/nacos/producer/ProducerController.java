package com.dvomu.springcloud.nacos.producer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: dvomu
 * @create: 2022-04-07
 */
@RestController
public class ProducerController {

    @GetMapping("/hello")
    public String hello(){
        return "======producer======";
    }
}
