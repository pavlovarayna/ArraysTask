package com.company;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class TargetSum {

    static void fakeInput(){
        String test = "1 1 1 1 1\n" +
                "3";
        System.setIn(new ByteArrayInputStream(test.getBytes()));
    }
    public static void main (String[] args) {
        fakeInput();
        Scanner in = new Scanner(System.in);
        int[] numbers = Arrays.stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int targetSum = in.nextInt();
        int rezult = solve(0, numbers, 0, targetSum);
        System.out.println(rezult);
    }

        static int solve(int index, int[] numbers, int current, int targetSum) {
            if (index == numbers.length) {
                if (current == targetSum) {
                    return 1;
                }
                return 0;
            }
                int counter = 0;
                counter += solve(index + 1, numbers, current + numbers[index], targetSum);
                counter += solve(index + 1, numbers, current - numbers[index], targetSum);
                return counter;

    }
}






