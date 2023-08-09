public class Operario extends Empregado{
    private double valorProducao;
    private double comissao;
    public Operario(String nome, String telefone, String endereco, int codigoSetor, int salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, telefone, endereco, codigoSetor, salarioBase, imposto);
        this.comissao = comissao;
        this.valorProducao = valorProducao;
    }
    @Override
    public double calcularSalario() {
        double salarioEmpregado = super.calcularSalario();
        return salarioEmpregado + (valorProducao * (comissao / 100));
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }
    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}