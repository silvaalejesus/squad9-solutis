import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
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

            // Convertendo para LocalDate.
            LocalDate dataNascimento = LocalDate.of(ano, mes, dia);

            // Pedir a data atual ao usuário.
            System.out.print("Digite a data atual (formato: dd/MM/yyyy): ");
            String dataAtualStr = scanner.next();

            // Convertendo o input do usuário de acordo com o formato.
            LocalDate dataAtual = LocalDate.parse(dataAtualStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            pegarTrimestre(dataNascimento);
            pegarSigno(dataNascimento);

            if (dataNascimento.isAfter(dataAtual) || dataNascimento.isBefore(LocalDate.of(1800, 1, 1))) {
                System.out.println("Erro: Data atual fornecida foi antes do nascimento do usuário ou inválida.");
            } else {
                Period periodo = Period.between(dataNascimento, dataAtual);
                int idade = periodo.getYears();
                System.out.println("Sua idade é " + idade + " anos.");
            }
        } catch (DateTimeException e) {
            System.out.println("Erro: Digite uma data de nascimento válida de acordo com o formato.");
        }

        scanner.close();
    }

    public static void pegarTrimestre(LocalDate date) {
        int monthValue = date.getMonthValue();
        int trimestre = (monthValue - 1) / 3 + 1;
        System.out.println("Você nasceu no " + trimestre + "° trimestre.");
    }

    public static void pegarSigno(LocalDate date) {
        int dia = date.getDayOfMonth();
        int mes = date.getMonthValue();

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            System.out.println("Seu signo é Áries.");
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            System.out.println("Seu signo é Touro.");
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            System.out.println("Seu signo é Gêmeos.");
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            System.out.println("Seu signo é Câncer.");
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            System.out.println("Seu signo é Leão.");
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            System.out.println("Seu signo é Virgem.");
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            System.out.println("Seu signo é Libra.");
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            System.out.println("Seu signo é Escorpião.");
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            System.out.println("Seu signo é Sagitário.");
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            System.out.println("Seu signo é Capricórnio.");
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            System.out.println("Seu signo é Aquário.");
        } else {
            System.out.println("Seu signo é Peixes.");
        }
    }
}
