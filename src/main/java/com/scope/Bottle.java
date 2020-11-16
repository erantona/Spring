package com.scope;

public class Bottle {
    private String bottleName;
    private int bottleSize;

    @Override
    public String toString() {
        return "Bottle{" +
                "bottleName='" + bottleName + '\'' +
                ", bottleSize=" + bottleSize +
                '}';
    }

    public String getBottleName() {
        return bottleName;
    }

    public void setBottleName(String bottleName) {
        this.bottleName = bottleName;
    }

    public int getBottleSize() {
        return bottleSize;
    }

    public void setBottleSize(int bottleSize) {
        this.bottleSize = bottleSize;
    }
}
