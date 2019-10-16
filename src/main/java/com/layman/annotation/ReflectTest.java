package com.layman.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName ReflectTest
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/10/13 17:02
 * @Version 3.0
 **/
@Pro(className = "com.layman.annotation.Demo1", methodName = "show")
public class ReflectTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        // 1. 解析注解
        // 1.1 获取该类的字节码文件对象
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        // 2. 获取上边的的对接对象
        // 其实就是在内存中生成了一个该注解接口的子类实现对象
        Pro pro = reflectTestClass.getAnnotation(Pro.class);
        // 3. 调用注解对象中定义的抽象方法,获取返回值
        String className = pro.className();
        String methodName = pro.methodName();

        System.out.println("class name = " + className);
        System.out.println("method name = " + methodName);

        Class clazz = Class.forName(className);
        Object object = clazz.newInstance();
        Method method = clazz.getMethod(methodName);
        method.invoke(object);
    }
}
