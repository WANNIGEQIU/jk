package com.jk.air;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AirApp {
    private final static Logger LOGGER = LoggerFactory.getLogger(AirApp.class);
    public static void main(String[] args) {
        SpringApplication.run(AirApp.class,args);
        LOGGER.info("注册中心启动成功");
    }
}
