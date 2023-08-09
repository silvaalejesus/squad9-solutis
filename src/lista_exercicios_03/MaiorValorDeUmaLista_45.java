import java.util.Scanner;

public class MaiorValorDeUmaLista_45 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int qtdNumeros = 100;
		int maior = 0;
		for (int c = 1; c <= qtdNumeros; c++) {
			System.out.print("Informe o " +c+ "º valor da lista: ");
			int num = scanner.nextInt();
			if (c == 1) {
				maior = num;
			}else {
				if (num > maior) {
					maior = num;
				}
			}
		}
		System.out.println("Maior valor da lista é: " +maior);
		scanner.close();
	}
}
