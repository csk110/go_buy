package com.buy.buygatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringCloudApplication
@EnableZuulProxy//启动网关服务
public class BuyGatewayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuyGatewayServerApplication.class, args);
    }

}
