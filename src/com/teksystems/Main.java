package com.teksystems;

public class Main {
    public static void main(String[] args) {
        int seconds = 86398;
        int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;
        p2/=60;
        System.out.printf(p2 + ":" + p3 + ":" + p1);
        // System.out.print("\n");
    }
}


