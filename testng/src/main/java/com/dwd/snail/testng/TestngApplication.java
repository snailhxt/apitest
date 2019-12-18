package com.dwd.snail.testng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
public class TestngApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestngApplication.class, args);
    }

}
