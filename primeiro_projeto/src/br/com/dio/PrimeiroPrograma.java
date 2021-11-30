package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Scanner;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dados do Gato.");
        System.out.print("nome: ");
        String nome = sc.nextLine();
        System.out.print("cor: ");
        String cor = sc.nextLine();
        System.out.print("idade: ");
        int idade = sc.nextInt();

        Gato gato = new Gato(nome, cor, idade);

        System.out.println(gato);
    }
}
