import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SomarDias_58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite a data no formato dd/MM/yyyy: ");
            String dataString = scanner.next();

            System.out.print("Digite a quantidade de dias a ser somada: ");
            int quantidadeDias = scanner.nextInt();

            // Cria um objeto DateTimeFormatter para converter a data de String para LocalDate
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            // Converte a data fornecida pelo usuário em um objeto LocalDate
            LocalDate data = LocalDate.parse(dataString, formatter);

            // Soma a quantidade de dias informada à data
            LocalDate dataSomada = data.plusDays(quantidadeDias);

            // Formata a data resultante em uma String no formato dd/MM/yyyy
            String dataSomadaString = dataSomada.format(formatter);
            System.out.println("Data somada: " + dataSomadaString);
        } catch (Exception e) {
            System.out.println("Erro: Digite uma data válida e uma quantidade de dias válida.");
        }

        scanner.close();
    }
}
