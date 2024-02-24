import algorithms.FrequencyCounter;
import algorithms.MultiplePointer;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //System.out.println(FrequencyCounter.checkFrequency(List.of(1,2,3), List.of(1,2,3,4)));
        //System.out.println(FrequencyCounter.anagramCheck("cohert", "cohert"));
        //MultiplePointer.leastSumZero(List.of(-4,-3,-1,0,2,4,5));
        //MultiplePointer.countUniqueValues(Arrays.asList(1,1,1,2,2));
        //MultiplePointer.maxSubArraySum(List.of(2,4,1,6,3,4,8,9,2,6,3,5), 4);
        System.out.println(MultiplePointer.isSubarray("hello", "hell world"));
        System.out.println(MultiplePointer.isSubarray("abc", "acb"));
    }
}