package algorithms;

import java.util.List;

public class MultiplePointer {

    //Given a sorted array, find the least sum that gives 0
    // (-4,-3,-1,0,2,4,5) -> (-4,4)
    public static void leastSumZero(List<Integer> list) {
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            int sum = list.get(left) + list.get(right);
            if (sum == 0) {
                System.out.println("numbers are: " + list.get(left) + " " + list.get(right));
                break;
            } else if (sum > 0) {
                right--;
            } else {
                left ++;
            }
        }
        System.out.println("Done");
    }

    // 1,1,1,2,2 -> 2
    // empty -> 0
    // -2,-1,-1,0,1 -> 4
    public static void countUniqueValues(List<Integer> list) {
        int i = 0;
        int j = 1;
        while (j <= list.size()-1) {
            if (list.get(i) != list.get(j)) {
                i++;
                list.set(i, list.get(j));
                j++;
            } else {
                j++;
            }
        }
        if (list.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(i+1);
        }
    }

    // Sliding window pattern
    // ((1,3,5,9,7,4), 2) -> 9+7 = 16 (9+7)
    // ((2,4,1,6,3,4,8,9,2,6,3,5), 4) -> 25 (8+9+2+6)
    public static void maxSubArraySum(List<Integer> list,int window) {
        int tempSum;
        int maxSum = 0;
        if (window > list.size()-1) {
            System.out.println("window is larger than the array size");
        } else {
            for (int i=0; i<window; i++) {
               maxSum = maxSum + list.get(i);
            }
            tempSum = maxSum;
            for (int j = window; j < list.size(); j++) {
                tempSum = tempSum-list.get(j-window)+list.get(j);
                maxSum = Math.max(maxSum, tempSum);
            }
        }
        System.out.println(maxSum);
    }

    /*isSubsequence('hello', 'hello world'); // true
    isSubsequence('sing', 'sting'); // true
    isSubsequence('abc', 'abracadabra'); // true
    isSubsequence('abc', 'acb'); // false (order matters)*/
    public static boolean isSubarray(String first, String second) {
        if (first.isEmpty()) return true;
        int i = 0;
        int j = 0;
        while (j < second.length()) {
            if (first.charAt(i) == second.charAt(j)) i++;
            if (i==first.length()) return true;
            j++;
        }
        return false;
    }

    public static boolean isSubstring(String mainString, String subString) {
        if (subString.length() > mainString.length()) return false;
        int i = 0;
        int j = 0;
        while (i < mainString.length()-1) {
            if (mainString.charAt(i) == subString.charAt(j)) j++;
            i++;
            if (j == subString.length()) break;
            if (mainString.charAt(i) != subString.charAt(j) && j >= 1) j=0;
        }
        return j != 0;
    }
}
