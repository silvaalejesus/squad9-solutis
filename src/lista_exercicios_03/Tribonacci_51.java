package lista_exercicios_03;

import java.util.Scanner;

public class Tribonacci_51 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Informe a quantidade de termos da sequência de Tribonacci: ");
        int n = scanner.nextInt();

        int primeiro = 1;
        int segundo = 1;
        int terceiro = 2;

        System.out.println("Os primeiros " + n + " termos da sequência de Tribonacci:");
        System.out.print(primeiro + " " + segundo + " " + terceiro + " ");

        for (int i = 4; i <= n; i++) {
            int proximo = primeiro + segundo + terceiro;
            System.out.print(proximo + " ");

            primeiro = segundo;
            segundo = terceiro;
            terceiro = proximo;
        }
        scanner.close();
	}
}
