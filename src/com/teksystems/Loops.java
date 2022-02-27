package com.teksystems;

import java.util.Arrays;
import java.util.Scanner;

public class Loops {
    public static void one() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void two() {
        for (int i = 10; i <= 100; i=i+10) {
            System.out.println(i);
        }
    }

    public static void three() {
        int i=1;
        while (i<=10) {
            System.out.println(i);
            i++;
        }
    }

    public static void four() {
        for (int i = 1; i <= 100; i++) {
            if (i%5==0) {
                if((i>=25)&&(i<=75)){
                    continue;
                }
                System.out.println(i);
            }
        }
    }

    public static void five() {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
                if(i==50)
                    break;
            }
        }
    }

    public static void six() {
        int[] week = new int[]{1, 2};
        int[] day = new int[]{1, 2, 3, 4, 5};
        for (int k : week) {
            System.out.println("Week " + k + ":");
            for (int i : day) System.out.println("Day " + i);
        }
    }

    public static void seven() {
        for (int a = 10; a <= 200; a++) {

            String number = Integer.toString(a);
            int length = (int) (Math.log10(a) + 1);
            boolean isPalindrome = true;

            for (int i = 0; i < length; i++) {
                for (int j = length - 1; j >= 0; j--) {
                    if (number.charAt(i) == number.charAt(j)) {
                        isPalindrome = true;
                    } else {
                        isPalindrome = false;
                        break;
                    }
                }
           }
            if (isPalindrome) {
                System.out.println(a);
            }
        }
    }

    public static void eight() {
        int n1 = 1, n;
        for (int n2 = 0; n2 < 50;) {
            System.out.println(n2);
            n=n2+n1;
            n2=n1;
            n1=n;
        }
    }

    public static void nine() {
        Scanner count = new Scanner(System.in);
        System.out.println("Enter a number for outer loop:");
        int outerCounter = count.nextInt();
        System.out.println("Enter a number for inner loop:");
        int innerCounter = count.nextInt();
        for (int i = 1; i <= outerCounter; i++) {
            for (int j = 1; j <= innerCounter; j++) {
                System.out.println("Outer loop: " + i + " Inner loop: " + j);
            }
        }
    }
}
