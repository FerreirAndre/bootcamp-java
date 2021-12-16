package linked_list;

public class Node<T> {
    private T value;
    private Node nextNode;

    public Node(T value) {
        this.value = value;
        this.nextNode = null;
    }

    public Node() {
        this.nextNode = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
