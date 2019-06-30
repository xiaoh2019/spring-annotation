import com.cy.config.MainConfig;
import com.cy.config.MainConfig2;
import entities.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Map;

/**
 * @author xiaoH
 * @create 2019-04-24-16:35
 */
public class SpringAnnocationTest {

    @Test
    public void test1(){
        ApplicationContext ioc = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names = ioc.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void test2(){
        ApplicationContext ioc = new AnnotationConfigApplicationContext(MainConfig2.class);


    }


    @Test
    public void test3(){
        ApplicationContext ioc = new AnnotationConfigApplicationContext(MainConfig2.class);
        Object person1 = ioc.getBean("person");

    }

    @Test
    public void test4(){
        ApplicationContext ioc = new AnnotationConfigApplicationContext(MainConfig2.class);

        String[] names = ioc.getBeanDefinitionNames();

        for (String name : names) {
            System.out.println(name);
        }

        Object bean = ioc.getBean("colorFactoryBean");
        System.out.println("类型"+bean.getClass());
    }


}
