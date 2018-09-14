package com.company;

import java.util.Scanner;

public class PrimesToN {


    static boolean isPrime(int n) {
            for (int def = 2; def <= (int) Math.sqrt(n); def++) {
                if (n % def == 0) {
                    return false;
                }
            }
        return true;
    }

    static void printPrimeToN(int number) {
        for (int i = 0; i < number; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    /*  */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        printPrimeToN(number);

    }
}
