package lista_exercicios_06;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    private String escola;

    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escola) {
        super(nome, codigoFuncional, escola);
        this.escola = escola;
    }

    @Override
    public String getEscola() {
        return escola;
    }

    @Override
    public void setEscola(String escola) {
        this.escola = escola;
    }
}
