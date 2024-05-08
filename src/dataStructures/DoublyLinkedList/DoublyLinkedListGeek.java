package dataStructures.DoublyLinkedList;

public class DoublyLinkedListGeek {

    NodeGeek head;
    NodeGeek tail;

    public DoublyLinkedListGeek()
    {
        this.head = null;
        this.tail = null;
    }



    public void push(int data)
    {
        NodeGeek temp = new NodeGeek(data);
        if (tail == null) {
            head = temp;
            tail = temp;
        }
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    @Override
    public String toString() {
        return "DoublyLinkedListGeek{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}
