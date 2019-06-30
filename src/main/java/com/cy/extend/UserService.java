package com.cy.extend;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @author xiaoH
 * @create 2019-06-30-12:35
 */
@Service
public class UserService {

    @EventListener(value = {ApplicationEvent.class})
    public void listen(ApplicationEvent applicationEvent){
        System.out.println("UserService事件监听"+applicationEvent);
    }
}
