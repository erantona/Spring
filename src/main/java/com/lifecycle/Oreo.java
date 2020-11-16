package com.lifecycle;

public class Oreo {
    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        System.out.println("{Oreo}Setting price :");
        this.price = price;
    }

    public Oreo() {
        super();

    }

    @Override
    public String toString() {
        return "{Oreo}Oreo{" +
                "price='" + price + '\'' +
                '}';
    }
//    We can change the names of init or destroy as we want
    public void init(){
        System.out.println("{Oreo}In init method");
    }
    public void destroy(){
        System.out.println("{Oreo}In destroy method");
    }
}