/* 3. Crie uma classe e na função main() implemente um programa que lê um número
inteiro do teclado e imprime todos os
números primos menores que ele (divisíveis por 1 ou por ele mesmo).
*/

import java.util.Scanner;

public class NumeroPrimo_03 {
    public static void main(String[] args) {
        System.out.println("Informe um número para verificar se é primo.");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println("Números primos menores que " + num + ":");

        for (int i = 2; i < num; i++) {
            if (isPrimo(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

    public static boolean isPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

