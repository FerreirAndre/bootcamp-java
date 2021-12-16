package queue;

public class Queue {
    private Node refNodeEntry;

    public Queue() {
        this.refNodeEntry = null;
    }

    public void enqueue(Object newObj) {
        Node nextNode = new Node(newObj);
        nextNode.setRefNode(refNodeEntry);
        refNodeEntry = nextNode;
    }

    public Object dequeue() {
        if (!this.isEmpty()) {
            Node firstNode = refNodeEntry;
            Node nodeAux = refNodeEntry;
            while (true) {
                if (firstNode.getRefNode() != null) {
                    nodeAux = firstNode;
                    firstNode = firstNode.getRefNode();
                } else {
                    nodeAux.setRefNode(null);
                    break;
                }
            }
            return firstNode.getObject();
        }
        return null;
    }

    public Object first() {
        if (!this.isEmpty()) {
            Node firstNode = refNodeEntry;
            while (true) {
                if (firstNode.getRefNode() != null) {
                    firstNode = firstNode.getRefNode();
                } else {
                    break;
                }
            }
            return firstNode.getObject();
        }
        return null;
    }

    public boolean isEmpty() {
        return refNodeEntry == null;
    }

    @Override
    public String toString() {
        String string = "____________________\n";
        string += "queue\n";
        string += "____________________\n";
        Node nodeAux = refNodeEntry;
        if (refNodeEntry != null) {
            while (nodeAux != null) {
                string += "[Node { data: " + nodeAux.getObject() + "}]\n";
                if (nodeAux.getRefNode() != null) {
                    nodeAux = nodeAux.getRefNode();
                }else {
                    break;
                }
            }
        } else {
            string = "empty queue.";
        }
        return string;
    }
}
