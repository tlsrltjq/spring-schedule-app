package com.example.springscheduleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringScheduleAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringScheduleAppApplication.class, args);
    }

}
