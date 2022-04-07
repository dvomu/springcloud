package com.dvomu.springcloud.conf;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: dvomu
 * @create: 2022-04-08
 */
@Configuration
public class RibbonRandomRuleConfig {

    //方法名一定要叫iRule
    @Bean
    public IRule iRule(){
        return new RandomRule();
    }
}
