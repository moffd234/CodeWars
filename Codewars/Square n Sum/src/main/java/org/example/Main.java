package org.example;

public class Main {
    public static void main(String[] args) {

    }

    public static int squareSum(int[] n){
        int sum = 0;
        for(int i : n){
            sum += i*i;
        }
        return sum;
    }
}