import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversaoMonetaria_54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor inicial em reais: ");
        double valorInicial = scanner.nextDouble();

        System.out.print("Informe o valor final em reais: ");
        double valorFinal = scanner.nextDouble();

        System.out.print("Informe o valor de incremento em reais: ");
        double incremento = scanner.nextDouble();

        System.out.print("Informe o valor de 1 dólar em reais: ");
        double valorDolar = scanner.nextDouble();

        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.println("\nTabela de Conversão de Reais para Dólares:");
        System.out.println("-----------------------------------------");
        System.out.println("Valor em Reais | Valor em Dólares");
        System.out.println("-----------------------------------------");

        for (double valorReais = valorInicial; valorReais <= valorFinal; valorReais += incremento) {
            double valorConvertido = valorReais / valorDolar;
            System.out.println(df.format(valorReais) + " BRL | " + df.format(valorConvertido) + " USD");
        }

        scanner.close();
    }
}
