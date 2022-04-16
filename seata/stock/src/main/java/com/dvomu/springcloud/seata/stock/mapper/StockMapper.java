package com.dvomu.springcloud.seata.stock.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @author: dvomu
 * @create: 2022-04-17
 */
@Mapper
public interface StockMapper {

    @Update("UPDATE stock SET `count` = count-#{count} WHERE `product_id` = #{productId}")
    void update(@Param("productId") int productId, @Param("count")int count);
}
