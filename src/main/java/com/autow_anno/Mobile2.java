package com.autow_anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Mobile2 {
    @Autowired
    @Qualifier("temp2")
    private Phone2 phone2;

    public Mobile2(Phone2 phone2) {
        super();
        this.phone2 = phone2;
    }

    public Mobile2() {
        super();
    }

    public Phone2 getPhone2() {
        return phone2;
    }

    public void setPhone2(Phone2 phone2) {
        this.phone2 = phone2;
    }

    @Override
    public String toString() {
        return "Mobile2{" +
                "phone2=" + phone2 +
                '}';
    }
}
