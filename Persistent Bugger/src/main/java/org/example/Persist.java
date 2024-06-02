package org.example;

public class Persist {
    public static int persistence(long n) {
        return 0;
    }

    public static long getProductOfDigits(String[] digits) {
        if(digits.length == 0){
            return 0;
        }
        
        long output = 1;
        for(String digit : digits){
            output *= Long.parseLong(digit);
        }
        return output;
    }

    // Splits the string by its digits then returns the product of the digits as a string
    public static String stringProduct(String str) {
        String[] digits = str.split("");
        long temp = getProductOfDigits(digits);
        return String.valueOf(temp);
    }
}