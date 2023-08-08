import java.util.Scanner;

public class NumeroPrimo_38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro positivo: ");
            int numero = scanner.nextInt();

            boolean ePrimo = verificarPrimo(numero);

            if (ePrimo) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }
        } catch (Exception e) {
            System.out.println("Erro: Digite um número inteiro válido.");
        }

        scanner.close();
    }

    private static boolean verificarPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        if (numero == 2) {
            return true;
        }

        if (numero % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
