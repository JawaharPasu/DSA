package dataStructures.DoublyLinkedList;

public class Node<T> {
    public T value;
    public Node<T> previous;
    public Node<T> next;

    public Node(T value) {
        this.value = value;
        this.previous = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", previous=" + previous +
                ", next=" + next +
                '}';
    }
}
