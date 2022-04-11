package com.dvomu.springcloud.feign.consumer.feign;

import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: dvomu
 * @create: 2022-04-09
 */
@FeignClient(name="feign-provider"/*,configuration = FeignConfig.class*/)
public interface FeignService {

    @GetMapping("/hello")
    public String hello();

//    @RequestLine("GET /hello")
//    public String hello();
}
