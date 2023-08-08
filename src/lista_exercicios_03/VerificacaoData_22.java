import java.time.LocalDate;
import java.util.Scanner;

public class VerificacaoData_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira data de aniversário (dia e mês, no formato dd-MM): ");
        String entrada1 = scanner.nextLine();

        System.out.print("Digite a segunda data de aniversário (dia e mês, no formato dd-MM): ");
        String entrada2 = scanner.nextLine();

        LocalDate dataAniversario1 = LocalDate.parse("2023-" + entrada1); // O ano não importa para a comparação
        LocalDate dataAniversario2 = LocalDate.parse("2023-" + entrada2);

        if (verificarAniversarioIgual(dataAniversario1, dataAniversario2)) {
            System.out.println("As datas de aniversário são iguais!");
        } else {
            System.out.println("As datas de aniversário não coincidem...");
        }

        scanner.close();
    }

    public static boolean verificarAniversarioIgual(LocalDate data1, LocalDate data2) {
        return data1.getMonth() == data2.getMonth() && data1.getDayOfMonth() == data2.getDayOfMonth();
    }
}
