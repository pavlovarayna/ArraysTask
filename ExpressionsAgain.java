package com.company;

import java.util.Scanner;

public class AboveTheMainDiagonal {

    public static void doneAboveTheMainDiagonal(){

        Scanner in = new Scanner(System.in);

        String inputString = in.nextLine();

        int[] nums = new int[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            nums[i] =  Integer.parseInt(String.valueOf(inputString.charAt(i)));
        }
        int targetSum = in.nextInt();

        int counter = 0;

        int number = 0;

        for (int i = 0; i < nums.length ; i++) {
            int currentSum;
            if (nums[0]== 0) {
                currentSum = nums[0];
                counter += countExpressions(i + 1, nums, currentSum, targetSum);
                break;
            }

            number *= 10;
            number += nums[i];
            currentSum = number;
            counter += countExpressions(i + 1, nums, currentSum, targetSum);

        }


        System.out.println(counter);

    }

    static int countExpressions (int index, int[] nums, int currentSum, int targetSum) {
        if (index == nums.length) {
            if (currentSum == targetSum) {
                return 1;
            } else {
                return 0;
            }
        }
        int counter = 0;
        int number = 0;

        for (int i = index; i < nums.length ; i++) {

            number *= 10;
            number += nums[i];
            counter += countExpressions(index+1, nums, currentSum + number, targetSum);
            counter += countExpressions(index+1, nums, currentSum - number, targetSum);
            counter += countExpressions(index+1, nums, currentSum * number, targetSum);
            number -= nums[i];
            currentSum = 0;
            if (number==0) {
                break;
            }


        }
        return counter;
    }
}