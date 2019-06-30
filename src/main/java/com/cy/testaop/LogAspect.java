package com.cy.testaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 *
 *
 * @author xiaoH
 * @create 2019-04-25-18:14
 */
@Aspect
@Component
public class LogAspect {
    @Pointcut("execution(public int com.cy.testaop.Calculator.division(..))")
    private void pointcut(){}

    //前置通知
    @Before("pointcut()")
    public void LogBefore(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println("@Before目标方法执行之前执行,方法名"+joinPoint.getSignature().getName()
             +"参数"+ Arrays.asList(args));
    }

    //后置通知
    @After(value="pointcut()")
    public void LogAfter(JoinPoint joinPoint){
        System.out.println("@After目标执行之后执行，方法"+joinPoint.getSignature().getName());
    }

    //返回通知
    @AfterReturning(value="pointcut()",returning = "result")
    public void afterReturn(Object result){
        System.out.println("@AfterReturning结果返回时通知,结果"+result);
    }

    @Around("pointcut()")
    public Object LogAround(ProceedingJoinPoint joinPoint ) throws Throwable {
        System.out.println("@Around环绕前");
        Object proceed = joinPoint.proceed();
        System.out.println("@Around环绕后");
        return proceed;
    }

    @AfterThrowing(value="pointcut()",throwing = "e")
    public void logException(Exception e){
        System.out.println("@AfterThrowing发生了异常,异常信息"+e.getMessage());
    }
}
