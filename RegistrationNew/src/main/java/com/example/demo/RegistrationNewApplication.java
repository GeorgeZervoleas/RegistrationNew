package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class RegistrationNewApplication {

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RegistrationNewApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(RegistrationNewApplication.class, args);
    }

}
