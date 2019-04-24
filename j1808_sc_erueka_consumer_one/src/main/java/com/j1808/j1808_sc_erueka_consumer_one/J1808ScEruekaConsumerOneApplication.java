package com.j1808.j1808_sc_erueka_consumer_one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication
@EnableDiscoveryClient//告诉注册中心 该服务是消费者
@RibbonClients //使用ribbion、负载均衡

public class J1808ScEruekaConsumerOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1808ScEruekaConsumerOneApplication.class, args);
    }

}
