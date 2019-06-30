import com.cy.config.MainConfigProperty;
import com.cy.config.MainConfiglife;
import com.cy.spring.controller.BookDao;
import com.cy.spring.controller.BookService;
import entities.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xiaoH
 * @create 2019-04-24-22:02
 */
public class SpringAnnocationTest1 {

    @Test
    public void test1(){
        AnnotationConfigApplicationContext ioc =
                new AnnotationConfigApplicationContext(MainConfigProperty.class);
        BookService bookService = ioc.getBean(BookService.class);
        bookService.save();

        ioc.close();

    }
}
