package com.basic.constructor;

import java.util.List;

public class Person {
    private  String personName;
    private int personId;
    private Certificate certificate;
    private List<String> Address;

    public Person(String personName, int personId, Certificate certificate, List<String> address) {
        this.personName = personName;
        this.personId = personId;
        this.certificate = certificate;
        Address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", personId=" + personId +
                ", certificate=" + certificate +
                ", Address=" + Address +
                '}';
    }
}
