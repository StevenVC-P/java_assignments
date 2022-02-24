package com.teksystems;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Practice {

    public static void practice() {
        int p1 = 86399;
        int second = p1 % 60;
        int minute = p1 / 60;
        int hour = minute % 60;
        minute/=60;
        System.out.println(minute + ":" + hour + ":" + second + "\r\n");

        Scanner newTemp = new Scanner(System.in);
        System.out.println("Enter a temperature in fahenheit");
        double fahrenheit = newTemp.nextInt();
        double celsius = (5d/9d)*(fahrenheit - 32);
        DecimalFormat df = new DecimalFormat("##.##");
        String formatted = df.format(celsius);
        System.out.println("Temperature in Celsius: " + formatted);
    }
}
