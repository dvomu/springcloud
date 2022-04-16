package com.dvomu.springcloud.seata.stock.controller;

import com.dvomu.springcloud.seata.stock.service.StockService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: dvomu
 * @create: 2022-04-17
 */
@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    private StockService stockService;

    @GetMapping("/update/{productId}/{count}")
    public String update(@PathVariable("productId") int productId,@PathVariable("count") int count){
        stockService.update(productId,count);
        return "产品ID:"+productId+",库存成功扣减"+count;
    }
}
