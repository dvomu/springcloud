package com.dvomu.springcloud.gateway.config;

import com.alibaba.csp.sentinel.adapter.gateway.sc.callback.BlockRequestHandler;
import com.alibaba.csp.sentinel.adapter.gateway.sc.callback.GatewayCallbackManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import javax.annotation.PostConstruct;
import java.util.HashMap;

/**
 * @author: dvomu
 */
@Configuration
public class GatewayConfig {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @PostConstruct
    public void init(){
        BlockRequestHandler handler = new BlockRequestHandler() {
            @Override
            public Mono<ServerResponse> handleRequest(ServerWebExchange exchange, Throwable t) {
                logger.error("异常信息:"+t);
                HashMap<String, String> result = new HashMap<>();
                result.put("code", HttpStatus.TOO_MANY_REQUESTS.toString());
                result.put("msg","限流了");

                //自定义异常处理
                return ServerResponse.status(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromValue(result));
            }
        };
        GatewayCallbackManager.setBlockHandler(handler);
    }
}
