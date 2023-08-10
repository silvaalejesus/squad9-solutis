package lista_exercicios_06.Empresa;

public class FuncionarioSemEstudo extends Funcionario {
    public FuncionarioSemEstudo(String nome, int codigoFuncional) {
        super(nome, codigoFuncional);
    }

    public FuncionarioSemEstudo(String nome, int codigoFuncional, Comissao comissao) {
        super(nome, codigoFuncional, comissao);
    }

    @Override
    public Double calcularSalario() {
        return getSalario() + this.getComissao().getValor() ;
    }
}