package com.company;

import java.util.Scanner;

public class NumbursToN {
    static void printNumbers(int number) {
        for (int i = 1; i <= number; i++) {
            if (i == number) {
                System.out.print(i);
            } else {
                System.out.print(i + " ");
            }


        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printNumbers(scanner.nextInt());
    }
}
