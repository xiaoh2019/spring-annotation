package com.cy.config;

import entities.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * bean的生命周期，由容器管理，也可以自己管理
 * 1.在@Bean 上面加initMethod ="init",destroyMethod="destroy",多实例的情况下，IOC不管理组件，需要自己销毁
 * 2.实体类实现InitializingBean,DisposableBean这两个接口
 * 3.使用jsr250中的注解
 *            @PostConstruct,@PreDestroy加在实体类方法上面
 * 4.BeanPostProcessor,bean的后置处理器
 * @author xiaoH
 * @create 2019-04-24-21:55
 */
@Configuration
@ComponentScan(value={"entities","com.cy.condition"})
public class MainConfiglife {

    @Bean(initMethod ="init",destroyMethod="destroy")
    public Car car(){
        return new Car();
    }


}
