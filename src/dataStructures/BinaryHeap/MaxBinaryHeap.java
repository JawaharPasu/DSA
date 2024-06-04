package dataStructures.BinaryHeap;

import java.util.ArrayList;

public class MaxBinaryHeap {
    private ArrayList<Integer> list;

    public MaxBinaryHeap() {
        this.list = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "MaxBinaryHeap{" +
                "list=" + list +
                '}';
    }

    public void insert(Integer number) {
        list.add(number);
        Integer index = (int) Math.floor(list.size()-1)/2;
        Integer numberPos = list.size()-1;
        while (number > list.get(index)) {
            list.set(numberPos, list.get(index));
            list.set(index, number);
            numberPos = index;
            index = (int) Math.floor(numberPos-1)/2;
        }
    }

    public Integer returnMax() {
        Integer value = list.get(0);
        list.set(0, list.removeLast());
        Integer index = 0;
        Integer swapIndex = 0;
        while ((index*2+1 < list.size()) || (index*2+2 < list.size())) {
            if ((index*2+2 < list.size()) && (list.get(index*2+2) > list.get(index*2+1))) swapIndex = index*2+2;
            else swapIndex = index*2+1;
            if (list.get(index) < list.get(swapIndex)) {
                Integer numberToBeSwapped = list.get(swapIndex);
                list.set(swapIndex, list.get(index));
                list.set(index, numberToBeSwapped);
                index = swapIndex;
            }
            else break;
        }
        return value;
    }
}
