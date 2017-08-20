package com.eperion.udemy.msb.lab4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab4SubjectClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab4SubjectClientApplication.class, args);
    }

}
