package lista_exercicios_06.Empresa;

public abstract class Funcionario {
    private String nome;
    private int codigoFuncional;
    private double salario = 1000;
    private Comissao comissao;

    public Funcionario(String nome, int codigoFuncional, Comissao comissao) {
        this(nome, codigoFuncional);
        this.comissao = comissao;
    }

    public Funcionario(String nome, int codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Comissao getComissao() {
        return this.comissao;
    }

    public void setComissao(Comissao comissao) {
        this.comissao = comissao;
    }

    public abstract Double calcularSalario();

    @Override
    public String toString() {
        return "Nome: " + nome + ", codigoFuncional: " + codigoFuncional + ", Salario: " + salario + ", Comissão: " + comissao.toString();
    }

}
