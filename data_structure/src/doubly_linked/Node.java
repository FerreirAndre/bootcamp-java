package doubly_linked;

public class Node<T> {
    private T value;
    private Node<T> nextNode;
    private Node<T> prevNode;

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return (T) value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<T> getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(Node<T> prevNode) {
        this.prevNode = prevNode;
    }
}
