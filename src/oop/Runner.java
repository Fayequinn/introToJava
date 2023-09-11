package oop;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle();

        car1.setModel("Alhambra");
        car1.setManufacturer("Seat");
        car1.setColour("Silver");
        car1.setMaxSpeed(70);
        car1.setFuelType("diesel");
        car1.setPassengerCapacity(7);
//        System.out.println(car.intro());

        Vehicle plane = new Vehicle();

        plane.setColour("white");
        plane.setFuelType("jet fuel");
        plane.setMaxSpeed(200);
        plane.setModel("747");
        plane.setManufacturer("Boeing");
        plane.setPassengerCapacity(250);
//        System.out.println(plane.intro());

        Vehicle car2 = new Vehicle("Seat", "Exeo", "white");
//        System.out.println(car2.intro());
        car2.setFuelType("diesel");
        car2.setPassengerCapacity(5);
        car2.setMaxSpeed(100);
//        System.out.println(car2.intro());

        Vehicle car3 =new Vehicle("Seat", "Ibiza", "red");
//        System.out.println(car3);
//
//        System.out.println(Vehicle.getUsedFor());
//
//        System.out.println(car1);
//        System.out.println(car2);

        List<Vehicle> cars = new ArrayList<>();

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

//        System.out.println(cars.size());

        for (Vehicle v :cars){
            System.out.println(v);}

            for (Vehicle v: cars){
                System.out.println(v.getModel());
        }

            for (int i=0; i<cars.size();i++){
                System.out.println(cars.get(i).getModel());
            }
    }
}
