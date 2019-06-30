import com.cy.config.ConfigOfAop;
import com.cy.config.ConfigOfProfile;
import com.cy.testaop.Calculator;
import com.cy.tx.test.TxOfConfig;
import com.cy.tx.test.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xiaoH
 * @create 2019-04-25-16:58
 */
public class AopTest {

    @Test
    public void test1(){
        ApplicationContext ioc = new AnnotationConfigApplicationContext(ConfigOfAop.class);
        Calculator calculator = ioc.getBean(Calculator.class);
        int add = calculator.division(1, 1);
        System.out.println(add);
    }


}
