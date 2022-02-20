package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Clock;
import java.time.LocalDateTime;

@SpringBootApplication
public class Demo4Application {


    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now(Clock.systemDefaultZone());
        System.out.println(localDateTime);
    }

}
