package lista_exercicios_06.Empresa;

public class FuncionarioEnsinoBasico extends FuncionarioSemEstudo {
    private String escola;

    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, String escola) {
        super(nome, codigoFuncional);
        this.escola = escola;
        setSalario(getSalario() * 1.10);
    }

    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, String escola, Comissao comissao) {
        super(nome, codigoFuncional);
        this.escola = escola;
        setComissao(comissao);
        setSalario(getSalario() * 1.10);
    }

    @Override
    public Double calcularSalario() {
        return getSalario() + this.getComissao().calcularComissao();
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }
}
