package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class VeryBasicCalculator {
    Scanner scan = new Scanner(System.in);
    double x, y;

    public void showOptions() {
        System.out.println("Enter 1 to add");
        System.out.println("Enter 2 to subtract");
        System.out.println("Enter 3 to multiply");
        System.out.println("Enter 4 to divide");

    }

    public double divide() {
        System.out.println("Enter your first number");
        x = scan.nextDouble();
        System.out.println("Enter your second number");
        y = scan.nextDouble();
        double value = x / y;

        return value;
    }

    public double multiply(){
        double x, y;
        System.out.println("Enter your first number");
        x = scan.nextDouble();
        System.out.println("Enter your second number");
        y = scan.nextDouble();
        double value = x * y;

        return value;
    }

    public double subtract() {
        System.out.println("Enter your first number");
        x = scan.nextDouble();
        System.out.println("Enter second number");
        y = scan.nextDouble();
        double value = x - y;

        return value;
    }

    public double add() {
        System.out.println("Enter your first number");
        x = scan.nextDouble();
        System.out.println("Enter second number");
        y = scan.nextDouble();
        double value = x + y;

        return value;
    }


    public static void main(String[] args) {
        VeryBasicCalculator math = new VeryBasicCalculator();
        Scanner scan = new Scanner(System.in);
        int x;
        double choice;
        math.showOptions();
        x = scan.nextInt();

        switch (x) {
            case 1:
                choice = math.add();
                System.out.println(choice);
                break;
            case 2:
                choice = math.subtract();
                System.out.println(choice);
                break;
            case 3:
                choice = math.multiply();
                System.out.println(choice);
                break;
            case 4:
                choice = math.divide();
                System.out.println(choice);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}



