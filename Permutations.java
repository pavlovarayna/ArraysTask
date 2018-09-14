package com.company;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// variations

public class Permutations {



    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int rank = in.nextInt();
        in.nextLine();
        String inputNumbers = in.nextLine();
        String[] firstRow = inputNumbers.split(" " );

        // prochitane na nums v int[] sas stream
        //int[] nums = Arrays.stream(in.nextLine().split(" "))
         //       .mapToInt(Integer::parseInt)
         //       .toArray();


        int[] n = new int[firstRow.length];

        for (int i = 0; i < firstRow.length ; i++) {
            n[i] = Integer.parseInt(firstRow[i]);
        }

        Arrays.sort(n);
        //int[] n = {1, 2, 4};

        List<Integer> permutation = Stream.generate(() -> 0)
                .limit(rank)
                .collect(Collectors.toList());

        makePermutation(0, n, rank, permutation);
    }

    public static void makePermutation(int index, int[] n, int rank, List<Integer> permutation) {

        if (index == rank) {
            for (int i = 0; i < permutation.size(); i++) {
                System.out.print(permutation.get(i));

            }
            System.out.println();
            return;
        }

        HashSet<Integer> used = new HashSet<>(); // permutations - hashset in main!!!
        for (int value = 0; value < n.length ; value++) {
            if (used.contains(n[value])) {
                continue;
            }

            used.add(n[value]);
            permutation.set(index, n[value]);
            makePermutation(index + 1, n, rank, permutation);
            used.remove(n[value]);



        }

    }
}
