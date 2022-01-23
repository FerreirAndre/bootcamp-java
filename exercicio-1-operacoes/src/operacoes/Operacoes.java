package operacoes;

public class Operacoes {
    private float primeiroNumero;
    private float segundoNumero;

    public Operacoes(float primeiroNumero, float segundoNumero) {
        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
    }

    public float soma() {
        return primeiroNumero + segundoNumero;
    }

    public float subtracao() {
        return primeiroNumero - segundoNumero;
    }

    public float multiplicacao() {
        return primeiroNumero * segundoNumero;
    }

    public float divisao() {
        return primeiroNumero / segundoNumero;
    }
}
