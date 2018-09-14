package com.company;

import java.util.Scanner;

public class 3Summ {

    public static void done3Summ(){

        Scanner in = new Scanner(System.in);

        String inputNumbers = in.nextLine();
        String[] firstRow = inputNumbers.split(", " );
        int[] nums = new int[firstRow.length];

        for (int i = 0; i < firstRow.length ; i++) {
        nums[i] = Integer.parseInt(firstRow[i]);
        }

        int target = 0;
        int currentSum = 0;
        int size = nums.length;

        HashSet<ArrayList<Integer>> threeSum1 = new HashSet<>();


        for (int i = 0; i < size - 2; i++) {
        for (int j = i + 1; j < size - 1; j++) {
        for (int k = j + 1; k < size ; k++) {
        currentSum = nums[i] + nums[j] + nums[k];
        if (currentSum == target) {
        ArrayList<Integer> currentSumArray = new ArrayList<>();
        currentSumArray.add(nums[i]);
        currentSumArray.add(nums[j]);
        currentSumArray.add(nums[k]);
        Collections.sort(currentSumArray);
          /*          for (int q = 0; q < currentSumArray.size(); q++){
                        System.out.println(currentSumArray.get(q));
                    }*/
        threeSum1.add(currentSumArray);


        //currentSumArray.clear();
        currentSum = 0;
        }

        }
        }
        }

        List<List<Integer>> threeSum = new ArrayList<>(threeSum1);
        //NB!
    }
}