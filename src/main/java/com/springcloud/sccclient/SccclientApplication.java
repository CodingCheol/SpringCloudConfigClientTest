package com.springcloud.sccclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.web.context.support.StandardServletEnvironment;

import javax.security.auth.login.Configuration;

@SpringBootApplication
public class SccclientApplication {

    public static void main(String[] args) {

        ConfigurableEnvironment environment = new StandardServletEnvironment();
        environment.setActiveProfiles("dev");
        new SpringApplicationBuilder(SccclientApplication.class)
                .environment(environment)
                .build()
                .run(args);
//        SpringApplication.run(SccclientApplication.class, args);
    }

}
