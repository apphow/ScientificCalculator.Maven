package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float number1, number2, result;
        String name;

        System.out.println("Hi. What's your name?");
        name = scan.nextLine();

        System.out.println("Hi " + name + ", Enter first number: ");
        number1 = scan.nextFloat();
        System.out.println("Enter second number: ");
        number2 = scan.nextFloat();
        result = number1 + number2;
        System.out.println(result);

    }



}
