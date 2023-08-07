package Exercicio01;

import java.util.Scanner;

public class Palindromo_08 {
	public static void main(String[] args) {
		System.out.print("Digita a palavra: ");
		String palavra = new Scanner(System.in).nextLine();
		String reverso = "";

		for (int c = (palavra.length() - 1); c >= 0; c--) {
			reverso += palavra.charAt(c);
		}

		if (reverso.equals(palavra)) {
			System.out.println("É palíndromo");
		} else {
			System.out.println("Não é palíndromo");
		}
	}
}
