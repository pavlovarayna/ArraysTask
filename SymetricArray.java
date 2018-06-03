package com.company;

import java.util.Scanner;

public class SymetricArray {
    public static void doneSymetricArray(){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] array = scanner.nextLine().split(" ");
            boolean isSimetric = true;
            for (int j = 0; j < array.length/2; j++) {
                if (!array[j].equals(array[array.length-1-j])) {
                    isSimetric = false;
                    break;
                }
            }
            System.out.println(isSimetric ? "Yes" : "No"); // !!

        }





    }
}
