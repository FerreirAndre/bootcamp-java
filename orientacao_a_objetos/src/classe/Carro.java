package classe;

public class Carro {
    String cor;
    String modelo;
    int capacidadeGas;

    public Carro() {

    }

    public Carro(String cor, String modelo, int capacidadeGas) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeGas = capacidadeGas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeGas() {
        return capacidadeGas;
    }

    public void setCapacidadeGas(int capacidadeGas) {
        this.capacidadeGas = capacidadeGas;
    }

    double valorEncher(double precoGas) {
        return precoGas * capacidadeGas;
    }
}
