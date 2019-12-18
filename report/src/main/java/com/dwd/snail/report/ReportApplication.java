package com.dwd.snail.report;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class ReportApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReportApplication.class, args);
    }

}
