package com.company;

import java.util.Scanner;

public class AboveTheMainDiagonal {

    public static void doneAboveTheMainDiagonal(){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[][] matrix = new long[n][n];
        long sum = 0;
        int row = 0;
        int col = 0;

        for (int i = row; i < n ; i++) {
            for (int j = col; j < n; j++) {
                if (i == j) {
                    for (int k = j+1; k < n; k++) {
                        matrix[i][k] = (long) Math.pow(2, i + k);
                        sum += matrix[i][k];
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
