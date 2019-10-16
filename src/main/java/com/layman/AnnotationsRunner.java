package com.layman;

import com.layman.annotation.Annotations;
import com.layman.test.Test;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * @ClassName AnnotationsRunner
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/10/13 15:17
 * @Version 3.0
 **/
public class AnnotationsRunner {

    public static void main(String[] args) throws Exception {
        System.out.println("执行自定义注解时间:" + new Date());
        Class clazz = Test.class;
        Method[] ms = clazz.getMethods();
        for (Method method : ms) {
            boolean flag = method.isAnnotationPresent(Annotations.class);
            if (flag) {
                method.invoke(clazz.newInstance(), null);
            }
        }
    }

}
