package com.dvomu.springcloud.seata.stock.service;

import com.dvomu.springcloud.seata.stock.pojo.Stock;

/**
 * @author: dvomu
 * @create: 2022-04-17
 */
public interface StockService {
    void update(int productId,int count);
}
