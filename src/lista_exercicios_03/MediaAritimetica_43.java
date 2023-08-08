import java.util.Scanner;

public class MediaAritimetica_43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int quantidadeValores = 500;
        int soma = 0;

        System.out.println("Digite " + quantidadeValores + " valores:");

        for (int i = 0; i < quantidadeValores; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            int valor = scanner.nextInt();
            soma += valor;
        }

        double media = (double) soma / quantidadeValores;

        System.out.println("A média dos valores é: " + media);

        scanner.close();
    }
}

