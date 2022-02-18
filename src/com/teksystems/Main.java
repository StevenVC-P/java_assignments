package com.teksystems;

public class Main {
    public static void main(String[] args) {
        int p1 = 86399;
        int second = p1 % 60;
        int minute = p1 / 60;
        int hour = minute % 60;
        minute/=60;
        System.out.printf(minute + ":" + hour + ":" + second);
    }
}


