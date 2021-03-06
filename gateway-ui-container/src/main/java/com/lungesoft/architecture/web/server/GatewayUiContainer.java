package com.lungesoft.architecture.web.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GatewayUiContainer {

    public static void main(String[] args) {
        SpringApplication.run(GatewayUiContainer.class, args);
    }

}
