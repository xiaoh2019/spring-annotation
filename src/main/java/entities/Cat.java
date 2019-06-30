package entities;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author xiaoH
 * @create 2019-04-24-22:17
 */
@Component
public class Cat implements InitializingBean,DisposableBean{

    public Cat(){
        System.out.println("构造");
    }

    public void destroy() throws Exception {
        System.out.println("销毁");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化");
    }
}
