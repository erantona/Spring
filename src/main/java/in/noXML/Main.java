package in.noXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("noxmlconf.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Demo demo = context.getBean("Golu",Demo.class);
        System.out.println(demo);
        demo.read();


    }
}
