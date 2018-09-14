package com.company;

import java.util.Scanner;

public class MaxSumOfKElements {

    public static void doneMaxSumOfKElements(){

        // max sum of k elements
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in. nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);

        for (int i = 0; i < n ; i++) {
           list.add(in.nextInt());
        }

        list.sort(Comparator.naturalOrder());
        int sum = 0;
        for (int i = list.size() - 1; i > list.size() - k - 1; i--) {
            sum += list.get(i);

        }
        System.out.println(sum);
    }
}
