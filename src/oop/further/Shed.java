package oop.further;

public class Shed<T extends Vehicle> {

    private T vehicle;

    public T getVehicle() {
        return vehicle;
    }

    public void setVehicle(T vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Shed{" +
                "vehicle=" + vehicle +
                '}';
    }
}
