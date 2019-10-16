package com.layman.annotation;

/**
 * @ClassName Worker
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/10/13 16:20
 * @Version 3.0
 **/
@MyAnno(age = 1, name = "张三", per = Person.P1 , anno2 = @MyAnno2, strs = {"a", "b", "c "})
@MyAnno3
public class Worker {

}
