import algorithms.*;
import dataStructures.singlyLinkedLists.Node;
import dataStructures.singlyLinkedLists.SinglyLinkedList;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{5, 34, 43, 44, 745634, 63, 94566, 834};
        //System.out.println(FrequencyCounter.checkFrequency(List.of(1,2,3), List.of(1,2,3,4)));
        //System.out.println(FrequencyCounter.anagramCheck("cohert", "cohert"));
        //MultiplePointer.leastSumZero(List.of(-4,-3,-1,0,2,4,5));
        //MultiplePointer.countUniqueValues(Arrays.asList(1,1,1,2,2));
        //MultiplePointer.maxSubArraySum(List.of(2,4,1,6,3,4,8,9,2,6,3,5), 4);
        //System.out.println(MultiplePointer.isSubarray("hello", "hell world"));
        //System.out.println(MultiplePointer.isSubarray("abc", "acb"));
        //Randoms.printPatternTriangle(7);
        //Randoms.printDiamondPattern(5);
        //System.out.println(Recursion.reverse("abra"));
        //System.out.println(Recursion.palindrome("tacocat"));
        //System.out.println(MultiplePointer.isSubstring("hello", "he"));
        //System.out.println(Arrays.toString(Sorting.mergeSort(new Integer[]{5, 3, 1, 2, 7, 6, 9, 8})));
        //System.out.println(Arrays.toString(Sorting.mergeArrays(new Integer[]{3,6,9}, new Integer[]{5,8,11})));
        //System.out.println(Sorting.pivotIndex(new Integer[]{7, 9, 11, 1, 2, 5, 6, 3, 8}, 0, 8));
        //System.out.println(Sorting.pivotIndex(new Integer[]{3, 1, 2, 5, 6, 7, 11, 9, 8}, 0, 4));
        //System.out.println(Sorting.pivotIndex(new Integer[]{2, 1, 3, 5, 6, 7, 11, 9, 8}, 6, 8));
        //System.out.println(Arrays.toString(Sorting.quickSort(arr, 0, arr.length-1)));
        //System.out.println(Sorting.getDigit(345,1));
        //System.out.println(Sorting.digitCount(1));
        //System.out.println(Sorting.mostDigits(arr));
        //System.out.println(Arrays.toString(Sorting.radixSort(arr)));
        SinglyLinkedList list = new SinglyLinkedList();
        list.push(new Node(1));
        list.push(new Node(2));
        list.push(new Node(3));
        list.print();
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.getLength());
    }
}