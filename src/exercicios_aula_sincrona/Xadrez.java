package Slide_119;

public class Xadrez {
    public static void main(String[] args) {

        int[][] tabuleiro = new int[8][8];

        int valor = 1;

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = valor;
                valor = valor * 2;
            }
        }


        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
