package pilha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        out:
        while (true) {
            menu();
            System.out.print("enter your choice: ");
            char choice = sc.next().charAt(0);
            switch (choice) {
                case 'i':
                    System.out.print("enter the number to store in the stack: ");
                    int valor = sc.nextInt();
                    stack.push(new Node(valor));
                    break;
                case 'd':
                    Node popped = stack.pop();
                    if (popped != null) {
                        System.out.println("value removed: " + stack.pop());
                    } else {
                        System.out.println("empty stack, can't remove.");
                    }
                    break;
                case 'p':
                    if (stack.isEmpty() == false) {
                        System.out.println(stack);
                    } else {
                        System.out.println("empty stack.");
                    }
                    break;
                case 'e':
                    System.out.println("exiting program, bye.");
                    break out;
                default:
                    System.out.println("wrong input, try again.");
            }
        }

        sc.close();
    }

    public static void menu() {
        System.out.println("I - insert an item");
        System.out.println("D - pop an item");
        System.out.println("P - print the stack");
        System.out.println("E - exit");
    }
}
