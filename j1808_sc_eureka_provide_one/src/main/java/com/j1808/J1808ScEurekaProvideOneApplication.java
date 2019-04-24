package com.j1808;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class J1808ScEurekaProvideOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1808ScEurekaProvideOneApplication.class, args);
    }

}
