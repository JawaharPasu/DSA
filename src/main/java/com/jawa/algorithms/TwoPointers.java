package com.jawa.algorithms;

public class TwoPointers {

    public static int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        while(i<j) {
            if (numbers[i]+numbers[j]-target == 0) break;
            else if (numbers[i]+numbers[j]-target > 0) j--;
            else i++;
        }
        return new int[]{i+1,j+1};
    }
}
