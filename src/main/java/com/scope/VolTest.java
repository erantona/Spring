package com.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VolTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("scopeconf.xml");

//        @By Annotation
        Jug jug1 = context.getBean("cuteJug",Jug.class);
        Jug jug2 = context.getBean("cuteJug",Jug.class);
        System.out.println("jug1 HashCode-> "+jug1.hashCode());
        System.out.println("jug2 HashCode-> "+jug2.hashCode());
//        both will be diff because we use @Scope in parentClass


        Bottle bottle1 = context.getBean("bottle", Bottle.class);
        Bottle bottle2 = context.getBean("bottle", Bottle.class);
        System.out.println("bottle1 hashcode-> "+bottle1.hashCode());
        System.out.println("bottle2 hashcode-> "+bottle2.hashCode());



    }
}
