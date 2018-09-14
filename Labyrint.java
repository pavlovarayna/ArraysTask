package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Labyrint {
    static boolean inRange(int value, int max) {
            return 0 <= value && value < max;
    }
    static  boolean pathExists(int row, int col, char[][]labirint) {
        // checks

        // ?? check for cycle
        // outside of lab
        int rows = labirint.length;
        int cols = labirint[row].length;

        int[] dRows = {0, -1, 0,+1};
        int[] dCols = {-1, 0, +1, 0};


        for (int dir = 0; dir < dRows.length; dir++) {
            var nextRow = row + dRows[dir];
            var nextCol = col + dCols[dir];

        if(!inRange(nextRow, rows) || !inRange(nextCol, cols)) {
            continue;
        }

        // already visited or wall
        if (labirint[nextRow][nextCol] == 'x') {
            continue;
        }

        // exit
        if (labirint[nextRow][nextCol] == 'e') {
            return true;
        }

        labirint[nextRow][nextCol] = 'x';
        var hasPath = pathExists(nextRow, nextCol, labirint);
        labirint[nextRow][nextCol] = ' ';
        if (hasPath) {
            return true;
        }
        }

        return false;
    }
    public static void main(String[] args) {
        char[][] labirint = {
                {' ',' ','x','x'},
                {' ',' ','x','x'},
                {' ',' ',' ','e'},
                {' ',' ','x','x'}
        };

        var hasExit = pathExists(1, 0, labirint);
        System.out.println(hasExit);

      }


}
