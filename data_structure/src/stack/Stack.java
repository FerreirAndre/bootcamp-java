package stack;

public class Stack {
    private Node refNodeEntry;

    public Stack() {
        this.refNodeEntry = null;
    }

    public Stack(Node refNodeEntry) {
        this.refNodeEntry = refNodeEntry;
    }

    public void push(Node newNode) {
        Node refAux = refNodeEntry;
        refNodeEntry = newNode;
        refNodeEntry.setRefNo(refAux);
    }

    public Node pop() {
        if (!this.isEmpty()) {
            Node nodePopped = refNodeEntry;
            refNodeEntry = refNodeEntry.getRefNo();
            return nodePopped;
        } else {
            return null;
        }
    }

    public Node top() {
        return refNodeEntry;
    }

    public boolean isEmpty() {
        return refNodeEntry == null;
    }

    @Override
    public String toString(){
        String string = "_________________\n";
        string += "Pilha\n";
        string += "_________________\n";
        Node nodeAux = refNodeEntry;
        while(nodeAux != null) {
            string += "[ Node { data: " + nodeAux.getDado() + "}]\n";
            nodeAux = nodeAux.getRefNo();
        }
        string += "_________________\n";
        return string;
    }
}
