package com.buy.buycartservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
public class BuyCartServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuyCartServiceApplication.class, args);
    }

}
