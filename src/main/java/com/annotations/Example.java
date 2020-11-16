package com.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
    private String name;

    public Example() {
        super();
    }
    @PostConstruct
    public void Start(){
        System.out.println("Starting!!..");
    }
    @PreDestroy
    public void End(){
        System.out.println("Ending");
    }




    @Override
    public String toString() {
        return "Example{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
