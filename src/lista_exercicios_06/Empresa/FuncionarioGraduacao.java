package lista_exercicios_06.Empresa;

public class FuncionarioGraduacao extends FuncionarioEnsinoMedio {
    private String universidade;

    public FuncionarioGraduacao(String nome, int codigoFuncional, String escola, String universidade) {
        super(nome, codigoFuncional, escola);
        setSalario(getSalario() * 2);
        this.universidade = universidade;
    }

    public FuncionarioGraduacao(String nome, int codigoFuncional, String escola, String universidade, Comissao comissao) {
        super(nome, codigoFuncional, escola, comissao);
        setSalario(getSalario() * 2);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    @Override
    public Double calcularSalario() {
        return getSalario() + this.getComissao().calcularComissao();
    }
}
