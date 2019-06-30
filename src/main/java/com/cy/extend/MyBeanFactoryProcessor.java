package com.cy.extend;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author xiaoH
 * @create 2019-06-30-1:17
 */
@Component
public class MyBeanFactoryProcessor implements BeanFactoryPostProcessor {

    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory)
            throws BeansException {
        System.out.println("postProcessBeanFactory....");
        //bean的定义数量
        int count = configurableListableBeanFactory.getBeanDefinitionCount();
        System.out.println(count);

    }
}
