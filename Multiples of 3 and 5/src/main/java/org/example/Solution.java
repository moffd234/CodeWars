package org.example;

import java.util.ArrayList;

public class Solution {

    /*
    Find all multiples of 3 and 5
    Sum them together
     */
    public int solution(int number) {
        ArrayList<Integer> multiples = getMultiples(number);

        return 0;
    }


    public ArrayList<Integer> getMultiples(int num) {
        ArrayList<Integer> multiples = new ArrayList<>();
        for(int i = 3; i < num; i++) {
            if(i % 3 == 0 || i % 5 == 0){
                multiples.add(i);
            }
        }
        return multiples;
    }

    public int sumMultiples(ArrayList<Integer> multiples) {
        return 0;
    }
}