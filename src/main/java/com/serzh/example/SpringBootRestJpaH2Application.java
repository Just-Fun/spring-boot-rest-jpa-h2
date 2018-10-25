package com.serzh.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class SpringBootRestJpaH2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestJpaH2Application.class, args);
    }
}
