package com.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("ob")
public class Str {
    @Value("Honda 360")
    private String bike;

    @Value("Tesla m3")
    private String car;

    @Value("#{temp}")
    private List<Integer> stringNo;

    public List<Integer> getStringNo() {
        return stringNo;
    }

    public void setStringNo(List<Integer> stringNo) {
        this.stringNo = stringNo;
    }

    @Override
    public String toString() {
        return "Str{" +
                "bike='" + bike + '\'' +
                ", car='" + car + '\'' +
                ", stringNo=" + stringNo +
                '}';
    }

    public String getBike() {
        return bike;
    }

    public void setBike(String bike) {
        this.bike = bike;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }
}
