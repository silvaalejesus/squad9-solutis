import java.util.Scanner;

/*
 * Solicite o nome e a idade de duas pessoas. Em seguida exiba o nome da pessoa mais velha
 *  e o nome da pessoa mais nova.

 * */
public class MaiorIguais_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maior = 0;
        double[] numeros = new double[3];
        boolean saoIguais = true;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe tres numeros");
            numeros[i] = scanner.nextDouble();
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] != numeros[i - 1]) {
                saoIguais = false;
                break;
            }
        }

        if (saoIguais) {
            System.out.println("Os valores são iguais");
        }
        System.out.println("o maior número é " + maior);

        scanner.close();
    }
}
