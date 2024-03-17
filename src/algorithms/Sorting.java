package algorithms;

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

    public static Integer[] insertionSort(Integer[] arr) {
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
}
