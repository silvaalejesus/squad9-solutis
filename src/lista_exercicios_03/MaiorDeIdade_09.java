package lista_exercicios_03;

import java.util.Scanner;

public class MaiorDeIdade_09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe sua idade: ");
		int idade = scanner.nextInt();
		
		//Considerando que a maior idade no Brasil é 18 anos.
		if (idade >= 18) {
			System.out.println("Maior de idade");
		}else if (idade >= 1){
			System.out.println("Menor de idade");
		}else {
			System.out.println("Dado indisponível. Idade não existe");
		}

		scanner.close();
	}

}
