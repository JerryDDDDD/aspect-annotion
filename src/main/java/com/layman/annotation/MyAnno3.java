package com.layman.annotation;

import java.lang.annotation.*;

/**
 * @Author 叶泽文
 * @Description
 * @Date 16:31 2019/10/13
 * @Param
 * @return
 **/

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnno3 {
}
