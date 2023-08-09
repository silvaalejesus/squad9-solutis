//    FuncionarioGraduacao graduacao = new FuncionarioGraduacao("alessa silva", 1, "escola sp");
//calcular os custos baseado na escolaridade
//    40% ensino basico
//    40% ensino medio
//    20% ensino superior
//    custoTotaldaEMpresa = totaldofuncionarios * 40%
package lista_exercicios_06;

public class Empresa extends Funcionario{
    String[] funcionarios = new String[10];
    private double custoTotal = 0;

    public Empresa(String nome, int codigoFuncional, double renda, double rendaTotal, String escolaridade, double custoTotal) {
        super(nome, codigoFuncional, renda, rendaTotal, escolaridade);
        this.custoTotal = custoTotal;
    }

    //    Funcionario funcionario = new Funcionario("ale", 0,  300.00, 2000, "medio");

}
