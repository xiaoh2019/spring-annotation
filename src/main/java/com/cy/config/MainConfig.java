package com.cy.config;

import com.cy.component.filter.MyTypeFilter;
import com.cy.spring.controller.BookService;
import entities.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;

/**
 * @author xiaoH
 * @create 2019-04-24-15:08
 */

/*@ComponebtScan包扫描,value指定要扫描的包，
includeFilters只包含哪些
 @ComponebtScan.Filter指定排除规则,type排除类型。excludeFilters定义排除哪些,
   FilterType.ANNOTATION根据注解，ilterType.ASSIGNABLE_TYPE 根据类型
   ANNOTATION,
    ASSIGNABLE_TYPE,
    ASPECTJ,      ASPECTJ表达式，不用
    REGEX,       正则表达式
    CUSTOM        自定义;
*/
@ComponentScan(value={"com.cy.spring.controller","com.cy.component.filter"},includeFilters = {
        /*@ComponentScan.Filter(type= FilterType.ANNOTATION,classes= {Controller.class}),
     @ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE,classes = {BookService.class}) ,*/
     @ComponentScan.Filter(type=FilterType.CUSTOM,classes = {MyTypeFilter.class})}
     , useDefaultFilters = false)
@Configuration
public class MainConfig {
    /*
       @Bean给容器注册组件
       类型为返回值类型，id为方法名
       @Bean(name="person1",destroyMethod = "",initMethod = "")
       指定id,初始化方法，销毁方法
    */
    @Bean
    public Person person(){
        return new Person("王二",12);
    }


}
