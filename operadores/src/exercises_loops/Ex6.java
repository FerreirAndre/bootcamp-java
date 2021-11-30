package exercises_loops;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, fatorial = 1;
        System.out.println("digite um numero para saber seu fatorial: ");
        numero = sc.nextInt();

        for(int i = numero;i>0;i--)
            fatorial *= i;

        System.out.println(numero+"! = " + fatorial);
        sc.close();
    }
}
