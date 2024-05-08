package dataStructures.singlyLinkedLists;

public class Node<T> {
    T val;
    Node<T> next;
    public Node(T val) {
        this.val = val;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
