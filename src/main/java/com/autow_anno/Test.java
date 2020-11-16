package com.autow_anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autow_anno.xml");
        Mobile2 mobile2 = context.getBean("mobile2", Mobile2.class);
        System.out.println(mobile2);
    }
}
