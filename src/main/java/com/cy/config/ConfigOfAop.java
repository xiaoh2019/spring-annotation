package com.cy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * aop: 动态将代码切入到指定的位置的编程方式，底层是动态代理
 * aop原理解析：
 *     @EnableAspectJAutoProxy
 *         @Import(AspectJAutoProxyRegistrar.class)
 *               后置处理器和 BeanFactoryAware
 *
 *
 * @author xiaoH
 * @create 2019-04-25-17:58
 */
@Configuration
@ComponentScan({"com.cy.testaop"})
@EnableAspectJAutoProxy
public class ConfigOfAop {

}
