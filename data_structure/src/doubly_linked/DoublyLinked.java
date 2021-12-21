package doubly_linked;

public class DoublyLinked<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size;

    public DoublyLinked() {
        this.firstNode = null;
        this.lastNode = null;
        this.size = 0;
    }

    public void add(T element) {
        Node<T> nodeNew = new Node<T>(element);
        nodeNew.setNextNode(null);
        nodeNew.setPrevNode(lastNode);
        if (firstNode == null) {
            firstNode = nodeNew;
        }
        if (lastNode != null) {
            lastNode.setNextNode(nodeNew);
        }
        lastNode = nodeNew;
        this.size++;
    }

    public void addIndex(T element, int index) {
        Node<T> nodeAux = getNode(index);
        Node<T> nodeNew = new Node<>(element);
        nodeNew.setNextNode(nodeAux);

        if (nodeNew.getNextNode() != null) {
            nodeNew.setPrevNode(nodeAux.getPrevNode());
            nodeNew.getNextNode().setPrevNode(nodeNew);
        } else {
            nodeNew.setPrevNode(lastNode);
            lastNode = nodeNew;
        }

        if (index == 0) {
            firstNode = nodeNew;
        } else {
            nodeNew.getPrevNode().setNextNode(nodeNew);
        }
        this.size++;
    }

    public void remove(int index) {
        if (index == 0) {
            firstNode = firstNode.getNextNode();
            if (firstNode != null) {
                firstNode.setPrevNode(null);
            }
        } else {
            Node<T> nodeAux = getNode(index);
            nodeAux.getPrevNode().setNextNode(nodeAux.getNextNode());
            if (nodeAux != lastNode) {
                nodeAux.getNextNode().setPrevNode(nodeAux.getPrevNode());
            } else {
                this.lastNode = nodeAux;
            }
        }

        this.size--;
    }

    private Node getNode(int index) {
        Node<T> nodeAux = firstNode;
        for (int i = 0; (i < index) && (nodeAux != null); i++) {
            nodeAux = nodeAux.getNextNode();
        }
        return nodeAux;
    }

    public T get(int index) {
        return (T) this.getNode(index).getValue();
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String string = "--------------------\n";
        string += "doubly linked list\n";
        string += "--------------------\n";
        Node<T> nodeAux = firstNode;
        for(int i=0;i<this.size;i++)
        {
            string += "[ Node { " + nodeAux.getValue() +"}]\n";
            nodeAux = nodeAux.getNextNode();
        }
        return string;
    }
}
