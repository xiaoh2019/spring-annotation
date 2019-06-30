package com.cy.config;

import com.cy.spring.controller.BookDao;
import entities.Blue;
import entities.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author xiaoH
 * @create 2019-04-24-23:22
 */
//@PropertySource,加在外部配置文件属性，
@PropertySource(value = {"classpath:/Person.properties"})
@ComponentScan(value = {"com.cy.spring.controller"})
@Configuration
public class MainConfigProperty {

    @Bean
    public Person person(){
        return new Person();
    }

    @Bean
    public Blue blue(){
        return new Blue();
    }



}


