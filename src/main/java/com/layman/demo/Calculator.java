package com.layman.demo;

/**
 * @ClassName Calculator
 * @Description 小明定义的计算器类
 * @Author 叶泽文
 * @Data 2019/10/13 17:29
 * @Version 3.0
 **/
public class Calculator {

    @Check
    public void add() {
        System.out.println("1 + 0 =" + (1 + 0));
    }

    @Check
    public void sub() {
        System.out.println("1 - 0 =" + (1 - 0));
    }

    @Check
    public void mul() {
        System.out.println("1 * 0 =" + (1 * 0));
    }

    @Check
    public void div() {
        System.out.println("1 /0 = " + (1 / 0));
    }

    @Check
    public void show () {
        System.out.println("永无Bug......");
    }
}
