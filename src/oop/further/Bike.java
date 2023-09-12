package oop.further;

public class Bike extends Vehicle{
    private boolean sidecar;

    public void setSidecar(boolean sidecar) {
        this.sidecar = sidecar;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "sidecar=" + sidecar +
                '}';
    }
}
