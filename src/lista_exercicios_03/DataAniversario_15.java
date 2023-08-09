import java.util.Scanner;

public class DataAniversario_15 {

	public static void main(String[] args) {
		System.out.print("Informe o dia: ");
		Scanner scanner = new Scanner(System.in);
		int dia = scanner.nextInt();
		
		System.out.print("Informe o mês: ");
		int mes = scanner.nextInt();
		
		String nomeMes = buscarNomeMes(mes);
		boolean dataValida = verificarDataAniversario(dia, mes);
		
		if(dataValida) {
			System.out.println("A data de aniversário está correta. Mês: " +nomeMes);
		}else { 
			System.out.println("Data de aniversário não é válida");
		}
		
		scanner.close();
	}

	public static boolean verificarDataAniversario(int dia, int mes) {
		if (mes < 1 || mes > 12) {
			return false;
		}
		
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			return dia >= 1 && dia <= 30;
		}
		
		if (mes == 2) {
			return dia >= 1 && dia <= 29;
		}
		
		return dia >= 1 && dia <= 31;
	}
		public static String buscarNomeMes(int mes) {
		String nomesMeses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
			            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};	

		return nomesMeses[mes - 1];
	}
}
