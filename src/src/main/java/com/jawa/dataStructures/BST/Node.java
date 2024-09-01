package com.jawa.dataStructures.BST;

import java.util.Comparator;

public class Node<T extends Comparable> {
    public T value;
    public Node<T> left,right;

    public Node(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
