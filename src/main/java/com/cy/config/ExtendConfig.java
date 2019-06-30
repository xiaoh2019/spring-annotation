package com.cy.config;

import entities.Blue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiaoH
 * @create 2019-06-30-1:11
 */
@Configuration
@ComponentScan(value = {"com.cy.extend"})
public class ExtendConfig {

    /*@Bean
    public Blue blue(){
        return new Blue();
    }*/
}
