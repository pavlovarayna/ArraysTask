package com.company;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class RevercedArray {


    public static void doneRevercedArrays(){
       // fakeInput();

        Scanner scanner = new Scanner(System.in);
        String[] inArray = scanner.nextLine().split(" ");
        String[] revArray = new String[inArray.length];

        for (int i = 0; i <= inArray.length - 1 ; i++) {
            revArray[i] = inArray[inArray.length - 1 - i];
            if (i == inArray.length - 1) {
                System.out.print(revArray[i]);
            } else {
                System.out.print(revArray[i] + ", ");
            }
        }
    }
}
