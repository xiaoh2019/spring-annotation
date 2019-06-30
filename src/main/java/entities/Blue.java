package entities;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 *用到spring底层的组件，实现xxxAware接口，创建对象的时候，
 * 会调用接口的方法注入相关组件。
 *每一个人Aware接口都有相应的processor后置处理器，在组件初始化前后操作
 *
 *
 * @author xiaoH
 * @create 2019-04-24-19:47
 */

@Component
public class Blue implements ApplicationContextAware,BeanNameAware,EmbeddedValueResolverAware {
    private ApplicationContext applicationContext;

    public Blue(){
        System.out.println("构造函数创建对象。。。");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
        System.out.println("传入的ioc"+applicationContext);
    }

    public void setBeanName(String name) {
        System.out.println("Blue在容器中的 id"+name);
    }

    //resolver解析器，
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String s = resolver.resolveStringValue("你好${os.name} 我是#{20-2}");
        System.out.println(s);
    }
}
