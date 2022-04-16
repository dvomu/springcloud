package com.dvomu.springcloud.seata.order.service;

import com.dvomu.springcloud.seata.order.pojo.Order;

/**
 * @author: dvomu
 * @create: 2022-04-17
 */
public interface OrderService {
    void add(Order order);
}
