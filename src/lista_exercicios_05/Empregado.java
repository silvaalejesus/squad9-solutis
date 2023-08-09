public class Empregado extends Pessoa {
    private int codigoSetor;
    private int salarioBase;
    private double imposto;

    public Empregado(String nome, String telefone, String endereco, int codigoSetor, int salarioBase, double imposto) {
        super(nome, telefone, endereco);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public double calcularSalario() {
        return this.salarioBase - (this.salarioBase * (this.imposto / 100));
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(int imposto) {
        this.imposto = imposto;
    }
}
