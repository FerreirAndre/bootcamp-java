package exercicios_array;

import java.util.Random;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 9;

        for(int i = 0 ; i < n ; i++) {

            int x = i*8;
            long valor = 1,temp =0;
            for(int j =0;j<x;j++){
                valor = valor*2;
                temp +=valor/12000;
            }
            System.out.println(temp + " kg");
        }
        sc.close();
    }
}
