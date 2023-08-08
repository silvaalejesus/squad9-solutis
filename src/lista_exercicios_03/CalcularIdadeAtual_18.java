import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalcularIdadeAtual_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Incluindo o dia, mês e o ano apartir das questões anteriores.
        try {
            System.out.print("Digite o dia do seu nascimento: ");
            int dia = scanner.nextInt();

            System.out.print("Digite o mês do seu nascimento: ");
            int mes = scanner.nextInt();

            System.out.print("Digite o ano do seu nascimento: ");
            int ano = scanner.nextInt();

            LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
            LocalDate dataAtual = LocalDate.now();

            if (!dataNascimento.isAfter(dataAtual) && dataNascimento.isBefore(LocalDate.of(1800, 1, 1))) {
                System.out.println("Data de nascimento inválida.");
            } else {
                Period periodo = Period.between(dataNascimento, dataAtual);
                int idade = periodo.getYears();
                System.out.println("Sua idade é " + idade + " anos.");
            }
        } catch (DateTimeException e) {
            System.out.println("Erro: Digite uma data de nascimento válida");
        }

        scanner.close();
    }
}
