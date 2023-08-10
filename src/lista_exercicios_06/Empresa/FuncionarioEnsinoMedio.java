package lista_exercicios_06.Empresa;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escola) {
        super(nome, codigoFuncional, escola);
        setSalario(getSalario() * 1.50);
    }

    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escola, Comissao comissao) {
        super(nome, codigoFuncional, escola, comissao);
        setSalario(getSalario() * 1.50);
    }

    @Override
    public Double calcularSalario() {
        return getSalario() + this.getComissao().calcularComissao();
    }
}