package com.serzh.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

//http://localhost:8080/swagger-ui.html
@EnableSwagger2
@SpringBootApplication
//http://javasolutionsguide.blogspot.com/2018/08/restful-api-using-spring-rest-spring.html
public class SpringBootRestJpaH2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestJpaH2Application.class, args);
    }
}
