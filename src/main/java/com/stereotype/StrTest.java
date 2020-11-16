package com.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StrTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("stereotypeconf.xml");
        Str str = context.getBean("ob",Str.class);
        System.out.println(str);
        System.out.println(str.getStringNo().getClass().getName());
    }
}
