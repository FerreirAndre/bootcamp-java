package exercicios_array;

public class Ex1 {
    public static void main(String[] args) {
        int[] lista = {22,4,10,3,2,9};
        int[] listaReversa = {0,0,0,0,0,0};
        int j=lista.length-1;
        for(int i = 0;i<lista.length;i++){
            listaReversa[i] = lista[j];
            j--;
        }
        for(int i=0;i<listaReversa.length;i++) {
            System.out.println(listaReversa[i]);
        }
    }
}
