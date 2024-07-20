package com.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
public class stockApplication {

    public static void main(String[] args) {
        SpringApplication.run(stockApplication.class, args);
    }

}