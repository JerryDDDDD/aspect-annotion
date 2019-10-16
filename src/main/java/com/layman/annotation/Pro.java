package com.layman.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author 叶泽文
 * @Description 描述需要执行的类名和方法名
 * @Date 17:03 2019/10/13
 * @Param
 * @return
 **/

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Pro {

    String className();

    String methodName();
}
