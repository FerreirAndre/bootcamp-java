package doubly_linked;

import linked_list.LinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinked<String> list = new DoublyLinked<>();
        list.add("c1");
        list.add("c2");
        list.add("c3");
        list.add("c4");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.addIndex("c1",1);
        System.out.println(list);
    }
}
