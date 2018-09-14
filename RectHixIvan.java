package com.company;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class RectHixIvan
{
    static void fakeInput()
    {
        String input = "1 2 1 1 1";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    static int solve(int[] heights)
    {
        if (heights.length == 0)
            return 0;

        int indexOfMin = findIndexOfMin(heights);
        int minArea = heights[indexOfMin] * heights.length;

        return Math.max(Math.max(solve(Arrays.copyOfRange(heights, indexOfMin + 1, heights.length)),
                solve(Arrays.copyOfRange(heights, 0, indexOfMin))), minArea);
    }

    static int findIndexOfMin(int[] heights)
    {
        if (heights.length == 1)
            return 0;

        int minIndex = 0;
        for (int i = 1; i < heights.length; i++)
            if (heights[i] < heights[minIndex])
                minIndex = i;

        return minIndex;
    }

    static int findLargestRectangleArea(int[] heights)
    {
        return solve(heights);
    }

    public static void main(String[] args)
    {
        fakeInput();
        Scanner input = new Scanner(System.in);

        int[] heights = Arrays.stream(input.nextLine().split("\\s"))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(findLargestRectangleArea(heights));
    }
}
