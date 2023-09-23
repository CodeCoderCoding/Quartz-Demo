package com.supremepole.springbootquartzhelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@Import(QuartzConfig.class)
public class SpringBootQuartzHelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootQuartzHelloWorldApplication.class, args);
    }

}
