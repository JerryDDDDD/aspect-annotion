package com.layman.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName RequestAspect
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/10/16 16:24
 * @Version 3.0
 **/
@Aspect
@Component
public class RequestAspect {

//    F:\github-layman\interpretation\src\main\java\com\layman\controller\TestController.java
    @Pointcut("execution(public * com.layman.controller.**.**(..))")
    public void log() {
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("方法执行前");
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        System.out.println("url:" + request.getRequestURI());
        System.out.println("ip:" + request.getRemoteHost());
        System.out.println("方法:" + request.getMethod());
        System.out.println("class_method:" + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        System.out.println("参数:" + joinPoint.getArgs());
        System.out.println("方法执行前完成");
    }

    @After("log()")
    public void doAfter(JoinPoint joinPoint) {
        System.out.println("方法执行后");
    }

    @AfterReturning(returning = "result", pointcut = "log()")
    public void doReturn(Object result) {
        System.out.println("方法 返回值:" + result);
    }
}
