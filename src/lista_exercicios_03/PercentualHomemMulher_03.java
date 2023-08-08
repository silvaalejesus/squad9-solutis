package lista_exercicios_03;

import java.util.Scanner;

public class PercentualHomemMulher_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe a quantidade de homens presentes na turma da faculdade: ");
		int qtdHomem = scanner.nextInt();
		System.out.print("Informe a quantidade de mulheres presentes na turma da faculdade: ");
		int qtdMulher = scanner.nextInt();
		
		int totalAlunos = qtdHomem + qtdMulher;
		
		double percentualHomem = ((double) qtdHomem / totalAlunos) * 100;
		double percentualMulher = ((double) qtdMulher / totalAlunos) * 100;
		
		System.out.println("Percentual de homens na turma é: " +percentualHomem);
		System.out.println("Percentual de mulheres na turma é: " +percentualMulher);

		scanner.close();
	}
}
