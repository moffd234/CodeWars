package org.example;

import java.util.ArrayList;

public class Max {
    public static int sequence(int[] arr) {
        return 4;
    }


    public static ArrayList<Integer[]> findSubArrays(int[] nums) {
        ArrayList<Integer[]> output = new ArrayList<>();
        output.add(new Integer[]{});
        // For loop for start index
        for (int i = 0; i < nums.length; i++)

            // For loop for end index
            for (int j = i; j < nums.length; j++) {
                ArrayList<Integer> temp = new ArrayList<>();
                // For loop to add subarray elements
                for (int k = i; k <=j; k++) {
                    temp.add(nums[k]);
                }
                output.add(temp.toArray(new Integer[0]));
            }


        return output;
    }

    public static int findSum(Integer[] nums) {

        return 0;
    }
}