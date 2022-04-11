package com.dvomu.springcloud.feign.provider;

import com.netflix.client.http.HttpRequest;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: dvomu
 * @create: 2022-04-07
 */
@RestController
public class ProviderController {

    @GetMapping("/hello")
    public String hello(HttpRequest request){
        System.out.println("Headers=:"+request.getHttpHeaders().toString());
//        try {
//            Thread.sleep(11000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "======producer======";
    }
}
