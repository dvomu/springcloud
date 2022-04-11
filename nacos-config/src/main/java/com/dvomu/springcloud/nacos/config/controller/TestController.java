package com.dvomu.springcloud.nacos.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: dvomu
 * @create: 2022-04-10
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${name}")
    private String name;

    @GetMapping("/test")
    public String test(){
        return name;
    }
}
