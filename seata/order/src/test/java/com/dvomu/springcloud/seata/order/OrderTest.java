package com.dvomu.springcloud.seata.order;

import com.dvomu.springcloud.seata.order.pojo.Order;
import com.dvomu.springcloud.seata.order.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: dvomu
 * @create: 2022-04-17
 */
@SpringBootTest
public class OrderTest {
    @Autowired
    private OrderService orderService;

    @Test
    public void testAdd(){
        Order order = new Order();
        order.setProductId(10);
        order.setTotalAmount(1);
        order.setStatus(1);
        orderService.add(order);
    }
}
