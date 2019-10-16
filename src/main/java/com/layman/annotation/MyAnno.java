package com.layman.annotation;

public @interface MyAnno {

    int age();

    String name() default "李四";

    Person per();

    MyAnno2 anno2();

    String[] strs();
}

