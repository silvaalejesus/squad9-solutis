package lista_exercicios_06.Empresa;

public class Comissao {
    private double valor;

    public Comissao(double valor) {
        this.valor = valor;
    }

    public double calcularComissao() {
        return this.valor;
    }

    protected void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    @Override
    public String toString() {
        return "Valor da comissão: " + this.valor;
    }
}