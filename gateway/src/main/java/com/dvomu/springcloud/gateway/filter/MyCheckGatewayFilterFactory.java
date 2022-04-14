package com.dvomu.springcloud.gateway.filter;

import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

/**
 * @author: dvomu
 * @create: 2022-04-14
 */
@Component
public class MyCheckGatewayFilterFactory extends AbstractGatewayFilterFactory<MyCheckGatewayFilterFactory.Config> {

    public MyCheckGatewayFilterFactory(){
        super(MyCheckGatewayFilterFactory.Config.class);
    }
    @Override
    public List<String> shortcutFieldOrder(){
        return Arrays.asList("value");
    }
    @Override
    public GatewayFilter apply(MyCheckGatewayFilterFactory.Config config) {
        return (exchange, chain) -> {
            String name = exchange.getRequest().getQueryParams().getFirst("name");
            if(StringUtils.isNotBlank(name)
                && config.getValue().equals(name)){
                exchange.getResponse().setStatusCode(HttpStatus.NOT_FOUND);
                return exchange.getResponse().setComplete();
            }
            return chain.filter(exchange);
        };
    }

    public static class Config{
        private String value;

        public String getValue() {
            return value;
        }
        public void setValue(String value) {
            this.value = value;
        }
    }
}
