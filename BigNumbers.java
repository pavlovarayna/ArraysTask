package com.company;
// ne minava v judge!!!

import java.util.Scanner;

public class BigNumbers {
    public static void BigNumbers(){
        Scanner scanner = new Scanner(System.in);
        String n =scanner.next();
        String m = scanner.next();


        int[] firstArr = new int[Integer.parseInt(n)];
        int[] secArr = new int[Integer.parseInt(m)];


        for (int i = 0; i < Integer.parseInt(n); i++) {
            firstArr[i] = scanner.nextInt();
        }
        for (int i = 0; i < Integer.parseInt(m); i++) {
            secArr[i] = scanner.nextInt();
        }

        int size;
        if (Integer.parseInt(n) == Integer.parseInt(m) || Integer.parseInt(n) > Integer.parseInt(m)) {
            size = Integer.parseInt(n);
        } else {
            size = Integer.parseInt(m);
        }

        int[] rezultArr = new int[size];


        for (int i = 0; i < size; i++) {
            int currentRezult = 0;
            if (Integer.parseInt(n) < size && i > Integer.parseInt(n) - 1) {
                currentRezult = secArr[i];
            } else if (Integer.parseInt(m) < size && i > Integer.parseInt(m) - 1){
                currentRezult = secArr[i];
            } else {
                currentRezult = firstArr[i] + secArr[i];
            }

            int lastDigit = currentRezult % 10;
            int plusDigit = currentRezult / 10;

            rezultArr[i] += lastDigit;
            if (plusDigit > 0) {
                rezultArr[i+1] = plusDigit;
            }
            if (i != size - 1) {
                System.out.print(rezultArr[i] + " ");
            } else {
                System.out.println(rezultArr[i]);
            }
        }





    }
}
