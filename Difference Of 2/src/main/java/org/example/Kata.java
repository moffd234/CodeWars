package org.example;

public class Kata {
    public static int[][] twosDifference(int[] array) {

        return new int[][]{new int[]{}};

    }

    public static int[][] findSubArrays(int[] input) {
        int n = input.length;
        if (n < 2) {
            return new int[][]{};
        }

        int[][] subArrays = new int[(n * (n - 1)) / 2][2];
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                subArrays[index][0] = input[i];
                subArrays[index][1] = input[j];
                index++;
            }
        }

        return subArrays;
    }
}