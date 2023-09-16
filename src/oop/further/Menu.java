package oop.further;

import java.util.Scanner;

public class Menu {
private Garage g;
    public Menu(Garage g){
        this.g = g;
        System.out.println("Welcome to the garage!");
        System.out.println("Press 1 to add a vehicle");
        System.out.println("Press 2 to remove a vehicle");
        System.out.println("Press 3 to calculate a bill");
        System.out.println("Press 4 to exit");


    }


    public void chooseOption(Garage g) {
        boolean b = true;
        while (b) {
            Scanner scan = new Scanner(System.in);
            int choice = -1;
            try {
                choice = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            if (choice == 1) {
                g.addVehicle(new Car());
            } else if (choice == 2) {
                System.out.println("Enter the id of the car you wish to remove: ");
                int idRemove = Integer.parseInt(scan.nextLine());
                g.removeVehicle(idRemove);
            } else if (choice == 3) {
                g.calculateBill();
            } else if (choice == 4) {
                System.out.println("Thankyou, bye!");
                b=false;
            }
        }
    }
            public static void main (String[]args){
            Garage garageE = new Garage();
            Menu menu = new Menu(garageE);
            menu.chooseOption(garageE);
                System.out.println(garageE);
        }



    }