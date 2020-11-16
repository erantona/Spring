package com.basic.reference;

public class Banana {

    private double length;

    public Banana() {
        super();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Bannana{" +
                "length=" + length +
                '}';
    }
}
