package com.example.changingvaluedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestChangingValueDemoApplication {

    public static void main(String[] args) {
        SpringApplication.from(ChangingValueDemoApplication::main).with(TestChangingValueDemoApplication.class).run(args);
    }

}
