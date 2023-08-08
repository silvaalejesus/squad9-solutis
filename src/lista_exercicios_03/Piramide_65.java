package lista_exercicios_03;

import utils.Input;

public class Piramide_65 {
    public static void main(String[] args) {
        int linhas = Input.getIntInput("Informe a quantidade de linhas");

        for (int i = 0; i < linhas; i++) {
            // Espaços em branco
            for (int j = 0; j < linhas - i - 1; j++) {
                System.out.print(" ");
            }

            // Asteriscos
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            // Quebra de linha para a próxima linha da pirâmide
            System.out.println();
        }

        Input.closeScanner();
    }
}
