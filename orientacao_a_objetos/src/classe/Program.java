package classe;

public class Program {
    public static void main(String[] args) {
        Carro carro = new Carro("azul","sedan",120);
        Carro carro1 = new Carro();
        carro1.setModelo("minivan");
        carro1.setCapacidadeGas(150);
        carro1.setCor("preto");
        System.out.println(carro.valorEncher(7));
        System.out.println(carro1.valorEncher(8));
    }
}
