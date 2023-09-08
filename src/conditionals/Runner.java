package conditionals;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Integer num1 = null;
//        Integer num2 = null;
//        Integer num3 = null;
//
//        System.out.println("Enter number 1: ");
//        num1 = scan.nextInt();
//
//        System.out.println("Enter number 2: ");
//        num2 = scan.nextInt();
//
//        System.out.println(num1);
//        System.out.println(num2);
//
//        if (num1 >= num2){
//            System.out.println(num1 + " is the bigger number!");
//        } else{
//            System.out.println(num2 + " is the bigger number!");
//        }
//
//        System.out.println("Enter another number: ");
//        num3 = scan.nextInt();
//
//        if (num3 % 2 == 0){
//            System.out.println(num3 + " is even");
//        } else {
//            System.out.println(num3 + " is odd");
//        }

//        String colour = null;
//        System.out.println("Pick a colour: red, amber of green:");
//        colour = scan.next();
//
//        if (colour.equals("red")){
//            System.out.println("STOP!");
//        } else if (colour.equals("amber")) {
//            System.out.println("WAIT");
//        } else if (colour.equals("green")) {
//            System.out.println("GO!");
//
//        }

        Integer num4 = null;
        System.out.println("Enter a number between 1 and 12:");
        num4 = scan.nextInt();

        switch (num4){
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Your number is not valid");
        }
    }}
