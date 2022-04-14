package com.dvomu.springcloud.sentinel.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.stereotype.Service;

/**
 * @author: dvomu
 * @create: 2022-04-13
 */
@Service
public class ProductService {
    @SentinelResource(value = "getProduct",blockHandler = "blockHandlerGetProduct")
    public String getProduct(){
        return "success";
    }

    public String blockHandlerGetProduct(BlockException e){
        e.printStackTrace();
        return "已被流控";
    }
}
