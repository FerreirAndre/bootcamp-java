package linked_list;

public class LinkedList<T> {
    private Node<T> refEntry;

    public LinkedList() {
        this.refEntry = null;
    }

    public void add(T value) {
        Node<T> newNode = new Node<>(value);

        if (this.isEmpty()) {
            this.refEntry = newNode;
            return;
        }
        Node<T> nodeAux = refEntry;
        for (int i = 0; i < this.size() - 1; i++) {
            nodeAux = nodeAux.getNextNode();
        }
        nodeAux.setNextNode(newNode);
    }
    private Node<T> getNode(int index){
        Node<T> nodeAux = refEntry;
        Node<T> nodeReturn = null;

    }

    public boolean isEmpty() {
        return refEntry == null;
    }

    public int size() {
        int listSize = 0;
        Node<T> nodeAux = refEntry;
        while (nodeAux.getNextNode() != null) {
            listSize++;
            if (nodeAux.getNextNode() == null) {
                break;
            } else {
                nodeAux = nodeAux.getNextNode();
            }
        }
        return listSize;
    }
}
