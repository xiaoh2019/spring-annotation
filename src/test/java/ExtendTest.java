import com.cy.config.ConfigOfAop;
import com.cy.config.ExtendConfig;
import com.cy.testaop.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xiaoH
 * @create 2019-04-25-16:58
 */
public class ExtendTest {

    @Test
    public void test(){
        AnnotationConfigApplicationContext ioc =
                new AnnotationConfigApplicationContext(ExtendConfig.class);

        ioc.close();
    }


}
