package exercicios_array;

import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[20];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);
        }
        System.out.println("numeros aleatorios");
        for (int numero : vetor) {
            System.out.print(numero+" ");
        }
        System.out.println("\nseus sucessores");
        for (int numero : vetor) {
            System.out.print(++numero+" ");
        }
    }
}
