package com.buy.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
@MapperScan("com.buy.user.mapper")
public class BuyUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuyUserServiceApplication.class, args);
    }

}
