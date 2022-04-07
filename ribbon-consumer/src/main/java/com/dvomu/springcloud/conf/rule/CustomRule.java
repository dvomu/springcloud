package com.dvomu.springcloud.conf.rule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author: dvomu
 * @create: 2022-04-08
 * 自定义负载均衡策略
 */
public class CustomRule extends AbstractLoadBalancerRule {
    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    @Override
    public Server choose(Object o) {
        // 获取当前请求服务的实例
        ILoadBalancer loadBalancer = this.getLoadBalancer();
        List<Server> reachableServers = loadBalancer.getReachableServers();
        if (reachableServers != null && reachableServers.size() > 0) {
            //根据当前producer服务数量随机返回
            int random = ThreadLocalRandom.current().nextInt(reachableServers.size());
            Server server = reachableServers.get(random);
            return server.isAlive() ? server : null;
        }
        return null;
    }
}
