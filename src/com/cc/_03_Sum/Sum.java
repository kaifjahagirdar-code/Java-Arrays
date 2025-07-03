package com.cc._03_Sum;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = keyboard.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = keyboard.nextInt();
        }

        int result = calculateSum(arr);
        System.out.println("Sum of the array elements: " + result);

        keyboard.close();
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
