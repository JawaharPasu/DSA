package com.jawa.dataStructures.graph;

import com.jawa.dataStructures.priorityqueue.PriorityQueue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DijkstraShortestPath<T extends Comparable> {
    Map<T, Double> distanceList;
    Map<T, T> previousNode;
    List<T> visitedNodes;
    T startNode, endNode, smallest;
    WeightedGraph<T> weightedGraph;
    PriorityQueue queue = new PriorityQueue();

    public DijkstraShortestPath(T start, T end, WeightedGraph<T> weightedGraph) {
        this.distanceList = new HashMap<>();
        this.previousNode = new HashMap<>();
        this.visitedNodes = new ArrayList<>();
        this.startNode = start;
        this.endNode = end;
        this.weightedGraph = weightedGraph;
        initializeAll();
    }

    private void initializeAll() {

        for (T t: this.weightedGraph.adjacencyList.keySet()) {
            if (startNode.equals(t)) {
                this.distanceList.put(t, 0.0);
                queue.push(new WeightedVertex<>(t, 0.0));
            } else {
                this.distanceList.put(t, Double.POSITIVE_INFINITY);
                queue.push(new WeightedVertex<>(t, Double.POSITIVE_INFINITY));
            }
            this.previousNode.put(t, null);
        }
    }

    public void dijkstra() {
        while (queue.getSize() > 0) {
            smallest = (T) queue.remove().getVertex();
            if (smallest.equals(endNode)) {
                System.out.println(this.distanceList);
                System.out.println(this.previousNode);
            }
            if (this.distanceList.get(smallest) != Double.POSITIVE_INFINITY) {
                // iterate each neighbour for the current node
                for (WeightedVertex<T> t : this.weightedGraph.adjacencyList.get(smallest)) {
                    //System.out.println(t);
                    //calculate the distance from the start node
                    Double candidateWeight = this.distanceList.get(smallest) + t.getWeight();
                    // compare if the current weight is less than the previous stored
                    if (candidateWeight < this.distanceList.get(t.getVertex())) {
                        // update the weight of the current neighbour of the node
                        this.distanceList.put(t.getVertex(), candidateWeight);
                        // update the neighnour previous to the current node
                        this.previousNode.put(t.getVertex(), smallest);
                        // enqueu the element to the queue
                        this.queue.push(new WeightedVertex<>(t.getVertex(), candidateWeight));
                    }
                }
            }
            //System.out.println(smallest);
        }
    }

    public void shortestPath() {
        dijkstra();
        traverse(endNode);
    }

    private void traverse(T node) {
        if (this.previousNode.get(node) == null) {
            System.out.print(node);
        } else {
            traverse(this.previousNode.get(node));
            System.out.print(" -> " + node);
        }
    }

    public void printDistanceList() {
        System.out.println("DistanceList : " + distanceList);
    }

    public void printVisited() {
        System.out.println("Visited Nodes : " + visitedNodes);
    }

    public void printPrevNode() {
        System.out.println("Previous node : " + previousNode);
    }
}
