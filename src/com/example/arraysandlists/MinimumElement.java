package com.example.arraysandlists;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        int count = 5;
        int myArray[] = readIntegers(count);
        System.out.println(Arrays.toString(myArray));
        int minValue = findMin(myArray);
        System.out.println(minValue);
    }

    public static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " numbers.");
        int[] values = new int[count];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int findMin(int array[]) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}
