package lista_exercicios_06;

public class FuncionarioGraduacao extends FuncionarioEnsinoMedio {
    private String universidade;

    public FuncionarioGraduacao(String nome, int codigoFuncional, String escola, String universidade) {
        super(nome, codigoFuncional, escola);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }
}
