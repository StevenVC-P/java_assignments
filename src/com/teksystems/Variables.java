package com.teksystems;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.*;

public class Variables {


    public static void one() {
        int x = 5;
        int y = 3;
        int z = x + y;
        System.out.println(z);
    }

    public static void two() {
        double x = 5;
        double y = 3;
        double z = x + y;
        System.out.println(z);
    }

    public static void three() {
        int x = 5;
        double y = 3;
        double z = x + y;
        System.out.println(z + " is a double");
    }

    public static void four() {
        float x = (float) 8.9;
        int y = 3;
        float z = x / y;
        System.out.println(z + " is a float");
        double a = 8.9;
        int b = 3;
        double c = a / b;
        System.out.println(c + " is a double");
    }

    public static void five() {
        int x = 5;
        double y = 3;
        double z = x / y;
        System.out.println(z + " is a double");
        int a = (int) z;
        System.out.println(a + " is an integer");
    }

    public static void six() {
        int x = 5;
        int y = 6;
        double q = y / x;
        System.out.println("q = " + q + " y as an integer");
        q = Double.valueOf(y) / x;
        System.out.println("q = " + q + " y as a double");
    }

    public static void seven() {
        final double pi = 3.14;
        System.out.println(pi * 2);
    }

    public static void eight() {
        double coffee = 2.00;
        double espresso = 2.50;
        double greenTea = 1.55;
        double subtotal;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many coffees? ");
        int coffeeOrder = scan.nextInt();
        System.out.println("How many espressos? ");
        int espressoOrder = scan.nextInt();
        System.out.println("How many green teas? ");
        int greenTeaOrder = scan.nextInt();
        subtotal = (coffeeOrder * coffee) + (espressoOrder * espresso) + (greenTeaOrder * greenTea);
        double salesTax = subtotal * .08;
        DecimalFormat df= new DecimalFormat("#.##");
        double totalSale = (subtotal + salesTax);
        System.out.println("Total Sale: " + df.format(totalSale));
    }
}
