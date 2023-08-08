package lista_exercicios_03;

import java.util.Scanner;

public class NumeroPerfeito_39 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe um numero: ");
		int num = scanner.nextInt();
		
		boolean numPerfeito = verificarNumPerfeito(num);
		
		if (numPerfeito) {
			System.out.println(num+ " é um número perfeito");
		}else {
			System.out.println(num+ " não é um número perfeito");
		}
		scanner.close();
	}
	
	public static boolean verificarNumPerfeito(int num) {
		int somaDivisores = 0;
		for (int c = 1; c < num; c++) {
			if (num % c == 0) {
				somaDivisores += c;
			}
		}
		
		return somaDivisores == num;
	}
}
