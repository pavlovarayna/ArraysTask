package com.company;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Numerology {


    public static void main(String[] args) {
        //fakeInput();
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < inputString.length(); i++) {
            numbers.add(Integer.parseInt(String.valueOf(inputString.charAt(i))));
        }

        int[] rezult = new int[10];
        solve(numbers, rezult);
        for (int i = 0; i < 10 ; i++) {
            if (i == 9) {
                System.out.print(rezult[i]);
            }
                else {
                System.out.print(rezult[i] + " ");
            }
        }

        }

    static void solve(ArrayList<Integer> numbers, int[] rezult) {
        if (numbers.size()== 1) {
            rezult[numbers.get(0)] += 1;
        }
        for (int i = 1; i < numbers.size(); i++) {
            int a = numbers.get(i - 1);
            int b = numbers.get(i);
            numbers.set(i, calculation(a, b));
            numbers.remove(i - 1);
            if (numbers.size() == 1) {
                rezult[numbers.get(0)] += 1;
            } else {
                solve(numbers, rezult);
            }

            numbers.set(i - 1, a); /// vajno e da se varne v na4alnoto sastoianie!!! podobno Massage in bottles
            numbers.add(i, b);

        }

    }

    static int calculation (int a, int b) {

        return (a + b) * (a ^ b) % 10;
    }





    }

