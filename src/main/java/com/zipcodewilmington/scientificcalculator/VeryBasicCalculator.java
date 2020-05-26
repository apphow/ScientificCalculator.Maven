package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class VeryBasicCalculator {
    Scanner scan = new Scanner(System.in);

    public void showMenu() {
        System.out.println("Enter 1 to add");;
        System.out.println("Enter 2 to subtract");
        System.out.println("Enter 3 to multiply");
        System.out.println("Enter 4 to divide");

    }

    public double division() {
        double a, b;
        System.out.println("Enter first value");
        a = scan.nextDouble();
        System.out.println("Enter first value");
        b = scan.nextDouble();
        double val = a / b;

        return val;
    }

    public double multiply() {
        double a, b;
        System.out.println("Enter first value");
        a = scan.nextDouble();
        System.out.println("Enter first value");
        b = scan.nextDouble();
        double val = a * b;

        return val;
    }

    public double substraction() {
        double a, b;
        System.out.println("Enter first value");
        a = scan.nextDouble();
        System.out.println("Enter first value");
        b = scan.nextDouble();
        double val = a - b;

        return val;
    }

    public double addition() {
        double a, b;
        System.out.println("Enter first value");
        a = scan.nextDouble();
        System.out.println("Enter first value");
        b = scan.nextDouble();
        double val = a + b;

        return val;
    }

    public static void main(String[] args) {
        VeryBasicCalculator calc = new VeryBasicCalculator();
        Scanner scan = new Scanner(System.in);
        int x;
        double score;
        calc.showMenu();
        x = scan.nextInt();

        switch (x) {
            case 1:
                score = calc.addition();
                System.out.println(score);
                break;
            case 2:
                score = calc.substraction();
                System.out.println(score);
                break;
            case 3:
                score = calc.multiply();
                System.out.println(score);
                break;
            case 4:
                score = calc.division();
                System.out.println(score);
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }

    }
}



