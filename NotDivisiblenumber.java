package com.company;
import java.util.Scanner;

public class NotDivisiblenumber {

    static void divisibleBy3and7(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                System.out.print("");
            } else {
                if (i == number) {
                    System.out.print(i);
                } else {
                    System.out.print(i + " ");
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        divisibleBy3and7(in.nextInt());


    }
}
