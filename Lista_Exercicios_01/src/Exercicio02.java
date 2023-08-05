import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        // Exercicio 02
        System.out.println("2. Faça um programa que receba 2 valores e retorne o maior entre eles.");
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Variáveis para armazenar os valores informados pelo usuário.
            int valor1 = 0;
            int valor2 = 0;

            // Try-catch para validar a entrada, caso o usuário digite uma string.
            try {
                System.out.print("Digite o primeiro valor (ou -1 para sair): ");
                // Lê a entrada do usuário e converte para um valor inteiro.
                valor1 = Integer.parseInt(sc.nextLine());
                // Sair do loop
                if (valor1 == -1) break;

                System.out.print("Digite o segundo valor (ou -1 para sair): ");
                valor2 = Integer.parseInt(sc.nextLine());
                if (valor2 == -1) break;

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                continue;
            }

            // Chama a função "maiorValor" para encontrar o maior entre os dois valores informados
            int maior = maiorValor(valor1, valor2);
            System.out.println("O maior valor entre " + valor1 + " e " + valor2 + " é: " + maior + "\n");
        }

        sc.close();
    }

    public static int maiorValor(int primeiroValor, int segundoValor) {
        return (primeiroValor > segundoValor) ? primeiroValor : segundoValor;
    }
}
