package com.scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("cuteJug")
@Scope("prototype")
public class Jug {
    @Value("Cute Jug")
    private String jugName;

    @Value("2")
    private int jugSize;

    @Override
    public String toString() {
        return "Jug{" +
                "jugName='" + jugName + '\'' +
                ", jugSize=" + jugSize +
                '}';
    }

    public String getJugName() {
        return jugName;
    }

    public void setJugName(String jugName) {
        this.jugName = jugName;
    }

    public int getJugSize() {
        return jugSize;
    }

    public void setJugSize(int jugSize) {
        this.jugSize = jugSize;
    }
}
