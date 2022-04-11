package com.dvomu.springcloud.feign.intercptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: dvomu
 * @create: 2022-04-09
 */
public class CustIntercptor implements RequestInterceptor {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public void apply(RequestTemplate requestTemplate) {
        //如果存在将覆盖
        requestTemplate.header("aaa","bbb");
//        requestTemplate.query("id","abc");
//        requestTemplate.uri("/123");
        logger.info("自定义拦截器");
    }
}
