package oop.further;

public class Car extends Vehicle{

    private int bootSize;

    public void setBootSize(int bootSize) {
        this.bootSize = bootSize;
    }

    @Override
    public int calcBill() {
        return 100;
    }

    @Override
    public String toString() {
        return "Car{" +
                "bootSize=" + bootSize +
                '}';
    }
}
