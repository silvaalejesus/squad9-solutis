import java.util.Scanner;

public class RacionalParaRealConverter_08 {
    private final int numerador;
    private final int denominador;

    public RacionalParaRealConverter_08(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o numerador: ");
            int numerador = scanner.nextInt();

            System.out.print("Digite o denominador: ");
            int denominador = scanner.nextInt();

            RacionalParaRealConverter_08 converter = new RacionalParaRealConverter_08(numerador, denominador);
            double resultado = converter.converterParaReal();

            // Verificando se o resultado é um numero.
            if (!Double.isNaN(resultado)) {
                System.out.println("O resultado da conversão é: " + resultado);
            }
        } catch (Exception e) {
            System.out.println("Erro: O valor digitado não é um número válido.");
        }

        scanner.close();
    }

    public double converterParaReal() {
        if (denominador == 0) {
            System.out.println("Erro: Divisão por zero não é permitida. O denominador não pode ser zero.");
            return Double.NaN;
        } else {
            return (double) numerador / denominador;
        }
    }
}