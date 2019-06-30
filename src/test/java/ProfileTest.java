import com.cy.config.ConfigOfProfile;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author xiaoH
 * @create 2019-04-25-16:58
 */
public class ProfileTest {

    @Test
    public void test1() throws SQLException {
        ApplicationContext ioc = new AnnotationConfigApplicationContext(ConfigOfProfile.class);
        String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
