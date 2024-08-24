package dataStructures;

import java.util.LinkedList;

public class Stack<E> extends LinkedList<E> {

    public void addElement(E e) {
        push(e);
    }

    public E removeElement() {
        return pop();
    }

}
