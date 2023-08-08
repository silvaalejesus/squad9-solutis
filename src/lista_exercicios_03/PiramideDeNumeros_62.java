import java.util.Scanner;

public class PiramideDeNumeros_62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de linhas: ");
        int linhas = scanner.nextInt();

        // Loop externo para percorrer cada linha da pirâmide.
        for (int i = 1; i <= linhas; i++) {
            // Loop interno para imprimir os números sequencialmente na linha atual.
            for (int j = 1; j <= i; j++) {
                System.out.printf("%02d ", i);
            }
            System.out.println();
        }
        scanner.close();
    }
}
