package com.dvomu.springcloud.seata.order.service.impl;

import com.dvomu.springcloud.seata.order.api.StockService;
import com.dvomu.springcloud.seata.order.mapper.OrderMapper;
import com.dvomu.springcloud.seata.order.pojo.Order;
import com.dvomu.springcloud.seata.order.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

/**
 * @author: dvomu
 * @create: 2022-04-17
 */
@Service
public class OrderServiceImpl implements OrderService {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private StockService stockService;

//    @Transactional(rollbackFor = Exception.class)
    @GlobalTransactional
    @Override
    public void add(Order order) {
        orderMapper.add(order);
        logger.info("订单生成成功");

        String result = stockService.update(order.getProductId(), order.getTotalAmount());
        logger.info(result);

        int a = 1/0;

    }
}
