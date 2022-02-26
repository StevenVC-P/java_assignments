package com.teksystems;

import java.util.Scanner;

public class OperNumb {
    public static void one() {
        //using calculator, divided successively  by 2, recorded 0 for even, 1 for odd, and read from the bottom to the top
        System.out.println("1: 1");
        System.out.println("8: 1000");
        System.out.println("33: 100001");
        System.out.println("78: 1001110");
        System.out.println("33987: 1000010011000011");
    }

    public static void two() {
        //multiply each digit of the binary number by the corresponding power of two, sum the results
        System.out.println("0010: 2+0 = 2");
        System.out.println("1001: 8+0+0+1 = 9");
        System.out.println("0011 0100: 32+16+0+8 = 52");
        System.out.println("0111 0010: 64+32+16+ 0+0+2+0 = 114");
        System.out.println("0010 1100 0110 0111: 8192+0+ 2048+1024+0+0+ 0+64+32+0+ 0+4+2+1 = 11367");
    }

    public static void three() {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = number.nextInt();
        System.out.println(Integer.parseInt(Integer.toBinaryString(x)));
        //before shift: decimal:2, binary:10
        x = x << 1;
        //after shift: decimal:4, binary:100
        System.out.println(x);
        System.out.println(Integer.parseInt(Integer.toBinaryString(x)));
        //following examples 9:1001 becomes 18:10010
        //following examples 17:10001 becomes 34:100010
        //following examples 88:1011000 becomes 176:1011 0000
    }
    public static void four() {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number:");
        long x = number.nextLong();
        System.out.println(Long.parseLong(Long.toBinaryString(x)));
        //before shift: decimal:150, binary:10010110
        x = x >> 2;
        //after shift: decimal:37, binary:100101
        System.out.println(x);
        System.out.println(Long.parseLong(Long.toBinaryString(x)));
        //following examples 225:1110 0001 becomes 56:111000
        //following examples 1555:110 0001 0011 becomes 388:1 1000 0100
        //following examples 32456:111 1110 1100 1000 becomes 8114:1 1111 1011 0010
    }
    public static void five() {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x=number.nextInt();
        System.out.println("Enter another number: ");
        // dec 7 = 0111
        int y=number.nextInt();
        // dec 17 = 10001
        System.out.println("z = " + (x & y));
        // addition will by 00001 = 1
        System.out.println("z = " + (x | y));
        // or will by 10111 = 23
    }
    public static void six() {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number for x: ");
        int x=number.nextInt();
        int y=x++;
        System.out.println("Before postfix: x = " + y);
        System.out.println("After postfix: x = " + x);
    }
    public static void seven() {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number for x: ");
        int x=number.nextInt();
        System.out.println("Enter a number of increments: ");
        int y=number.nextInt();
        int z=0;
        while (z<y){
            z = z + 1;
            x++;
            System.out.println("x is now " + x);
        }
    }
}
