package com.layman.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName TestCheck
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/10/13 17:32
 * @Version 3.0
 **/
public class TestCheck {

    public static void main(String[] args) throws IOException {
        //
        Calculator calculator = new Calculator();
        Class cls = calculator.getClass();
        Method[] methods = cls.getMethods();
        int number = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));
        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)) {
                try {
                    method.invoke(calculator);
                } catch (Exception e) {
                    number++;
                    bw.write(method.getName() + "方法出现了异常");
                    bw.newLine();
                    bw.write("异常名称:" + e.getCause().getClass().getSimpleName());
//                    e.printStackTrace();
                }
            }
        }



        bw.newLine();
        bw.write("本次异常一共出现了:" + number + "次");
        bw.flush();
        bw.close();
    }
}
