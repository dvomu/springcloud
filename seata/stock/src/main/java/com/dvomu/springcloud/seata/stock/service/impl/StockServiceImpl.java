package com.dvomu.springcloud.seata.stock.service.impl;

import com.dvomu.springcloud.seata.stock.mapper.StockMapper;
import com.dvomu.springcloud.seata.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: dvomu
 * @create: 2022-04-17
 */
@Service
public class StockServiceImpl implements StockService {

    @Autowired
    StockMapper stockMapper;

    @Override
    public void update(int productId,int count) {
        stockMapper.update(productId,count);
    }
}
