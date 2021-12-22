package circular_list;

public class Main {
    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.add("c1");
        System.out.println(list);
        list.add("c2");
        list.add("c3");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
