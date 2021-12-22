package circular_list;

public class Node {
    private String value;
    private Node nextNode;

    public Node() {
    }

    public Node(String value) {
        this.value = value;
        this.nextNode = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
