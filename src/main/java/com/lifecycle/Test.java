package com.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        Here we dont use ApplicationContext because it dose not have registerShutdown()
//        so we use AbstractApplicationContext
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lyfecycleconf.xml");
        Oreo oreo = (Oreo) context.getBean("oreo");
        context.registerShutdownHook();
        System.out.println(oreo);
//        Registering ShutDown hook
        System.out.println("ooooooooooooooooooooooooooo");

        Maza maza = (Maza) context.getBean("maza");
        System.out.println(maza);


    }
}
