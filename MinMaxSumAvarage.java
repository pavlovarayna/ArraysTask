package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class MinMaxSumAvarage {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        int n = scanner.nextInt();


        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sum = 0;

        if (n >= 1 && n <= 1000) {
            for (int i = 0; i < n; i++) {
                int number = scanner.nextInt();
                if (number >= -10000 && number <= 10000) {
                    if (number < min) {
                        min = number;
                    } else if (number > max) {
                        max = number;
                    }
                    sum += number;
                }
            }
            double avg = sum / n;
            System.out.println("min=" + df.format(min));
            System.out.println("max=" + df.format(max));
            System.out.println("sum=" + df.format(sum));
            System.out.println("avg=" + df.format(avg));
        }
    }

    private static ArrayList<Integer> Min(ArrayList<Integer>) {

        double min = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (number < min) {
                min = number;
            }

        }
    }
}
