import com.cy.config.ConfigAutowire;
import com.cy.config.MainConfigProperty;
import com.cy.spring.controller.BookService;
import entities.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xiaoH
 * @create 2019-04-24-22:02
 */
public class SpringAnnocationAutowired {

    @Test
    public void test1(){
        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(ConfigAutowire.class);
        Object boss = ioc.getBean("boss");
        System.out.println(boss);
        Object car = ioc.getBean("car");
        System.out.println(car);
        Object color = ioc.getBean("color");
        System.out.println(color);
        System.out.println(ioc);

    }
}
