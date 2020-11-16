package in.noXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "in.noXML")
public class JavaConfig {

    @Bean
    protected Mango getMango(){
        return new Mango();
    }

    @Bean(name = {"Golu", "polu"})
    public Demo getDemo(){
        //Create a object
        Demo demo = new Demo(getMango());
        return demo;
    }

}
