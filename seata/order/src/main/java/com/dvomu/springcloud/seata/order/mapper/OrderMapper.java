package com.dvomu.springcloud.seata.order.mapper;

import com.dvomu.springcloud.seata.order.pojo.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: dvomu
 * @create: 2022-04-17
 */
@Mapper
public interface OrderMapper {

    @Insert("INSERT INTO `order` (`product_id`, `total_amount`, `status`) VALUES (#{productId},#{totalAmount},#{status})")
    void add(Order order);
}
