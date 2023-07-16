package com.blog.aop;


import ch.qos.logback.classic.Logger;
import com.blog.entity.Article;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;


@Aspect
public class ValidateAspect {

    Logger logger = (Logger) LoggerFactory.getLogger(ValidateAspect.class);


    @Pointcut("execution(* com.blog.service.impl.ArticleServiceImpl.advice(*))")
    public void pointcut(){}

    @Around("pointcut()")
    public Object article(ProceedingJoinPoint pjp) throws Throwable {

        Object[] args = pjp.getArgs();
        Article a =  (Article)args[0];
        System.out.println( "标题是："+ a.getTitle());
        Object proceed = pjp.proceed();
        return proceed;
    }
}
