package dataStructures.DoublyLinkedList;

// this class is correct, but the construction of node should involve all the declared variables,
// if variables are set after initalisation, stackoverflow error is received as prevNode and nextNode refrences loop infinitely
public class DoublyLinkedList<T> {

    Node<T> first;
    Node<T> last;
    Integer length;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    public DoublyLinkedList<T> push(T value) {
        Node<T> node = new Node<>(value);
        if (this.length==0) {
            this.first = node;
        } else {
            this.last.next = node;
            node.previous = this.last;
        }
        this.last = node;
        this.length++;
        return this;
    }

    @Override
    public String toString() {
        return "DoublyLinkedList{" +
                "first=" + first +
                ", last=" + last +
                ", length=" + length +
                '}';
    }
}
