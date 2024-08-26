package com.jawa.algorithms;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplePointerTest {

    @Test
    void testremoveDuplicates1() {
       int[] nums = {1,1,1,2,2,3};
       int k =3;
       k %=8;
        System.out.println(k);
       int expected = 5;
       int actual = MultiplePointer.removeDuplicates(nums);
       assertEquals(actual, expected);
    }

    @Test
    void testremoveDuplicates2() {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int expected = 7;
        int actual = MultiplePointer.removeDuplicates(nums);
        assertEquals(actual, expected);
    }

    @Test
    void testMaxProfit1() {
        int[] prices = {3,3};
        int expected = 0;
        int actual = MultiplePointer.maxProfit(prices);
        LinkedList<String> list = new LinkedList<>();
        assertEquals(expected, actual);
    }
}
