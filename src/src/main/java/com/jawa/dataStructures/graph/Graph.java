package dataStructures.graph;

import dataStructures.Stack;

import java.util.*;

public class Graph<T extends Comparable> {
    public Map<T, List<T>> adjacencyList;
    private List<T> visitedNodes;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    public void addVertex(T t) {
        if (!adjacencyList.containsKey(t)) adjacencyList.put(t, new ArrayList<>());
    }

    public void addEdge(T t1, T t2) {
        if (adjacencyList.containsKey(t1) && adjacencyList.containsKey(t2)) {
            adjacencyList.get(t1).add(t2);
            adjacencyList.get(t2).add(t1);
        }
    }

    public void removeEdge(T t1, T t2) {
        if (adjacencyList.containsKey(t1) && adjacencyList.containsKey(t2)) {
            adjacencyList.get(t1).remove(t2);
            adjacencyList.get(t2).remove(t1);
        }
    }

    public void removeVertex(T t) {
        if (adjacencyList.containsKey(t)) {
            List<T> listToBeRemoved = adjacencyList.get(t);
            for (int i = 0; i < listToBeRemoved.size(); i++) {
                removeEdge(t, listToBeRemoved.get(i));
            }
            adjacencyList.remove(t);
        }
    }

    // The Dfs recursive and the Dfs Iterative can be optimised by adding a MAp of visted nodes boolean and instead of contains,
    // we can use map.get to get the boolean to make recursive call/ add the vertex to the stack
    public void DfsRecursive(T t) {
        visitedNodes = new ArrayList<>();
        if (adjacencyList.containsKey(t)) {
            DfsCallRecursive(t);
        }
        System.out.println(visitedNodes);
    }

    public void DfsCallRecursive(T t) {
        if (!visitedNodes.contains(t)) {
            visitedNodes.add(t);
        }
        for (T node: adjacencyList.get(t)) {
            if (!visitedNodes.contains(node)) DfsCallRecursive(node);
        }
    }

    //DFS iterative we are using stack
    public void DfsIterative(T t) {
        Stack<T> stack = new Stack<>();
        stack.addElement(t);
        visitedNodes = new ArrayList<>();
        while (!stack.isEmpty()) {
            T node = stack.removeElement();
            if (!visitedNodes.contains(node)) visitedNodes.add(node);
            for (T neighbour: adjacencyList.get(node)) {
                if (!visitedNodes.contains(neighbour)) stack.addElement(neighbour);
            }
        }
        System.out.println(visitedNodes);
    }

    //BFS iterative we are using queue
    public void BfsIterative(T t) {
        visitedNodes = new ArrayList<>();
        LinkedList<T> list = new LinkedList<>();
        list.add(t);
        while (!list.isEmpty()) {
            T node = list.pop();
            if (!visitedNodes.contains(node)) visitedNodes.add(node);
            for (T neighbour:adjacencyList.get(node)) {
                if (!visitedNodes.contains(neighbour)) list.add(neighbour);
            }
        }
        System.out.println(visitedNodes);
    }

    @Override
    public String toString() {
        return "Graph{" +
                "adjacencyList=" + adjacencyList +
                '}';
    }
}
