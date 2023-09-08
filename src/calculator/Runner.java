package calculator;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer num1 = null;
        Integer num2 = null;
        String operator = null;


        System.out.println("Enter number 1: ");
        num1 = scan.nextInt();

        System.out.println("Enter number 2: ");
        num2 = scan.nextInt();
        System.out.println("Enter an operator: ");
        operator = scan.next();

        if (operator.equals("+")){
            System.out.println(num1+" + "+num2+" = "+(num1+num2));
        } else if (operator.equals("-")) {
                System.out.println(num1+" - "+num2+" = "+(num1-num2));
        } else if
            (operator.equals("*")) {
                System.out.println(num1+" x "+num2+" = "+(num1*num2));
        } else if
        (operator.equals("/")) {
            System.out.println(num1+" / "+num2+" = "+(num1/num2));
        } else {
            System.out.println("You have entered an invalid operator.");
        }
    }
}
