import algorithms.*;
import dataStructures.BST.BinarySearchTree;
import dataStructures.BST.Node;
import dataStructures.BinaryHeap.MaxBinaryHeap;
import dataStructures.DoublyLinkedList.DoublyLinkedList;
import dataStructures.DoublyLinkedList.DoublyLinkedListGeek;
import dataStructures.Stack;
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
//        SinglyLinkedList list = new SinglyLinkedList();
//        list.push(new Node(1));
//        list.push(new Node(3));
//        list.print();
//        System.out.println(list.get(0));
//        list.insert(new Node(2), 1);
//        System.out.println(list);
//
//        list.set(new Node(0), 0);
//        System.out.println(list);
//        //list.push(new Node(4));
//        list.push(new Node("read"));
//        list.print();
//        System.out.println();
//        list.reverse();
//
////        System.out.println(list.set(new Node(4),3));
////        System.out.println(list.set(new Node(5),2));
////        System.out.println(list.insert(new Node(3), 2));
////        System.out.println(list.remove(2));
//        list.print();
//        System.out.println(list.getLength());
//        Node<Integer> node = new Node<>(0);
//        System.out.println(node);
//        DoublyLinkedListGeek doublyLinkedListGeek = new DoublyLinkedListGeek();
//        doublyLinkedListGeek.push(0);
//        doublyLinkedListGeek.push(1);
//        doublyLinkedListGeek.push(2);

        /*DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);

        list.push(1);
        list.push(2);
        list.push(3);*/

        /*Stack<Integer> numberStack = new Stack<>();

        numberStack.push(1);
        numberStack.push(2);
        numberStack.push(4);

        numberStack.pop();

        System.out.println(numberStack);*/

       /* BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insert(9);
        binarySearchTree.insert(11);
        binarySearchTree.insert(8);
        binarySearchTree.insert(7);
        binarySearchTree.insert(10);

        Node<Integer> node = binarySearchTree.find(8);

        System.out.println(node);
        System.out.println(binarySearchTree.bfs());
        System.out.println(binarySearchTree.dfsPreOrd());
        System.out.println(binarySearchTree.dfsPostOrd());
        System.out.println(binarySearchTree.dfsinOrd());*/

        MaxBinaryHeap binaryHeap = new MaxBinaryHeap();
        binaryHeap.insert(100);
        binaryHeap.insert(101);
        binaryHeap.insert(98);
        binaryHeap.insert(86);
        binaryHeap.insert(102);
        binaryHeap.insert(65);
        binaryHeap.insert(78);

        System.out.println(binaryHeap);
        System.out.println(binaryHeap.returnMax());
        System.out.println(binaryHeap);
        System.out.println(binaryHeap.returnMax());
        System.out.println(binaryHeap);
    }
}