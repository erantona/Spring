package com.basic.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        ApplicationContext context = new ClassPathXmlApplicationContext("primitiveconf.xml");

        Student student1 =(Student) context.getBean("student1");
        System.out.println(student1);

        Student student2 =(Student) context.getBean("student2");
        System.out.println(student2);
    }
}
