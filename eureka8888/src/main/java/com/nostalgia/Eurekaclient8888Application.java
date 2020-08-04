package com.nostalgia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Eurekaclient8888Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaclient8888Application.class, args);
    }

}
