package com.cy.importBean;

import entities.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author xiaoH
 * @create 2019-04-24-19:56
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar{

    /**
     *
     * @param annotationMetadata  当前类注解信息都能拿到
     * @param beanDefinitionRegistry   BeanDefinition注册类
     */
    public void registerBeanDefinitions(
            AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {

        boolean red = beanDefinitionRegistry.containsBeanDefinition("entities.Red");
        if(red){
            //指定bean的定义信息（bean的类型）
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(RainBow.class);
            beanDefinitionRegistry.registerBeanDefinition("rainBow",rootBeanDefinition);
        }
    }
}
