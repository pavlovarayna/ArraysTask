package com.company;

import java.util.Scanner;

public class MostFrequantElementFromArray {

    public static void doneMostFrequantElementFromArray(){

       // most freqant element from array

        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);

        for (int i = 0; i < n ; i++) {
           list.add(in.nextInt());
        }

        list.sort(Comparator.naturalOrder());
        int max = 1;
        int maxnum = 0;
        int current = 1;
        int currennum = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                current++;
                currennum = list.get(i);
                if (max <= current) {
                    max = current;
                    maxnum = currennum;
                    }
            } else {
                current = 1;
                currennum = 0;
            }
        }
        System.out.println(maxnum + " (" + max + " times)");
    }
}
