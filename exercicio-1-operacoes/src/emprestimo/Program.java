package emprestimo;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;
        System.out.print("digite o valor do emprestimo: ");
        valor = sc.nextDouble();
        System.out.println("o valor do juros será: " + retornaJuros(valor));
        sc.close();
    }

    public static double retornaJuros(double emprestimo) {
        return emprestimo * 0.12;
    }
}
