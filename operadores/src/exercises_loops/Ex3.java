package exercises_loops;

import java.util.List;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero,maior=0,soma=0;
        for(int i =0;i<5;i++){
            System.out.println("digite o numero: ");
            numero = sc.nextInt();
            maior = numero>maior?numero:maior;
            soma += numero;
        }
        int media = soma/5;
        System.out.println("o maior é: " + maior + "\na média é: " + media);
        sc.close();
    }
}
