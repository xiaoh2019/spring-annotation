import com.cy.config.ConfigOfAop;
import com.cy.config.RefreshTestConfig;
import com.cy.testaop.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xiaoH
 * @create 2019-06-30-13:40
 */
public class IOCRefreshTest {
    @Test
    public void test1(){
        ApplicationContext ioc = new AnnotationConfigApplicationContext(RefreshTestConfig.class);



    }

}
