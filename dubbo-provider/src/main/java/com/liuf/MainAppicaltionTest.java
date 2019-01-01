package com.liuf;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author liuf
 * @create 2018-12-31 15:20
 */
public class MainAppicaltionTest {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:provider.xml");
        ioc.start();
        System.out.println("启动成功。。。。。。。。。。。。");
        System.in.read();
    }
}
