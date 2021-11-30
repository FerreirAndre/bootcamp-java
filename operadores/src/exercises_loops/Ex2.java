package exercises_loops;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        System.out.println("digite o valor: ");
        valor = sc.nextInt();
        while (valor < 0 || valor > 10){
            System.out.println("valor invalido, digite novamente: ");
            valor = sc.nextInt();
        }
        System.out.println("valor valido.");
        sc.close();
    }
}
