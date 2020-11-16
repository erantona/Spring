package com.basic.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
        Apple apple = (Apple) context.getBean("apple");
        System.out.println(apple);
        System.out.println(apple.getBanana().getLength());
        System.out.println(apple.getWeight());
    }
}
