package com.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Maza implements InitializingBean, DisposableBean {
    private double price;
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Maza() {
        super();
    }

    @Override
    public String toString() {
        return "{Maza}Maza{" +
                "price=" + price +
                '}';
    }

//    It similar to init method
    public void afterPropertiesSet() throws Exception {
        System.out.println("{Maza}Drinking Maza : init()");
    }
//    The help is we dont have to configure these methods in xml file
    public void destroy() throws Exception {
        System.out.println("{Maza}Putting the empty bottle in dustbin : destroy()");
    }
}
