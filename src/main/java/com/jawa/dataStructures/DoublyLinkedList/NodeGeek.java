package dataStructures.DoublyLinkedList;

public class NodeGeek {
    int data;
    NodeGeek prev;
    NodeGeek next;

    public NodeGeek(int data)
    {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return "NodeGeek{" +
                "data=" + data +
                ", prev=" + prev +
                ", next=" + next +
                '}';
    }
}
