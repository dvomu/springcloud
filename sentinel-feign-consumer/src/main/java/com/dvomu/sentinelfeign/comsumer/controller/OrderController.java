package com.dvomu.sentinelfeign.comsumer.controller;

import com.dvomu.sentinelfeign.comsumer.feign.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: dvomu
 * @create: 2022-04-13
 */
@RestController
public class OrderController {

    @Autowired
    ProviderService providerService;

    @GetMapping("/getOrder")
    public String getOrder(){
        return providerService.getData();
    }
}
