package oop.further;

public class RunnerGeneric {

    public static void main(String[] args) {

        Shed<Car> carShed = new Shed<>();

        carShed.setVehicle(new Car());
        Car car = carShed.getVehicle();
        System.out.println(car.getBootSize());

        Car car2 = new Car();
        car2.setBootSize(100);
        carShed.setVehicle(car2);

        System.out.println(carShed);
        System.out.println(car);

        carShed.setVehicle(car);
        System.out.println(carShed);

    }
}
