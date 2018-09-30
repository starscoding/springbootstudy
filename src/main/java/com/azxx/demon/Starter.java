package com.azxx.demon;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @SpringBootApplication 包含了三个特点：
 *
 * @EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism
 * @ComponentScan: enable @Component scan on the package where the application is located (see the best practices)
 * @Configuration: allow to register extra beans in the context or import additional configuration classes
 *
 */
@SpringBootApplication // 等同于 @EnableAutoConfiguration @ComponentScan @Configuration
@ComponentScan(basePackages = {
        "com.azxx.demon.configuration",
        "com.azxx.demon.controller",
        "com.azxx.demon.service"})
public class Starter {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(Starter.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
//        SpringApplication.run(Application.class,args);
    }
}
