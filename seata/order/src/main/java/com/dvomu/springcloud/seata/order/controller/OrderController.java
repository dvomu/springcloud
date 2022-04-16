package com.dvomu.springcloud.seata.order.controller;

import com.dvomu.springcloud.seata.order.pojo.Order;
import com.dvomu.springcloud.seata.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: dvomu
 * @create: 2022-04-17
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("/addOrder")
    public String addOrder(){
        Order order = new Order(10,1);
        orderService.add(order);
        return "下单成功";
    }
}
