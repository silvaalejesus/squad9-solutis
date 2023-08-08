
import java.util.Scanner;

public class Tabuada_53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número que deseja multiplicar: ");
        int multiplicador = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            int resultado = (multiplicador * i);
            System.out.println( multiplicador + "x" + i + "=" +resultado);
        }
        scanner.close();
    }
}
