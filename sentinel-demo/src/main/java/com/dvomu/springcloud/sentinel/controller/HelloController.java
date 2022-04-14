package com.dvomu.springcloud.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.dvomu.springcloud.sentinel.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author: dvomu
 * @create: 2022-04-12
 */
@RestController
public class HelloController {

    @Autowired
    ProductService productService;

    @GetMapping("/user")
    @SentinelResource(value = "user",blockHandler = "blockHandlerForTestQPS")
    public String testQPS(String id){
        return "ok";
    }

    @GetMapping("/testThread")
    @SentinelResource(value = "testThread",blockHandler = "blockHandlerForTestQPS")
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
        productService.getProduct();
        return "ok";
    }
    @GetMapping("/test2")
    public String test2() {
        productService.getProduct();
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
    @SentinelResource(value = "getById",blockHandler = "hotBlockHandler")
    public String getById(@PathVariable("id") Integer id) {
        return "ok---id="+id;
    }

    public String hotBlockHandler(@PathVariable("id") Integer id,BlockException ex){
        ex.printStackTrace();
        return "已被热点流控";
    }

    public String blockHandlerForTestQPS(String id, BlockException e){
        e.printStackTrace();
        return "已被流控";
    }

}
