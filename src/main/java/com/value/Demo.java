package com.value;
//SpEL
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Value("#{9+5}")
    private int first;

    @Value("#{22+15-2}")
    private int second;

//to call static method of any class
    @Value("#{ T(java.lang.Math).sqrt(144.0)}")
    private double third;

    @Value("#{T(java.lang.Math).PI*5}")
    private double fourth;

    @Value("#{new java.lang.String('Suvendu Roy')}")
    private String fifth;

    @Value("#{5>2}")
    private boolean sixth;

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public double getThird() {
        return third;
    }

    public void setThird(double third) {
        this.third = third;
    }

    public double getFourth() {
        return fourth;
    }

    public void setFourth(double fourth) {
        this.fourth = fourth;
    }

    public String getFifth() {
        return fifth;
    }

    public void setFifth(String fifth) {
        this.fifth = fifth;
    }

    public boolean isSixth() {
        return sixth;
    }

    public void setSixth(boolean sixth) {
        this.sixth = sixth;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", fourth=" + fourth +
                ", fifth='" + fifth + '\'' +
                ", sixth=" + sixth +
                '}';
    }
}
