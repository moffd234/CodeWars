package org.example;

public class Kata {

    public static String high(String s) {
        // Your code here...
        return "";
    }

    public static int calcLetterScore(char letter) {
        return letter - 'a' + 1;
    }

    public static int calcWordScore(String str) {
        int sum = 0;
        for(Character c: str.toCharArray()) {
            sum += calcLetterScore(c);
        }
        return sum;
    }

}