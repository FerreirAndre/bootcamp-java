package exercises_loops;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        while(true){
            System.out.println("nome:");
            nome = sc.next();
            if (nome.equals("0")) break;
            System.out.println("idade:");
            idade = sc.nextInt();
        }
        System.out.println("terminando o programa.");
        sc.close();
    }
}
