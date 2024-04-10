package dataStructures.singlyLinkedLists;

public class SinglyLinkedList {
    Node first, last;
    Integer length;

    public SinglyLinkedList() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    public SinglyLinkedList push(Node node) {
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

    public Node pop() {
        if (this.length == 1) {
            Node currentNode = this.first;
            this.first = null;
            this.last = null;
            this.length = 0;
            return currentNode;
        }
        Node currentNode = this.first;
        Node removedNode = this.last;
        while (currentNode.next != this.last) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        this.last = currentNode;
        this.length--;
        return removedNode;
    }

    public void print(){
        Node currentNode = this.first;
        for (int i =0; i<length;i++){
            System.out.println(currentNode.val);
            currentNode = currentNode.next;
        }
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
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
