package com.neusoft.platform.web;

import com.neusoft.enjoy.springboot.web.annotations.EnableSwagger;
import com.neusoft.enjoy.web.controller.DefaultRegistry;
import com.neusoft.enjoy.web.interceptor.LoginIntercepter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@SpringBootApplication
@EnableSwagger
public class Application {

    public static void main(String[] args) throws IOException {
        SpringApplication application = new SpringApplication(Application.class);
        application.run(args);
    }

//    @Bean
//    public LoginIntercepter loginIntercepter(){
//       LoginIntercepter loginCookieIntercepte=new LoginIntercepter(0);
//       loginCookieIntercepte.addWhite("/file","/login","/api/login");
//       return loginCookieIntercepte;
//    }
}