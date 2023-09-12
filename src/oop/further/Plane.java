package oop.further;

public class Plane extends Vehicle {
    private boolean propeller;

    public void setPropeller(boolean propeller) {
        this.propeller = propeller;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "propeller=" + propeller +
                '}';
    }
}
