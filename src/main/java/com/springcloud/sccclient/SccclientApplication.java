package com.springcloud.sccclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.context.support.StandardServletEnvironment;

@SpringBootApplication
public class SccclientApplication {

    public static void main(String[] args) {

//        ConfigurableEnvironment environment = new StandardServletEnvironment();
//        environment.setActiveProfiles("dev");
//        new SpringApplicationBuilder(SccclientApplication.class)
//                .environment(environment)
//                .build()
//                .run(args);
        SpringApplication.run(SccclientApplication.class, args);
    }

}
