package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringReverce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(stringReverce("Telerik"));
    }
    static String stringReverce(String str) {
        if (str.length() == 0) {
            return str;
        }
        char firstLetter = str.charAt(0);
        String reversed = stringReverce(str.substring(1)) + firstLetter;
        return reversed;
    }
}




