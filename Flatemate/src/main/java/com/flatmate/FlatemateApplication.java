package com.flatmate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlatemateApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlatemateApplication.class, args);
        System.out.println("Hello, Flatmate Application is running!");
    }
}