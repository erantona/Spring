package com.autowiring;

public class Mobile {
    Phone phone;

    public Mobile(Phone phone) {
        super();
        this.phone = phone;
    }

    public Mobile() {
        super();
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "phone=" + phone +
                '}';
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Phone getPhone() {
        return phone;
    }
}
