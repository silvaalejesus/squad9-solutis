import java.util.Scanner;

public class OrdenacaoTresNumeros_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            System.out.print("Digite o terceiro número: ");
            int num3 = scanner.nextInt();

            // Método com as funções Math.max() e Math.min().

            // int maior = Math.max(num1, Math.max(num2, num3));
            // int menor = Math.min(num1, Math.min(num2, num3));
            // int meio = num1 + num2 + num3 - maior - menor;
            // System.out.println("Números em ordem crescente: " + menor + ", " + meio + ", " + maior);

            int menor, meio, maior, temp;

            // Método utilizando apenas 3 estruturas de decisão
            if (num2 < num1) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
            if (num3 < num2) {
                temp = num2;
                num2 = num3;
                num3 = temp;
            }
            if (num2 < num1) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }

            menor = num1;
            meio = num2;
            maior = num3;

            System.out.println("Números em ordem crescente: " + menor + ", " + meio + ", " + maior);
        } catch (Exception e) {
            System.out.println("Erro: Digite valores numéricos válidos.");
        }

        scanner.close();
    }
}

