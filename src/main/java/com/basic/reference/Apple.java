package com.basic.reference;

public class Apple {
    private double weight;
    private Banana banana;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Banana getBanana() {
        return banana;
    }

    public void setBanana(Banana banana) {
        this.banana = banana;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", banana=" + banana +
                '}';
    }
}
