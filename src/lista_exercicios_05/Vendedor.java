package lista_exercicios_05;

public class Vendedor extends Empregado{
    private double valorVendas;
    private double comissao;

    public Vendedor(double valorVendas, double comissao) {
        super(nome, telefone, endereco, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double calcularSalario() {
        double salarioEmpregado = super.calcularSalario();
        double comissaoExtra = (valorVendas * comissao) / 100;
        return salarioEmpregado + comissaoExtra;
    }
    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "valorVendas=" + valorVendas +
                ", comissao=" + comissao +
                '}';
    }
}
