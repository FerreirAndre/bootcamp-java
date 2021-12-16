package queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();
        out:
        while(true){
            menu();
            System.out.print("enter your choice: ");
            char choice = sc.next().charAt(0);
            choice = Character.toLowerCase(choice);
            switch(choice) {
                case 'e':
                    System.out.print("enter the value: ");
                    Object object = sc.next();
                    queue.enqueue(object);
                    break;
                case 'd':
                    Object objRemoved = queue.dequeue();
                    queue.dequeue();
                    System.out.println("object removed: " + objRemoved);
                    break;
                case 'p':
                    if(!queue.isEmpty()){
                        System.out.println(queue);
                        break;
                    }
                    System.out.println("empty queue");
                    break;
                case 'f':
                    System.out.println(queue.first());
                    break;
                case 'x':
                    break out;
                default:
                    System.out.println("invalid input!");
                    break;
            }

        }
        sc.close();
    }
    public static void menu() {
        System.out.println("E - Enqueue");
        System.out.println("D - Dequeue");
        System.out.println("P - Print queue");
        System.out.println("X - Exit");
    }
}
