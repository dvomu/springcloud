package com.dvomu.sentinelfeign.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author: dvomu
 * @create: 2022-04-12
 */
@RestController
public class HelloController {


    @GetMapping("/user")
    public String testQPS(String id){
        return "ok";
    }

    @GetMapping("/testThread")
    public String testThread(String id) throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        return "ok";
    }

    @GetMapping("/testEx")
    public String testEx() {
        return "ok";
    }

    @GetMapping("/getComments")
    public String getComments() {
        return "ok";
    }

    @GetMapping("/getItem")
    public String getItem() {
        return "ok";
    }
    @GetMapping("/test1")
    public String test1() {
        return "ok";
    }
    @GetMapping("/test2")
    public String test2() {
        return "ok";
    }
    @GetMapping("/test3")
    public String test3() {
        return "ok";
    }
    @GetMapping("/test4")
    public String test4() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        return "ok";
    }

    @GetMapping("/getById/{id}")
    public String getById(@PathVariable("id") Integer id) {
        return "ok---id="+id;
    }

}
