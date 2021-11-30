package exercises_loops;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd, numero, par = 0, impar = 0;
        System.out.println("Digite a quantidade de numeros:");
        qtd = sc.nextInt();
        for (int i = 0; i < qtd; i++) {
            System.out.println("digite o numero:");
            numero = sc.nextInt();
            if (numero % 2 == 0)
                par++;
            else
                impar++;
        }
        System.out.println("pares: " + par + "\nimpares: " + impar);

        sc.close();
    }
}
