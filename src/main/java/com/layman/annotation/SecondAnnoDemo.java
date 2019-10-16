package com.layman.annotation;

import java.util.Date;

/**
 * @ClassName SecondAnnoDemo
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/10/13 15:57
 * @Version 3.0
 **/
@SuppressWarnings("all")
public class SecondAnnoDemo {

    @Override
    public String toString() {
        return super.toString();
    }

    @SuppressWarnings("all")
    @Deprecated
    public void show1 () {
        System.out.println("this is show method has problem");
    }

//    @MyAnno
    public void show2 () {
        System.out.println("this is show2, used to replace show1");
    }

    public void demo () {
        this.show1();
        Date date = new Date();
        date.getDate();
    }
}
