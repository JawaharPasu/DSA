package com.jawa.dataStructures.priorityqueue;

import com.jawa.dataStructures.graph.WeightedVertex;

import java.util.TreeSet;

public class PriorityQueue {
    TreeSet<WeightedVertex<?>> queue;

    public PriorityQueue() {
        this.queue = new TreeSet<>();
    }

    public void push(WeightedVertex<?> vertex) {
        queue.add(vertex);
    }

    public WeightedVertex<?> remove() {
        return this.queue.removeFirst();
    }

    public WeightedVertex<?> peek() {
        return this.queue.first();
    }

    public Integer getSize() {
       return this.queue.size();
    }

    @Override
    public String toString() {
        return "PriorityQueue{" +
                "queue=" + queue +
                '}';
    }
}
