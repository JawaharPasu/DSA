import com.jawa.algorithms.MultiplePointer;
import com.jawa.dataStructures.BST.BinarySearchTree;
import com.jawa.dataStructures.BST.Node;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{5, 34, 43, 44, 745634, 63, 94566, 834};
        Integer[] arr1 = new Integer[]{10, 7, 3, 5, 9, 11, 4};
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
        //System.out.println(Arrays.toString(Sorting.quickSort(arr1, 0, arr1.length-1)));
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

        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insert(12);
        binarySearchTree.insert(10);
        binarySearchTree.insert(17);
        binarySearchTree.insert(9);
        binarySearchTree.insert(11);
        binarySearchTree.insert(15);
        binarySearchTree.insert(18);

        Node<Integer> node = binarySearchTree.find(8);

        System.out.println(node);
        System.out.println(binarySearchTree.bfs());
        System.out.println(binarySearchTree.dfsPreOrd());
        System.out.println(binarySearchTree.dfsPostOrd());
        System.out.println(binarySearchTree.dfsinOrd());

        /*MaxBinaryHeap binaryHeap = new MaxBinaryHeap();
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
        System.out.println(binaryHeap);*/
//        System.out.println(HashFunction.hash("helloo", 7));

        /*//      A
        //     / \
        //    B   C
        //    |   |
        //    D - E
        //     \ /
        //      F
        Graph<String> graph = new Graph<>();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "E");
        graph.addEdge("D", "E");
        graph.addEdge("D", "F");
        graph.addEdge("E", "F");
        graph.DfsRecursive("A");
        graph.DfsIterative("A");
        graph.BfsIterative("A");*/
//        System.out.println(graph);
//        graph.removeEdge("Bangalore", "Hyderabad");
//        System.out.println(graph);
//        graph.removeVertex("Chennai");
//        System.out.println(graph);
        /*WeightedGraph<String> weightedGraph = new WeightedGraph<>();
        weightedGraph.addVertex("A");
        weightedGraph.addVertex("B");
        weightedGraph.addVertex("C");
        weightedGraph.addVertex("D");
        weightedGraph.addVertex("E");
        weightedGraph.addVertex("F");

        weightedGraph.addEdge("A", "B", 4);
        weightedGraph.addEdge("A", "C", 2);
        weightedGraph.addEdge("B", "E", 3);
        weightedGraph.addEdge("C", "D", 2);
        weightedGraph.addEdge("C", "F", 4);
        weightedGraph.addEdge("D", "E", 3);
        weightedGraph.addEdge("D", "F", 1);
        weightedGraph.addEdge("E", "F", 1);


        DijkstraShortestPath<String> dijkstraShortestPath = new DijkstraShortestPath<>("A", "E", weightedGraph);

        dijkstraShortestPath.dijkstra();
        dijkstraShortestPath.shortestPath();*/

        /*Integer[] coins = {1, 5, 10, 25};
        Integer n = coins.length;
        Integer sum = 5;

        Integer[][] dp = new Integer[n + 1][sum + 1];
        for (Integer[] row : dp)
            Arrays.fill(row, -1);

        //Integer num = 45;
        Long duration1 = System.currentTimeMillis();
        //System.out.println(DynamicMemoization.fibonacci(num, new Integer[num]));
        System.out.println(Recursion.countCoins(coins, n, sum));
        Long timeTaken = System.currentTimeMillis() - duration1;
        System.out.println(timeTaken);

        Long duration2 = System.currentTimeMillis();
        //System.out.println(Recursion.fibonacci(num));
        System.out.println(DynamicMemoization.countCoins(coins, n , sum, dp));
        Long timeTaken2 = System.currentTimeMillis() - duration2;
        System.out.println(timeTaken2);

        Long duration3 = System.currentTimeMillis();
        //DynamicTabulated.fibonacci(num);
        System.out.println(DynamicTabulated.countCoinsOptimised(coins, n, sum));
        Long timeTaken3 = System.currentTimeMillis() - duration3;
        System.out.println(timeTaken3);*/
        /*String[] grid = {"/\\","\\/"};
        char[] subgrid = grid[0].toCharArray();
        System.out.println(subgrid);

        String str = "abracada";
        char[] chars = str.toCharArray();

        System.out.println(chars);*/


        System.out.println(MultiplePointer.lengthOfLongestSubstring("pwwkew"));
        double median = 0;

        Optional got = Optional.ofNullable("GOT");
        Map<Integer, List<String>> valmap = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("abc");
        valmap.put(1, list);
        valmap.get(1).add("bca");
        System.out.println("hjgh".substring(1));
    }

}