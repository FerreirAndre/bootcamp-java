package stack;

public class Node {
    private int data;
    private Node refNode = null;

    public Node() {
    }

    public Node(int dado) {
        this.data = dado;
    }

    public int getDado() {
        return data;
    }

    public void setDado(int dado) {
        this.data = dado;
    }

    public Node getRefNo() {
        return refNode;
    }

    public void setRefNo(Node refNo) {
        this.refNode = refNo;
    }

    /* uncomment if necessary to use, not needed right now.
    @Override
    public String toString(){
        return "No { " +
                "dado = " + data+
                " }";
    }*/
}
