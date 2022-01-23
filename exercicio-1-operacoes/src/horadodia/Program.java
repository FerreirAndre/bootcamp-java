package horadodia;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("digite a hora: ");
        int horas = leitor.nextInt();
        if (horas < 12) {
            System.out.println("bom dia");
        } else if (horas < 19) {
            System.out.println("boa tarde");
        } else {
            System.out.println("boa noite");
        }
        leitor.close();
    }
}
