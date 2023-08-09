
import utils.Input;

public class QuantidadeSalario_02 {
    public static void main(String[] args) {

        double salarioFuncionario = Input.getDoubleInput("Informe seu salário atual");
        double salarioAtual = Input.getDoubleInput("Informe seu salário minimo atual");

        double quantidadeSalario = salarioAtual / salarioFuncionario;

        System.out.println(quantidadeSalario);
    }

}
