package entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author xiaoH
 * @create 2019-04-25-14:14
 */
@Component
public class Boss {

    //@Autowired
    private Car car;

    //类只有一个 有参构造器，@Autowired可以省略，创建对象时，自动从IOC中获取组件注入
    //@Autowired
    public Boss(@Autowired Car car) {
        this.car = car;
        System.out.println("boss有参构造器");
    }

    public Car getCar() {
        return car;
    }

    //@Autowired
    //标志在方法上，spring创建对象就会调用方法，完成赋值
    public void setCar(Car car) {
        this.car = car;
    }


    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                '}';
    }
}
