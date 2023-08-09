
public class Tabuada_59 {
    public static void main(String[] args) {
        System.out.println("Tabuada de 1 a 10 separada por operação:");

        for (int i = 1; i <= 10; i++) {
            System.out.println("\nTabuada de Adição para " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " + " + j + " = " + (i + j));
            }

            System.out.println("\nTabuada de Subtração para " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " - " + j + " = " + (i - j));
            }

            System.out.println("\nTabuada de Multiplicação para " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println("\nTabuada de Divisão para " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " / " + j + " = " + (i / j));
            }
        }
    }
}
