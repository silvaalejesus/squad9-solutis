import utils.Input;
public class Divida_05 {

    public static void main(String[] args) {
        double valorInicial = Input.getDoubleInput("Informe o valor inicial da dívida: ");
        int meses = Input.getIntInput("Informe a quantidade de meses: ");
        double jurosMensais = Input.getDoubleInput("Informe os juros mensais (%): ");

        double valorFinal = calcularDivida(valorInicial, meses, jurosMensais);

        System.out.println("Valor final da dívida após " + meses + " meses: " + valorFinal);

    }

    public static double calcularDivida(double valorInicial, int meses, double jurosMensais) {
        double juros = (jurosMensais / 100) * valorInicial * meses;
        double valorFinal = valorInicial + juros;
        return valorFinal;
    }
}