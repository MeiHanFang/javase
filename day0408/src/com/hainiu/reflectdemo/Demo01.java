package com.hainiu.reflectdemo;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author HaiNiu
 * @description
 */
public class Demo01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

        // 加载配置文件 系统类加载器以流的形式加载系统资源
        InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream("obj.properties");// 获取资源根路径下的资源
        Properties properties = new Properties();
        properties.load(stream);
        // 读取配置信息
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        // 反射技术
        Class clazz = Class.forName(className);
        Object obj = clazz.getDeclaredConstructor().newInstance();
        Method method = clazz.getMethod(methodName);

        method.invoke(obj);

    }
}
