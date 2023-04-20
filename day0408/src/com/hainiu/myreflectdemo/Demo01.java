package com.hainiu.myreflectdemo;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //加载配置文件
        InputStream resource = ClassLoader.getSystemClassLoader().getResourceAsStream("obj.properties");
        Properties properties = new Properties();
        //将配置文件加载到properties集合中
        properties.load(resource);
        //获取key值
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        //反射技术
        //字节码文件
        Class clazz = Class.forName(className);
        //获取对象
        Object o = clazz.getConstructor().newInstance();

        //获取方法
        Method method = clazz.getMethod(methodName);
        method.invoke(o);
    }
}
