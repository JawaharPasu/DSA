package com.jawa.dataStructures.singlyLinkedLists;

public class SinglyLinkedList<T> {
    Node<T> first, last;
    Integer length;

    public SinglyLinkedList() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    public SinglyLinkedList<T> push(Node<T> node) {
        if (this.first == null) {
            this.first = node;
            this.last = node;
            this.length++;
        } else {
            this.last.next = node;
            this.last = node;
            length++;
        }
        return this;
    }

    public Node<T> pop() {
        if (this.length == 1) {
            Node<T> currentNode = this.first;
            this.first = null;
            this.last = null;
            this.length = 0;
            return currentNode;
        }
        Node<T> currentNode = this.first;
        Node<T> removedNode = this.last;
        while (currentNode.next != this.last) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        this.last = currentNode;
        this.length--;
        return removedNode;
    }

    public Node<T> shift() {
        Node<T> returnedNode = this.first;
        this.first = this.first.next;
        this.length--;
        if (this.length == 0) this.last = null;
        return returnedNode;
    }

    public SinglyLinkedList<T> unShift(Node<T> node) {
        node.next = this.first;
        this.first = node;
        length++;
        return this;
    }

    public Node<T> get(Integer index) {
        if (index == 0) return this.first;
        if (index>this.length) return null;
        Node<T> currenntNode = this.first;
        for (int i = 0; i<index; i++) {
            currenntNode = currenntNode.next;
        }
        return currenntNode;
    }

    public SinglyLinkedList<T> insert(Node<T> newNode, Integer position) {
        if (position> this.length) return null;
        if (position == 0) {
            unShift(newNode);
            this.length++;
            return this;
        }
        Node<T> currentNode = this.first;
        for(int i=0; i<position-1; i++) {
            currentNode = currentNode.next;
        }
        // 3 4 5
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        this.length++;
        return this;
    }

    public SinglyLinkedList<T> set(Node<T> newValue, Integer position) {
        if (position == 0) {
            newValue.next = this.first.next;
            this.first = newValue;
            return this;
        }
        if (position> this.length) return null;
        Node<T> currentNode = this.first;
        for (int i=0; i<position-1;i++){
            currentNode = currentNode.next;
        }
        newValue.next = currentNode.next.next;
        currentNode.next = newValue;
        if (position.equals(this.length-1)) this.last = newValue;
        return this;
    }

    public Node<T> remove(Integer position) {
        if (position == 0) return shift();
        if (position == this.length-1) return pop();
        Node<T> previousPositionNode = get(position-1);
        Node<T> removedNode = previousPositionNode.next;
        previousPositionNode.next = removedNode.next;
        this.length--;
        return removedNode;
    }

    /**
     * this method reverses tbe singly linked list
     * example 1->2->3->4->5->6->7
     * first node -> 1, last node ->7
     * first declare a variable node
     * then swap the first and the last node
     * result after swap:
     * node ->1, firstnode->7, lastnode->1
     * declare 2 more variables prevNode and the nextNode
     *  prevNode            -> node                     -> nextNode (this is the state at line 136, after 1st line in the for loop)
     *  null                -> 1                        -> 2
     *  null                <- 1 (node.next = prevNode) -/- 2 (the next node link from 1 -> 2 is broken)
     *  1 (prevNode = node) -/- 2 (node = nextNode)     -> 3 (the loop repeats after this)
     * @return reversed singly linked list 7->6->5->4->3->2->1
     *
     */
    public SinglyLinkedList<T> reverse(){
        Node<T> node = this.first;
        this.first = this.last;
        this.last = node;
        Node<T> prevNode = null;
        Node<T> nextNode = null;
        for (int i = 0 ; i<this.length; i++) {
            nextNode = node.next;
            node.next = prevNode;
            prevNode = node;
            node = nextNode;
        }
        return this;
    }

    public void print(){
        Node<T> currentNode = this.first;
        for (int i =0; i<length;i++){
            System.out.print(currentNode.val + ",");
            currentNode = currentNode.next;
        }
    }

    public Node<T> getFirst() {
        return first;
    }

    public Node<T> getLast() {
        return last;
    }

    public Integer getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "first=" + first +
                ", last=" + last +
                ", length=" + length +
                '}';
    }
}
