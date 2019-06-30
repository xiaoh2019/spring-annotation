package com.cy.config;

import com.cy.beanPostProcessor.MyBeanPostProcessor;
import com.cy.condition.*;
import entities.Color;
import entities.Person;
import org.springframework.context.annotation.*;

/**
 * @author xiaoH
 * @create 2019-04-24-18:00
 */
//@Import({Color.class,MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
@Import({MyBeanPostProcessor.class})
@Configuration
public class MainConfig2 {

    //默认单实例,@Scope指定作用范围，单例singleton,多例prototype
    //懒加载，容器启动时不创建组件，用到时再创建
    //@Scope(value = "prototype")
    //@Lazy
    @Bean
    public Person person(){
        return  new Person();
    }

    /**
     * @Conditional,满足条件才祖册组件
     *
     */
    @Conditional({WindowsCondition.class})
    @Bean("liao")
    public Person person1(){
        return new Person("廖铁头",20);
    }

    @Conditional({LinuxCondition.class})
    @Bean("baobao")
    public Person person2(){
        return new Person("宝宝",20);
    }

    /**
     * 添加组件方式：
     * 1.包扫描+注解（@Component,@Controller....）
     * 2.@Bean
     * 3.@Import
     * 4.使用FactoryBean
     */

   /* @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }*/

}
