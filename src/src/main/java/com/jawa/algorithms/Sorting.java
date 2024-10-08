package com.jawa.algorithms;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorting {

    public static Integer[] bubbleSort(Integer[] arr) {
        int swapCount;
        do {
            swapCount = 0;
            for (int i = 0; i<arr.length-1; i++) {
                if (arr[i] > arr[i+1]) {
                    int swap = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = swap;
                    swapCount++;
                }
            }
        } while (swapCount > 0);
        return arr;
    }

    public static Integer[] selectionSort(Integer[] arr) {
        for (int i=0; i<arr.length; i++) {
            int min = arr[i];
            int swapindex = i;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[j] < min) {
                    swapindex = j;
                    min = arr[j];
                }
            }
            int swap = arr[i];
            arr[i] = arr[swapindex];
            arr[swapindex] = swap;
        }
        return arr;
    }

    public static Integer[] insertionSort(Integer[] arr) {
        for (int i =1; i< arr.length-1; i++) {
            int currentval = arr[i];
            for (int j = i-1; j>0 && arr[j]>currentval; j--) {
                if (arr[j]>arr[j+1]) {
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
        return arr;
    }

    public static Integer[] mergeSort(Integer[] arr) {
        if (arr.length==1) return arr;
        int mid = (int) Math.floor((double) arr.length /2);
        Integer[] arr1 = new Integer[mid];
        Integer[] arr2 = new Integer[arr.length - mid];
        for (int i=0; i<mid; i++) {
            arr1[i] = arr[i];
        }
        for (int i = 0; i<arr.length - mid; i++){
            arr2[i] = arr[i+mid];
        }
        return mergeArrays(mergeSort(arr1), mergeSort(arr2));
    }

    public static Integer[] mergeArrays(Integer[] arr1, Integer[] arr2) {
        Integer[] result = new Integer[arr1.length+arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<arr1.length && j<arr2.length) {
            if (arr1[i]<arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (j<arr2.length) {
            result[k] = arr2[j];
            j++;
            k++;
        }
        while (i<arr1.length) {
            result[k] = arr1[i];
            i++;
            k++;
        }
        return result;
    }

    public static Integer[] quickSort(Integer[] arr, int startIndex, int endIndex) {
        if (startIndex<endIndex) {
            int pivot = pivotIndex(arr,startIndex,endIndex);
            //left
            quickSort(arr, startIndex, pivot-1);
            //right
            quickSort(arr, pivot+1, endIndex);
        }
        return arr;
    }
    //7, 9, 1, 2, 5, 6, 3, 8
    //
    public static int pivotIndex(Integer[] arr, int startIndex, int endIndex) {
        int pivot=startIndex;
        int i=startIndex;
        int startnumber = arr[startIndex];
        //int swap = 0;
        while (i<endIndex) {
            if (arr[i+1]<startnumber) {
                pivot++;
                swap(arr, pivot, i+1);
            }
            i++;
        }
        swap(arr, pivot, startIndex);
        System.out.println(Arrays.toString(arr));
        return pivot;
    }

    public static Integer[] swap(Integer[] arr, int i, int j) {
        int swap = 0;
        swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
        return arr;
    }

    public static Integer getDigit(Integer num, Integer position) {
        return (int)Math.floor(Math.abs(num)/Math.pow(10, position))%10;
    }

    public static Integer digitCount(Integer num) {
        return num==0 ? 1 : (int)Math.floor(Math.log10(Math.abs(num)))+1;
    }

    public static Integer mostDigits(Integer[] arr) {
        int max = 0;
        for (Integer integer : arr) {
            max = Math.max(max, digitCount(integer));
        }
        return max;
    }

    public static Integer[] radixSort(Integer[] arr) {
        int maxdigit = mostDigits(arr);
        for (int i = 0; i< maxdigit; i++) {
            Map<Integer, List<Integer>> mappedNumbers = new TreeMap<>();
            for (Integer integer: arr) {
                int digit = getDigit(integer, i);
                if (!mappedNumbers.containsKey(digit)) {
                    List<Integer> list = new ArrayList<>();
                    list.add(integer);
                    mappedNumbers.put(digit, list);
                } else {
                    mappedNumbers.get(digit).add(integer);
                }
            }
            Collection<List<Integer>> values = mappedNumbers.values();
            List<Integer> localSortedList = values.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
            arr = localSortedList.toArray(new Integer[localSortedList.size()]);
        }
        return arr;
    }
}
