package com.layman.test;

import com.layman.annotation.Annotations;
import com.layman.annotation.DoSomeThing;

/**
 * @ClassName Test
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/10/13 15:16
 * @Version 3.0
 **/
public class Test {

    private DoSomeThing doSomeThing = new DoSomeThing();

    @Annotations
    public void test() {
//        doSomeThing.test();
    }
}
