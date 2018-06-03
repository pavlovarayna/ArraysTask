package com.company;

import java.util.Scanner;

public class AboveTheMainDiagonal2 {
    public static void doneAboveTheMainDiagonal2(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nRows = n;
        int mCols = n;

        int[][] matrix = new int[nRows][mCols];

        for (int row = 0; row < nRows ; row++) {
            for (int col = 0; col < mCols ; col++) {
                if (row == 0 && col == 0) {
                    matrix[row][col] = 1;
                } else if (row != 0 && col == 0) {
                    matrix[row][col] = matrix[row-1][0] * 2;
                } else {
                    matrix[row][col] = matrix[row][col-1] * 2;
                }
            }
        }

        int sumDia = 0;
        for (short row = 0; row < nRows; row++) {
            for (short col = 0; col < mCols; col++) {
                if (row == col) {
                    for (int i = col; i < mCols; i++) {
                        sumDia += matrix[row][i];
                    }


                }
            }
        }

        System.out.println(sumDia);

    }
}
