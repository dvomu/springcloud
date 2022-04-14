package com.dvomu.sentinelfeign.comsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: dvomu
 * ProviderServiceFallback 为自定义降级处理类
 */
@FeignClient(value = "sentinel-feign-privider",path = "/pc"
        ,fallback = ProviderServiceFallback.class)
public interface ProviderService {
    @GetMapping("/getData")
    public String getData();
}
