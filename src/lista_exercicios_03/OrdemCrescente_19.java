package lista_exercicios_03;

import java.util.Scanner;

public class OrdemCrescente_19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o primeiro numero: ");
		int n1 = scanner.nextInt();
		System.out.print("Informe o segundo numero: ");
		int n2 = scanner.nextInt();
		
		if (n1 <= n2) {
			System.out.println("Os numeros em ordem crescente: " + n1 + " " +n2);
		}else {
			System.out.println("Os numeros em ordem crescente: " + n2 + " " +n1);
		}

		scanner.close();
	}
}
