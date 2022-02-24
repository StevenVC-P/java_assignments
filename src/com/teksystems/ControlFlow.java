package com.teksystems;

import java.util.Scanner;

public class ControlFlow {
    public static void controlFlow(){
        Scanner var = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = var.nextInt();
        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x < 20) {
            System.out.println("Between 10 and 20");
        } else {
            System.out.println("Greater than or equal to 20");
        }
        if (x < 10 || x > 20) {
            System.out.println("Out of range");
        } else {
            System.out.println("In range");
        }
        Scanner score = new Scanner(System.in);
        System.out.println("Enter grade: ");
        int grade = score.nextInt();
        if (grade < 0 || grade > 100) {
            System.out.println("Score out of range");
        } else if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        Scanner y = new Scanner(System.in);
        System.out.println("Enter a number (1-7):");
        int day = y.nextInt();
        switch (day) {
            case 1 -> System.out.println("Year of the Sunday");
            case 2 -> System.out.println("Year of the Monday");
            case 3 -> System.out.println("Year of the Tuesday");
            case 4 -> System.out.println("Year of the Wednesday");
            case 5 -> System.out.println("Year of the Thursday");
            case 6 -> System.out.println("Year of the Friday");
            case 7 -> System.out.println("Year of the Saturday");
            default -> System.out.println("Error: Invalid number");
        }
    }
}
