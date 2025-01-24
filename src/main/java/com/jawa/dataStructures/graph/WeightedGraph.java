package com.jawa.dataStructures.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightedGraph<T extends Comparable> {
    public Map<T, List<WeightedVertex<T>>> adjacencyList;

    public WeightedGraph() {
        this.adjacencyList = new HashMap<>();
    }

    public void addVertex(T vertex){
        if (!adjacencyList.containsKey(vertex)) adjacencyList.put(vertex, new ArrayList<>());
    }

    public void addEdge(T v1, T v2, Integer weight) {
        if (adjacencyList.containsKey(v1) && adjacencyList.containsKey(v2)) {
            adjacencyList.get(v1).add(new WeightedVertex<>(v2, (double) weight));
            adjacencyList.get(v2).add(new WeightedVertex<>(v1, (double) weight));
        }
    }

    @Override
    public String toString() {
        return "WeightedGraph{" +
                "adjacencyList=" + adjacencyList +
                '}';
    }
}
