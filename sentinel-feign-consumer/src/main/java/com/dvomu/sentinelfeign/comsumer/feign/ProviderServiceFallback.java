package com.dvomu.sentinelfeign.comsumer.feign;

import org.springframework.stereotype.Component;

/**
 * @author: dvomu
 * Feign异常处理类需实现远程调用接口
 */
@Component
public class ProviderServiceFallback implements ProviderService{
    @Override
    public String getData() {
        return "ProviderService.getData()被降级了";
    }
}
