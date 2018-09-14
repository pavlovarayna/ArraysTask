package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class BracketsCase {

    public static void main(String[] args) {

        int n = 6;
        String expression = "";

        generateExpression(expression, n);

        for (String item: brackets) {
            System.out.println(item);
        }
    }
    static HashSet<String> brackets = new HashSet<>();

    static HashSet<String> generateExpression(String expression, int n) {

        if (expression.length() == n) {
            brackets.add(expression);
            return brackets;
        }



        HashSet<String> currentBrackets = generateExpression(expression + "()", n);
        brackets.addAll(currentBrackets);
        currentBrackets = generateExpression("(" + expression + ")", n);
        brackets.addAll(currentBrackets);
        currentBrackets = generateExpression("()" + expression, n);
        brackets.addAll(currentBrackets);

        return brackets;
    }


}