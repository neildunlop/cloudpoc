package com.datinko.prototype.cloudpoc.configurationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Neil on 29/09/2015.
 */
@EnableAutoConfiguration
@EnableConfigServer // important!!
@ComponentScan
//@EnableDiscoveryClient
//does this need to register with Eureka?  Depends on the way we do it!
public class Application {

    public static void main(String[] args) {

        System.setProperty("spring.config.name", "configuration-service");
        SpringApplication.run(Application.class, args);
    }
}