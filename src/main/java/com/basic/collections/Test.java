package com.basic.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionconf.xml");

        Employee employee = (Employee) context.getBean("emp");

        System.out.println(employee.getName());
        System.out.println(employee.getPhones());
        System.out.println(employee.getAddress());
        System.out.println(employee.getTraining());
        System.out.println(employee.getProps());

    }
}
