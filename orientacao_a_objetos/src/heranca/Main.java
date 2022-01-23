package heranca;

public class Main {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        Funcionario gerente = new Gerente();
        Funcionario faxas = new Faxineiro();
        Funcionario vendedor = new Vendedor();

        Vendedor vendas = (Vendedor) new Funcionario();
    }
}
