package lista_exercicios_05;

public class Administrador extends Empregado{
    private double ajudaDeCusto;
    
    public Administrador(String nome, String telefone, String endereco, int codigoSetor, int salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, telefone, endereco, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }
    
    public double calcularSalario() {
        return super.calcularSalario() + this.getAjudaDeCusto();
    }
    
    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
}
