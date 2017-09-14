package com.neusoft.platform.system;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@MapperScan(basePackages = {"com.neusoft.platform.system.dao"})
@SpringBootApplication
public class Application {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws Exception {
        SpringApplication application = new SpringApplication(Application.class,
                "classpath:/dubbo/*.xml");
        application.run(args);
    }
}