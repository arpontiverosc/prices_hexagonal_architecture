package com.inditex.prices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.inditex.prices.out.jpa")
@EntityScan(basePackages = {"com.inditex.prices.out.jpa"})
@SpringBootApplication(scanBasePackages = {"com.inditex.prices"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}