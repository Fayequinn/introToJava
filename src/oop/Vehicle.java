package oop;

public class Vehicle {

    private String model;

    private String manufacturer;

    private int passengerCapacity;

    private int maxSpeed;

    private String fuelType;

    private String colour;

    private static String usedFor = "transport";

    public static String getUsedFor() {
        return usedFor;
    }

    public String toString(){
        return "This is a "+colour+" "+manufacturer+" "+model+" of fuel type "+fuelType+" with passenger capacity "+passengerCapacity+" and maximum speed "+maxSpeed+".";

    }

    public String getModel(){
        return model;
    }


    public void setModel(String model){
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Vehicle(){
    }

    public Vehicle(String manufacturer, String model, String colour){
        setManufacturer(manufacturer);
        this.model = model;
        this.colour = colour;
    }
}
