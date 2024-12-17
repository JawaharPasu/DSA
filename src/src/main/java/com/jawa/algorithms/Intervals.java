package com.jawa.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Intervals {

    public static int[][] merge(int[][] intervals) {
        int duplicate = 0;
        int a,b,c,d;
        for(int i=0; i < intervals.length-1 ; i++) {
            a=intervals[i][0];
            b=intervals[i][1];
            c=intervals[i+1][0];
            d=intervals[i+1][1];
            if(intervals[i][1]>=intervals[i+1][0]) {
                intervals[i][1] =intervals[i+1][1];
                intervals[i+1][0] = intervals[i][0];
                duplicate++;
            }
        }

        int[][] result = new int[intervals.length - duplicate][2];
        result[0][0] = intervals[0][0];
        result[0][1] = intervals[0][1];
        int j=1;
        for (int i=1; i<intervals.length; i++) {
            if(intervals[i-1][0] == intervals[i][0] && intervals[i-1][1] == intervals[i][1]) continue;
            else {
                result[j][0] = intervals[i][0];
                result[j][1] = intervals[i][1];
                j++;
            }
        }
        return result;
    }

    public static int[][] mergeSoln(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] prev = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if (interval[0] <= prev[1]) {
                prev[1] = Math.max(prev[1], interval[1]);
            } else {
                merged.add(prev);
                prev = interval;
            }
        }

        merged.add(prev);

        return merged.toArray(new int[merged.size()][]);
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> result = new ArrayList<>();
        int[] prev = newInterval;
        boolean noskip=true;
        for (int i=0; i<intervals.length; i++) {
            int[] interval = intervals[i];
            if (newInterval[0] <= interval[1] && interval[0]<=newInterval[1]) {
                prev[0] = Math.min(prev[0], interval[0]);
                prev[1] = Math.max(prev[1], interval[1]);
            } else {
                result.add(interval);
            }
        }

        result.add(prev);
        result.sort(Comparator.comparingInt(a -> a[0]));
        return result.toArray(new int[result.size()][]);
    }
}
