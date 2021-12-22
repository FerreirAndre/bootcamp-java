package circular_list;

public class CircularList {
    private Node head;
    private Node tail;
    private int listSize;

    public CircularList() {
        this.head = null;
        this.tail = null;
        this.listSize = 0;
    }

    public void add(String value) {
        Node nodeNew = new Node(value);
        if (this.listSize == 0) {
            this.head = nodeNew;
            this.tail = this.head;
            this.head.setNextNode(tail);
        } else {
            nodeNew.setNextNode(this.tail);
            this.head.setNextNode(nodeNew);
            this.tail = nodeNew;
        }
        this.listSize++;
    }

    public void remove(int index) {
        validIndex(index);
        Node nodeAux = this.tail;
        if (index == 0) {
            this.tail = this.tail.getNextNode();
            this.head.setNextNode(this.tail);
        } else if (index == 1) {
            this.tail.setNextNode(this.tail.getNextNode());
        } else {
            for (int i = 0; i < index - 1; i++) {
                nodeAux = nodeAux.getNextNode();
            }
            nodeAux.setNextNode(nodeAux.getNextNode().getNextNode());
        }
        this.listSize--;
    }

    private Node getNode(int index) {
        Node nodeAux = head;
        for (int i = 0; i < this.listSize; i++) {
            nodeAux = nodeAux.getNextNode();
        }
        return nodeAux;
    }

    public String get(int index) {
        return this.getNode(index).getValue();
    }

    public boolean isEmpty() {
        return this.listSize == 0;
    }

    public int size() {
        return this.listSize;
    }

    private void validIndex(int index) {
        if (index < 0 || index > this.listSize) {
            throw new IndexOutOfBoundsException("invalid index.");
        }
    }

    @Override
    public String toString() {
        String string = "_________________\n";
        string+="Circular list\n";
        string+="_________________\n";
        Node nodeAux = this.tail;
        for(int i =0;i<listSize;i++){
            string+="Node { "+ nodeAux.getValue()+"}\n";
            nodeAux = nodeAux.getNextNode();
        }
        return string;
    }
}
