import java.util.Scanner;

public class DataCompleta_24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o dia: ");
		int dia = scanner.nextInt();

		System.out.print("Informe o mês: ");
		int mes = scanner.nextInt();

		System.out.print("Informe o ano: ");
		int ano = scanner.nextInt();

		boolean dataValida = validarData(dia, mes, ano);

		if (dataValida) {
			System.out.println("A data informada é válida");
		} else {
			System.out.println("A data informada é inválida");
		}

		scanner.close();
	}

	public static boolean validarData(int dia, int mes, int ano) {
		if (ano <= 0 || mes < 1 || mes > 12 || dia < 1) {
			return false;
		}

		boolean bissexto = (ano % 4 == 0 || ano % 400 == 0 || ano % 100 != 0);

		switch (mes) {
		case 2: // fevereiro
			if (bissexto) {
				return dia <= 29;
			} else {
				return dia <= 28;
			}
		case 4, 6, 9, 11: //abril, junho, setembro e novembro
			return dia <= 30;
		default:
			return dia <= 31;
		}
	}
}
