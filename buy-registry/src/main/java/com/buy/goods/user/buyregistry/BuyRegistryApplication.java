package com.buy.goods.user.buyregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BuyRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuyRegistryApplication.class, args);
    }

}
