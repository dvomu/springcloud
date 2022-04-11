package com.dvomu.springcloud.feign.consumer.controller;

import com.dvomu.springcloud.feign.consumer.feign.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: dvomu
 * @create: 2022-04-09
 */
@RestController
public class FeignConsumerController {
    @Autowired
    private FeignService feignService;

    @GetMapping("/helloFeign")
    public String hello(){
//        new Thread(()->{
//            for(int i=1;i<100;i++) {
//                try {
//                    Thread.sleep(1000);
//                    System.out.println(i);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//
//        }).start();

        return feignService.hello();
    }
}
