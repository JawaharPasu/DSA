package com.jawa.algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class IntervalsTest {
    @Test
    void testMerge() {
        int[][] interval = {{1,3},{2,6},{8,10},{15,18}};
        Arrays.sort(interval, Comparator.comparingInt(a -> a[0]));
        int[][] result = Intervals.merge(interval);
        assertNotEquals(interval,result);
    }

    @Test
    void testMerge2() {
        int[][] interval = {{1,4},{0,4}};
        //Arrays.sort(interval, Comparator.comparingInt(a -> a[0]));
        int[][] result = Intervals.mergeSoln(interval);
        assertNotEquals(interval,result);
    }

    @Test
    void testInsert(){
        int[][] interval = {{1,2},{3,5},{6,7},{8,10}, {12,16}};
        int[] newinterval = {4,8};
        int[][] result = Intervals.insert(interval, newinterval);
        System.out.println(result);
    }

    @Test
    void testReverse() {
        String word = " the sky is   blue ";
        System.out.println(Intervals.reverse(word));
    }
}
