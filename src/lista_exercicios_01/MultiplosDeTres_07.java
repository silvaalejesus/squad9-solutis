public class MultiplosDeTres_07 {
    public static void main(String[] args) {
        // Exercício 07
        System.out.println(
                "7. Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e 100, usando os tipos de dados int e double.");

        // Utilizando integer
        System.out.println("Utilizando integer:");
        for (int i = 1; i <= 100; i++) {
            // Apenas múltiplos de 3
            if (i % 3 == 0) {
                int result = i / 2;
                System.out.printf("%d ", result);
            }
        }

        System.out.println();

        // Utilizando double
        System.out.println("Utilizando double:");
        for (double i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                double result = i / 2;
                System.out.printf("%.2f ", result);
            }
        }
    }
}
