import com.cy.config.MainConfigProperty;
import com.cy.config.MainConfiglife;
import entities.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xiaoH
 * @create 2019-04-24-22:02
 */
public class SpringAnnocationTest2 {

    @Test
    public void test1(){
        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(MainConfigProperty.class);
        System.out.println("--------------");
        String[] names = ioc.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        Person person = (Person) ioc.getBean("person");
        System.out.println(person);


    }
}
