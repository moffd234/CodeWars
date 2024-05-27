package org.example;

public class NumberUtils {

    public static boolean isNarcissistic(int number) {
        int sum = getSum(number);
        return false;
    }

    public static int getSum(int n){
        int sum = 0;

        // Get each individual digit
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

}