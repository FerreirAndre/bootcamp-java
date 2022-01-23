package operacoes;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite o primeiro numero: ");
        float primeiroNumero = sc.nextFloat();
        System.out.print("digite o segundo numero: ");
        float segundoNumero = sc.nextFloat();
        Operacoes operacoes = new Operacoes(primeiroNumero,segundoNumero);
        System.out.println("soma:" + String.format("%.2f",operacoes.soma()));
        System.out.println("subtracao:" + String.format("%.2f",operacoes.subtracao()));
        System.out.println("multiplicacao:" + String.format("%.2f",operacoes.multiplicacao()));
        System.out.println("divisao:" + String.format("%.2f",operacoes.divisao()));
        sc.close();
    }
}
