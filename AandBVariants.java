package com.company;

import java.util.Scanner;

public class AandBVariants {

    public static void doneAandBVariants(){

        Scanner in = new Scanner(System.in);
        int rank = in.nextInt();
        in.nextLine();
        String firstLine = in.nextLine();
        String[] firstRow = firstLine.split(" ");
        int n = firstRow.length;
        String[] numbers = new String[n];

        for (int i = 0; i < n ; i++) {
            numbers[i] = String.valueOf(firstRow[i]);
//           System.out.print(numbers[i] + " ");
        }
        ArrayList<String> output = new ArrayList<>(currentVariant(rank, numbers[0], numbers[1], ""));
        Collections.sort(output);
        for (int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i));
        }

    }
    public static HashSet<String> variant = new HashSet<>();

    public static HashSet<String> currentVariant(int rank, String a, String b, String currentString) {


        if (currentString.length() == rank) {
            variant.add(currentString);
            return variant;
        }

        currentVariant(rank, a, b, currentString.concat(a));
        currentVariant(rank, a, b, currentString.concat(b));
        return variant;
    }
    }
}