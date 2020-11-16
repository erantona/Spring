package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autoconf.xml");
//       no need of typeCasting just mention name.class
        Mobile mobile=  context.getBean("mobile",Mobile.class);
        System.out.println(mobile);
    }
}
