package oop.further;

public class Runner {

    public static void main(String[] args) {

        Car c = new Car();
        c.setModel("Alhambra");
        c.setManufacturer("Seat");
        c.setColour("Silver");
        c.setMaxSpeed(70);
        c.setFuelType("diesel");
        c.setPassengerCapacity(7);
        c.setBootSize(270);

        System.out.println(c);

        Bike b = new Bike();
        b.setModel("Sportster");
        b.setManufacturer("Harley Davidson");
        b.setColour("Black");
        b.setMaxSpeed(150);
        b.setFuelType("petrol");
        b.setPassengerCapacity(2);
        b.setSidecar(true);

        System.out.println(b);

        Plane p = new Plane();
        p.setModel("747");
        p.setManufacturer("Boeing");
        p.setColour("White");
        p.setMaxSpeed(300);
        p.setFuelType("jet fuel");
        p.setPassengerCapacity(400);
        p.setPropeller(true);

        System.out.println(p);


        Garage garage = new Garage();
        garage.addVehicle(c);
        garage.addVehicle(b);
        garage.addVehicle(p);
        System.out.println(garage);
//
//        garage.removeVehicle(1);
//        System.out.println(garage);

//garage.emptyGarage();
//        System.out.println(garage);

        System.out.println(garage.calculateBill());

        garage.removeByType("car");
        System.out.println(garage);
    }
}
