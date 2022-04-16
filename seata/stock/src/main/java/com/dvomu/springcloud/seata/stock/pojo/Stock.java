package com.dvomu.springcloud.seata.stock.pojo;

/**
 * @author: dvomu
 * @create: 2022-04-17
 */
public class Stock {
    private Integer id;
    private Integer productId;
    private Integer count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
