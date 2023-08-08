import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ValidacaoHorario_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora (0 a 23): ");
        // Continua no loop caso o número não for um inteiro.
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, insira um número válido para as horas.");
            scanner.next();
        }
        int horas = scanner.nextInt();

        System.out.print("Digite os minutos (0 a 59): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, insira um número válido para os minutos.");
            scanner.next();
        }
        int minutos = scanner.nextInt();

        System.out.print("Digite os segundos (0 a 59): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, insira um número válido para os segundos.");
            scanner.next();
        }
        int segundos = scanner.nextInt();

        // Cria uma String contendo o horário fornecido pelo usuário no formato "hora:minuto:segundo".
        String horarioString = horas + ":" + minutos + ":" + segundos;

        try {
            // Tenta criar um objeto LocalTime com o horário fornecido.
            LocalTime time = LocalTime.parse(horarioString);
            System.out.println("Horário válido: " + time);
        } catch (DateTimeParseException e) {
            System.out.println("Horário inválido: " + horarioString);
        }

        scanner.close();
    }
}
