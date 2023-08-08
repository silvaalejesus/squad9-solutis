import java.util.Scanner;

public class Piramide_63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas da pirâmide: ");
        int quantidadeLinhas = scanner.nextInt();

        for (int linha = 1; linha <= quantidadeLinhas; linha++) {
            for (int numero = 1; numero <= linha; numero++) {
                System.out.print(numero + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
