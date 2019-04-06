package com.romanstetsiuk.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    String applicationName() {
        return "my application";
    }

    @Bean
    Double version(){
        return 1.0;
    }

}
