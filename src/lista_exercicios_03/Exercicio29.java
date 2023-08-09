

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as coordenadas do vertice superior esquerdo (x1 y1):");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Digite as coordenadas do vertice inferior direito (x2 y2):");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        scanner.close();

        if (x1 == x2 && y1 == y2) {
            System.out.println("É um ponto.");
        } else if (x1 == x2 || y1 == y2) {
            if (x1 == x2) {
                System.out.println("reta vertical.");
            } else {
                System.out.println("reta horizontal.");
            }
        } else {
            System.out.println("retangulo.");
        }
    }
}
