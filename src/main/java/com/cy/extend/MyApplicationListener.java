package com.cy.extend;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author xiaoH
 * @create 2019-06-30-2:04
 */
@Component
public class MyApplicationListener implements ApplicationListener {
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("onApplicationEvent...监听事件"+applicationEvent);
    }
}
