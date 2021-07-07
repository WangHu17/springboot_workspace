package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class SpringBootQuickbuildApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootQuickbuildApplication.class, args);
    }

}
