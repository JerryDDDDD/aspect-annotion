package com.layman.annotation;

import java.util.Date;

/**
 * @ClassName DoSomeThing
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/10/13 15:14
 * @Version 3.0
 **/
public class DoSomeThing {

    public void test() {
        System.out.println("执行自定义注解");
        System.out.println("执行自定义注解时间:" + new Date());
    }
}
