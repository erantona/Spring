package com.standalonecollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Cycle {
    private List<String> parts;
    private Map<String ,Integer> brands;
    private Properties speed;

    public List<String> getParts() {
        return parts;
    }

    public void setParts(List<String> parts) {
        this.parts = parts;
    }

    public Map<String, Integer> getBrands() {
        return brands;
    }

    public void setBrands(Map<String, Integer> brands) {
        this.brands = brands;
    }

    public Properties getSpeed() {
        return speed;
    }

    public void setSpeed(Properties speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Cycle{" +
                "parts=" + parts +
                ", brands=" + brands +
                ", speed=" + speed +
                '}';
    }
}


