package com.dvomu.springcloud.seata.order.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: dvomu
 * @create: 2022-04-17
 */
@FeignClient(value = "seata-stock",path = "/stock")
public interface StockService {

    @GetMapping("/update/{productId}/{count}")
    public String update(@PathVariable("productId") int productId, @PathVariable("count") int count);
}
