package com.dvomu.springcloud.seata.stock;

import com.dvomu.springcloud.seata.stock.mapper.StockMapper;
import com.dvomu.springcloud.seata.stock.service.StockService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: dvomu
 * @create: 2022-04-17
 */
@SpringBootTest
public class StockTest {
    @Autowired
    StockService service;

    @Test
    public void testUpdate(){
        service.update(10,1);
    }
}
