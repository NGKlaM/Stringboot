package com.config;

import com.bean.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public HelloWorld helloWorldBean(){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setShop("Hello world!!! (java)");


        return helloWorld;
    }
}
