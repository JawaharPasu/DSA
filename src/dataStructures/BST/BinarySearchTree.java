package dataStructures.BST;

public class BinarySearchTree<T extends Comparable> {
    public Node<T> root;

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
}
