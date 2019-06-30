package entities;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author xiaoH
 * @create 2019-04-24-22:29
 */
@Component
public class Gog {

    public Gog(){
        System.out.println("Gog的构造");
    }

    @PostConstruct
    public void init(){
        System.out.println("Gog init初始化");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Gog destroy");
    }

}
