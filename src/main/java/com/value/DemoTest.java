package com.value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class DemoTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("valueconf.xml");
        Demo demo = context.getBean("demo",Demo.class);
        System.out.println(demo);
//        SpelExpressionParser tempParser = new SpelExpressionParser();
//        Expression expression = tempParser.parseExpression("25-5");


    }
}
