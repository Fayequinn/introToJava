package oop.further;

public abstract class Vehicle {

    private int id;

    public int getId() {
        return id;
    }

    private static int count;
        private String model;

        private String manufacturer;

        private int passengerCapacity;

        private int maxSpeed;

        private String fuelType;

        private String colour;

        private static String usedFor = "transport";

        public abstract int calcBill();

    public Vehicle() {
        this.id = count++;
    }

    public static String getUsedFor() {
            return usedFor;
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

//    public String toString(){
//        return "This is a "+colour+" "+manufacturer+" "+model+" of fuel type "+fuelType+" with passenger capacity "+passengerCapacity+" and maximum speed "+maxSpeed+".";


}
