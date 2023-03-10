package me.whiteship.designpatterns._01_creational_patterns._01_singleton_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public String info() {
        return "this is info";
    }
}
