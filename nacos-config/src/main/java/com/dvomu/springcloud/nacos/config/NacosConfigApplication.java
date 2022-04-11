package com.dvomu.springcloud.nacos.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * @author: dvomu
 * @create: 2022-04-09
 */
@SpringBootApplication
public class NacosConfigApplication {
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext context =
                SpringApplication.run(NacosConfigApplication.class, args);
//        while (true){
            String name = context.getEnvironment().getProperty("name");
            String password = context.getEnvironment().getProperty("password");
            System.err.println("name :"+name+"; password: "+password);
//            TimeUnit.SECONDS.sleep(1);
//        }
        String uid = context.getEnvironment().getProperty("user.uid");
        System.out.println(uid);
    }
}
