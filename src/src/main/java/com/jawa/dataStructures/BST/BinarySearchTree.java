package com.jawa.dataStructures.BST;

import java.util.Deque;
import java.util.LinkedList;

public class BinarySearchTree<T extends Comparable> {
    public Node<T> root;
    private LinkedList<T> list;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(T t) {
        Node<T> node = new Node<>(t);
        if (this.root==null) this.root=node;
        else {
            Node<T> newNode = this.root;
            while (newNode != null) {
                if (newNode.value.compareTo(node.value) < 1) {
                    if(newNode.right!=null) newNode=newNode.right;
                    else {
                        newNode.right=node;
                        break;
                    }
                }
                else {
                    if (newNode.left!=null) newNode = newNode.left;
                    else  {
                        newNode.left=node;
                        break;
                    }
                }
            }
        }
    }

    public Node<T> find(T t) {
        Node<T> newNode = this.root;
        while (newNode!=null) {
            if (newNode.value.equals(t)) return newNode;
            else if (newNode.value.compareTo(t)<1) newNode = newNode.right;
            else newNode = newNode.left;
            }
        return null;
    }

    public LinkedList<T> bfs(){
        LinkedList<Node<T>> queue = new LinkedList<>();
        LinkedList<T> list = new LinkedList<>();
        if (this.root!= null) queue.offer(this.root);
        while (!queue.isEmpty()) {
            Node<T> node = queue.pop();
            list.offer(node.value);
            if (node.left!=null) queue.offer(node.left);
            if (node.right!=null) queue.offer(node.right);
        }
        return list;
    }

    /*public LinkedList<T> dfsPreOrd() {
        LinkedList<Node<T>> queue = new LinkedList<>();
        LinkedList<T> list = new LinkedList<>();
        if (this.root!= null) {
            queue.offer(this.root);
            list.offer(this.root.value);
        }
        Node<T> newNode = queue.removeLast();
        while(newNode.left!=null) {
                queue.offer(newNode.left);
                list.offer(newNode.left.value);
                newNode=newNode.left;
        }
        while (!queue.isEmpty()) {
            Node<T> nextNode = newNode;
            while (nextNode!=null) {
                if (nextNode.left != null && !list.contains(nextNode.left.value)) {
                    queue.offer(nextNode.left);
                    list.offer(nextNode.left.value);
                }
                nextNode=nextNode.left;
            }
            newNode = queue.removeLast();
            if (newNode.right!=null) {
                list.offer(newNode.right.value);
            }
        }
        return list;
    }*/

    public LinkedList<T> dfsPreOrd() {
        this.list = new LinkedList<>();
        traversePreOrd(this.root);
        return this.list;
    }

    private void traversePreOrd(Node<T> node) {
        this.list.offer(node.value);
        if (node.left!=null) traversePreOrd(node.left);
        if (node.right!=null) traversePreOrd(node.right);
    }

    public LinkedList<T> dfsPostOrd() {
        this.list = new LinkedList<>();
        traversePostOrd(this.root);
        return this.list;
    }

    private void traversePostOrd(Node<T> node) {
        if (node.left!=null) traversePostOrd(node.left);
        if (node.right!=null) traversePostOrd(node.right);
        this.list.offer(node.value);
    }

    public LinkedList<T> dfsinOrd() {
        this.list = new LinkedList<>();
        traverseinOrd(this.root);
        return this.list;
    }

    private void traverseinOrd(Node<T> node) {
        if (node.left!=null) traverseinOrd(node.left);
        this.list.offer(node.value);
        if (node.right!=null) traverseinOrd(node.right);
    }
}
