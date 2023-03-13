package com.config;

import com.bean.HelloWorld;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean();
        System.out.println(helloWorld.getShop());
        applicationContext.close();
    }
}
