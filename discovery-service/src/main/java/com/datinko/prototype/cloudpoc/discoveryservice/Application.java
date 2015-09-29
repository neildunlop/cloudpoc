package com.datinko.prototype.cloudpoc.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Application {

    public static void main(String[] args) {

        // Tell Boot to look for discovery-service.yml
        System.setProperty("spring.config.name", "discovery-service");
        SpringApplication.run(Application.class, args);
    }
}
