package com.company;

import java.util.Scanner;

public class ThreeGroups {
    public static void doneThreeGroups() {
        Scanner scanner = new Scanner(System.in);
        String[] inArray = scanner.nextLine().split(" ");
        int n = inArray.length;
        int[] numArray = new int[n];

        String nullGroup = "";
        String oneGroup = "";
        String twoGroup = "";

        for (int i = 0; i < n ; i++) {
            numArray[i] = Integer.parseInt(inArray[i]);
            if (numArray[i] % 3 == 0) {
                nullGroup += numArray[i] + " ";
            } else if (numArray[i] % 3 == 1) {
                oneGroup += numArray[i] + " ";
            } else if (numArray[i] % 3 == 2) {
                twoGroup += numArray[i] + " ";
            }
        }

        System.out.println(nullGroup);
        System.out.println(oneGroup);
        System.out.println(twoGroup);
    }
}
