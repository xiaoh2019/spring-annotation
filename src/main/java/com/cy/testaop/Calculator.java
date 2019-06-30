package com.cy.testaop;

import org.springframework.stereotype.Component;

/**
 * @author xiaoH
 * @create 2019-04-25-18:20
 */
@Component
public class Calculator {

    public int division(int x,int y){
        System.out.println("目标方法");
        return x / y;
    }
}
