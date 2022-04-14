package com.dvomu.springcloud.gateway.predicates;

import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.cloud.gateway.handler.predicate.GatewayPredicate;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.server.ServerWebExchange;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author: dvomu
 * @create: 2022-04-14
 */
@Component
public class IsAuthRoutePredicateFactory extends
        AbstractRoutePredicateFactory<IsAuthRoutePredicateFactory.Config> {


    public IsAuthRoutePredicateFactory() {
        super(IsAuthRoutePredicateFactory.Config.class);
    }

    @Override
    public Predicate<ServerWebExchange> apply(Config config) {
        return (GatewayPredicate) serverWebExchange -> config.getName().equals("xxoo");
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList("name");
    }

    /**
     * 用于接收配置文件中断言信息
     */
    @Validated
    public static class Config{
        private String name ;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
