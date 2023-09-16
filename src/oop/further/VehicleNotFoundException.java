package oop.further;


// example of checked exception
//public class VehicleNotFoundException extends Exception{
//
//    public VehicleNotFoundException(String msg){
//        super(msg);
//    }
//}

public class VehicleNotFoundException extends RuntimeException{

    public VehicleNotFoundException(String msg){
        super(msg);
    }
}

