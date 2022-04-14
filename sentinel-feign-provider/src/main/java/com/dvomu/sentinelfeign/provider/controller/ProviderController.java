package com.dvomu.sentinelfeign.provider.controller;

import com.netflix.client.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: dvomu
 * @create: 2022-04-07
 */
@RestController
@RequestMapping("/pc")
public class ProviderController {

    @GetMapping("/getData")
    public String getData(){
//        int a = 1/0;
        return "provider sussess";
    }

    @GetMapping("/testFilter")
    public String testFilter(@PathVariable(value = "name",required = false) String name){
        return "name="+name;
    }
}
