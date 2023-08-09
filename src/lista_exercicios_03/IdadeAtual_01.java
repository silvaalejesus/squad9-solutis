import java.time.LocalDate;
import java.util.Scanner;

public class IdadeAtual_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu ano de nascimento: ");
        int anoNasc = scanner.nextInt();

        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - anoNasc;

        System.out.println("Sua idade no ano de " + anoAtual + " é: " + idade);

        scanner.close();
    }

}
