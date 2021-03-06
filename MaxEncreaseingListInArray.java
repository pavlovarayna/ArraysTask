package com.company;

import java.util.Scanner;

public class MaxEncreaseingListInArray {

    public static void doneMaxEncreaseingListInArray(){

        // max encreaseing  list in array
        int n = in.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = in.nextInt();
        }

        int max = 0;
        int current = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i-1]) {
                current++;
                max = Math.max(max, current);
            } else {
                max = Math.max(max, current);
                current = 1;
            }
        }
        System.out.println(max);
    }
}
