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

    public Node shift() {
        Node returnedNode = this.first;
        this.first = this.first.next;
        this.length--;
        if (this.length == 0) this.last = null;
        return returnedNode;
    }

    public SinglyLinkedList unShift(Node node) {
        node.next = this.first;
        this.first = node;
        length++;
        return this;
    }

    public Node get(Integer index) {
        if (index == 0) return this.first;
        if (index>this.length) return null;
        Node currenntNode = this.first;
        for (int i = 0; i<index; i++) {
            currenntNode = currenntNode.next;
        }
        return currenntNode;
    }

    public SinglyLinkedList insert(Node newNode, Integer position) {
        if (position> this.length) return null;
        if (position == 0) {
            unShift(newNode);
            this.length++;
            return this;
        }
        Node currentNode = this.first;
        for(int i=0; i<position-1; i++) {
            currentNode = currentNode.next;
        }
        // 3 4 5
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        this.length++;
        return this;
    }

    public SinglyLinkedList set(Node newValue, Integer position) {
        if (position == 0) {
            newValue.next = this.first.next;
            this.first = newValue;
            return this;
        }
        if (position> this.length) return null;
        Node currentNode = this.first;
        for (int i=0; i<position-1;i++){
            currentNode = currentNode.next;
        }
        newValue.next = currentNode.next.next;
        currentNode.next = newValue;
        if (position.equals(this.length-1)) this.last = newValue;
        return this;
    }

    public Node remove(Integer position) {
        if (position == 0) return shift();
        if (position == this.length-1) return pop();
        Node previousPositionNode = get(position-1);
        Node removedNode = previousPositionNode.next;
        previousPositionNode.next = removedNode.next;
        this.length--;
        return removedNode;
    }

    public SinglyLinkedList revere(){
        Node node = this.first;
        this.first = this.last;
        this.last = node;
        Node prevNode = null;
        Node nextNode = null;
        for (int i = 0 ; i<this.length; i++) {
            nextNode = node.next;
            node.next = prevNode;
            prevNode = node;
            node = nextNode;
        }
        return this;
    }

    public void print(){
        Node currentNode = this.first;
        for (int i =0; i<length;i++){
            System.out.print(currentNode.val + ",");
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
