package in.noXML;

//import org.springframework.stereotype.Component;
//
//@Component("demoo")
public class Demo {

    private Mango mango;

    public Mango getMango() {
        return mango;
    }

    public void setMango(Mango mango) {
        this.mango = mango;
    }

    public Demo(Mango mango) {
        this.mango = mango;
    }

    public void read() {
        this.mango.display();
        System.out.println("It's Working.");
    }
}
