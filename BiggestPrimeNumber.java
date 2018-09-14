package com.company;

import java.util.Scanner;

public class BiggestPrimeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        biggestPrimeNum(scanner.nextInt());
    }

    static int biggestPrimeNum (int number) {
        for (int i = number; i <= 1; i--) {
            if (isPrime(i)) {
                return i;
            }
        }
        return 1;
    }

    static boolean isPrime(int number) {
        for (int def = 2; def <= (int) Math.sqrt(number); def++) {
            if (number % def == 0) {
                return false;
            }
        }
        return true;
    }


}
