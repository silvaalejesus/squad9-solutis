package Lista_3;

import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de n:");
        int n = scanner.nextInt();

        scanner.close();

        long resultado = calcularFibonacci(n);

        System.out.println("O " + n + " termo da sequência de Fibonacci é: " + resultado);
    }

    public static long calcularFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long fib1 = 0;
            long fib2 = 1;
            long fibN = 0;

            for (int i = 2; i <= n; i++) {
                fibN = fib1 + fib2;
                fib1 = fib2;
                fib2 = fibN;
            }

            return fibN;
        }
    }
}
