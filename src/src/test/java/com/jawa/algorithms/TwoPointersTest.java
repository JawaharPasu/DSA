package com.jawa.algorithms;

import org.junit.jupiter.api.Test;

public class TwoPointersTest {
    @Test
    void testTwoSum() {
        int[] arr = {2,7,11,15};
        int target =9;
        int[] result = TwoPointers.twoSum(arr, target);
        System.out.println(result);
    }
}
