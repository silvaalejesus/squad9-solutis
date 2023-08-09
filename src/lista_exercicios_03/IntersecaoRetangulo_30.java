import java.util.Scanner;

public class IntersecaoRetangulo_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite as coordenadas do primeiro retângulo:");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        System.out.println("Digite as coordenadas do segundo retângulo:");
        int x3 = input.nextInt();
        int y3 = input.nextInt();
        int x4 = input.nextInt();
        int y4 = input.nextInt();

        input.close();

        boolean intersecao = vereficaIntercesao(x1, y1, x2, y2, x3, y3, x4, y4);

        if (intersecao) {
            System.out.println("Os dois retângulos se interceptam.");
        } else {
            System.out.println("Os dois retângulos não se interceptam.");
        }

        input.close();
    }

    public static boolean vereficaIntercesao(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        boolean sobrepoemHorizontal = x1 < x4 && x2 > x3;
        boolean sobrepoemVertical = y1 < y4 && y2 > y3;

        return sobrepoemHorizontal && sobrepoemVertical;
    }
}
