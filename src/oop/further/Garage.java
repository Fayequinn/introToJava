package oop.further;

import java.util.List;
import java.util.ArrayList;

public class Garage {
    private List<Vehicle> vehicles = new ArrayList<>();

    public boolean addVehicle(Vehicle v) {
        return this.vehicles.add(v);
    }

    public boolean removeVehicle(int id) {
        for (Vehicle v : this.vehicles) {
            if (v.getId() == id) {
                return this.vehicles.remove(v);
            }
        }
        return false;
    }

    public boolean removeByType(String type) {
        for (int i = this.vehicles.size() - 1; i >= 0; i--) {
            Vehicle v = this.vehicles.get(i);
            if (v.getClass().getSimpleName().equalsIgnoreCase(type)) {
                this.vehicles.remove(v);
            }
        }
        return false;
    }

// THIS IS PASSING IN THE 'CLASS'
//    public boolean removeByType(Class c) {
//        for (int i = this.vehicles.size() - 1; i >= 0; i--) {
//            Vehicle v = this.vehicles.get(i);
//            if (v.getClass() == c) {
//                this.vehicles.remove(v);
//            }
//        }
//        return false;
//    }

    public void emptyGarage() {
        this.vehicles.clear();
    }

    public int calculateBill() {
        int bill = 0;
        for (Vehicle v : this.vehicles) {
            if (v instanceof Car) {
                bill += 100;
            } else if (v instanceof Bike) {
                bill += 200;
            } else if (v instanceof Plane) {
                bill += 300;
            }
        }
        return bill;
    }


    @Override
    public String toString() {
        return "Garage{" +
                "vehicles=" + vehicles +
                '}';
    }
}


//
//    public boolean emptyGarage


