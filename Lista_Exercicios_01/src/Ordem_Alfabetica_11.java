package Exercicio01;

import java.util.Scanner;

public class Ordem_Alfabetica_11 {
	public static void main(String[] args) {
		System.out.print("Digite a primeira palavra: ");
		String palavra1 = new Scanner (System.in).nextLine();
		System.out.print("Digite a segunda palavra: ");
		String palavra2 = new Scanner (System.in).nextLine();
		
		int comparacao = palavra1.compareToIgnoreCase(palavra2);
		
		if(comparacao < 0) {
			System.out.println("Palavras em ordem alfabética: " +palavra1+ ", " +palavra2);
		}else if (comparacao > 0) {
			System.out.println("Palavras em ordem alfabética: " +palavra2+ ", " +palavra1);
		}else {
			System.out.println("As palavras são iguais");
		}
		
		if (palavra1.length() > palavra2.length()) {
			System.out.println("A palavra " +palavra1+ " tem o maior numero de caracteres que a palavra " +palavra2);
		}else if (palavra1.length() < palavra2.length()) {
			System.out.println("A palavra " +palavra2+ " tem o maior numero de caracteres que a palavra " +palavra1);
		}else {
			System.out.println("A palavra " +palavra1+ " tem a mesma quantidade de caracteres que a palavra " +palavra2);
		}
	}
}

