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

    public T remove(int index){
        indexValidation(index);

        Node<T> targetNode = this.getNode(index);

        if(index == 0){
            refEntry = targetNode.getNextNode();
            return targetNode.getValue();
        }

        Node<T> prevNode = getNode(index-1);
        prevNode.setNextNode(targetNode.getNextNode());

        return prevNode.getValue();
    }

    private Node<T> getNode(int index) {
        indexValidation(index);

        Node<T> nodeAux = refEntry;
        Node<T> nodeReturn = null;

        for (int i = 0; i <= index; i++) {
            nodeReturn = nodeAux;
            nodeAux = nodeAux.getNextNode();
        }

        return nodeReturn;
    }

    public T get(int index){
        return getNode(index).getValue();
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

    private void indexValidation(int index) {
        if (index > this.size() || index < 0) {
            int listSize = this.size() - 1;
            throw new IndexOutOfBoundsException("no content at index " + index + " it only has " + listSize + " items.");
        }
    }

    @Override
    public String toString() {
        String string = "__________________\n";
        string += "linked list\n";
        string+="__________________\n";
        Node<T> nodeAux = refEntry;
        for(int i =0;i<=this.size();i++){
            string += "[ Node { " + nodeAux.getValue() + " }]\n";
            nodeAux = nodeAux.getNextNode();
        }
        string += "__________________\n";
        return string;
    }
}
