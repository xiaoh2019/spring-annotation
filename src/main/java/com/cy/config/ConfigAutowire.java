package com.cy.config;

import com.cy.spring.controller.BookDao;
import entities.Car;
import entities.Color;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 自动装配
 * 1.@Autowired
 * 2.spring还支持@Resource和@Inject   【这是java规范的】
 *
 *
 * @author xiaoH
 * @create 2019-04-25-0:00
 */
@ComponentScan({"com.cy.spring.controller","entities"})
@Configuration
public class ConfigAutowire {

    @Bean
    public  BookDao bookDao1(){
        return new BookDao();
    }

    //@Bean标注的方法入参是从IOC容器获取自动注入的
    @Bean
    public Color color(Car car){
        Color color = new Color();
        color.setCar(car);
        return color;
    }


}
