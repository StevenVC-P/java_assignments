package com.teksystems;

import java.util.Arrays;
import java.util.Objects;

import static java.util.Collections.copy;

public class ArrayEx {
    public static void one() {
        int[] firstArray = {1, 2, 3};
        System.out.println(Arrays.toString(firstArray));
    }

    public static void two() {
        int[] middle = {13, 5, 7, 68, 2};
        for (int i = 0; i < middle.length; i++) {
            if (i == middle.length / 2) {
                System.out.println(middle[i]);
            }
        }
    }

    public static void three() {
        String[] color = {"red", "green", "blue", "yellow"};
        System.out.println(color.length);
        String[] color2 = color.clone();
        System.out.println(Arrays.toString(color2));
    }

    public static void four() {
        int[] numbers = {4, 12, 8, 100, 30};
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (i == 0 || i == numbers.length - 1) {
                System.out.println(numbers[i]);
            }
        }
    }

    public static void five() {
        int[] numbers = new int[5];
        for (int i = 0; i <= numbers.length - 1; i++) numbers[i] = i;
        System.out.println(Arrays.toString(numbers));
    }

    public static void six() {
        int[] numbers = new int[5];
        for (int i = 0; i <= numbers.length - 1; i++) numbers[i] = i * 2;
        System.out.println(Arrays.toString(numbers));
    }

    public static void seven() {
        int[] numbers = new int[5];
        for (int i = 0; i <= numbers.length - 1; i++) numbers[i] = i;
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (i != numbers.length / 2) {
                System.out.println(numbers[i]);
            }
        }
    }

    public static void eight() {
        int[] numbers = new int[5];
        for (int i = 0; i <= numbers.length - 1; i++) numbers[i] = i;
        int temp = numbers[0];
        numbers[0] = numbers[2];
        numbers[2] = temp;
        System.out.println(Arrays.toString(numbers));
    }

    public static void nine() {
        int[] numbers = {4,2,9,13,1,0};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (i == 0 || i == numbers.length - 1) {
                System.out.println(numbers[i]);
            }
        }
    }

    public static void ten() {
        Object[] elements = {5, "string", "strung", "strong", 5.5};
        System.out.println(Arrays.toString(elements));
    }
}

