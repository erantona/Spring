package com.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("annotconf.xml");
        context.registerShutdownHook();
        Example example = (Example) context.getBean("example");
        System.out.println(example);
    }
}
