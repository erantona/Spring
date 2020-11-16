package com.basic.constructor;

public class Certificate {
    private final String name;

    public Certificate(String name){
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "name='" + name + '\'' +
                '}';
    }
}
