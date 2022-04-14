package com.dvomu.springcloud.sentinel.exception;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import com.alibaba.csp.sentinel.slots.system.SystemBlockException;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: dvomu
 * @create: 2022-04-13
 */

@Component
public class MyBlockExceptionHandler implements BlockExceptionHandler {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public void handle(HttpServletRequest req, HttpServletResponse resp,
                       BlockException e) throws Exception {
        // e.getRule():资源,规则的详细信息
        logger.info("BlockException:"+e.getRule());
        //构造返回信息
        ObjectMapper mapper = new ObjectMapper();
        String strjson = "";
        if(e instanceof FlowException){
            strjson = "{\"code\":101,\"msg\":\"接口限流了\"}";
        }else if(e instanceof DegradeException){
            strjson = "{\"code\":102,\"msg\":\"服务降级了\"}";
        }else if(e instanceof ParamFlowException){
            strjson = "{\"code\":103,\"msg\":\"热点参数限流了\"}";
        }else if(e instanceof SystemBlockException){
            strjson = "{\"code\":104,\"msg\":\"触发系统保护规则了\"}";
        }else if(e instanceof AuthorityException){
            strjson = "{\"code\":105,\"msg\":\"授权规则未通过\"}";
        }

        resp.setStatus(500);
        resp.setCharacterEncoding("utf-8");
        resp.setContentType(MediaType.APPLICATION_JSON_VALUE);
        mapper.writeValue(resp.getWriter(),JSON.parse(strjson));
    }
}
