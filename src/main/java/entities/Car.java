package entities;

import org.springframework.stereotype.Component;

/**
 * @author xiaoH
 * @create 2019-04-24-21:59
 */
@Component
public class Car {

    public Car(){
        System.out.println("构造方法");
    }

    public void init(){
        System.out.println("初始化方法");
    }

    public void destroy(){
        System.out.println("销毁方法");
    }
}
