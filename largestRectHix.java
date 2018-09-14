package com.company;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class largestRectHix {
    static void fakeInput() {
        String test = "1 2 1 1 1";
        System.setIn(new ByteArrayInputStream(test.getBytes()));
    }

    public static void main(String[] args) {
        fakeInput();
        Scanner in = new Scanner(System.in);
        String[] inputString = in.nextLine().split(" ");

        int[] numbers = new int[inputString.length];
        for (int i = 0; i < inputString.length; i++) {
            numbers[i] =  Integer.parseInt(inputString[i]);
        }

        System.out.println(solve(numbers));
    }

    static int findIndexMin(int[] numbers) {
        int indexMin = 0;
        if (numbers.length == 1) {
            return 0;
        }
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[indexMin]) {
                indexMin = i;
            }
        }
        return indexMin;
    }

    static int solve(int[] numbers) {
        int currentMax;
        if (numbers.length == 0) {
            return 0;
        }

        int width = 1;
        int minArrayElement = findIndexMin(numbers);
        int maxArea = numbers.length * numbers[minArrayElement] * width;

        int rezult = Math.max(Math.max(solve(Arrays.copyOfRange(numbers, 0, minArrayElement)),
                            solve(Arrays.copyOfRange(numbers, minArrayElement + 1, numbers.length))),
                                maxArea);

        return rezult;
    }


}
