package com.liuf;

import com.liuf.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liuf
 * @create 2018-12-31 15:20
 */
public class MainAppicaltionTest {
    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:consumer.xml");
            OrderService orderService = ioc.getBean(OrderService.class);
            orderService.initOrder("1");
            System.out.println("调用完成");
            System.in.read();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}