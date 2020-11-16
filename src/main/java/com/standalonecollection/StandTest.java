package com.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("standconf.xml");
        Cycle cycle = context.getBean("cycle",Cycle.class);
        System.out.println(cycle);
    }
}
