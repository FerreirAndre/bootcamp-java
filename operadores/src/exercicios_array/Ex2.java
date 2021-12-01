package exercicios_array;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vetor = new String[6];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("letra: ");
            String letra = sc.next();

            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {
                vetor[i] = letra;
            }
        }
        for (String letra : vetor) {
            if (letra != null) {
                System.out.println(letra);
            }
        }

        sc.close();
    }
}
