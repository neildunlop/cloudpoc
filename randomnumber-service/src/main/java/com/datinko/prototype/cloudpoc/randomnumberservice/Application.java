package com.datinko.prototype.cloudpoc.randomnumberservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
public class Application {

    public static void main(String[] args) {

        System.setProperty("spring.config.name", "randomnumber-service");
        SpringApplication.run(Application.class, args);
    }
}
